/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>init declarator</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.init_declarator#getDeclarator <em>Declarator</em>}</li>
 *   <li>{@link org.xtext.example.ansic.init_declarator#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getinit_declarator()
 * @model
 * @generated
 */
public interface init_declarator extends EObject
{
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
   * @see org.xtext.example.ansic.AnsicPackage#getinit_declarator_Declarator()
   * @model containment="true"
   * @generated
   */
  declarator getDeclarator();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.init_declarator#getDeclarator <em>Declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declarator</em>' containment reference.
   * @see #getDeclarator()
   * @generated
   */
  void setDeclarator(declarator value);

  /**
   * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Initializer</em>' containment reference.
   * @see #setInitializer(initializer)
   * @see org.xtext.example.ansic.AnsicPackage#getinit_declarator_Initializer()
   * @model containment="true"
   * @generated
   */
  initializer getInitializer();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.init_declarator#getInitializer <em>Initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Initializer</em>' containment reference.
   * @see #getInitializer()
   * @generated
   */
  void setInitializer(initializer value);

} // init_declarator