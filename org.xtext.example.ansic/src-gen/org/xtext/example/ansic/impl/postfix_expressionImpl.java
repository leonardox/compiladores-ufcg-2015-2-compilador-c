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
import org.xtext.example.ansic.postfix_expression;
import org.xtext.example.ansic.postfix_expression_linha;
import org.xtext.example.ansic.primary_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.postfix_expressionImpl#getPrimary_expression <em>Primary expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.postfix_expressionImpl#getPostfix_expression_linha <em>Postfix expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postfix_expressionImpl extends MinimalEObjectImpl.Container implements postfix_expression
{
  /**
   * The cached value of the '{@link #getPrimary_expression() <em>Primary expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPrimary_expression()
   * @generated
   * @ordered
   */
  protected primary_expression primary_expression;

  /**
   * The cached value of the '{@link #getPostfix_expression_linha() <em>Postfix expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPostfix_expression_linha()
   * @generated
   * @ordered
   */
  protected postfix_expression_linha postfix_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfix_expressionImpl()
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
    return AnsicPackage.Literals.POSTFIX_EXPRESSION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public primary_expression getPrimary_expression()
  {
    return primary_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPrimary_expression(primary_expression newPrimary_expression, NotificationChain msgs)
  {
    primary_expression oldPrimary_expression = primary_expression;
    primary_expression = newPrimary_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, oldPrimary_expression, newPrimary_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPrimary_expression(primary_expression newPrimary_expression)
  {
    if (newPrimary_expression != primary_expression)
    {
      NotificationChain msgs = null;
      if (primary_expression != null)
        msgs = ((InternalEObject)primary_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, null, msgs);
      if (newPrimary_expression != null)
        msgs = ((InternalEObject)newPrimary_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, null, msgs);
      msgs = basicSetPrimary_expression(newPrimary_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION, newPrimary_expression, newPrimary_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public postfix_expression_linha getPostfix_expression_linha()
  {
    return postfix_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPostfix_expression_linha(postfix_expression_linha newPostfix_expression_linha, NotificationChain msgs)
  {
    postfix_expression_linha oldPostfix_expression_linha = postfix_expression_linha;
    postfix_expression_linha = newPostfix_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA, oldPostfix_expression_linha, newPostfix_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPostfix_expression_linha(postfix_expression_linha newPostfix_expression_linha)
  {
    if (newPostfix_expression_linha != postfix_expression_linha)
    {
      NotificationChain msgs = null;
      if (postfix_expression_linha != null)
        msgs = ((InternalEObject)postfix_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA, null, msgs);
      if (newPostfix_expression_linha != null)
        msgs = ((InternalEObject)newPostfix_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetPostfix_expression_linha(newPostfix_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA, newPostfix_expression_linha, newPostfix_expression_linha));
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
      case AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        return basicSetPrimary_expression(null, msgs);
      case AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA:
        return basicSetPostfix_expression_linha(null, msgs);
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
      case AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        return getPrimary_expression();
      case AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA:
        return getPostfix_expression_linha();
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
      case AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        setPrimary_expression((primary_expression)newValue);
        return;
      case AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA:
        setPostfix_expression_linha((postfix_expression_linha)newValue);
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
      case AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        setPrimary_expression((primary_expression)null);
        return;
      case AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA:
        setPostfix_expression_linha((postfix_expression_linha)null);
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
      case AnsicPackage.POSTFIX_EXPRESSION__PRIMARY_EXPRESSION:
        return primary_expression != null;
      case AnsicPackage.POSTFIX_EXPRESSION__POSTFIX_EXPRESSION_LINHA:
        return postfix_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //postfix_expressionImpl