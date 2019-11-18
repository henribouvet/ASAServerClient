/**
 */
package metaModelAsa;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attachment Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.AttachmentLink#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see metaModelAsa.MetaModelAsaPackage#getAttachmentLink()
 * @model
 * @generated
 */
public interface AttachmentLink extends Link {
	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference.
	 * @see #setConnector(Connector)
	 * @see metaModelAsa.MetaModelAsaPackage#getAttachmentLink_Connector()
	 * @model required="true"
	 * @generated
	 */
	Connector getConnector();

	/**
	 * Sets the value of the '{@link metaModelAsa.AttachmentLink#getConnector <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connector</em>' reference.
	 * @see #getConnector()
	 * @generated
	 */
	void setConnector(Connector value);

} // AttachmentLink
