/**
 */
package metaModelAsa;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see metaModelAsa.MetaModelAsaFactory
 * @model kind="package"
 * @generated
 */
public interface MetaModelAsaPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metaModelAsa";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/metaModelAsa";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metaModelAsa";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetaModelAsaPackage eINSTANCE = metaModelAsa.impl.MetaModelAsaPackageImpl.init();

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ArchitecturalElementImpl <em>Architectural Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ArchitecturalElementImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getArchitecturalElement()
	 * @generated
	 */
	int ARCHITECTURAL_ELEMENT = 0;

	/**
	 * The number of structural features of the '<em>Architectural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Architectural Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARCHITECTURAL_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ComponentImpl <em>Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ComponentImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getComponent()
	 * @generated
	 */
	int COMPONENT = 1;

	/**
	 * The feature id for the '<em><b>Configuration</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__CONFIGURATION = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Interface Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT__INTERFACE_COMPONENT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPONENT_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ConfigurationImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getConfiguration()
	 * @generated
	 */
	int CONFIGURATION = 2;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__COMPONENT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__CONNECTOR = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION__PORT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFIGURATION_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ConnectorImpl <em>Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ConnectorImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getConnector()
	 * @generated
	 */
	int CONNECTOR = 3;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__FROM = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR__TO = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_FEATURE_COUNT = ARCHITECTURAL_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTOR_OPERATION_COUNT = ARCHITECTURAL_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.InterfaceImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 6;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.FromImpl <em>From</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.FromImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getFrom()
	 * @generated
	 */
	int FROM = 4;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM__ROLES = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>From</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FROM_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ToImpl <em>To</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ToImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getTo()
	 * @generated
	 */
	int TO = 5;

	/**
	 * The feature id for the '<em><b>Roles</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO__ROLES = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>To</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TO_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.InterfaceComponentImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getInterfaceComponent()
	 * @generated
	 */
	int INTERFACE_COMPONENT = 14;

	/**
	 * The number of structural features of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Interface Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_COMPONENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.PortImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 7;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ServiceImpl <em>Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ServiceImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getService()
	 * @generated
	 */
	int SERVICE = 8;

	/**
	 * The number of structural features of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_FEATURE_COUNT = INTERFACE_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SERVICE_OPERATION_COUNT = INTERFACE_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.RolesImpl <em>Roles</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.RolesImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getRoles()
	 * @generated
	 */
	int ROLES = 9;

	/**
	 * The number of structural features of the '<em>Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Roles</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROLES_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ProvidedPortImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getProvidedPort()
	 * @generated
	 */
	int PROVIDED_PORT = 10;

	/**
	 * The number of structural features of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.RequiredPortImpl <em>Required Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.RequiredPortImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getRequiredPort()
	 * @generated
	 */
	int REQUIRED_PORT = 11;

	/**
	 * The number of structural features of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.RequiredServiceImpl <em>Required Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.RequiredServiceImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getRequiredService()
	 * @generated
	 */
	int REQUIRED_SERVICE = 12;

	/**
	 * The number of structural features of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Required Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.ProvidedServiceImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getProvidedService()
	 * @generated
	 */
	int PROVIDED_SERVICE = 13;

	/**
	 * The number of structural features of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_FEATURE_COUNT = SERVICE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_SERVICE_OPERATION_COUNT = SERVICE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.LinkImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 15;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__COMPONENT = 0;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.BindingLinkImpl <em>Binding Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.BindingLinkImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getBindingLink()
	 * @generated
	 */
	int BINDING_LINK = 16;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_LINK__COMPONENT = LINK__COMPONENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_LINK__PORT = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Binding Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Binding Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINDING_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link metaModelAsa.impl.AttachmentLinkImpl <em>Attachment Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see metaModelAsa.impl.AttachmentLinkImpl
	 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getAttachmentLink()
	 * @generated
	 */
	int ATTACHMENT_LINK = 17;

	/**
	 * The feature id for the '<em><b>Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_LINK__COMPONENT = LINK__COMPONENT;

	/**
	 * The feature id for the '<em><b>Connector</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_LINK__CONNECTOR = LINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attachment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_LINK_FEATURE_COUNT = LINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attachment Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTACHMENT_LINK_OPERATION_COUNT = LINK_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link metaModelAsa.ArchitecturalElement <em>Architectural Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Architectural Element</em>'.
	 * @see metaModelAsa.ArchitecturalElement
	 * @generated
	 */
	EClass getArchitecturalElement();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Component <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Component</em>'.
	 * @see metaModelAsa.Component
	 * @generated
	 */
	EClass getComponent();

	/**
	 * Returns the meta object for the reference '{@link metaModelAsa.Component#getConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Configuration</em>'.
	 * @see metaModelAsa.Component#getConfiguration()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_Configuration();

	/**
	 * Returns the meta object for the reference list '{@link metaModelAsa.Component#getInterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Interface Component</em>'.
	 * @see metaModelAsa.Component#getInterfaceComponent()
	 * @see #getComponent()
	 * @generated
	 */
	EReference getComponent_InterfaceComponent();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Configuration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see metaModelAsa.Configuration
	 * @generated
	 */
	EClass getConfiguration();

	/**
	 * Returns the meta object for the reference list '{@link metaModelAsa.Configuration#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Component</em>'.
	 * @see metaModelAsa.Configuration#getComponent()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Component();

	/**
	 * Returns the meta object for the reference list '{@link metaModelAsa.Configuration#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Connector</em>'.
	 * @see metaModelAsa.Configuration#getConnector()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Connector();

	/**
	 * Returns the meta object for the reference list '{@link metaModelAsa.Configuration#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Port</em>'.
	 * @see metaModelAsa.Configuration#getPort()
	 * @see #getConfiguration()
	 * @generated
	 */
	EReference getConfiguration_Port();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Connector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connector</em>'.
	 * @see metaModelAsa.Connector
	 * @generated
	 */
	EClass getConnector();

	/**
	 * Returns the meta object for the reference '{@link metaModelAsa.Connector#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see metaModelAsa.Connector#getFrom()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_From();

	/**
	 * Returns the meta object for the reference '{@link metaModelAsa.Connector#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see metaModelAsa.Connector#getTo()
	 * @see #getConnector()
	 * @generated
	 */
	EReference getConnector_To();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.From <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>From</em>'.
	 * @see metaModelAsa.From
	 * @generated
	 */
	EClass getFrom();

	/**
	 * Returns the meta object for the reference list '{@link metaModelAsa.From#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see metaModelAsa.From#getRoles()
	 * @see #getFrom()
	 * @generated
	 */
	EReference getFrom_Roles();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.To <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>To</em>'.
	 * @see metaModelAsa.To
	 * @generated
	 */
	EClass getTo();

	/**
	 * Returns the meta object for the reference list '{@link metaModelAsa.To#getRoles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Roles</em>'.
	 * @see metaModelAsa.To#getRoles()
	 * @see #getTo()
	 * @generated
	 */
	EReference getTo_Roles();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see metaModelAsa.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see metaModelAsa.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Service</em>'.
	 * @see metaModelAsa.Service
	 * @generated
	 */
	EClass getService();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Roles <em>Roles</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Roles</em>'.
	 * @see metaModelAsa.Roles
	 * @generated
	 */
	EClass getRoles();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.ProvidedPort <em>Provided Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Port</em>'.
	 * @see metaModelAsa.ProvidedPort
	 * @generated
	 */
	EClass getProvidedPort();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.RequiredPort <em>Required Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Port</em>'.
	 * @see metaModelAsa.RequiredPort
	 * @generated
	 */
	EClass getRequiredPort();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.RequiredService <em>Required Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required Service</em>'.
	 * @see metaModelAsa.RequiredService
	 * @generated
	 */
	EClass getRequiredService();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.ProvidedService <em>Provided Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided Service</em>'.
	 * @see metaModelAsa.ProvidedService
	 * @generated
	 */
	EClass getProvidedService();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.InterfaceComponent <em>Interface Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface Component</em>'.
	 * @see metaModelAsa.InterfaceComponent
	 * @generated
	 */
	EClass getInterfaceComponent();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see metaModelAsa.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link metaModelAsa.Link#getComponent <em>Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Component</em>'.
	 * @see metaModelAsa.Link#getComponent()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Component();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.BindingLink <em>Binding Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Binding Link</em>'.
	 * @see metaModelAsa.BindingLink
	 * @generated
	 */
	EClass getBindingLink();

	/**
	 * Returns the meta object for the reference '{@link metaModelAsa.BindingLink#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see metaModelAsa.BindingLink#getPort()
	 * @see #getBindingLink()
	 * @generated
	 */
	EReference getBindingLink_Port();

	/**
	 * Returns the meta object for class '{@link metaModelAsa.AttachmentLink <em>Attachment Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attachment Link</em>'.
	 * @see metaModelAsa.AttachmentLink
	 * @generated
	 */
	EClass getAttachmentLink();

	/**
	 * Returns the meta object for the reference '{@link metaModelAsa.AttachmentLink#getConnector <em>Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connector</em>'.
	 * @see metaModelAsa.AttachmentLink#getConnector()
	 * @see #getAttachmentLink()
	 * @generated
	 */
	EReference getAttachmentLink_Connector();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetaModelAsaFactory getMetaModelAsaFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ArchitecturalElementImpl <em>Architectural Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ArchitecturalElementImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getArchitecturalElement()
		 * @generated
		 */
		EClass ARCHITECTURAL_ELEMENT = eINSTANCE.getArchitecturalElement();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ComponentImpl <em>Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ComponentImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getComponent()
		 * @generated
		 */
		EClass COMPONENT = eINSTANCE.getComponent();

		/**
		 * The meta object literal for the '<em><b>Configuration</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__CONFIGURATION = eINSTANCE.getComponent_Configuration();

		/**
		 * The meta object literal for the '<em><b>Interface Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPONENT__INTERFACE_COMPONENT = eINSTANCE.getComponent_InterfaceComponent();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ConfigurationImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getConfiguration()
		 * @generated
		 */
		EClass CONFIGURATION = eINSTANCE.getConfiguration();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__COMPONENT = eINSTANCE.getConfiguration_Component();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__CONNECTOR = eINSTANCE.getConfiguration_Connector();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONFIGURATION__PORT = eINSTANCE.getConfiguration_Port();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ConnectorImpl <em>Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ConnectorImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getConnector()
		 * @generated
		 */
		EClass CONNECTOR = eINSTANCE.getConnector();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__FROM = eINSTANCE.getConnector_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTOR__TO = eINSTANCE.getConnector_To();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.FromImpl <em>From</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.FromImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getFrom()
		 * @generated
		 */
		EClass FROM = eINSTANCE.getFrom();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FROM__ROLES = eINSTANCE.getFrom_Roles();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ToImpl <em>To</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ToImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getTo()
		 * @generated
		 */
		EClass TO = eINSTANCE.getTo();

		/**
		 * The meta object literal for the '<em><b>Roles</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TO__ROLES = eINSTANCE.getTo_Roles();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.InterfaceImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.PortImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ServiceImpl <em>Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ServiceImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getService()
		 * @generated
		 */
		EClass SERVICE = eINSTANCE.getService();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.RolesImpl <em>Roles</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.RolesImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getRoles()
		 * @generated
		 */
		EClass ROLES = eINSTANCE.getRoles();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ProvidedPortImpl <em>Provided Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ProvidedPortImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getProvidedPort()
		 * @generated
		 */
		EClass PROVIDED_PORT = eINSTANCE.getProvidedPort();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.RequiredPortImpl <em>Required Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.RequiredPortImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getRequiredPort()
		 * @generated
		 */
		EClass REQUIRED_PORT = eINSTANCE.getRequiredPort();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.RequiredServiceImpl <em>Required Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.RequiredServiceImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getRequiredService()
		 * @generated
		 */
		EClass REQUIRED_SERVICE = eINSTANCE.getRequiredService();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.ProvidedServiceImpl <em>Provided Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.ProvidedServiceImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getProvidedService()
		 * @generated
		 */
		EClass PROVIDED_SERVICE = eINSTANCE.getProvidedService();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.InterfaceComponentImpl <em>Interface Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.InterfaceComponentImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getInterfaceComponent()
		 * @generated
		 */
		EClass INTERFACE_COMPONENT = eINSTANCE.getInterfaceComponent();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.LinkImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Component</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__COMPONENT = eINSTANCE.getLink_Component();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.BindingLinkImpl <em>Binding Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.BindingLinkImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getBindingLink()
		 * @generated
		 */
		EClass BINDING_LINK = eINSTANCE.getBindingLink();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINDING_LINK__PORT = eINSTANCE.getBindingLink_Port();

		/**
		 * The meta object literal for the '{@link metaModelAsa.impl.AttachmentLinkImpl <em>Attachment Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see metaModelAsa.impl.AttachmentLinkImpl
		 * @see metaModelAsa.impl.MetaModelAsaPackageImpl#getAttachmentLink()
		 * @generated
		 */
		EClass ATTACHMENT_LINK = eINSTANCE.getAttachmentLink();

		/**
		 * The meta object literal for the '<em><b>Connector</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTACHMENT_LINK__CONNECTOR = eINSTANCE.getAttachmentLink_Connector();

	}

} //MetaModelAsaPackage
