/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>postfix expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.postfix_expression#getPrimary_expression <em>Primary expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.postfix_expression#getPostfix_expression_linha <em>Postfix expression linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression()
 * @model
 * @generated
 */
public interface postfix_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Primary expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Primary expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Primary expression</em>' containment reference.
   * @see #setPrimary_expression(primary_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression_Primary_expression()
   * @model containment="true"
   * @generated
   */
  primary_expression getPrimary_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.postfix_expression#getPrimary_expression <em>Primary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Primary expression</em>' containment reference.
   * @see #getPrimary_expression()
   * @generated
   */
  void setPrimary_expression(primary_expression value);

  /**
   * Returns the value of the '<em><b>Postfix expression linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Postfix expression linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Postfix expression linha</em>' containment reference.
   * @see #setPostfix_expression_linha(postfix_expression_linha)
   * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression_Postfix_expression_linha()
   * @model containment="true"
   * @generated
   */
  postfix_expression_linha getPostfix_expression_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.postfix_expression#getPostfix_expression_linha <em>Postfix expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Postfix expression linha</em>' containment reference.
   * @see #getPostfix_expression_linha()
   * @generated
   */
  void setPostfix_expression_linha(postfix_expression_linha value);

} // postfix_expression
