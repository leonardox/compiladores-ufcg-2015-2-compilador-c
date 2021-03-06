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
import org.xtext.example.ansic.declarator;
import org.xtext.example.ansic.direct_declarator;
import org.xtext.example.ansic.pointer;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>declarator</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.declaratorImpl#getPointer <em>Pointer</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.declaratorImpl#getDirect_declarator <em>Direct declarator</em>}</li>
 * </ul>
 *
 * @generated
 */
public class declaratorImpl extends MinimalEObjectImpl.Container implements declarator
{
  /**
   * The cached value of the '{@link #getPointer() <em>Pointer</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPointer()
   * @generated
   * @ordered
   */
  protected pointer pointer;

  /**
   * The cached value of the '{@link #getDirect_declarator() <em>Direct declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect_declarator()
   * @generated
   * @ordered
   */
  protected direct_declarator direct_declarator;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected declaratorImpl()
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
    return AnsicPackage.Literals.DECLARATOR;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public pointer getPointer()
  {
    return pointer;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetPointer(pointer newPointer, NotificationChain msgs)
  {
    pointer oldPointer = pointer;
    pointer = newPointer;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.DECLARATOR__POINTER, oldPointer, newPointer);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPointer(pointer newPointer)
  {
    if (newPointer != pointer)
    {
      NotificationChain msgs = null;
      if (pointer != null)
        msgs = ((InternalEObject)pointer).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DECLARATOR__POINTER, null, msgs);
      if (newPointer != null)
        msgs = ((InternalEObject)newPointer).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DECLARATOR__POINTER, null, msgs);
      msgs = basicSetPointer(newPointer, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.DECLARATOR__POINTER, newPointer, newPointer));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declarator getDirect_declarator()
  {
    return direct_declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect_declarator(direct_declarator newDirect_declarator, NotificationChain msgs)
  {
    direct_declarator oldDirect_declarator = direct_declarator;
    direct_declarator = newDirect_declarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.DECLARATOR__DIRECT_DECLARATOR, oldDirect_declarator, newDirect_declarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect_declarator(direct_declarator newDirect_declarator)
  {
    if (newDirect_declarator != direct_declarator)
    {
      NotificationChain msgs = null;
      if (direct_declarator != null)
        msgs = ((InternalEObject)direct_declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DECLARATOR__DIRECT_DECLARATOR, null, msgs);
      if (newDirect_declarator != null)
        msgs = ((InternalEObject)newDirect_declarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DECLARATOR__DIRECT_DECLARATOR, null, msgs);
      msgs = basicSetDirect_declarator(newDirect_declarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.DECLARATOR__DIRECT_DECLARATOR, newDirect_declarator, newDirect_declarator));
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
      case AnsicPackage.DECLARATOR__POINTER:
        return basicSetPointer(null, msgs);
      case AnsicPackage.DECLARATOR__DIRECT_DECLARATOR:
        return basicSetDirect_declarator(null, msgs);
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
      case AnsicPackage.DECLARATOR__POINTER:
        return getPointer();
      case AnsicPackage.DECLARATOR__DIRECT_DECLARATOR:
        return getDirect_declarator();
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
      case AnsicPackage.DECLARATOR__POINTER:
        setPointer((pointer)newValue);
        return;
      case AnsicPackage.DECLARATOR__DIRECT_DECLARATOR:
        setDirect_declarator((direct_declarator)newValue);
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
      case AnsicPackage.DECLARATOR__POINTER:
        setPointer((pointer)null);
        return;
      case AnsicPackage.DECLARATOR__DIRECT_DECLARATOR:
        setDirect_declarator((direct_declarator)null);
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
      case AnsicPackage.DECLARATOR__POINTER:
        return pointer != null;
      case AnsicPackage.DECLARATOR__DIRECT_DECLARATOR:
        return direct_declarator != null;
    }
    return super.eIsSet(featureID);
  }

} //declaratorImpl
