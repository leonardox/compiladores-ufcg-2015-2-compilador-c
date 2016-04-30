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
import org.xtext.example.ansic.initializer;
import org.xtext.example.ansic.initializer_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>initializer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.initializerImpl#getInit_declarator_list <em>Init declarator list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.initializerImpl#getAssignment_expression <em>Assignment expression</em>}</li>
 * </ul>
 *
 * @generated
 */
public class initializerImpl extends MinimalEObjectImpl.Container implements initializer
{
  /**
   * The cached value of the '{@link #getInit_declarator_list() <em>Init declarator list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInit_declarator_list()
   * @generated
   * @ordered
   */
  protected initializer_list init_declarator_list;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected initializerImpl()
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
    return AnsicPackage.Literals.INITIALIZER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer_list getInit_declarator_list()
  {
    return init_declarator_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInit_declarator_list(initializer_list newInit_declarator_list, NotificationChain msgs)
  {
    initializer_list oldInit_declarator_list = init_declarator_list;
    init_declarator_list = newInit_declarator_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST, oldInit_declarator_list, newInit_declarator_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInit_declarator_list(initializer_list newInit_declarator_list)
  {
    if (newInit_declarator_list != init_declarator_list)
    {
      NotificationChain msgs = null;
      if (init_declarator_list != null)
        msgs = ((InternalEObject)init_declarator_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST, null, msgs);
      if (newInit_declarator_list != null)
        msgs = ((InternalEObject)newInit_declarator_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST, null, msgs);
      msgs = basicSetInit_declarator_list(newInit_declarator_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST, newInit_declarator_list, newInit_declarator_list));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION, oldAssignment_expression, newAssignment_expression);
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
        msgs = ((InternalEObject)assignment_expression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION, null, msgs);
      if (newAssignment_expression != null)
        msgs = ((InternalEObject)newAssignment_expression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION, null, msgs);
      msgs = basicSetAssignment_expression(newAssignment_expression, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION, newAssignment_expression, newAssignment_expression));
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
      case AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST:
        return basicSetInit_declarator_list(null, msgs);
      case AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION:
        return basicSetAssignment_expression(null, msgs);
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
      case AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST:
        return getInit_declarator_list();
      case AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION:
        return getAssignment_expression();
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
      case AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST:
        setInit_declarator_list((initializer_list)newValue);
        return;
      case AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)newValue);
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
      case AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST:
        setInit_declarator_list((initializer_list)null);
        return;
      case AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION:
        setAssignment_expression((assignment_expression)null);
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
      case AnsicPackage.INITIALIZER__INIT_DECLARATOR_LIST:
        return init_declarator_list != null;
      case AnsicPackage.INITIALIZER__ASSIGNMENT_EXPRESSION:
        return assignment_expression != null;
    }
    return super.eIsSet(featureID);
  }

} //initializerImpl
