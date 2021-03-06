/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>initializer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.initializer#getInit_declarator_list <em>Init declarator list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.initializer#getAssignment_expression <em>Assignment expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getinitializer()
 * @model
 * @generated
 */
public interface initializer extends EObject
{
  /**
   * Returns the value of the '<em><b>Init declarator list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Init declarator list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Init declarator list</em>' containment reference.
   * @see #setInit_declarator_list(initializer_list)
   * @see org.xtext.example.ansic.AnsicPackage#getinitializer_Init_declarator_list()
   * @model containment="true"
   * @generated
   */
  initializer_list getInit_declarator_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.initializer#getInit_declarator_list <em>Init declarator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Init declarator list</em>' containment reference.
   * @see #getInit_declarator_list()
   * @generated
   */
  void setInit_declarator_list(initializer_list value);

  /**
   * Returns the value of the '<em><b>Assignment expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment expression</em>' containment reference.
   * @see #setAssignment_expression(assignment_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getinitializer_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.initializer#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

} // initializer
