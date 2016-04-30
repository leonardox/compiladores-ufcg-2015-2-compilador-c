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
import org.xtext.example.ansic.designation;
import org.xtext.example.ansic.initializer;
import org.xtext.example.ansic.initializer_list_complement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>initializer list complement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.initializer_list_complementImpl#getDesignation <em>Designation</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.initializer_list_complementImpl#getInitializer <em>Initializer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class initializer_list_complementImpl extends MinimalEObjectImpl.Container implements initializer_list_complement
{
  /**
   * The cached value of the '{@link #getDesignation() <em>Designation</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignation()
   * @generated
   * @ordered
   */
  protected designation designation;

  /**
   * The cached value of the '{@link #getInitializer() <em>Initializer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInitializer()
   * @generated
   * @ordered
   */
  protected initializer initializer;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected initializer_list_complementImpl()
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
    return AnsicPackage.Literals.INITIALIZER_LIST_COMPLEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designation getDesignation()
  {
    return designation;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesignation(designation newDesignation, NotificationChain msgs)
  {
    designation oldDesignation = designation;
    designation = newDesignation;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION, oldDesignation, newDesignation);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesignation(designation newDesignation)
  {
    if (newDesignation != designation)
    {
      NotificationChain msgs = null;
      if (designation != null)
        msgs = ((InternalEObject)designation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION, null, msgs);
      if (newDesignation != null)
        msgs = ((InternalEObject)newDesignation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION, null, msgs);
      msgs = basicSetDesignation(newDesignation, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION, newDesignation, newDesignation));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public initializer getInitializer()
  {
    return initializer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetInitializer(initializer newInitializer, NotificationChain msgs)
  {
    initializer oldInitializer = initializer;
    initializer = newInitializer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER, oldInitializer, newInitializer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInitializer(initializer newInitializer)
  {
    if (newInitializer != initializer)
    {
      NotificationChain msgs = null;
      if (initializer != null)
        msgs = ((InternalEObject)initializer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER, null, msgs);
      if (newInitializer != null)
        msgs = ((InternalEObject)newInitializer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER, null, msgs);
      msgs = basicSetInitializer(newInitializer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER, newInitializer, newInitializer));
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
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION:
        return basicSetDesignation(null, msgs);
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER:
        return basicSetInitializer(null, msgs);
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
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION:
        return getDesignation();
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER:
        return getInitializer();
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
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION:
        setDesignation((designation)newValue);
        return;
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER:
        setInitializer((initializer)newValue);
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
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION:
        setDesignation((designation)null);
        return;
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER:
        setInitializer((initializer)null);
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
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__DESIGNATION:
        return designation != null;
      case AnsicPackage.INITIALIZER_LIST_COMPLEMENT__INITIALIZER:
        return initializer != null;
    }
    return super.eIsSet(featureID);
  }

} //initializer_list_complementImpl
