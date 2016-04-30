/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>additive expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.additive_expression#getMultiplicative_expression <em>Multiplicative expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.additive_expression#getAdditive_expression_linha <em>Additive expression linha</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getadditive_expression()
 * @model
 * @generated
 */
public interface additive_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Multiplicative expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Multiplicative expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Multiplicative expression</em>' containment reference.
   * @see #setMultiplicative_expression(multiplicative_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getadditive_expression_Multiplicative_expression()
   * @model containment="true"
   * @generated
   */
  multiplicative_expression getMultiplicative_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.additive_expression#getMultiplicative_expression <em>Multiplicative expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Multiplicative expression</em>' containment reference.
   * @see #getMultiplicative_expression()
   * @generated
   */
  void setMultiplicative_expression(multiplicative_expression value);

  /**
   * Returns the value of the '<em><b>Additive expression linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Additive expression linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Additive expression linha</em>' containment reference.
   * @see #setAdditive_expression_linha(additive_expression_linha)
   * @see org.xtext.example.ansic.AnsicPackage#getadditive_expression_Additive_expression_linha()
   * @model containment="true"
   * @generated
   */
  additive_expression_linha getAdditive_expression_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.additive_expression#getAdditive_expression_linha <em>Additive expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Additive expression linha</em>' containment reference.
   * @see #getAdditive_expression_linha()
   * @generated
   */
  void setAdditive_expression_linha(additive_expression_linha value);

} // additive_expression
