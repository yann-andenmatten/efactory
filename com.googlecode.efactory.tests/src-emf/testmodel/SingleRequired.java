/*******************************************************************************
 * Copyright (c) 2009 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleRequired.java 82 2009-11-16 05:39:21Z sebastian.benz $
 */
package testmodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc --> A representation of the model object '
 * <em><b>Singe Required</b></em>'. <!-- end-user-doc -->
 * 
 * <p>
 * The following features are supported:
 * <ul>
 * <li>{@link testmodel.SingleRequired#getNestedElements <em>Nested Elements
 * </em>}</li>
 * <li>{@link testmodel.SingleRequired#getNestedElement <em>Nested Element</em>}
 * </li>
 * <li>{@link testmodel.SingleRequired#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 * 
 * @see testmodel.TestmodelPackage#getSingleRequired()
 * @model
 * @generated
 */
public interface SingleRequired extends Abstract, SingleOptional {
	/**
	 * Returns the value of the '<em><b>Nested Elements</b></em>' containment
	 * reference list. The list contents are of type
	 * {@link testmodel.NestedElements}. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Elements</em>' containment reference
	 * list isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nested Elements</em>' containment reference
	 *         list.
	 * @see testmodel.TestmodelPackage#getSingleRequired_NestedElements()
	 * @model containment="true"
	 * @generated
	 */
	EList<NestedElements> getNestedElements();

	/**
	 * Returns the value of the '<em><b>Nested Element</b></em>' containment
	 * reference. <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nested Element</em>' containment reference
	 * isn't clear, there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Nested Element</em>' containment reference.
	 * @see #setNestedElement(NestedElement)
	 * @see testmodel.TestmodelPackage#getSingleRequired_NestedElement()
	 * @model containment="true"
	 * @generated
	 */
	NestedElement getNestedElement();

	/**
	 * Sets the value of the '{@link testmodel.SingleRequired#getNestedElement
	 * <em>Nested Element</em>}' containment reference. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Nested Element</em>' containment
	 *            reference.
	 * @see #getNestedElement()
	 * @generated
	 */
	void setNestedElement(NestedElement value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testmodel.TestmodelPackage#getSingleRequired_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testmodel.SingleRequired#getName
	 * <em>Name</em>}' attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value
	 *            the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // SingeRequired
