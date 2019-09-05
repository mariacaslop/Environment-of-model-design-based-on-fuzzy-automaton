/**
 */
package fuzzyAutomaton.tests;

import fuzzyAutomaton.FuzzyAutomatonFactory;
import fuzzyAutomaton.TransitionFeature;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Transition Feature</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionFeatureTest extends TestCase {

	/**
	 * The fixture for this Transition Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionFeature fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TransitionFeatureTest.class);
	}

	/**
	 * Constructs a new Transition Feature test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFeatureTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Transition Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(TransitionFeature fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Transition Feature test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionFeature getFixture() {
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
		setFixture(FuzzyAutomatonFactory.eINSTANCE.createTransitionFeature());
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

} //TransitionFeatureTest
