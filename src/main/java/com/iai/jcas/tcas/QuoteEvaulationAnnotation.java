

/* First created by JCasGen Wed Aug 10 13:32:38 CEST 2016 */
package com.iai.jcas.tcas;

import org.apache.uima.jcas.JCas; 
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;

import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Wed Aug 10 13:32:38 CEST 2016
 * XML source: D:/merlin/workspace_eumssi_new/com.iai.QuoteAnnotatonEvaluator/src/main/resources/com/iai/uima/jcas/tcas/QuoteAnnotationEvaluationTypeSystem.xml
 * @generated */
public class QuoteEvaulationAnnotation extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(QuoteEvaulationAnnotation.class);
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
  protected QuoteEvaulationAnnotation() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated
   * @param addr low level Feature Structure reference
   * @param type the type of this Feature Structure 
   */
  public QuoteEvaulationAnnotation(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated
   * @param jcas JCas to which this Feature Structure belongs 
   */
  public QuoteEvaulationAnnotation(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated
   * @param jcas JCas to which this Feature Structure belongs
   * @param begin offset to the begin spot in the SofA
   * @param end offset to the end spot in the SofA 
  */  
  public QuoteEvaulationAnnotation(JCas jcas, int begin, int end) {
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
    if (QuoteEvaulationAnnotation_Type.featOkTst && ((QuoteEvaulationAnnotation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "com.iai.jcas.tcas.QuoteEvaulationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QuoteEvaulationAnnotation_Type)jcasType).casFeatCode_Precision);}
    
  /** setter for Precision - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setPrecision(double v) {
    if (QuoteEvaulationAnnotation_Type.featOkTst && ((QuoteEvaulationAnnotation_Type)jcasType).casFeat_Precision == null)
      jcasType.jcas.throwFeatMissing("Precision", "com.iai.jcas.tcas.QuoteEvaulationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QuoteEvaulationAnnotation_Type)jcasType).casFeatCode_Precision, v);}    
   
    
  //*--------------*
  //* Feature: Recall

  /** getter for Recall - gets 
   * @generated
   * @return value of the feature 
   */
  public double getRecall() {
    if (QuoteEvaulationAnnotation_Type.featOkTst && ((QuoteEvaulationAnnotation_Type)jcasType).casFeat_Recall == null)
      jcasType.jcas.throwFeatMissing("Recall", "com.iai.jcas.tcas.QuoteEvaulationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QuoteEvaulationAnnotation_Type)jcasType).casFeatCode_Recall);}
    
  /** setter for Recall - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setRecall(double v) {
    if (QuoteEvaulationAnnotation_Type.featOkTst && ((QuoteEvaulationAnnotation_Type)jcasType).casFeat_Recall == null)
      jcasType.jcas.throwFeatMissing("Recall", "com.iai.jcas.tcas.QuoteEvaulationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QuoteEvaulationAnnotation_Type)jcasType).casFeatCode_Recall, v);}    
   
    
  //*--------------*
  //* Feature: F1Score

  /** getter for F1Score - gets 
   * @generated
   * @return value of the feature 
   */
  public double getF1Score() {
    if (QuoteEvaulationAnnotation_Type.featOkTst && ((QuoteEvaulationAnnotation_Type)jcasType).casFeat_F1Score == null)
      jcasType.jcas.throwFeatMissing("F1Score", "com.iai.jcas.tcas.QuoteEvaulationAnnotation");
    return jcasType.ll_cas.ll_getDoubleValue(addr, ((QuoteEvaulationAnnotation_Type)jcasType).casFeatCode_F1Score);}
    
  /** setter for F1Score - sets  
   * @generated
   * @param v value to set into the feature 
   */
  public void setF1Score(double v) {
    if (QuoteEvaulationAnnotation_Type.featOkTst && ((QuoteEvaulationAnnotation_Type)jcasType).casFeat_F1Score == null)
      jcasType.jcas.throwFeatMissing("F1Score", "com.iai.jcas.tcas.QuoteEvaulationAnnotation");
    jcasType.ll_cas.ll_setDoubleValue(addr, ((QuoteEvaulationAnnotation_Type)jcasType).casFeatCode_F1Score, v);}    
  }

    