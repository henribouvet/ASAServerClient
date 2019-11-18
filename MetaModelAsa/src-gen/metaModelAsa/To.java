/**
 */
package metaModelAsa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>To</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.To#getRoles <em>Roles</em>}</li>
 * </ul>
 *
 * @see metaModelAsa.MetaModelAsaPackage#getTo()
 * @model
 * @generated
 */
public interface To extends Interface {
	/**
	 * Returns the value of the '<em><b>Roles</b></em>' reference list.
	 * The list contents are of type {@link metaModelAsa.Roles}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Roles</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Roles</em>' reference list.
	 * @see metaModelAsa.MetaModelAsaPackage#getTo_Roles()
	 * @model
	 * @generated
	 */
	EList<Roles> getRoles();

} // To
