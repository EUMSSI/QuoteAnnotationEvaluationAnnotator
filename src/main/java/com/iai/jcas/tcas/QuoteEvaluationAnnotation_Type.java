
/* First created by JCasGen Fri Aug 12 14:06:18 CEST 2016 */
package com.iai.jcas.tcas;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.cas.impl.CASImpl;
import org.apache.uima.cas.impl.FSGenerator;
import org.apache.uima.cas.FeatureStructure;
import org.apache.uima.cas.impl.TypeImpl;
import org.apache.uima.cas.Type;
import org.apache.uima.cas.impl.FeatureImpl;
import org.apache.uima.cas.Feature;
import org.apache.uima.jcas.tcas.Annotation_Type;

/** 
 * Updated by JCasGen Fri Aug 12 14:07:51 CEST 2016
 * @generated */
public class QuoteEvaluationAnnotation_Type extends Annotation_Type {
  /** @generated 
   * @return the generator for this type
   */
  @Override
  protected FSGenerator getFSGenerator() {return fsGenerator;}
  /** @generated */
  private final FSGenerator fsGenerator = 
    new FSGenerator() {
      public FeatureStructure createFS(int addr, CASImpl cas) {
  			 if (QuoteEvaluationAnnotation_Type.this.useExistingInstance) {
  			   // Return eq fs instance if already created
  		     FeatureStructure fs = QuoteEvaluationAnnotation_Type.this.jcas.getJfsFromCaddr(addr);
  		     if (null == fs) {
  		       fs = new QuoteEvaluationAnnotation(addr, QuoteEvaluationAnnotation_Type.this);
  			   QuoteEvaluationAnnotation_Type.this.jcas.putJfsFromCaddr(addr, fs);
  			   return fs;
  		     }
  		     return fs;
        } else return new QuoteEvaluationAnnotation(addr, QuoteEvaluationAnnotation_Type.this);
  	  }
    };
  /** @generated */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = QuoteEvaluationAnnotation.typeIndexID;
  /** @generated 
     @modifiable */
  @SuppressWarnings ("hiding")
  public final static boolean featOkTst = JCasRegistry.getFeatOkTst("com.iai.jcas.tcas.QuoteEvaluationAnnotation");
 
  /** @generated */
  final Feature casFeat_Precision;
  /** @generated */
  final int     casFeatCode_Precision;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getPrecision(int addr) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "com.iai.jcas.tcas.QuoteEvaluationAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Precision);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setPrecision(int addr, double v) {
        if (featOkTst && casFeat_Precision == null)
      jcas.throwFeatMissing("Precision", "com.iai.jcas.tcas.QuoteEvaluationAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Precision, v);}
    
  
 
  /** @generated */
  final Feature casFeat_Recall;
  /** @generated */
  final int     casFeatCode_Recall;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getRecall(int addr) {
        if (featOkTst && casFeat_Recall == null)
      jcas.throwFeatMissing("Recall", "com.iai.jcas.tcas.QuoteEvaluationAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_Recall);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setRecall(int addr, double v) {
        if (featOkTst && casFeat_Recall == null)
      jcas.throwFeatMissing("Recall", "com.iai.jcas.tcas.QuoteEvaluationAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_Recall, v);}
    
  
 
  /** @generated */
  final Feature casFeat_F1Score;
  /** @generated */
  final int     casFeatCode_F1Score;
  /** @generated
   * @param addr low level Feature Structure reference
   * @return the feature value 
   */ 
  public double getF1Score(int addr) {
        if (featOkTst && casFeat_F1Score == null)
      jcas.throwFeatMissing("F1Score", "com.iai.jcas.tcas.QuoteEvaluationAnnotation");
    return ll_cas.ll_getDoubleValue(addr, casFeatCode_F1Score);
  }
  /** @generated
   * @param addr low level Feature Structure reference
   * @param v value to set 
   */    
  public void setF1Score(int addr, double v) {
        if (featOkTst && casFeat_F1Score == null)
      jcas.throwFeatMissing("F1Score", "com.iai.jcas.tcas.QuoteEvaluationAnnotation");
    ll_cas.ll_setDoubleValue(addr, casFeatCode_F1Score, v);}
    
  



  /** initialize variables to correspond with Cas Type and Features
	 * @generated
	 * @param jcas JCas
	 * @param casType Type 
	 */
  public QuoteEvaluationAnnotation_Type(JCas jcas, Type casType) {
    super(jcas, casType);
    casImpl.getFSClassRegistry().addGeneratorForType((TypeImpl)this.casType, getFSGenerator());

 
    casFeat_Precision = jcas.getRequiredFeatureDE(casType, "Precision", "uima.cas.Double", featOkTst);
    casFeatCode_Precision  = (null == casFeat_Precision) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Precision).getCode();

 
    casFeat_Recall = jcas.getRequiredFeatureDE(casType, "Recall", "uima.cas.Double", featOkTst);
    casFeatCode_Recall  = (null == casFeat_Recall) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_Recall).getCode();

 
    casFeat_F1Score = jcas.getRequiredFeatureDE(casType, "F1Score", "uima.cas.Double", featOkTst);
    casFeatCode_F1Score  = (null == casFeat_F1Score) ? JCas.INVALID_FEATURE_CODE : ((FeatureImpl)casFeat_F1Score).getCode();

  }
}



    