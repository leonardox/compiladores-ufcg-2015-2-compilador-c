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
import org.xtext.example.ansic.ArgumentExpressionListLinhaAction;
import org.xtext.example.ansic.argument_expression_list_linha;
import org.xtext.example.ansic.assignment_expression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Argument Expression List Linha Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.ArgumentExpressionListLinhaActionImpl#getAssignment_expression <em>Assignment expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.ArgumentExpressionListLinhaActionImpl#getArgument_expression_list_linha <em>Argument expression list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ArgumentExpressionListLinhaActionImpl extends argument_expression_list_linhaImpl implements ArgumentExpressionListLinhaAction
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
   * The cached value of the '{@link #getArgument_expression_list_linha() <em>Argument expression list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument_expression_list_linha()
   * @generated
   * @ordered
   */
  protected argument_expression_list_linha argument_expression_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ArgumentExpressionListLinhaActionImpl()
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
    return AnsicPackage.Literals.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
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
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argument_expression_list_linha getArgument_expression_list_linha()
  {
    return argument_expression_list_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument_expression_list_linha(argument_expression_list_linha newArgument_expression_list_linha, NotificationChain msgs)
  {
    argument_expression_list_linha oldArgument_expression_list_linha = argument_expression_list_linha;
    argument_expression_list_linha = newArgument_expression_list_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA, oldArgument_expression_list_linha, newArgument_expression_list_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument_expression_list_linha(argument_expression_list_linha newArgument_expression_list_linha)
  {
    if (newArgument_expression_list_linha != argument_expression_list_linha)
    {
      NotificationChain msgs = null;
      if (argument_expression_list_linha != null)
        msgs = ((InternalEObject)argument_expression_list_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA, null, msgs);
      if (newArgument_expression_list_linha != null)
        msgs = ((InternalEObject)newArgument_expression_list_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA, null, msgs);
      msgs = basicSetArgument_expression_list_linha(newArgument_expression_list_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA, newArgument_expression_list_linha, newArgument_expression_list_linha));
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
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA:
        return basicSetArgument_expression_list_linha(null, msgs);
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
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA:
        return getArgument_expression_list_linha();
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
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
        return;
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA:
        setArgument_expression_list_linha((argument_expression_list_linha)newValue);
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
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
        return;
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA:
        setArgument_expression_list_linha((argument_expression_list_linha)null);
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
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
      case AnsicPackage.ARGUMENT_EXPRESSION_LIST_LINHA_ACTION__ARGUMENT_EXPRESSION_LIST_LINHA:
        return argument_expression_list_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //ArgumentExpressionListLinhaActionImpl
