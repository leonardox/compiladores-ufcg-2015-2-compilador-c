/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Struct Or Union Specifier Complement Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.StructOrUnionSpecifierComplementAction#getStruct_declaration_list <em>Struct declaration list</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getStructOrUnionSpecifierComplementAction()
 * @model
 * @generated
 */
public interface StructOrUnionSpecifierComplementAction extends struct_or_union_specifier_complement
{
  /**
   * Returns the value of the '<em><b>Struct declaration list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Struct declaration list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Struct declaration list</em>' containment reference.
   * @see #setStruct_declaration_list(struct_declaration_list)
   * @see org.xtext.example.ansic.AnsicPackage#getStructOrUnionSpecifierComplementAction_Struct_declaration_list()
   * @model containment="true"
   * @generated
   */
  struct_declaration_list getStruct_declaration_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.StructOrUnionSpecifierComplementAction#getStruct_declaration_list <em>Struct declaration list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Struct declaration list</em>' containment reference.
   * @see #getStruct_declaration_list()
   * @generated
   */
  void setStruct_declaration_list(struct_declaration_list value);

} // StructOrUnionSpecifierComplementAction