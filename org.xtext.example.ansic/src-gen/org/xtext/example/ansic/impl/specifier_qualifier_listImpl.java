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
import org.xtext.example.ansic.specifier_qualifier_list;
import org.xtext.example.ansic.type_qualifier;
import org.xtext.example.ansic.type_specifier;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>specifier qualifier list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.specifier_qualifier_listImpl#getType_specifier <em>Type specifier</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.specifier_qualifier_listImpl#getSpecifier_qualifier_list <em>Specifier qualifier list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.specifier_qualifier_listImpl#getType_qualifier <em>Type qualifier</em>}</li>
 * </ul>
 *
 * @generated
 */
public class specifier_qualifier_listImpl extends MinimalEObjectImpl.Container implements specifier_qualifier_list
{
  /**
   * The cached value of the '{@link #getType_specifier() <em>Type specifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_specifier()
   * @generated
   * @ordered
   */
  protected type_specifier type_specifier;

  /**
   * The cached value of the '{@link #getSpecifier_qualifier_list() <em>Specifier qualifier list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSpecifier_qualifier_list()
   * @generated
   * @ordered
   */
  protected specifier_qualifier_list specifier_qualifier_list;

  /**
   * The cached value of the '{@link #getType_qualifier() <em>Type qualifier</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType_qualifier()
   * @generated
   * @ordered
   */
  protected type_qualifier type_qualifier;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected specifier_qualifier_listImpl()
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
    return AnsicPackage.Literals.SPECIFIER_QUALIFIER_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_specifier getType_specifier()
  {
    return type_specifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_specifier(type_specifier newType_specifier, NotificationChain msgs)
  {
    type_specifier oldType_specifier = type_specifier;
    type_specifier = newType_specifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, oldType_specifier, newType_specifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_specifier(type_specifier newType_specifier)
  {
    if (newType_specifier != type_specifier)
    {
      NotificationChain msgs = null;
      if (type_specifier != null)
        msgs = ((InternalEObject)type_specifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, null, msgs);
      if (newType_specifier != null)
        msgs = ((InternalEObject)newType_specifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, null, msgs);
      msgs = basicSetType_specifier(newType_specifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER, newType_specifier, newType_specifier));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public specifier_qualifier_list getSpecifier_qualifier_list()
  {
    return specifier_qualifier_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSpecifier_qualifier_list(specifier_qualifier_list newSpecifier_qualifier_list, NotificationChain msgs)
  {
    specifier_qualifier_list oldSpecifier_qualifier_list = specifier_qualifier_list;
    specifier_qualifier_list = newSpecifier_qualifier_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST, oldSpecifier_qualifier_list, newSpecifier_qualifier_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSpecifier_qualifier_list(specifier_qualifier_list newSpecifier_qualifier_list)
  {
    if (newSpecifier_qualifier_list != specifier_qualifier_list)
    {
      NotificationChain msgs = null;
      if (specifier_qualifier_list != null)
        msgs = ((InternalEObject)specifier_qualifier_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST, null, msgs);
      if (newSpecifier_qualifier_list != null)
        msgs = ((InternalEObject)newSpecifier_qualifier_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST, null, msgs);
      msgs = basicSetSpecifier_qualifier_list(newSpecifier_qualifier_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST, newSpecifier_qualifier_list, newSpecifier_qualifier_list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public type_qualifier getType_qualifier()
  {
    return type_qualifier;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetType_qualifier(type_qualifier newType_qualifier, NotificationChain msgs)
  {
    type_qualifier oldType_qualifier = type_qualifier;
    type_qualifier = newType_qualifier;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER, oldType_qualifier, newType_qualifier);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType_qualifier(type_qualifier newType_qualifier)
  {
    if (newType_qualifier != type_qualifier)
    {
      NotificationChain msgs = null;
      if (type_qualifier != null)
        msgs = ((InternalEObject)type_qualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER, null, msgs);
      if (newType_qualifier != null)
        msgs = ((InternalEObject)newType_qualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER, null, msgs);
      msgs = basicSetType_qualifier(newType_qualifier, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER, newType_qualifier, newType_qualifier));
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
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        return basicSetType_specifier(null, msgs);
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST:
        return basicSetSpecifier_qualifier_list(null, msgs);
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER:
        return basicSetType_qualifier(null, msgs);
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
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        return getType_specifier();
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST:
        return getSpecifier_qualifier_list();
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER:
        return getType_qualifier();
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
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        setType_specifier((type_specifier)newValue);
        return;
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST:
        setSpecifier_qualifier_list((specifier_qualifier_list)newValue);
        return;
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER:
        setType_qualifier((type_qualifier)newValue);
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
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        setType_specifier((type_specifier)null);
        return;
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST:
        setSpecifier_qualifier_list((specifier_qualifier_list)null);
        return;
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER:
        setType_qualifier((type_qualifier)null);
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
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_SPECIFIER:
        return type_specifier != null;
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__SPECIFIER_QUALIFIER_LIST:
        return specifier_qualifier_list != null;
      case AnsicPackage.SPECIFIER_QUALIFIER_LIST__TYPE_QUALIFIER:
        return type_qualifier != null;
    }
    return super.eIsSet(featureID);
  }

} //specifier_qualifier_listImpl
