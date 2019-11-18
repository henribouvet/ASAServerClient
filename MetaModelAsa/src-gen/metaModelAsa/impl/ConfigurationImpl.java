/**
 */
package metaModelAsa.impl;

import java.util.Collection;

import metaModelAsa.Component;
import metaModelAsa.Configuration;
import metaModelAsa.Connector;
import metaModelAsa.MetaModelAsaPackage;
import metaModelAsa.Port;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.impl.ConfigurationImpl#getComponent <em>Component</em>}</li>
 *   <li>{@link metaModelAsa.impl.ConfigurationImpl#getConnector <em>Connector</em>}</li>
 *   <li>{@link metaModelAsa.impl.ConfigurationImpl#getPort <em>Port</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConfigurationImpl extends ArchitecturalElementImpl implements Configuration {
	/**
	 * The cached value of the '{@link #getComponent() <em>Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<Component> component;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> connector;

	/**
	 * The cached value of the '{@link #getPort() <em>Port</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> port;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelAsaPackage.Literals.CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Component> getComponent() {
		if (component == null) {
			component = new EObjectResolvingEList<Component>(Component.class, this,
					MetaModelAsaPackage.CONFIGURATION__COMPONENT);
		}
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getConnector() {
		if (connector == null) {
			connector = new EObjectResolvingEList<Connector>(Connector.class, this,
					MetaModelAsaPackage.CONFIGURATION__CONNECTOR);
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPort() {
		if (port == null) {
			port = new EObjectResolvingEList<Port>(Port.class, this, MetaModelAsaPackage.CONFIGURATION__PORT);
		}
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelAsaPackage.CONFIGURATION__COMPONENT:
			return getComponent();
		case MetaModelAsaPackage.CONFIGURATION__CONNECTOR:
			return getConnector();
		case MetaModelAsaPackage.CONFIGURATION__PORT:
			return getPort();
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetaModelAsaPackage.CONFIGURATION__COMPONENT:
			getComponent().clear();
			getComponent().addAll((Collection<? extends Component>) newValue);
			return;
		case MetaModelAsaPackage.CONFIGURATION__CONNECTOR:
			getConnector().clear();
			getConnector().addAll((Collection<? extends Connector>) newValue);
			return;
		case MetaModelAsaPackage.CONFIGURATION__PORT:
			getPort().clear();
			getPort().addAll((Collection<? extends Port>) newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetaModelAsaPackage.CONFIGURATION__COMPONENT:
			getComponent().clear();
			return;
		case MetaModelAsaPackage.CONFIGURATION__CONNECTOR:
			getConnector().clear();
			return;
		case MetaModelAsaPackage.CONFIGURATION__PORT:
			getPort().clear();
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetaModelAsaPackage.CONFIGURATION__COMPONENT:
			return component != null && !component.isEmpty();
		case MetaModelAsaPackage.CONFIGURATION__CONNECTOR:
			return connector != null && !connector.isEmpty();
		case MetaModelAsaPackage.CONFIGURATION__PORT:
			return port != null && !port.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ConfigurationImpl
