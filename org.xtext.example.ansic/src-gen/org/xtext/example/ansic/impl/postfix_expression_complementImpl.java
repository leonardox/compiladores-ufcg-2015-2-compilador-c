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
import org.xtext.example.ansic.argument_expression_list;
import org.xtext.example.ansic.expression;
import org.xtext.example.ansic.postfix_expression_complement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>postfix expression complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.postfix_expression_complementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.postfix_expression_complementImpl#getArgument_expression_list <em>Argument expression list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.postfix_expression_complementImpl#getIdentifier <em>Identifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class postfix_expression_complementImpl extends MinimalEObjectImpl.Container implements postfix_expression_complement
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
   * The cached value of the '{@link #getArgument_expression_list() <em>Argument expression list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument_expression_list()
   * @generated
   * @ordered
   */
  protected argument_expression_list argument_expression_list;

  /**
   * The default value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected static final String IDENTIFIER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIdentifier() <em>Identifier</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIdentifier()
   * @generated
   * @ordered
   */
  protected String identifier = IDENTIFIER_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected postfix_expression_complementImpl()
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
    return AnsicPackage.Literals.POSTFIX_EXPRESSION_COMPLEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public argument_expression_list getArgument_expression_list()
  {
    return argument_expression_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument_expression_list(argument_expression_list newArgument_expression_list, NotificationChain msgs)
  {
    argument_expression_list oldArgument_expression_list = argument_expression_list;
    argument_expression_list = newArgument_expression_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST, oldArgument_expression_list, newArgument_expression_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument_expression_list(argument_expression_list newArgument_expression_list)
  {
    if (newArgument_expression_list != argument_expression_list)
    {
      NotificationChain msgs = null;
      if (argument_expression_list != null)
        msgs = ((InternalEObject)argument_expression_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST, null, msgs);
      if (newArgument_expression_list != null)
        msgs = ((InternalEObject)newArgument_expression_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST, null, msgs);
      msgs = basicSetArgument_expression_list(newArgument_expression_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST, newArgument_expression_list, newArgument_expression_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIdentifier()
  {
    return identifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIdentifier(String newIdentifier)
  {
    String oldIdentifier = identifier;
    identifier = newIdentifier;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__IDENTIFIER, oldIdentifier, identifier));
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
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST:
        return basicSetArgument_expression_list(null, msgs);
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
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION:
        return getExpression();
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST:
        return getArgument_expression_list();
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__IDENTIFIER:
        return getIdentifier();
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
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST:
        setArgument_expression_list((argument_expression_list)newValue);
        return;
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__IDENTIFIER:
        setIdentifier((String)newValue);
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
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION:
        setExpression((expression)null);
        return;
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST:
        setArgument_expression_list((argument_expression_list)null);
        return;
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__IDENTIFIER:
        setIdentifier(IDENTIFIER_EDEFAULT);
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
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__EXPRESSION:
        return expression != null;
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__ARGUMENT_EXPRESSION_LIST:
        return argument_expression_list != null;
      case AnsicPackage.POSTFIX_EXPRESSION_COMPLEMENT__IDENTIFIER:
        return IDENTIFIER_EDEFAULT == null ? identifier != null : !IDENTIFIER_EDEFAULT.equals(identifier);
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
    result.append(" (identifier: ");
    result.append(identifier);
    result.append(')');
    return result.toString();
  }

} //postfix_expression_complementImpl
