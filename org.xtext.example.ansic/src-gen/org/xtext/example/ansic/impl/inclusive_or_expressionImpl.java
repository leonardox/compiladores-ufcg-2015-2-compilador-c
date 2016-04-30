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
import org.xtext.example.ansic.exclusive_or_expression;
import org.xtext.example.ansic.inclusive_or_expression;
import org.xtext.example.ansic.inclusive_or_expression_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>inclusive or expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.inclusive_or_expressionImpl#getExclusive_or_expression <em>Exclusive or expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.inclusive_or_expressionImpl#getInclusive_or_expression_linha <em>Inclusive or expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class inclusive_or_expressionImpl extends MinimalEObjectImpl.Container implements inclusive_or_expression
{
  /**
   * The cached value of the '{@link #getExclusive_or_expression() <em>Exclusive or expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExclusive_or_expression()
   * @generated
   * @ordered
   */
  protected exclusive_or_expression exclusive_or_expression;

  /**
   * The cached value of the '{@link #getInclusive_or_expression_linha() <em>Inclusive or expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInclusive_or_expression_linha()
   * @generated
   * @ordered
   */
  protected inclusive_or_expression_linha inclusive_or_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected inclusive_or_expressionImpl()
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
    return AnsicPackage.Literals.INCLUSIVE_OR_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public exclusive_or_expression getExclusive_or_expression()
  {
    return exclusive_or_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExclusive_or_expression(exclusive_or_expression newExclusive_or_expression, NotificationChain msgs)
  {
    exclusive_or_expression oldExclusive_or_expression = exclusive_or_expression;
    exclusive_or_expression = newExclusive_or_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, oldExclusive_or_expression, newExclusive_or_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExclusive_or_expression(exclusive_or_expression newExclusive_or_expression)
  {
    if (newExclusive_or_expression != exclusive_or_expression)
    {
      NotificationChain msgs = null;
      if (exclusive_or_expression != null)
        msgs = ((InternalEObject)exclusive_or_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, null, msgs);
      if (newExclusive_or_expression != null)
        msgs = ((InternalEObject)newExclusive_or_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, null, msgs);
      msgs = basicSetExclusive_or_expression(newExclusive_or_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION, newExclusive_or_expression, newExclusive_or_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public inclusive_or_expression_linha getInclusive_or_expression_linha()
  {
    return inclusive_or_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInclusive_or_expression_linha(inclusive_or_expression_linha newInclusive_or_expression_linha, NotificationChain msgs)
  {
    inclusive_or_expression_linha oldInclusive_or_expression_linha = inclusive_or_expression_linha;
    inclusive_or_expression_linha = newInclusive_or_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA, oldInclusive_or_expression_linha, newInclusive_or_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInclusive_or_expression_linha(inclusive_or_expression_linha newInclusive_or_expression_linha)
  {
    if (newInclusive_or_expression_linha != inclusive_or_expression_linha)
    {
      NotificationChain msgs = null;
      if (inclusive_or_expression_linha != null)
        msgs = ((InternalEObject)inclusive_or_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA, null, msgs);
      if (newInclusive_or_expression_linha != null)
        msgs = ((InternalEObject)newInclusive_or_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetInclusive_or_expression_linha(newInclusive_or_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA, newInclusive_or_expression_linha, newInclusive_or_expression_linha));
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
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        return basicSetExclusive_or_expression(null, msgs);
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA:
        return basicSetInclusive_or_expression_linha(null, msgs);
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
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        return getExclusive_or_expression();
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA:
        return getInclusive_or_expression_linha();
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
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        setExclusive_or_expression((exclusive_or_expression)newValue);
        return;
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA:
        setInclusive_or_expression_linha((inclusive_or_expression_linha)newValue);
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
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        setExclusive_or_expression((exclusive_or_expression)null);
        return;
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA:
        setInclusive_or_expression_linha((inclusive_or_expression_linha)null);
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
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__EXCLUSIVE_OR_EXPRESSION:
        return exclusive_or_expression != null;
      case AnsicPackage.INCLUSIVE_OR_EXPRESSION__INCLUSIVE_OR_EXPRESSION_LINHA:
        return inclusive_or_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //inclusive_or_expressionImpl
