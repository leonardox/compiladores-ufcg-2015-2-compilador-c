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
import org.xtext.example.ansic.additive_expression;
import org.xtext.example.ansic.additive_expression_linha;
import org.xtext.example.ansic.multiplicative_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>additive expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.additive_expressionImpl#getMultiplicative_expression <em>Multiplicative expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.additive_expressionImpl#getAdditive_expression_linha <em>Additive expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class additive_expressionImpl extends MinimalEObjectImpl.Container implements additive_expression
{
  /**
   * The cached value of the '{@link #getMultiplicative_expression() <em>Multiplicative expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMultiplicative_expression()
   * @generated
   * @ordered
   */
  protected multiplicative_expression multiplicative_expression;

  /**
   * The cached value of the '{@link #getAdditive_expression_linha() <em>Additive expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAdditive_expression_linha()
   * @generated
   * @ordered
   */
  protected additive_expression_linha additive_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected additive_expressionImpl()
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
    return AnsicPackage.Literals.ADDITIVE_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public multiplicative_expression getMultiplicative_expression()
  {
    return multiplicative_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetMultiplicative_expression(multiplicative_expression newMultiplicative_expression, NotificationChain msgs)
  {
    multiplicative_expression oldMultiplicative_expression = multiplicative_expression;
    multiplicative_expression = newMultiplicative_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, oldMultiplicative_expression, newMultiplicative_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMultiplicative_expression(multiplicative_expression newMultiplicative_expression)
  {
    if (newMultiplicative_expression != multiplicative_expression)
    {
      NotificationChain msgs = null;
      if (multiplicative_expression != null)
        msgs = ((InternalEObject)multiplicative_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, null, msgs);
      if (newMultiplicative_expression != null)
        msgs = ((InternalEObject)newMultiplicative_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, null, msgs);
      msgs = basicSetMultiplicative_expression(newMultiplicative_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION, newMultiplicative_expression, newMultiplicative_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public additive_expression_linha getAdditive_expression_linha()
  {
    return additive_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetAdditive_expression_linha(additive_expression_linha newAdditive_expression_linha, NotificationChain msgs)
  {
    additive_expression_linha oldAdditive_expression_linha = additive_expression_linha;
    additive_expression_linha = newAdditive_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA, oldAdditive_expression_linha, newAdditive_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAdditive_expression_linha(additive_expression_linha newAdditive_expression_linha)
  {
    if (newAdditive_expression_linha != additive_expression_linha)
    {
      NotificationChain msgs = null;
      if (additive_expression_linha != null)
        msgs = ((InternalEObject)additive_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA, null, msgs);
      if (newAdditive_expression_linha != null)
        msgs = ((InternalEObject)newAdditive_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetAdditive_expression_linha(newAdditive_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA, newAdditive_expression_linha, newAdditive_expression_linha));
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
      case AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        return basicSetMultiplicative_expression(null, msgs);
      case AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA:
        return basicSetAdditive_expression_linha(null, msgs);
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
      case AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        return getMultiplicative_expression();
      case AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA:
        return getAdditive_expression_linha();
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
      case AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        setMultiplicative_expression((multiplicative_expression)newValue);
        return;
      case AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA:
        setAdditive_expression_linha((additive_expression_linha)newValue);
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
      case AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        setMultiplicative_expression((multiplicative_expression)null);
        return;
      case AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA:
        setAdditive_expression_linha((additive_expression_linha)null);
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
      case AnsicPackage.ADDITIVE_EXPRESSION__MULTIPLICATIVE_EXPRESSION:
        return multiplicative_expression != null;
      case AnsicPackage.ADDITIVE_EXPRESSION__ADDITIVE_EXPRESSION_LINHA:
        return additive_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //additive_expressionImpl