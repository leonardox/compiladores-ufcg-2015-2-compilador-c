/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.xtext.example.ansic.AnsicPackage;
import org.xtext.example.ansic.compound_statement;
import org.xtext.example.ansic.declaration_list;
import org.xtext.example.ansic.declaration_specifiers;
import org.xtext.example.ansic.declarator;
import org.xtext.example.ansic.function_definition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>function definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.impl.function_definitionImpl#getDeclaration_specifiers <em>Declaration specifiers</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.function_definitionImpl#getDeclarator <em>Declarator</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.function_definitionImpl#getDeclaration_list <em>Declaration list</em>}</li>
 *   <li>{@link org.xtext.example.ansic.impl.function_definitionImpl#getCompound_statement <em>Compound statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class function_definitionImpl extends MinimalEObjectImpl.Container implements function_definition
{
  /**
   * The cached value of the '{@link #getDeclaration_specifiers() <em>Declaration specifiers</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_specifiers()
   * @generated
   * @ordered
   */
  protected EList<declaration_specifiers> declaration_specifiers;

  /**
   * The cached value of the '{@link #getDeclarator() <em>Declarator</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclarator()
   * @generated
   * @ordered
   */
  protected declarator declarator;

  /**
   * The cached value of the '{@link #getDeclaration_list() <em>Declaration list</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDeclaration_list()
   * @generated
   * @ordered
   */
  protected EList<declaration_list> declaration_list;

  /**
   * The cached value of the '{@link #getCompound_statement() <em>Compound statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCompound_statement()
   * @generated
   * @ordered
   */
  protected compound_statement compound_statement;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected function_definitionImpl()
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
    return AnsicPackage.Literals.FUNCTION_DEFINITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<declaration_specifiers> getDeclaration_specifiers()
  {
    if (declaration_specifiers == null)
    {
      declaration_specifiers = new EObjectContainmentEList<declaration_specifiers>(declaration_specifiers.class, this, AnsicPackage.FUNCTION_DEFINITION__DECLARATION_SPECIFIERS);
    }
    return declaration_specifiers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public declarator getDeclarator()
  {
    return declarator;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetDeclarator(declarator newDeclarator, NotificationChain msgs)
  {
    declarator oldDeclarator = declarator;
    declarator = newDeclarator;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.FUNCTION_DEFINITION__DECLARATOR, oldDeclarator, newDeclarator);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDeclarator(declarator newDeclarator)
  {
    if (newDeclarator != declarator)
    {
      NotificationChain msgs = null;
      if (declarator != null)
        msgs = ((InternalEObject)declarator).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.FUNCTION_DEFINITION__DECLARATOR, null, msgs);
      if (newDeclarator != null)
        msgs = ((InternalEObject)newDeclarator).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.FUNCTION_DEFINITION__DECLARATOR, null, msgs);
      msgs = basicSetDeclarator(newDeclarator, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.FUNCTION_DEFINITION__DECLARATOR, newDeclarator, newDeclarator));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<declaration_list> getDeclaration_list()
  {
    if (declaration_list == null)
    {
      declaration_list = new EObjectContainmentEList<declaration_list>(declaration_list.class, this, AnsicPackage.FUNCTION_DEFINITION__DECLARATION_LIST);
    }
    return declaration_list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public compound_statement getCompound_statement()
  {
    return compound_statement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetCompound_statement(compound_statement newCompound_statement, NotificationChain msgs)
  {
    compound_statement oldCompound_statement = compound_statement;
    compound_statement = newCompound_statement;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT, oldCompound_statement, newCompound_statement);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCompound_statement(compound_statement newCompound_statement)
  {
    if (newCompound_statement != compound_statement)
    {
      NotificationChain msgs = null;
      if (compound_statement != null)
        msgs = ((InternalEObject)compound_statement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT, null, msgs);
      if (newCompound_statement != null)
        msgs = ((InternalEObject)newCompound_statement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT, null, msgs);
      msgs = basicSetCompound_statement(newCompound_statement, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT, newCompound_statement, newCompound_statement));
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
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_SPECIFIERS:
        return ((InternalEList<?>)getDeclaration_specifiers()).basicRemove(otherEnd, msgs);
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATOR:
        return basicSetDeclarator(null, msgs);
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_LIST:
        return ((InternalEList<?>)getDeclaration_list()).basicRemove(otherEnd, msgs);
      case AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT:
        return basicSetCompound_statement(null, msgs);
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
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_SPECIFIERS:
        return getDeclaration_specifiers();
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATOR:
        return getDeclarator();
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_LIST:
        return getDeclaration_list();
      case AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT:
        return getCompound_statement();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_SPECIFIERS:
        getDeclaration_specifiers().clear();
        getDeclaration_specifiers().addAll((Collection<? extends declaration_specifiers>)newValue);
        return;
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATOR:
        setDeclarator((declarator)newValue);
        return;
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_LIST:
        getDeclaration_list().clear();
        getDeclaration_list().addAll((Collection<? extends declaration_list>)newValue);
        return;
      case AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT:
        setCompound_statement((compound_statement)newValue);
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
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_SPECIFIERS:
        getDeclaration_specifiers().clear();
        return;
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATOR:
        setDeclarator((declarator)null);
        return;
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_LIST:
        getDeclaration_list().clear();
        return;
      case AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT:
        setCompound_statement((compound_statement)null);
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
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_SPECIFIERS:
        return declaration_specifiers != null && !declaration_specifiers.isEmpty();
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATOR:
        return declarator != null;
      case AnsicPackage.FUNCTION_DEFINITION__DECLARATION_LIST:
        return declaration_list != null && !declaration_list.isEmpty();
      case AnsicPackage.FUNCTION_DEFINITION__COMPOUND_STATEMENT:
        return compound_statement != null;
    }
    return super.eIsSet(featureID);
  }

} //function_definitionImpl