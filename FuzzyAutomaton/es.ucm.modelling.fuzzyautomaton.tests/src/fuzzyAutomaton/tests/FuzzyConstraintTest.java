/**
 */
package fuzzyAutomaton.tests;

import fuzzyAutomaton.FuzzyAutomatonFactory;
import fuzzyAutomaton.FuzzyConstraint;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fuzzy Constraint</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzyConstraintTest extends TestCase {

	/**
	 * The fixture for this Fuzzy Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyConstraint fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FuzzyConstraintTest.class);
	}

	/**
	 * Constructs a new Fuzzy Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyConstraintTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fuzzy Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FuzzyConstraint fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fuzzy Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyConstraint getFixture() {
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
		setFixture(FuzzyAutomatonFactory.eINSTANCE.createFuzzyConstraint());
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

} //FuzzyConstraintTest
