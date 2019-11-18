/**
 */
package metaModelAsa.impl;

import java.util.Collection;

import metaModelAsa.Component;
import metaModelAsa.Configuration;
import metaModelAsa.InterfaceComponent;
import metaModelAsa.MetaModelAsaPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link metaModelAsa.impl.ComponentImpl#getConfiguration <em>Configuration</em>}</li>
 *   <li>{@link metaModelAsa.impl.ComponentImpl#getInterfaceComponent <em>Interface Component</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ComponentImpl extends ArchitecturalElementImpl implements Component {
	/**
	 * The cached value of the '{@link #getConfiguration() <em>Configuration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfiguration()
	 * @generated
	 * @ordered
	 */
	protected Configuration configuration;

	/**
	 * The cached value of the '{@link #getInterfaceComponent() <em>Interface Component</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterfaceComponent()
	 * @generated
	 * @ordered
	 */
	protected EList<InterfaceComponent> interfaceComponent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelAsaPackage.Literals.COMPONENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration getConfiguration() {
		if (configuration != null && configuration.eIsProxy()) {
			InternalEObject oldConfiguration = (InternalEObject) configuration;
			configuration = (Configuration) eResolveProxy(oldConfiguration);
			if (configuration != oldConfiguration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							MetaModelAsaPackage.COMPONENT__CONFIGURATION, oldConfiguration, configuration));
			}
		}
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration basicGetConfiguration() {
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfiguration(Configuration newConfiguration) {
		Configuration oldConfiguration = configuration;
		configuration = newConfiguration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelAsaPackage.COMPONENT__CONFIGURATION,
					oldConfiguration, configuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InterfaceComponent> getInterfaceComponent() {
		if (interfaceComponent == null) {
			interfaceComponent = new EObjectResolvingEList<InterfaceComponent>(InterfaceComponent.class, this,
					MetaModelAsaPackage.COMPONENT__INTERFACE_COMPONENT);
		}
		return interfaceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetaModelAsaPackage.COMPONENT__CONFIGURATION:
			if (resolve)
				return getConfiguration();
			return basicGetConfiguration();
		case MetaModelAsaPackage.COMPONENT__INTERFACE_COMPONENT:
			return getInterfaceComponent();
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
		case MetaModelAsaPackage.COMPONENT__CONFIGURATION:
			setConfiguration((Configuration) newValue);
			return;
		case MetaModelAsaPackage.COMPONENT__INTERFACE_COMPONENT:
			getInterfaceComponent().clear();
			getInterfaceComponent().addAll((Collection<? extends InterfaceComponent>) newValue);
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
		case MetaModelAsaPackage.COMPONENT__CONFIGURATION:
			setConfiguration((Configuration) null);
			return;
		case MetaModelAsaPackage.COMPONENT__INTERFACE_COMPONENT:
			getInterfaceComponent().clear();
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
		case MetaModelAsaPackage.COMPONENT__CONFIGURATION:
			return configuration != null;
		case MetaModelAsaPackage.COMPONENT__INTERFACE_COMPONENT:
			return interfaceComponent != null && !interfaceComponent.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImpl
