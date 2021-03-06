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
import org.xtext.example.ansic.additive_expression_complement;
import org.xtext.example.ansic.multiplicative_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>additive expression complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.additive_expression_complementImpl#getMultiplicative_expression <em>Multiplicative expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class additive_expression_complementImpl extends MinimalEObjectImpl.Container implements additive_expression_complement
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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected additive_expression_complementImpl()
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
    return AnsicPackage.Literals.ADDITIVE_EXPRESSION_COMPLEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION, oldMultiplicative_expression, newMultiplicative_expression);
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
        msgs = ((InternalEObject)multiplicative_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION, null, msgs);
      if (newMultiplicative_expression != null)
        msgs = ((InternalEObject)newMultiplicative_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION, null, msgs);
      msgs = basicSetMultiplicative_expression(newMultiplicative_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION, newMultiplicative_expression, newMultiplicative_expression));
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
      case AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION:
        return basicSetMultiplicative_expression(null, msgs);
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
      case AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION:
        return getMultiplicative_expression();
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
      case AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION:
        setMultiplicative_expression((multiplicative_expression)newValue);
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
      case AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION:
        setMultiplicative_expression((multiplicative_expression)null);
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
      case AnsicPackage.ADDITIVE_EXPRESSION_COMPLEMENT__MULTIPLICATIVE_EXPRESSION:
        return multiplicative_expression != null;
    }
    return super.eIsSet(featureID);
  }

} //additive_expression_complementImpl
