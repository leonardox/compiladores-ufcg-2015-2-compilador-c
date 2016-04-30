/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>enum specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.enum_specifier#getEnumerator_list <em>Enumerator list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.enum_specifier#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getenum_specifier()
 * @model
 * @generated
 */
public interface enum_specifier extends EObject
{
  /**
   * Returns the value of the '<em><b>Enumerator list</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enumerator list</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enumerator list</em>' containment reference.
   * @see #setEnumerator_list(enumerator_list)
   * @see org.xtext.example.ansic.AnsicPackage#getenum_specifier_Enumerator_list()
   * @model containment="true"
   * @generated
   */
  enumerator_list getEnumerator_list();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.enum_specifier#getEnumerator_list <em>Enumerator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enumerator list</em>' containment reference.
   * @see #getEnumerator_list()
   * @generated
   */
  void setEnumerator_list(enumerator_list value);

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
   * @see org.xtext.example.ansic.AnsicPackage#getenum_specifier_Identifier()
   * @model
   * @generated
   */
  String getIdentifier();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.enum_specifier#getIdentifier <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Identifier</em>' attribute.
   * @see #getIdentifier()
   * @generated
   */
  void setIdentifier(String value);

} // enum_specifier
