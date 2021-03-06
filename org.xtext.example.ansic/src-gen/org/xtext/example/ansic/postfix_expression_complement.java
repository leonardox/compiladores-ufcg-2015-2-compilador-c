/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>postfix expression complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.postfix_expression_complement#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.postfix_expression_complement#getArgument_expression_list <em>Argument expression list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.postfix_expression_complement#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression_complement()
 * @model
 * @generated
 */
public interface postfix_expression_complement extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(expression)
   * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression_complement_Expression()
   * @model containment="true"
   * @generated
   */
  expression getExpression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.postfix_expression_complement#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(expression value);

  /**
   * Returns the value of the '<em><b>Argument expression list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument expression list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument expression list</em>' containment reference.
   * @see #setArgument_expression_list(argument_expression_list)
   * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression_complement_Argument_expression_list()
   * @model containment="true"
   * @generated
   */
  argument_expression_list getArgument_expression_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.postfix_expression_complement#getArgument_expression_list <em>Argument expression list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument expression list</em>' containment reference.
   * @see #getArgument_expression_list()
   * @generated
   */
  void setArgument_expression_list(argument_expression_list value);

  /**
   * Returns the value of the '<em><b>Identifier</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Identifier</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Identifier</em>' attribute.
   * @see #setIdentifier(String)
   * @see org.xtext.example.ansic.AnsicPackage#getpostfix_expression_complement_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.postfix_expression_complement#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

} // postfix_expression_complement
