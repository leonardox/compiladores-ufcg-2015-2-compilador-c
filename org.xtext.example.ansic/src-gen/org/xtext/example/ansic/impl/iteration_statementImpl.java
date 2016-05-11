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
import org.xtext.example.ansic.declaration;
import org.xtext.example.ansic.expression;
import org.xtext.example.ansic.expression_statement;
import org.xtext.example.ansic.iteration_statement;
import org.xtext.example.ansic.statement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>iteration statement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.iteration_statementImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.iteration_statementImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.iteration_statementImpl#getExpression_statement <em>Expression statement</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.iteration_statementImpl#getExpression_statement2 <em>Expression statement2</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.iteration_statementImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class iteration_statementImpl extends MinimalEObjectImpl.Container implements iteration_statement
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
   * The cached value of the '{@link #getStatement() <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatement()
   * @generated
   * @ordered
   */
  protected statement statement;

  /**
   * The cached value of the '{@link #getExpression_statement() <em>Expression statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_statement()
   * @generated
   * @ordered
   */
  protected expression_statement expression_statement;

  /**
   * The cached value of the '{@link #getExpression_statement2() <em>Expression statement2</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getExpression_statement2()
   * @generated
   * @ordered
   */
  protected expression_statement expression_statement2;

  /**
   * The cached value of the '{@link #getDeclaration() <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration()
   * @generated
   * @ordered
   */
  protected declaration declaration;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected iteration_statementImpl()
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
    return AnsicPackage.Literals.ITERATION_STATEMENT;
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__EXPRESSION, oldExpression, newExpression);
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
        msgs = ((InternalEObject)expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__EXPRESSION, null, msgs);
      if (newExpression != null)
        msgs = ((InternalEObject)newExpression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__EXPRESSION, null, msgs);
      msgs = basicSetExpression(newExpression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__EXPRESSION, newExpression, newExpression));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public statement getStatement()
  {
    return statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStatement(statement newStatement, NotificationChain msgs)
  {
    statement oldStatement = statement;
    statement = newStatement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__STATEMENT, oldStatement, newStatement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatement(statement newStatement)
  {
    if (newStatement != statement)
    {
      NotificationChain msgs = null;
      if (statement != null)
        msgs = ((InternalEObject)statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__STATEMENT, null, msgs);
      if (newStatement != null)
        msgs = ((InternalEObject)newStatement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__STATEMENT, null, msgs);
      msgs = basicSetStatement(newStatement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__STATEMENT, newStatement, newStatement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement getExpression_statement()
  {
    return expression_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_statement(expression_statement newExpression_statement, NotificationChain msgs)
  {
    expression_statement oldExpression_statement = expression_statement;
    expression_statement = newExpression_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, oldExpression_statement, newExpression_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_statement(expression_statement newExpression_statement)
  {
    if (newExpression_statement != expression_statement)
    {
      NotificationChain msgs = null;
      if (expression_statement != null)
        msgs = ((InternalEObject)expression_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, null, msgs);
      if (newExpression_statement != null)
        msgs = ((InternalEObject)newExpression_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, null, msgs);
      msgs = basicSetExpression_statement(newExpression_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT, newExpression_statement, newExpression_statement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public expression_statement getExpression_statement2()
  {
    return expression_statement2;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetExpression_statement2(expression_statement newExpression_statement2, NotificationChain msgs)
  {
    expression_statement oldExpression_statement2 = expression_statement2;
    expression_statement2 = newExpression_statement2;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, oldExpression_statement2, newExpression_statement2);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setExpression_statement2(expression_statement newExpression_statement2)
  {
    if (newExpression_statement2 != expression_statement2)
    {
      NotificationChain msgs = null;
      if (expression_statement2 != null)
        msgs = ((InternalEObject)expression_statement2).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, null, msgs);
      if (newExpression_statement2 != null)
        msgs = ((InternalEObject)newExpression_statement2).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, null, msgs);
      msgs = basicSetExpression_statement2(newExpression_statement2, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2, newExpression_statement2, newExpression_statement2));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declaration getDeclaration()
  {
    return declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclaration(declaration newDeclaration, NotificationChain msgs)
  {
    declaration oldDeclaration = declaration;
    declaration = newDeclaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__DECLARATION, oldDeclaration, newDeclaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclaration(declaration newDeclaration)
  {
    if (newDeclaration != declaration)
    {
      NotificationChain msgs = null;
      if (declaration != null)
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.ITERATION_STATEMENT__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.ITERATION_STATEMENT__DECLARATION, newDeclaration, newDeclaration));
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
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION:
        return basicSetExpression(null, msgs);
      case AnsicPackage.ITERATION_STATEMENT__STATEMENT:
        return basicSetStatement(null, msgs);
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        return basicSetExpression_statement(null, msgs);
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        return basicSetExpression_statement2(null, msgs);
      case AnsicPackage.ITERATION_STATEMENT__DECLARATION:
        return basicSetDeclaration(null, msgs);
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
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION:
        return getExpression();
      case AnsicPackage.ITERATION_STATEMENT__STATEMENT:
        return getStatement();
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        return getExpression_statement();
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        return getExpression_statement2();
      case AnsicPackage.ITERATION_STATEMENT__DECLARATION:
        return getDeclaration();
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
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION:
        setExpression((expression)newValue);
        return;
      case AnsicPackage.ITERATION_STATEMENT__STATEMENT:
        setStatement((statement)newValue);
        return;
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        setExpression_statement((expression_statement)newValue);
        return;
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        setExpression_statement2((expression_statement)newValue);
        return;
      case AnsicPackage.ITERATION_STATEMENT__DECLARATION:
        setDeclaration((declaration)newValue);
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
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION:
        setExpression((expression)null);
        return;
      case AnsicPackage.ITERATION_STATEMENT__STATEMENT:
        setStatement((statement)null);
        return;
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        setExpression_statement((expression_statement)null);
        return;
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        setExpression_statement2((expression_statement)null);
        return;
      case AnsicPackage.ITERATION_STATEMENT__DECLARATION:
        setDeclaration((declaration)null);
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
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION:
        return expression != null;
      case AnsicPackage.ITERATION_STATEMENT__STATEMENT:
        return statement != null;
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT:
        return expression_statement != null;
      case AnsicPackage.ITERATION_STATEMENT__EXPRESSION_STATEMENT2:
        return expression_statement2 != null;
      case AnsicPackage.ITERATION_STATEMENT__DECLARATION:
        return declaration != null;
    }
    return super.eIsSet(featureID);
  }

} //iteration_statementImpl
