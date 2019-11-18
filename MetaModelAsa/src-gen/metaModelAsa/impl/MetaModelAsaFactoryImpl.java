/**
 */
package metaModelAsa.impl;

import metaModelAsa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MetaModelAsaFactoryImpl extends EFactoryImpl implements MetaModelAsaFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MetaModelAsaFactory init() {
		try {
			MetaModelAsaFactory theMetaModelAsaFactory = (MetaModelAsaFactory) EPackage.Registry.INSTANCE
					.getEFactory(MetaModelAsaPackage.eNS_URI);
			if (theMetaModelAsaFactory != null) {
				return theMetaModelAsaFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MetaModelAsaFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelAsaFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MetaModelAsaPackage.ARCHITECTURAL_ELEMENT:
			return createArchitecturalElement();
		case MetaModelAsaPackage.COMPONENT:
			return createComponent();
		case MetaModelAsaPackage.CONFIGURATION:
			return createConfiguration();
		case MetaModelAsaPackage.CONNECTOR:
			return createConnector();
		case MetaModelAsaPackage.FROM:
			return createFrom();
		case MetaModelAsaPackage.TO:
			return createTo();
		case MetaModelAsaPackage.INTERFACE:
			return createInterface();
		case MetaModelAsaPackage.PORT:
			return createPort();
		case MetaModelAsaPackage.SERVICE:
			return createService();
		case MetaModelAsaPackage.ROLES:
			return createRoles();
		case MetaModelAsaPackage.PROVIDED_PORT:
			return createProvidedPort();
		case MetaModelAsaPackage.REQUIRED_PORT:
			return createRequiredPort();
		case MetaModelAsaPackage.REQUIRED_SERVICE:
			return createRequiredService();
		case MetaModelAsaPackage.PROVIDED_SERVICE:
			return createProvidedService();
		case MetaModelAsaPackage.INTERFACE_COMPONENT:
			return createInterfaceComponent();
		case MetaModelAsaPackage.BINDING_LINK:
			return createBindingLink();
		case MetaModelAsaPackage.ATTACHMENT_LINK:
			return createAttachmentLink();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArchitecturalElement createArchitecturalElement() {
		ArchitecturalElementImpl architecturalElement = new ArchitecturalElementImpl();
		return architecturalElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Component createComponent() {
		ComponentImpl component = new ComponentImpl();
		return component;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Configuration createConfiguration() {
		ConfigurationImpl configuration = new ConfigurationImpl();
		return configuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector createConnector() {
		ConnectorImpl connector = new ConnectorImpl();
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public From createFrom() {
		FromImpl from = new FromImpl();
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public To createTo() {
		ToImpl to = new ToImpl();
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Port createPort() {
		PortImpl port = new PortImpl();
		return port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service createService() {
		ServiceImpl service = new ServiceImpl();
		return service;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Roles createRoles() {
		RolesImpl roles = new RolesImpl();
		return roles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedPort createProvidedPort() {
		ProvidedPortImpl providedPort = new ProvidedPortImpl();
		return providedPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredPort createRequiredPort() {
		RequiredPortImpl requiredPort = new RequiredPortImpl();
		return requiredPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequiredService createRequiredService() {
		RequiredServiceImpl requiredService = new RequiredServiceImpl();
		return requiredService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProvidedService createProvidedService() {
		ProvidedServiceImpl providedService = new ProvidedServiceImpl();
		return providedService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterfaceComponent createInterfaceComponent() {
		InterfaceComponentImpl interfaceComponent = new InterfaceComponentImpl();
		return interfaceComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BindingLink createBindingLink() {
		BindingLinkImpl bindingLink = new BindingLinkImpl();
		return bindingLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttachmentLink createAttachmentLink() {
		AttachmentLinkImpl attachmentLink = new AttachmentLinkImpl();
		return attachmentLink;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetaModelAsaPackage getMetaModelAsaPackage() {
		return (MetaModelAsaPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MetaModelAsaPackage getPackage() {
		return MetaModelAsaPackage.eINSTANCE;
	}

} //MetaModelAsaFactoryImpl
