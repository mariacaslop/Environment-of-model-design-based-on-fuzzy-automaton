/**
 */
package fuzzyAutomaton.tests;

import fuzzyAutomaton.FuzzyAutomatonFactory;
import fuzzyAutomaton.FuzzyRelation;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Fuzzy Relation</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzyRelationTest extends TestCase {

	/**
	 * The fixture for this Fuzzy Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyRelation fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FuzzyRelationTest.class);
	}

	/**
	 * Constructs a new Fuzzy Relation test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyRelationTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Fuzzy Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(FuzzyRelation fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Fuzzy Relation test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyRelation getFixture() {
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
		setFixture(FuzzyAutomatonFactory.eINSTANCE.createFuzzyRelation());
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

} //FuzzyRelationTest
