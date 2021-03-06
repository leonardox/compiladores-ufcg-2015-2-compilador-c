/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>assignment expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.assignment_expression#getConditional_expression <em>Conditional expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.assignment_expression#getUnary_expression <em>Unary expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.assignment_expression#getAssignment_operator <em>Assignment operator</em>}</li>
 *   <li>{@link org.xtext.example.ansic.assignment_expression#getAssignment_expression <em>Assignment expression</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getassignment_expression()
 * @model
 * @generated
 */
public interface assignment_expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditional expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conditional expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditional expression</em>' containment reference.
   * @see #setConditional_expression(conditional_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getassignment_expression_Conditional_expression()
   * @model containment="true"
   * @generated
   */
  conditional_expression getConditional_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.assignment_expression#getConditional_expression <em>Conditional expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditional expression</em>' containment reference.
   * @see #getConditional_expression()
   * @generated
   */
  void setConditional_expression(conditional_expression value);

  /**
   * Returns the value of the '<em><b>Unary expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unary expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unary expression</em>' containment reference.
   * @see #setUnary_expression(unary_expression)
   * @see org.xtext.example.ansic.AnsicPackage#getassignment_expression_Unary_expression()
   * @model containment="true"
   * @generated
   */
  unary_expression getUnary_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.assignment_expression#getUnary_expression <em>Unary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unary expression</em>' containment reference.
   * @see #getUnary_expression()
   * @generated
   */
  void setUnary_expression(unary_expression value);

  /**
   * Returns the value of the '<em><b>Assignment operator</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assignment operator</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assignment operator</em>' attribute.
   * @see #setAssignment_operator(String)
   * @see org.xtext.example.ansic.AnsicPackage#getassignment_expression_Assignment_operator()
   * @model
   * @generated
   */
  String getAssignment_operator();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.assignment_expression#getAssignment_operator <em>Assignment operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment operator</em>' attribute.
   * @see #getAssignment_operator()
   * @generated
   */
  void setAssignment_operator(String value);

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
   * @see org.xtext.example.ansic.AnsicPackage#getassignment_expression_Assignment_expression()
   * @model containment="true"
   * @generated
   */
  assignment_expression getAssignment_expression();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.assignment_expression#getAssignment_expression <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assignment expression</em>' containment reference.
   * @see #getAssignment_expression()
   * @generated
   */
  void setAssignment_expression(assignment_expression value);

} // assignment_expression
