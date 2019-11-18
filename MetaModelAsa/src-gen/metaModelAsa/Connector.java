/**
 */
package metaModelAsa;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.Connector#getFrom <em>From</em>}</li>
 *   <li>{@link metaModelAsa.Connector#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see metaModelAsa.MetaModelAsaPackage#getConnector()
 * @model
 * @generated
 */
public interface Connector extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(From)
	 * @see metaModelAsa.MetaModelAsaPackage#getConnector_From()
	 * @model required="true"
	 * @generated
	 */
	From getFrom();

	/**
	 * Sets the value of the '{@link metaModelAsa.Connector#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(From value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(To)
	 * @see metaModelAsa.MetaModelAsaPackage#getConnector_To()
	 * @model required="true"
	 * @generated
	 */
	To getTo();

	/**
	 * Sets the value of the '{@link metaModelAsa.Connector#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(To value);

} // Connector
