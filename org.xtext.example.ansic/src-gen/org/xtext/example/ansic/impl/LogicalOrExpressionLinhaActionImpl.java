/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.example.ansic.AnsicPackage;
import org.xtext.example.ansic.LogicalOrExpressionLinhaAction;
import org.xtext.example.ansic.logical_and_expression;
import org.xtext.example.ansic.logical_or_expression_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Logical Or Expression Linha Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.LogicalOrExpressionLinhaActionImpl#getLogical_and_expression <em>Logical and expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.LogicalOrExpressionLinhaActionImpl#getLogical_or_expression_linha <em>Logical or expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LogicalOrExpressionLinhaActionImpl extends logical_or_expression_linhaImpl implements LogicalOrExpressionLinhaAction
{
  /**
   * The cached value of the '{@link #getLogical_and_expression() <em>Logical and expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogical_and_expression()
   * @generated
   * @ordered
   */
  protected logical_and_expression logical_and_expression;

  /**
   * The cached value of the '{@link #getLogical_or_expression_linha() <em>Logical or expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogical_or_expression_linha()
   * @generated
   * @ordered
   */
  protected logical_or_expression_linha logical_or_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LogicalOrExpressionLinhaActionImpl()
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
    return AnsicPackage.Literals.LOGICAL_OR_EXPRESSION_LINHA_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_and_expression getLogical_and_expression()
  {
    return logical_and_expression;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogical_and_expression(logical_and_expression newLogical_and_expression, NotificationChain msgs)
  {
    logical_and_expression oldLogical_and_expression = logical_and_expression;
    logical_and_expression = newLogical_and_expression;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION, oldLogical_and_expression, newLogical_and_expression);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical_and_expression(logical_and_expression newLogical_and_expression)
  {
    if (newLogical_and_expression != logical_and_expression)
    {
      NotificationChain msgs = null;
      if (logical_and_expression != null)
        msgs = ((InternalEObject)logical_and_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION, null, msgs);
      if (newLogical_and_expression != null)
        msgs = ((InternalEObject)newLogical_and_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION, null, msgs);
      msgs = basicSetLogical_and_expression(newLogical_and_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION, newLogical_and_expression, newLogical_and_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public logical_or_expression_linha getLogical_or_expression_linha()
  {
    return logical_or_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetLogical_or_expression_linha(logical_or_expression_linha newLogical_or_expression_linha, NotificationChain msgs)
  {
    logical_or_expression_linha oldLogical_or_expression_linha = logical_or_expression_linha;
    logical_or_expression_linha = newLogical_or_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA, oldLogical_or_expression_linha, newLogical_or_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogical_or_expression_linha(logical_or_expression_linha newLogical_or_expression_linha)
  {
    if (newLogical_or_expression_linha != logical_or_expression_linha)
    {
      NotificationChain msgs = null;
      if (logical_or_expression_linha != null)
        msgs = ((InternalEObject)logical_or_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA, null, msgs);
      if (newLogical_or_expression_linha != null)
        msgs = ((InternalEObject)newLogical_or_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetLogical_or_expression_linha(newLogical_or_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA, newLogical_or_expression_linha, newLogical_or_expression_linha));
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
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION:
        return basicSetLogical_and_expression(null, msgs);
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA:
        return basicSetLogical_or_expression_linha(null, msgs);
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
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION:
        return getLogical_and_expression();
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA:
        return getLogical_or_expression_linha();
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
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION:
        setLogical_and_expression((logical_and_expression)newValue);
        return;
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA:
        setLogical_or_expression_linha((logical_or_expression_linha)newValue);
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
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION:
        setLogical_and_expression((logical_and_expression)null);
        return;
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA:
        setLogical_or_expression_linha((logical_or_expression_linha)null);
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
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_AND_EXPRESSION:
        return logical_and_expression != null;
      case AnsicPackage.LOGICAL_OR_EXPRESSION_LINHA_ACTION__LOGICAL_OR_EXPRESSION_LINHA:
        return logical_or_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //LogicalOrExpressionLinhaActionImpl
