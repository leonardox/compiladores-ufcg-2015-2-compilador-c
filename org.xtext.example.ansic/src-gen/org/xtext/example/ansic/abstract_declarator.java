/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>abstract declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.abstract_declarator#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.xtext.example.ansic.abstract_declarator#getDirect_abstract_declarator <em>Direct abstract declarator</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getabstract_declarator()
 * @model
 * @generated
 */
public interface abstract_declarator extends EObject
{
  /**
   * Returns the value of the '<em><b>Pointer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pointer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pointer</em>' containment reference.
   * @see #setPointer(pointer)
   * @see org.xtext.example.ansic.AnsicPackage#getabstract_declarator_Pointer()
   * @model containment="true"
   * @generated
   */
  pointer getPointer();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.abstract_declarator#getPointer <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pointer</em>' containment reference.
   * @see #getPointer()
   * @generated
   */
  void setPointer(pointer value);

  /**
   * Returns the value of the '<em><b>Direct abstract declarator</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Direct abstract declarator</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Direct abstract declarator</em>' containment reference.
   * @see #setDirect_abstract_declarator(direct_abstract_declarator)
   * @see org.xtext.example.ansic.AnsicPackage#getabstract_declarator_Direct_abstract_declarator()
   * @model containment="true"
   * @generated
   */
  direct_abstract_declarator getDirect_abstract_declarator();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.abstract_declarator#getDirect_abstract_declarator <em>Direct abstract declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Direct abstract declarator</em>' containment reference.
   * @see #getDirect_abstract_declarator()
   * @generated
   */
  void setDirect_abstract_declarator(direct_abstract_declarator value);

} // abstract_declarator
