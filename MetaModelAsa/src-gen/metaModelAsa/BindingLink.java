/**
 */
package metaModelAsa;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binding Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.BindingLink#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see metaModelAsa.MetaModelAsaPackage#getBindingLink()
 * @model
 * @generated
 */
public interface BindingLink extends Link {
	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference.
	 * @see #setPort(Port)
	 * @see metaModelAsa.MetaModelAsaPackage#getBindingLink_Port()
	 * @model required="true"
	 * @generated
	 */
	Port getPort();

	/**
	 * Sets the value of the '{@link metaModelAsa.BindingLink#getPort <em>Port</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port</em>' reference.
	 * @see #getPort()
	 * @generated
	 */
	void setPort(Port value);

} // BindingLink
