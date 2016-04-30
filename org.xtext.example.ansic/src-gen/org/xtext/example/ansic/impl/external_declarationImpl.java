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
import org.xtext.example.ansic.external_declaration;
import org.xtext.example.ansic.function_definition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>external declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.external_declarationImpl#getFunction_definitio <em>Function definitio</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.external_declarationImpl#getDeclaration <em>Declaration</em>}</li>
 * </ul>
 *
 * @generated
 */
public class external_declarationImpl extends MinimalEObjectImpl.Container implements external_declaration
{
  /**
   * The cached value of the '{@link #getFunction_definitio() <em>Function definitio</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFunction_definitio()
   * @generated
   * @ordered
   */
  protected function_definition function_definitio;

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
  protected external_declarationImpl()
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
    return AnsicPackage.Literals.EXTERNAL_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public function_definition getFunction_definitio()
  {
    return function_definitio;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetFunction_definitio(function_definition newFunction_definitio, NotificationChain msgs)
  {
    function_definition oldFunction_definitio = function_definitio;
    function_definitio = newFunction_definitio;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO, oldFunction_definitio, newFunction_definitio);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFunction_definitio(function_definition newFunction_definitio)
  {
    if (newFunction_definitio != function_definitio)
    {
      NotificationChain msgs = null;
      if (function_definitio != null)
        msgs = ((InternalEObject)function_definitio).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO, null, msgs);
      if (newFunction_definitio != null)
        msgs = ((InternalEObject)newFunction_definitio).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO, null, msgs);
      msgs = basicSetFunction_definitio(newFunction_definitio, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO, newFunction_definitio, newFunction_definitio));
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.EXTERNAL_DECLARATION__DECLARATION, oldDeclaration, newDeclaration);
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
        msgs = ((InternalEObject)declaration).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXTERNAL_DECLARATION__DECLARATION, null, msgs);
      if (newDeclaration != null)
        msgs = ((InternalEObject)newDeclaration).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.EXTERNAL_DECLARATION__DECLARATION, null, msgs);
      msgs = basicSetDeclaration(newDeclaration, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.EXTERNAL_DECLARATION__DECLARATION, newDeclaration, newDeclaration));
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
      case AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO:
        return basicSetFunction_definitio(null, msgs);
      case AnsicPackage.EXTERNAL_DECLARATION__DECLARATION:
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
      case AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO:
        return getFunction_definitio();
      case AnsicPackage.EXTERNAL_DECLARATION__DECLARATION:
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
      case AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO:
        setFunction_definitio((function_definition)newValue);
        return;
      case AnsicPackage.EXTERNAL_DECLARATION__DECLARATION:
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
      case AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO:
        setFunction_definitio((function_definition)null);
        return;
      case AnsicPackage.EXTERNAL_DECLARATION__DECLARATION:
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
      case AnsicPackage.EXTERNAL_DECLARATION__FUNCTION_DEFINITIO:
        return function_definitio != null;
      case AnsicPackage.EXTERNAL_DECLARATION__DECLARATION:
        return declaration != null;
    }
    return super.eIsSet(featureID);
  }

} //external_declarationImpl
