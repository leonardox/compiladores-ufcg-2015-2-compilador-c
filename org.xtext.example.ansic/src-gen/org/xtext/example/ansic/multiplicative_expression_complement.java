/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>multiplicative expression complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.multiplicative_expression_complement#getCast_expression <em>Cast expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getmultiplicative_expression_complement()
 * @model
 * @generated
 */
public interface multiplicative_expression_complement extends EObject
{
  /**
   * Returns the value of the '<em><b>Cast expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cast expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cast expression</em>' containment reference.
   * @see #setCast_expression(cast_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getmultiplicative_expression_complement_Cast_expression()
   * @model containment="true"
   * @generated
   */
  cast_expression getCast_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.multiplicative_expression_complement#getCast_expression <em>Cast expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cast expression</em>' containment reference.
   * @see #getCast_expression()
   * @generated
   */
  void setCast_expression(cast_expression value);

} // multiplicative_expression_complement
