/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>relational expression complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.relational_expression_complement#getShift_expression <em>Shift expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getrelational_expression_complement()
 * @model
 * @generated
 */
public interface relational_expression_complement extends EObject
{
  /**
   * Returns the value of the '<em><b>Shift expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shift expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shift expression</em>' containment reference.
   * @see #setShift_expression(shift_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getrelational_expression_complement_Shift_expression()
   * @model containment="true"
   * @generated
   */
  shift_expression getShift_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.relational_expression_complement#getShift_expression <em>Shift expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shift expression</em>' containment reference.
   * @see #getShift_expression()
   * @generated
   */
  void setShift_expression(shift_expression value);

} // relational_expression_complement