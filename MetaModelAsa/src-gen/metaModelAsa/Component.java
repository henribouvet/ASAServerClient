/**
 */
package metaModelAsa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.Component#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link metaModelAsa.Component#getInterfaceComponent <em>Interface Component</em>}</li>
 * </ul>
 *
 * @see metaModelAsa.MetaModelAsaPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends ArchitecturalElement {
	/**
	 * Returns the value of the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configuration</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configuration</em>' reference.
	 * @see #setConfiguration(Configuration)
	 * @see metaModelAsa.MetaModelAsaPackage#getComponent_Configuration()
	 * @model ordered="false"
	 * @generated
	 */
	Configuration getConfiguration();

	/**
	 * Sets the value of the '{@link metaModelAsa.Component#getConfiguration <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Configuration</em>' reference.
	 * @see #getConfiguration()
	 * @generated
	 */
	void setConfiguration(Configuration value);

	/**
	 * Returns the value of the '<em><b>Interface Component</b></em>' reference list.
	 * The list contents are of type {@link metaModelAsa.InterfaceComponent}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Component</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Component</em>' reference list.
	 * @see metaModelAsa.MetaModelAsaPackage#getComponent_InterfaceComponent()
	 * @model lower="2"
	 * @generated
	 */
	EList<InterfaceComponent> getInterfaceComponent();

} // Component
