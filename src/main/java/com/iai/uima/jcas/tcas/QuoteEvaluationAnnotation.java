

/* First created by JCasGen Fri Aug 12 14:06:18 CEST 2016 */
package com.iai.uima.jcas.tcas;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Fri Aug 12 14:14:32 CEST 2016
 * XML source: D:/merlin/GitHub/QuoteEvaluationAnnotator/src/main/resources/com/iai/uima/jcas/tcas/QuoteEvaluationTypeSystem.xml
 * @generated */
public class QuoteEvaluationAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuoteEvaluationAnnotation.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated
   * @return index of the type  
   */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected QuoteEvaluationAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuoteEvaluationAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuoteEvaluationAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuoteEvaluationAnnotation(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** 
   * <!-- begin-user-doc -->
   * Write your own initialization here
   * <!-- end-user-doc -->
   *
   * @generated modifiable 
   */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: Precision

  /** getter for Precision - gets 
   * @generated
   * @return value of the feature 
   */
  public double getPrecision() {
    if (QuoteEvaluationAnnotation_Type.featOkTst && ((QuoteEvaluationAnnotation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "com.iai.uima.jcas.tcas.QuoteEvaluationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QuoteEvaluationAnnotation_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(double v) {
    if (QuoteEvaluationAnnotation_Type.featOkTst && ((QuoteEvaluationAnnotation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "com.iai.uima.jcas.tcas.QuoteEvaluationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QuoteEvaluationAnnotation_Type)jcasType).casFeatCode_Precision, v);}    
   
    
  //*--------------*
  //* Feature: Recall

  /** getter for Recall - gets 
   * @generated
   * @return value of the feature 
   */
  public double getRecall() {
    if (QuoteEvaluationAnnotation_Type.featOkTst && ((QuoteEvaluationAnnotation_Type)jcasType).casFeat_Recall == null)
      jcasType.jcas.throwFeatMissing("Recall", "com.iai.uima.jcas.tcas.QuoteEvaluationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QuoteEvaluationAnnotation_Type)jcasType).casFeatCode_Recall);}
    
  /** setter for Recall - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecall(double v) {
    if (QuoteEvaluationAnnotation_Type.featOkTst && ((QuoteEvaluationAnnotation_Type)jcasType).casFeat_Recall == null)
      jcasType.jcas.throwFeatMissing("Recall", "com.iai.uima.jcas.tcas.QuoteEvaluationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QuoteEvaluationAnnotation_Type)jcasType).casFeatCode_Recall, v);}    
   
    
  //*--------------*
  //* Feature: F1Score

  /** getter for F1Score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getF1Score() {
    if (QuoteEvaluationAnnotation_Type.featOkTst && ((QuoteEvaluationAnnotation_Type)jcasType).casFeat_F1Score == null)
      jcasType.jcas.throwFeatMissing("F1Score", "com.iai.uima.jcas.tcas.QuoteEvaluationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QuoteEvaluationAnnotation_Type)jcasType).casFeatCode_F1Score);}
    
  /** setter for F1Score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setF1Score(double v) {
    if (QuoteEvaluationAnnotation_Type.featOkTst && ((QuoteEvaluationAnnotation_Type)jcasType).casFeat_F1Score == null)
      jcasType.jcas.throwFeatMissing("F1Score", "com.iai.uima.jcas.tcas.QuoteEvaluationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QuoteEvaluationAnnotation_Type)jcasType).casFeatCode_F1Score, v);}    
  }

    