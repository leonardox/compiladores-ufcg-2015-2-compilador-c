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
import org.xtext.example.ansic.StructOrUnionSpecifierComplementAction;
import org.xtext.example.ansic.struct_declaration_list;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Or Union Specifier Complement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.StructOrUnionSpecifierComplementActionImpl#getStruct_declaration_list <em>Struct declaration list</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructOrUnionSpecifierComplementActionImpl extends struct_or_union_specifier_complementImpl implements StructOrUnionSpecifierComplementAction
{
  /**
   * The cached value of the '{@link #getStruct_declaration_list() <em>Struct declaration list</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct_declaration_list()
   * @generated
   * @ordered
   */
  protected struct_declaration_list struct_declaration_list;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructOrUnionSpecifierComplementActionImpl()
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
    return AnsicPackage.Literals.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration_list getStruct_declaration_list()
  {
    return struct_declaration_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct_declaration_list(struct_declaration_list newStruct_declaration_list, NotificationChain msgs)
  {
    struct_declaration_list oldStruct_declaration_list = struct_declaration_list;
    struct_declaration_list = newStruct_declaration_list;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST, oldStruct_declaration_list, newStruct_declaration_list);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct_declaration_list(struct_declaration_list newStruct_declaration_list)
  {
    if (newStruct_declaration_list != struct_declaration_list)
    {
      NotificationChain msgs = null;
      if (struct_declaration_list != null)
        msgs = ((InternalEObject)struct_declaration_list).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST, null, msgs);
      if (newStruct_declaration_list != null)
        msgs = ((InternalEObject)newStruct_declaration_list).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST, null, msgs);
      msgs = basicSetStruct_declaration_list(newStruct_declaration_list, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST, newStruct_declaration_list, newStruct_declaration_list));
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
      case AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST:
        return basicSetStruct_declaration_list(null, msgs);
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
      case AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST:
        return getStruct_declaration_list();
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
      case AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST:
        setStruct_declaration_list((struct_declaration_list)newValue);
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
      case AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST:
        setStruct_declaration_list((struct_declaration_list)null);
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
      case AnsicPackage.STRUCT_OR_UNION_SPECIFIER_COMPLEMENT_ACTION__STRUCT_DECLARATION_LIST:
        return struct_declaration_list != null;
    }
    return super.eIsSet(featureID);
  }

} //StructOrUnionSpecifierComplementActionImpl
