/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>struct declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.struct_declaration#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.struct_declaration#getStruct_declarator_list <em>Struct declarator list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.struct_declaration#getStatic_assert_declaration <em>Static assert declaration</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getstruct_declaration()
 * @model
 * @generated
 */
public interface struct_declaration extends EObject
{
  /**
   * Returns the value of the '<em><b>Specifier qualifier list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Specifier qualifier list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Specifier qualifier list</em>' containment reference.
   * @see #setSpecifier_qualifier_list(specifier_qualifier_list)
   * @see org.xtext.example.ansic.AnsicPackage#getstruct_declaration_Specifier_qualifier_list()
   * @model containment="true"
   * @generated
   */
  specifier_qualifier_list getSpecifier_qualifier_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.struct_declaration#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Specifier qualifier list</em>' containment reference.
   * @see #getSpecifier_qualifier_list()
   * @generated
   */
  void setSpecifier_qualifier_list(specifier_qualifier_list value);

  /**
   * Returns the value of the '<em><b>Struct declarator list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declarator list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declarator list</em>' containment reference.
   * @see #setStruct_declarator_list(struct_declarator_list)
   * @see org.xtext.example.ansic.AnsicPackage#getstruct_declaration_Struct_declarator_list()
   * @model containment="true"
   * @generated
   */
  struct_declarator_list getStruct_declarator_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.struct_declaration#getStruct_declarator_list <em>Struct declarator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declarator list</em>' containment reference.
   * @see #getStruct_declarator_list()
   * @generated
   */
  void setStruct_declarator_list(struct_declarator_list value);

  /**
   * Returns the value of the '<em><b>Static assert declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Static assert declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Static assert declaration</em>' containment reference.
   * @see #setStatic_assert_declaration(static_assert_declaration)
   * @see org.xtext.example.ansic.AnsicPackage#getstruct_declaration_Static_assert_declaration()
   * @model containment="true"
   * @generated
   */
  static_assert_declaration getStatic_assert_declaration();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.struct_declaration#getStatic_assert_declaration <em>Static assert declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Static assert declaration</em>' containment reference.
   * @see #getStatic_assert_declaration()
   * @generated
   */
  void setStatic_assert_declaration(static_assert_declaration value);

} // struct_declaration
