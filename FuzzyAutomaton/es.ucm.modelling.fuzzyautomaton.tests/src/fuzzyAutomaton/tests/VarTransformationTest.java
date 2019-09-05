/**
 */
package fuzzyAutomaton.tests;

import fuzzyAutomaton.FuzzyAutomatonFactory;
import fuzzyAutomaton.VarTransformation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Var Transformation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class VarTransformationTest extends TestCase {

	/**
	 * The fixture for this Var Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarTransformation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VarTransformationTest.class);
	}

	/**
	 * Constructs a new Var Transformation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarTransformationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Var Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(VarTransformation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Var Transformation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarTransformation getFixture() {
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
		setFixture(FuzzyAutomatonFactory.eINSTANCE.createVarTransformation());
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

} //VarTransformationTest
