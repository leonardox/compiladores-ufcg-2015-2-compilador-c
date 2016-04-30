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
import org.xtext.example.ansic.StructDeclarationListLinhaAction;
import org.xtext.example.ansic.struct_declaration;
import org.xtext.example.ansic.struct_declaration_list_linha;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Struct Declaration List Linha Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.StructDeclarationListLinhaActionImpl#getStruct_declaration <em>Struct declaration</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.StructDeclarationListLinhaActionImpl#getStruct_declaration_list_linha <em>Struct declaration list linha</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructDeclarationListLinhaActionImpl extends struct_declaration_list_linhaImpl implements StructDeclarationListLinhaAction
{
  /**
   * The cached value of the '{@link #getStruct_declaration() <em>Struct declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct_declaration()
   * @generated
   * @ordered
   */
  protected struct_declaration struct_declaration;

  /**
   * The cached value of the '{@link #getStruct_declaration_list_linha() <em>Struct declaration list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStruct_declaration_list_linha()
   * @generated
   * @ordered
   */
  protected struct_declaration_list_linha struct_declaration_list_linha;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected StructDeclarationListLinhaActionImpl()
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
    return AnsicPackage.Literals.STRUCT_DECLARATION_LIST_LINHA_ACTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration getStruct_declaration()
  {
    return struct_declaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct_declaration(struct_declaration newStruct_declaration, NotificationChain msgs)
  {
    struct_declaration oldStruct_declaration = struct_declaration;
    struct_declaration = newStruct_declaration;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION, oldStruct_declaration, newStruct_declaration);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct_declaration(struct_declaration newStruct_declaration)
  {
    if (newStruct_declaration != struct_declaration)
    {
      NotificationChain msgs = null;
      if (struct_declaration != null)
        msgs = ((InternalEObject)struct_declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION, null, msgs);
      if (newStruct_declaration != null)
        msgs = ((InternalEObject)newStruct_declaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION, null, msgs);
      msgs = basicSetStruct_declaration(newStruct_declaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION, newStruct_declaration, newStruct_declaration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public struct_declaration_list_linha getStruct_declaration_list_linha()
  {
    return struct_declaration_list_linha;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetStruct_declaration_list_linha(struct_declaration_list_linha newStruct_declaration_list_linha, NotificationChain msgs)
  {
    struct_declaration_list_linha oldStruct_declaration_list_linha = struct_declaration_list_linha;
    struct_declaration_list_linha = newStruct_declaration_list_linha;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA, oldStruct_declaration_list_linha, newStruct_declaration_list_linha);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStruct_declaration_list_linha(struct_declaration_list_linha newStruct_declaration_list_linha)
  {
    if (newStruct_declaration_list_linha != struct_declaration_list_linha)
    {
      NotificationChain msgs = null;
      if (struct_declaration_list_linha != null)
        msgs = ((InternalEObject)struct_declaration_list_linha).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA, null, msgs);
      if (newStruct_declaration_list_linha != null)
        msgs = ((InternalEObject)newStruct_declaration_list_linha).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA, null, msgs);
      msgs = basicSetStruct_declaration_list_linha(newStruct_declaration_list_linha, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA, newStruct_declaration_list_linha, newStruct_declaration_list_linha));
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
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION:
        return basicSetStruct_declaration(null, msgs);
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA:
        return basicSetStruct_declaration_list_linha(null, msgs);
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
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION:
        return getStruct_declaration();
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA:
        return getStruct_declaration_list_linha();
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
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION:
        setStruct_declaration((struct_declaration)newValue);
        return;
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA:
        setStruct_declaration_list_linha((struct_declaration_list_linha)newValue);
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
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION:
        setStruct_declaration((struct_declaration)null);
        return;
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA:
        setStruct_declaration_list_linha((struct_declaration_list_linha)null);
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
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION:
        return struct_declaration != null;
      case AnsicPackage.STRUCT_DECLARATION_LIST_LINHA_ACTION__STRUCT_DECLARATION_LIST_LINHA:
        return struct_declaration_list_linha != null;
    }
    return super.eIsSet(featureID);
  }

} //StructDeclarationListLinhaActionImpl
