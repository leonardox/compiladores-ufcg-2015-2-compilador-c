/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.struct_declarator#getConstant_expression <em>Constant expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.struct_declarator#getDeclarator <em>Declarator</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getstruct_declarator()
 * @model
 * @generated
 */
public interface struct_declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Constant expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Constant expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Constant expression</em>' containment reference.
   * @see #setConstant_expression(constant_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getstruct_declarator_Constant_expression()
   * @model containment="true"
   * @generated
   */
  constant_expression getConstant_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.struct_declarator#getConstant_expression <em>Constant expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Constant expression</em>' containment reference.
   * @see #getConstant_expression()
   * @generated
   */
  void setConstant_expression(constant_expression value);

  /**
   * Returns the value of the '<em><b>Declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declarator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declarator</em>' containment reference.
   * @see #setDeclarator(declarator)
   * @see org.xtext.example.ansic.AnsicPackage#getstruct_declarator_Declarator()
   * @model containment="true"
   * @generated
   */
  declarator getDeclarator();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.struct_declarator#getDeclarator <em>Declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarator</em>' containment reference.
   * @see #getDeclarator()
   * @generated
   */
  void setDeclarator(declarator value);

} // struct_declarator
