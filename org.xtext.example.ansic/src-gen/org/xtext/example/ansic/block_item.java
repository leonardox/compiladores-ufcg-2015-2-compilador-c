/**
 * generated by Xtext 2.9.1
 */
package org.xtext.example.ansic;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>block item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.ansic.block_item#getBlock_item_list_linha <em>Block item list linha</em>}</li>
 *   <li>{@link org.xtext.example.ansic.block_item#getDeclaration <em>Declaration</em>}</li>
 *   <li>{@link org.xtext.example.ansic.block_item#getStatement <em>Statement</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.ansic.AnsicPackage#getblock_item()
 * @model
 * @generated
 */
public interface block_item extends block_item_list
{
  /**
   * Returns the value of the '<em><b>Block item list linha</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Block item list linha</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Block item list linha</em>' containment reference.
   * @see #setBlock_item_list_linha(block_item_list_linha)
   * @see org.xtext.example.ansic.AnsicPackage#getblock_item_Block_item_list_linha()
   * @model containment="true"
   * @generated
   */
  block_item_list_linha getBlock_item_list_linha();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.block_item#getBlock_item_list_linha <em>Block item list linha</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Block item list linha</em>' containment reference.
   * @see #getBlock_item_list_linha()
   * @generated
   */
  void setBlock_item_list_linha(block_item_list_linha value);

  /**
   * Returns the value of the '<em><b>Declaration</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Declaration</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Declaration</em>' containment reference.
   * @see #setDeclaration(declaration)
   * @see org.xtext.example.ansic.AnsicPackage#getblock_item_Declaration()
   * @model containment="true"
   * @generated
   */
  declaration getDeclaration();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.block_item#getDeclaration <em>Declaration</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Declaration</em>' containment reference.
   * @see #getDeclaration()
   * @generated
   */
  void setDeclaration(declaration value);

  /**
   * Returns the value of the '<em><b>Statement</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Statement</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Statement</em>' containment reference.
   * @see #setStatement(statement)
   * @see org.xtext.example.ansic.AnsicPackage#getblock_item_Statement()
   * @model containment="true"
   * @generated
   */
  statement getStatement();

  /**
   * Sets the value of the '{@link org.xtext.example.ansic.block_item#getStatement <em>Statement</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Statement</em>' containment reference.
   * @see #getStatement()
   * @generated
   */
  void setStatement(statement value);

} // block_item
