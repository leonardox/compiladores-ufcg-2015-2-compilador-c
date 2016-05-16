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
import org.xtext.example.ansic.expression_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>expression linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.expression_linhaImpl#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.expression_linhaImpl#getExpression_linha <em>Expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class expression_linhaImpl extends MinimalEObjectImpl.Container implements expression_linha
{
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
   * The cached value of the '{@link #getExpression_linha() <em>Expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_linha()
   * @generated
   * @ordered
   */
  protected expression_linha expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected expression_linhaImpl()
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
    return AnsicPackage.Literals.EXPRESSION_LINHA;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
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
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_linha getExpression_linha()
  {
    return expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_linha(expression_linha newExpression_linha, NotificationChain msgs)
  {
    expression_linha oldExpression_linha = expression_linha;
    expression_linha = newExpression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, oldExpression_linha, newExpression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_linha(expression_linha newExpression_linha)
  {
    if (newExpression_linha != expression_linha)
    {
      NotificationChain msgs = null;
      if (expression_linha != null)
        msgs = ((InternalEObject)expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, null, msgs);
      if (newExpression_linha != null)
        msgs = ((InternalEObject)newExpression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, null, msgs);
      msgs = basicSetExpression_linha(newExpression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA, newExpression_linha, newExpression_linha));
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
      case AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
      case AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        return basicSetExpression_linha(null, msgs);
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
      case AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
      case AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        return getExpression_linha();
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
      case AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
        return;
      case AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        setExpression_linha((expression_linha)newValue);
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
      case AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
        return;
      case AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        setExpression_linha((expression_linha)null);
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
      case AnsicPackage.EXPRESSION_LINHA__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
      case AnsicPackage.EXPRESSION_LINHA__EXPRESSION_LINHA:
        return expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //expression_linhaImpl
