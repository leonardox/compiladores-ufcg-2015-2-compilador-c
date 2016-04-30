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
import org.xtext.example.ansic.designator;
import org.xtext.example.ansic.designator_list;
import org.xtext.example.ansic.designator_list_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>designator list</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.designator_listImpl#getDesignator <em>Designator</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.designator_listImpl#getDesignator_list_linha <em>Designator list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class designator_listImpl extends MinimalEObjectImpl.Container implements designator_list
{
  /**
   * The cached value of the '{@link #getDesignator() <em>Designator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignator()
   * @generated
   * @ordered
   */
  protected designator designator;

  /**
   * The cached value of the '{@link #getDesignator_list_linha() <em>Designator list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDesignator_list_linha()
   * @generated
   * @ordered
   */
  protected designator_list_linha designator_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected designator_listImpl()
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
    return AnsicPackage.Literals.DESIGNATOR_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designator getDesignator()
  {
    return designator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesignator(designator newDesignator, NotificationChain msgs)
  {
    designator oldDesignator = designator;
    designator = newDesignator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.DESIGNATOR_LIST__DESIGNATOR, oldDesignator, newDesignator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesignator(designator newDesignator)
  {
    if (newDesignator != designator)
    {
      NotificationChain msgs = null;
      if (designator != null)
        msgs = ((InternalEObject)designator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DESIGNATOR_LIST__DESIGNATOR, null, msgs);
      if (newDesignator != null)
        msgs = ((InternalEObject)newDesignator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DESIGNATOR_LIST__DESIGNATOR, null, msgs);
      msgs = basicSetDesignator(newDesignator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.DESIGNATOR_LIST__DESIGNATOR, newDesignator, newDesignator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public designator_list_linha getDesignator_list_linha()
  {
    return designator_list_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDesignator_list_linha(designator_list_linha newDesignator_list_linha, NotificationChain msgs)
  {
    designator_list_linha oldDesignator_list_linha = designator_list_linha;
    designator_list_linha = newDesignator_list_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA, oldDesignator_list_linha, newDesignator_list_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDesignator_list_linha(designator_list_linha newDesignator_list_linha)
  {
    if (newDesignator_list_linha != designator_list_linha)
    {
      NotificationChain msgs = null;
      if (designator_list_linha != null)
        msgs = ((InternalEObject)designator_list_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA, null, msgs);
      if (newDesignator_list_linha != null)
        msgs = ((InternalEObject)newDesignator_list_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA, null, msgs);
      msgs = basicSetDesignator_list_linha(newDesignator_list_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA, newDesignator_list_linha, newDesignator_list_linha));
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
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR:
        return basicSetDesignator(null, msgs);
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA:
        return basicSetDesignator_list_linha(null, msgs);
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
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR:
        return getDesignator();
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA:
        return getDesignator_list_linha();
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
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR:
        setDesignator((designator)newValue);
        return;
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA:
        setDesignator_list_linha((designator_list_linha)newValue);
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
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR:
        setDesignator((designator)null);
        return;
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA:
        setDesignator_list_linha((designator_list_linha)null);
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
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR:
        return designator != null;
      case AnsicPackage.DESIGNATOR_LIST__DESIGNATOR_LIST_LINHA:
        return designator_list_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //designator_listImpl
