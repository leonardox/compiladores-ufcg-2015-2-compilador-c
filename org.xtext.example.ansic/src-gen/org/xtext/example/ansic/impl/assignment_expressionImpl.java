/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.xtext.example.ansic.AnsicPackage;
import org.xtext.example.ansic.assignment_expression;
import org.xtext.example.ansic.conditional_expression;
import org.xtext.example.ansic.unary_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>assignment expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.assignment_expressionImpl#getConditional_expression <em>Conditional expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.assignment_expressionImpl#getUnary_expression <em>Unary expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.assignment_expressionImpl#getAssignment_operator <em>Assignment operator</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.assignment_expressionImpl#getAssignment_expression <em>Assignment expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class assignment_expressionImpl extends MinimalEObjectImpl.Container implements assignment_expression
{
  /**
   * The cached value of the '{@link #getConditional_expression() <em>Conditional expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional_expression()
   * @generated
   * @ordered
   */
  protected conditional_expression conditional_expression;

  /**
   * The cached value of the '{@link #getUnary_expression() <em>Unary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnary_expression()
   * @generated
   * @ordered
   */
  protected unary_expression unary_expression;

  /**
   * The default value of the '{@link #getAssignment_operator() <em>Assignment operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment_operator()
   * @generated
   * @ordered
   */
  protected static final String ASSIGNMENT_OPERATOR_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssignment_operator() <em>Assignment operator</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment_operator()
   * @generated
   * @ordered
   */
  protected String assignment_operator = ASSIGNMENT_OPERATOR_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssignment_expression() <em>Assignment expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignment_expression()
   * @generated
   * @ordered
   */
  protected assignment_expression assignment_expression;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected assignment_expressionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AnsicPackage.Literals.ASSIGNMENT_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_expression getConditional_expression()
  {
    return conditional_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional_expression(conditional_expression newConditional_expression, NotificationChain msgs)
  {
    conditional_expression oldConditional_expression = conditional_expression;
    conditional_expression = newConditional_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION, oldConditional_expression, newConditional_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional_expression(conditional_expression newConditional_expression)
  {
    if (newConditional_expression != conditional_expression)
    {
      NotificationChain msgs = null;
      if (conditional_expression != null)
        msgs = ((InternalEObject)conditional_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION, null, msgs);
      if (newConditional_expression != null)
        msgs = ((InternalEObject)newConditional_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION, null, msgs);
      msgs = basicSetConditional_expression(newConditional_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION, newConditional_expression, newConditional_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public unary_expression getUnary_expression()
  {
    return unary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetUnary_expression(unary_expression newUnary_expression, NotificationChain msgs)
  {
    unary_expression oldUnary_expression = unary_expression;
    unary_expression = newUnary_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION, oldUnary_expression, newUnary_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnary_expression(unary_expression newUnary_expression)
  {
    if (newUnary_expression != unary_expression)
    {
      NotificationChain msgs = null;
      if (unary_expression != null)
        msgs = ((InternalEObject)unary_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION, null, msgs);
      if (newUnary_expression != null)
        msgs = ((InternalEObject)newUnary_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION, null, msgs);
      msgs = basicSetUnary_expression(newUnary_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION, newUnary_expression, newUnary_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssignment_operator()
  {
    return assignment_operator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment_operator(String newAssignment_operator)
  {
    String oldAssignment_operator = assignment_operator;
    assignment_operator = newAssignment_operator;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR, oldAssignment_operator, assignment_operator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public assignment_expression getAssignment_expression()
  {
    return assignment_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAssignment_expression(assignment_expression newAssignment_expression, NotificationChain msgs)
  {
    assignment_expression oldAssignment_expression = assignment_expression;
    assignment_expression = newAssignment_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssignment_expression(assignment_expression newAssignment_expression)
  {
    if (newAssignment_expression != assignment_expression)
    {
      NotificationChain msgs = null;
      if (assignment_expression != null)
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION:
        return basicSetConditional_expression(null, msgs);
      case AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION:
        return basicSetUnary_expression(null, msgs);
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION:
        return getConditional_expression();
      case AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION:
        return getUnary_expression();
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        return getAssignment_operator();
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION:
        setConditional_expression((conditional_expression)newValue);
        return;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION:
        setUnary_expression((unary_expression)newValue);
        return;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        setAssignment_operator((String)newValue);
        return;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION:
        setConditional_expression((conditional_expression)null);
        return;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION:
        setUnary_expression((unary_expression)null);
        return;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        setAssignment_operator(ASSIGNMENT_OPERATOR_EDEFAULT);
        return;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AnsicPackage.ASSIGNMENT_EXPRESSION__CONDITIONAL_EXPRESSION:
        return conditional_expression != null;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__UNARY_EXPRESSION:
        return unary_expression != null;
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_OPERATOR:
        return ASSIGNMENT_OPERATOR_EDEFAULT == null ? assignment_operator != null : !ASSIGNMENT_OPERATOR_EDEFAULT.equals(assignment_operator);
      case AnsicPackage.ASSIGNMENT_EXPRESSION__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (assignment_operator: ");
    result.append(assignment_operator);
    result.append(')');
    return result.toString();
  }

} //assignment_expressionImpl
