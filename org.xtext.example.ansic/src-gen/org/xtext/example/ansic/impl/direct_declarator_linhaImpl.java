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
import org.xtext.example.ansic.direct_declarator_complemento;
import org.xtext.example.ansic.direct_declarator_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>direct declarator linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.direct_declarator_linhaImpl#getDirect_declarator_complemento <em>Direct declarator complemento</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.direct_declarator_linhaImpl#getDirect_declarator_linha <em>Direct declarator linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class direct_declarator_linhaImpl extends MinimalEObjectImpl.Container implements direct_declarator_linha
{
  /**
   * The cached value of the '{@link #getDirect_declarator_complemento() <em>Direct declarator complemento</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect_declarator_complemento()
   * @generated
   * @ordered
   */
  protected direct_declarator_complemento direct_declarator_complemento;

  /**
   * The cached value of the '{@link #getDirect_declarator_linha() <em>Direct declarator linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirect_declarator_linha()
   * @generated
   * @ordered
   */
  protected direct_declarator_linha direct_declarator_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected direct_declarator_linhaImpl()
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
    return AnsicPackage.Literals.DIRECT_DECLARATOR_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declarator_complemento getDirect_declarator_complemento()
  {
    return direct_declarator_complemento;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect_declarator_complemento(direct_declarator_complemento newDirect_declarator_complemento, NotificationChain msgs)
  {
    direct_declarator_complemento oldDirect_declarator_complemento = direct_declarator_complemento;
    direct_declarator_complemento = newDirect_declarator_complemento;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO, oldDirect_declarator_complemento, newDirect_declarator_complemento);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect_declarator_complemento(direct_declarator_complemento newDirect_declarator_complemento)
  {
    if (newDirect_declarator_complemento != direct_declarator_complemento)
    {
      NotificationChain msgs = null;
      if (direct_declarator_complemento != null)
        msgs = ((InternalEObject)direct_declarator_complemento).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO, null, msgs);
      if (newDirect_declarator_complemento != null)
        msgs = ((InternalEObject)newDirect_declarator_complemento).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO, null, msgs);
      msgs = basicSetDirect_declarator_complemento(newDirect_declarator_complemento, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO, newDirect_declarator_complemento, newDirect_declarator_complemento));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public direct_declarator_linha getDirect_declarator_linha()
  {
    return direct_declarator_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDirect_declarator_linha(direct_declarator_linha newDirect_declarator_linha, NotificationChain msgs)
  {
    direct_declarator_linha oldDirect_declarator_linha = direct_declarator_linha;
    direct_declarator_linha = newDirect_declarator_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA, oldDirect_declarator_linha, newDirect_declarator_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDirect_declarator_linha(direct_declarator_linha newDirect_declarator_linha)
  {
    if (newDirect_declarator_linha != direct_declarator_linha)
    {
      NotificationChain msgs = null;
      if (direct_declarator_linha != null)
        msgs = ((InternalEObject)direct_declarator_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA, null, msgs);
      if (newDirect_declarator_linha != null)
        msgs = ((InternalEObject)newDirect_declarator_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA, null, msgs);
      msgs = basicSetDirect_declarator_linha(newDirect_declarator_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA, newDirect_declarator_linha, newDirect_declarator_linha));
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
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO:
        return basicSetDirect_declarator_complemento(null, msgs);
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA:
        return basicSetDirect_declarator_linha(null, msgs);
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
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO:
        return getDirect_declarator_complemento();
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA:
        return getDirect_declarator_linha();
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
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO:
        setDirect_declarator_complemento((direct_declarator_complemento)newValue);
        return;
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA:
        setDirect_declarator_linha((direct_declarator_linha)newValue);
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
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO:
        setDirect_declarator_complemento((direct_declarator_complemento)null);
        return;
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA:
        setDirect_declarator_linha((direct_declarator_linha)null);
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
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_COMPLEMENTO:
        return direct_declarator_complemento != null;
      case AnsicPackage.DIRECT_DECLARATOR_LINHA__DIRECT_DECLARATOR_LINHA:
        return direct_declarator_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //direct_declarator_linhaImpl
