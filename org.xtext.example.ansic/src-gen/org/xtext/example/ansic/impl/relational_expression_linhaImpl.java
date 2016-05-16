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
import org.xtext.example.ansic.relational_expression_linha;
import org.xtext.example.ansic.shift_expression_complement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>relational expression linha</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.relational_expression_linhaImpl#getShift_expression_complement <em>Shift expression complement</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.relational_expression_linhaImpl#getRelational_expression_linha <em>Relational expression linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class relational_expression_linhaImpl extends MinimalEObjectImpl.Container implements relational_expression_linha
{
  /**
   * The cached value of the '{@link #getShift_expression_complement() <em>Shift expression complement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShift_expression_complement()
   * @generated
   * @ordered
   */
  protected shift_expression_complement shift_expression_complement;

  /**
   * The cached value of the '{@link #getRelational_expression_linha() <em>Relational expression linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRelational_expression_linha()
   * @generated
   * @ordered
   */
  protected relational_expression_linha relational_expression_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected relational_expression_linhaImpl()
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
    return AnsicPackage.Literals.RELATIONAL_EXPRESSION_LINHA;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public shift_expression_complement getShift_expression_complement()
  {
    return shift_expression_complement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetShift_expression_complement(shift_expression_complement newShift_expression_complement, NotificationChain msgs)
  {
    shift_expression_complement oldShift_expression_complement = shift_expression_complement;
    shift_expression_complement = newShift_expression_complement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT, oldShift_expression_complement, newShift_expression_complement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShift_expression_complement(shift_expression_complement newShift_expression_complement)
  {
    if (newShift_expression_complement != shift_expression_complement)
    {
      NotificationChain msgs = null;
      if (shift_expression_complement != null)
        msgs = ((InternalEObject)shift_expression_complement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT, null, msgs);
      if (newShift_expression_complement != null)
        msgs = ((InternalEObject)newShift_expression_complement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT, null, msgs);
      msgs = basicSetShift_expression_complement(newShift_expression_complement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT, newShift_expression_complement, newShift_expression_complement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public relational_expression_linha getRelational_expression_linha()
  {
    return relational_expression_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRelational_expression_linha(relational_expression_linha newRelational_expression_linha, NotificationChain msgs)
  {
    relational_expression_linha oldRelational_expression_linha = relational_expression_linha;
    relational_expression_linha = newRelational_expression_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA, oldRelational_expression_linha, newRelational_expression_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRelational_expression_linha(relational_expression_linha newRelational_expression_linha)
  {
    if (newRelational_expression_linha != relational_expression_linha)
    {
      NotificationChain msgs = null;
      if (relational_expression_linha != null)
        msgs = ((InternalEObject)relational_expression_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA, null, msgs);
      if (newRelational_expression_linha != null)
        msgs = ((InternalEObject)newRelational_expression_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA, null, msgs);
      msgs = basicSetRelational_expression_linha(newRelational_expression_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA, newRelational_expression_linha, newRelational_expression_linha));
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
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT:
        return basicSetShift_expression_complement(null, msgs);
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA:
        return basicSetRelational_expression_linha(null, msgs);
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
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT:
        return getShift_expression_complement();
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA:
        return getRelational_expression_linha();
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
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT:
        setShift_expression_complement((shift_expression_complement)newValue);
        return;
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA:
        setRelational_expression_linha((relational_expression_linha)newValue);
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
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT:
        setShift_expression_complement((shift_expression_complement)null);
        return;
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA:
        setRelational_expression_linha((relational_expression_linha)null);
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
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__SHIFT_EXPRESSION_COMPLEMENT:
        return shift_expression_complement != null;
      case AnsicPackage.RELATIONAL_EXPRESSION_LINHA__RELATIONAL_EXPRESSION_LINHA:
        return relational_expression_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //relational_expression_linhaImpl
