/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>direct abstract declarator complement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.direct_abstract_declarator_complement#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.direct_abstract_declarator_complement#getType_qualifier_list <em>Type qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.direct_abstract_declarator_complement#getParameter_type_list <em>Parameter type list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getdirect_abstract_declarator_complement()
 * @model
 * @generated
 */
public interface direct_abstract_declarator_complement extends EObject
{
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
   * @see org.xtext.example.ansic.AnsicPackage#getdirect_abstract_declarator_complement_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.direct_abstract_declarator_complement#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

  /**
   * Returns the value of the '<em><b>Type qualifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type qualifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type qualifier list</em>' containment reference.
   * @see #setType_qualifier_list(type_qualifier_list)
   * @see org.xtext.example.ansic.AnsicPackage#getdirect_abstract_declarator_complement_Type_qualifier_list()
   * @model containment="true"
   * @generated
   */
  type_qualifier_list getType_qualifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.direct_abstract_declarator_complement#getType_qualifier_list <em>Type qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type qualifier list</em>' containment reference.
   * @see #getType_qualifier_list()
   * @generated
   */
  void setType_qualifier_list(type_qualifier_list value);

  /**
   * Returns the value of the '<em><b>Parameter type list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parameter type list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parameter type list</em>' containment reference.
   * @see #setParameter_type_list(parameter_type_list)
   * @see org.xtext.example.ansic.AnsicPackage#getdirect_abstract_declarator_complement_Parameter_type_list()
   * @model containment="true"
   * @generated
   */
  parameter_type_list getParameter_type_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.direct_abstract_declarator_complement#getParameter_type_list <em>Parameter type list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parameter type list</em>' containment reference.
   * @see #getParameter_type_list()
   * @generated
   */
  void setParameter_type_list(parameter_type_list value);

} // direct_abstract_declarator_complement
