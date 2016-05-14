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
import org.xtext.example.ansic.conditional_expression;
import org.xtext.example.ansic.conditional_expression_linha;
import org.xtext.example.ansic.expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>conditional expression linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.conditional_expression_linhaImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.conditional_expression_linhaImpl#getConditional_expression <em>Conditional expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.conditional_expression_linhaImpl#getConditional_expression_linha <em>Conditional expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class conditional_expression_linhaImpl extends MinimalEObjectImpl.Container implements conditional_expression_linha
{
  /**
   * The cached value of the '{@link #getExpression() <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression()
   * @generated
   * @ordered
   */
  protected expression expression;

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
   * The cached value of the '{@link #getConditional_expression_linha() <em>Conditional expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConditional_expression_linha()
   * @generated
   * @ordered
   */
  protected conditional_expression_linha conditional_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected conditional_expression_linhaImpl()
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
    return AnsicPackage.Literals.CONDITIONAL_EXPRESSION_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression getExpression()
  {
    return expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression(expression newExpression, NotificationChain msgs)
  {
    expression oldExpression = expression;
    expression = newExpression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION, oldExpression, newExpression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression(expression newExpression)
  {
    if (newExpression != expression)
    {
      NotificationChain msgs = null;
      if (expression != null)
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION, newExpression, newExpression));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION, oldConditional_expression, newConditional_expression);
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
        msgs = ((InternalEObject)conditional_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION, null, msgs);
      if (newConditional_expression != null)
        msgs = ((InternalEObject)newConditional_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION, null, msgs);
      msgs = basicSetConditional_expression(newConditional_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION, newConditional_expression, newConditional_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public conditional_expression_linha getConditional_expression_linha()
  {
    return conditional_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetConditional_expression_linha(conditional_expression_linha newConditional_expression_linha, NotificationChain msgs)
  {
    conditional_expression_linha oldConditional_expression_linha = conditional_expression_linha;
    conditional_expression_linha = newConditional_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA, oldConditional_expression_linha, newConditional_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setConditional_expression_linha(conditional_expression_linha newConditional_expression_linha)
  {
    if (newConditional_expression_linha != conditional_expression_linha)
    {
      NotificationChain msgs = null;
      if (conditional_expression_linha != null)
        msgs = ((InternalEObject)conditional_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA, null, msgs);
      if (newConditional_expression_linha != null)
        msgs = ((InternalEObject)newConditional_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetConditional_expression_linha(newConditional_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA, newConditional_expression_linha, newConditional_expression_linha));
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
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION:
        return basicSetConditional_expression(null, msgs);
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA:
        return basicSetConditional_expression_linha(null, msgs);
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
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION:
        return getExpression();
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION:
        return getConditional_expression();
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA:
        return getConditional_expression_linha();
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
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION:
        setConditional_expression((conditional_expression)newValue);
        return;
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA:
        setConditional_expression_linha((conditional_expression_linha)newValue);
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
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION:
        setExpression((expression)null);
        return;
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION:
        setConditional_expression((conditional_expression)null);
        return;
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA:
        setConditional_expression_linha((conditional_expression_linha)null);
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
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__EXPRESSION:
        return expression != null;
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION:
        return conditional_expression != null;
      case AnsicPackage.CONDITIONAL_EXPRESSION_LINHA__CONDITIONAL_EXPRESSION_LINHA:
        return conditional_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //conditional_expression_linhaImpl
