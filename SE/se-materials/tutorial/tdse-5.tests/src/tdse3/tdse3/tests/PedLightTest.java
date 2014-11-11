/**
 */
package tdse3.tdse3.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import tdse3.tdse3.PedLight;
import tdse3.tdse3.Tdse3Factory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Ped Light</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class PedLightTest extends TestCase {

	/**
	 * The fixture for this Ped Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedLight fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(PedLightTest.class);
	}

	/**
	 * Constructs a new Ped Light test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PedLightTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Ped Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(PedLight fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Ped Light test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PedLight getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Tdse3Factory.eINSTANCE.createPedLight());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //PedLightTest
