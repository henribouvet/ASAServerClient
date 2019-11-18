/**
 */
package metaModelAsa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.Configuration#getComponent <em>Component</em>}</li>
 *   <li>{@link metaModelAsa.Configuration#getConnector <em>Connector</em>}</li>
 *   <li>{@link metaModelAsa.Configuration#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @see metaModelAsa.MetaModelAsaPackage#getConfiguration()
 * @model
 * @generated
 */
public interface Configuration extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Component</b></em>' reference list.
	 * The list contents are of type {@link metaModelAsa.Component}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Component</em>' reference list.
	 * @see metaModelAsa.MetaModelAsaPackage#getConfiguration_Component()
	 * @model required="true"
	 * @generated
	 */
	EList<Component> getComponent();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' reference list.
	 * The list contents are of type {@link metaModelAsa.Connector}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connector</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' reference list.
	 * @see metaModelAsa.MetaModelAsaPackage#getConfiguration_Connector()
	 * @model
	 * @generated
	 */
	EList<Connector> getConnector();

	/**
	 * Returns the value of the '<em><b>Port</b></em>' reference list.
	 * The list contents are of type {@link metaModelAsa.Port}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Port</em>' reference list.
	 * @see metaModelAsa.MetaModelAsaPackage#getConfiguration_Port()
	 * @model required="true"
	 * @generated
	 */
	EList<Port> getPort();

} // Configuration
