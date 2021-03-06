/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>logical or expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.logical_or_expression#getLogical_and_expression <em>Logical and expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.logical_or_expression#getLogical_or_expression_linha <em>Logical or expression linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getlogical_or_expression()
 * @model
 * @generated
 */
public interface logical_or_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Logical and expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical and expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical and expression</em>' containment reference.
   * @see #setLogical_and_expression(logical_and_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getlogical_or_expression_Logical_and_expression()
   * @model containment="true"
   * @generated
   */
  logical_and_expression getLogical_and_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.logical_or_expression#getLogical_and_expression <em>Logical and expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical and expression</em>' containment reference.
   * @see #getLogical_and_expression()
   * @generated
   */
  void setLogical_and_expression(logical_and_expression value);

  /**
   * Returns the value of the '<em><b>Logical or expression linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Logical or expression linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Logical or expression linha</em>' containment reference.
   * @see #setLogical_or_expression_linha(logical_or_expression_linha)
   * @see org.xtext.example.ansic.AnsicPackage#getlogical_or_expression_Logical_or_expression_linha()
   * @model containment="true"
   * @generated
   */
  logical_or_expression_linha getLogical_or_expression_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.logical_or_expression#getLogical_or_expression_linha <em>Logical or expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Logical or expression linha</em>' containment reference.
   * @see #getLogical_or_expression_linha()
   * @generated
   */
  void setLogical_or_expression_linha(logical_or_expression_linha value);

} // logical_or_expression
