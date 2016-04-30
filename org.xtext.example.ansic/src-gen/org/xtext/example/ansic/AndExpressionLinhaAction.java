/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Expression Linha Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.AndExpressionLinhaAction#getEquality_expression <em>Equality expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.AndExpressionLinhaAction#getAnd_expression_linha <em>And expression linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getAndExpressionLinhaAction()
 * @model
 * @generated
 */
public interface AndExpressionLinhaAction extends and_expression_linha
{
  /**
   * Returns the value of the '<em><b>Equality expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Equality expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Equality expression</em>' containment reference.
   * @see #setEquality_expression(equality_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getAndExpressionLinhaAction_Equality_expression()
   * @model containment="true"
   * @generated
   */
  equality_expression getEquality_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.AndExpressionLinhaAction#getEquality_expression <em>Equality expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Equality expression</em>' containment reference.
   * @see #getEquality_expression()
   * @generated
   */
  void setEquality_expression(equality_expression value);

  /**
   * Returns the value of the '<em><b>And expression linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>And expression linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>And expression linha</em>' containment reference.
   * @see #setAnd_expression_linha(and_expression_linha)
   * @see org.xtext.example.ansic.AnsicPackage#getAndExpressionLinhaAction_And_expression_linha()
   * @model containment="true"
   * @generated
   */
  and_expression_linha getAnd_expression_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.AndExpressionLinhaAction#getAnd_expression_linha <em>And expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>And expression linha</em>' containment reference.
   * @see #getAnd_expression_linha()
   * @generated
   */
  void setAnd_expression_linha(and_expression_linha value);

} // AndExpressionLinhaAction