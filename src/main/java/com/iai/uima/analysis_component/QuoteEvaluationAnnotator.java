package com.iai.uima.analysis_component;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Collection;
import java.util.HashMap;

import org.apache.uima.UimaContext;
import org.apache.uima.analysis_engine.AnalysisEngineProcessException;
import org.apache.uima.fit.component.JCasAnnotator_ImplBase;
import org.apache.uima.fit.descriptor.ConfigurationParameter;
import org.apache.uima.fit.util.JCasUtil;
import org.apache.uima.jcas.JCas;
import org.apache.uima.resource.ResourceInitializationException;

import com.iai.jcas.tcas.QuoteEvaluationAnnotation;
import com.iai.uima.jcas.tcas.QuoteAnnotation;

import de.tudarmstadt.ukp.dkpro.core.api.metadata.type.DocumentMetaData;

public class QuoteEvaluationAnnotator extends JCasAnnotator_ImplBase {

	public static final String PARAM_QUOTES_TO_QUOTEE_LOCATION = "quotes2quoteeLocation";
	@ConfigurationParameter(name = PARAM_QUOTES_TO_QUOTEE_LOCATION, mandatory = false)
	private String quotes2quoteeLocation;

	@Override
	public void initialize(UimaContext aContext) throws ResourceInitializationException {
		super.initialize(aContext);
	}

	@Override
	public void process(JCas aJCas) throws AnalysisEngineProcessException {

		HashMap<Integer, String> quoteBegin2quotee = new HashMap<Integer, String>();
		DocumentMetaData meta = DocumentMetaData.get(aJCas);
		String baseUri = meta.getDocumentBaseUri();
		String docID = meta.getDocumentId().substring(0, meta.getDocumentId().lastIndexOf('.'));

		URI uri = null;
		try {
			uri = new URI(baseUri + "manual_quotes/" + docID + ".quote");
		} catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
		BufferedReader br = null;
		try {
			br = new BufferedReader(new FileReader(new File(uri)));
			String line;
			while ((line = br.readLine()) != null) {
				String[] content = line.toLowerCase().split("\\t");
				quoteBegin2quotee.put(Integer.parseInt(content[0]), content[1]);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.err.println("Quotes file " + uri + " could not be found");
			return;
		} catch (IOException e) {
			throw new AnalysisEngineProcessException(e);
		}

		Collection<QuoteAnnotation> quotes = JCasUtil.select(aJCas, QuoteAnnotation.class);
		int found = 0;

		for (QuoteAnnotation quote : quotes) {
			String quotee = quoteBegin2quotee.get(quote.getBegin());
			if (quotee == null)
				continue;
			String repQuotee = quote.getRepresentativeQuoteeMention().toLowerCase();
			if (repQuotee.contains(quotee) || quotee.contains(repQuotee))
				found++;
		}
		QuoteEvaluationAnnotation annotation = new QuoteEvaluationAnnotation(aJCas);

		double precision = (double) found / quotes.size();
		double recall = (double) quotes.size() / quoteBegin2quotee.size();

		annotation.setPrecision(precision);
		annotation.setRecall(recall);
		annotation.setF1Score(precision * recall / (precision + recall));
		annotation.addToIndexes();
	}

}
