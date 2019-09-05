/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see fuzzyAutomaton.FuzzyAutomatonFactory
 * @model kind="package"
 * @generated
 */
public interface FuzzyAutomatonPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fuzzyAutomaton";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "fuzzyAutomaton";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fuzzyAutomaton";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FuzzyAutomatonPackage eINSTANCE = fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl.init();

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl <em>Fuzzy Automaton</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyAutomaton()
	 * @generated
	 */
	int FUZZY_AUTOMATON = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON__NAME = 0;

	/**
	 * The feature id for the '<em><b>TNorm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON__TNORM = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON__STATES = 2;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON__TRANSITIONS = 3;

	/**
	 * The feature id for the '<em><b>Variable Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON__VARIABLE_SET = 4;

	/**
	 * The feature id for the '<em><b>Transition Features</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON__TRANSITION_FEATURES = 5;

	/**
	 * The number of structural features of the '<em>Fuzzy Automaton</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_AUTOMATON_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.StateImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getState()
	 * @generated
	 */
	int STATE = 1;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__IS_INITIAL = 0;

	/**
	 * The feature id for the '<em><b>Incoming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING = 2;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.TransitionImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__FEATURE = 2;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.VariableSetImpl <em>Variable Set</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.VariableSetImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVariableSet()
	 * @generated
	 */
	int VARIABLE_SET = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SET__NAME = 0;

	/**
	 * The feature id for the '<em><b>Variables</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SET__VARIABLES = 1;

	/**
	 * The number of structural features of the '<em>Variable Set</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_SET_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.VariableImpl <em>Variable</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.VariableImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVariable()
	 * @generated
	 */
	int VARIABLE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Variable</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.TransitionFeatureImpl <em>Transition Feature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.TransitionFeatureImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getTransitionFeature()
	 * @generated
	 */
	int TRANSITION_FEATURE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Feature To Transition</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE__FEATURE_TO_TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE__ACTION = 2;

	/**
	 * The feature id for the '<em><b>Fuzzy Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE__FUZZY_CONSTRAINT = 3;

	/**
	 * The feature id for the '<em><b>Var Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE__VAR_TRANSFORMATION = 4;

	/**
	 * The number of structural features of the '<em>Transition Feature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.ActionImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.InputImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__PARAMETERS = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.OutputImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = ACTION__NAME;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__EXPRESSION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = ACTION_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.FuzzyConstraintImpl <em>Fuzzy Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.FuzzyConstraintImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyConstraint()
	 * @generated
	 */
	int FUZZY_CONSTRAINT = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_CONSTRAINT__NAME = 0;

	/**
	 * The feature id for the '<em><b>TNorm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_CONSTRAINT__TNORM = 1;

	/**
	 * The feature id for the '<em><b>Fuzzy Relations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_CONSTRAINT__FUZZY_RELATIONS = 2;

	/**
	 * The number of structural features of the '<em>Fuzzy Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.FuzzyRelationImpl <em>Fuzzy Relation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.FuzzyRelationImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyRelation()
	 * @generated
	 */
	int FUZZY_RELATION = 10;

	/**
	 * The feature id for the '<em><b>TF Relation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RELATION__TF_RELATION = 0;

	/**
	 * The feature id for the '<em><b>Expression1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RELATION__EXPRESSION1 = 1;

	/**
	 * The feature id for the '<em><b>Expression2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RELATION__EXPRESSION2 = 2;

	/**
	 * The feature id for the '<em><b>Expression3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RELATION__EXPRESSION3 = 3;

	/**
	 * The feature id for the '<em><b>Delta</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RELATION__DELTA = 4;

	/**
	 * The number of structural features of the '<em>Fuzzy Relation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUZZY_RELATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.VarTransformationImpl <em>Var Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.VarTransformationImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVarTransformation()
	 * @generated
	 */
	int VAR_TRANSFORMATION = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TRANSFORMATION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Var Updates</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TRANSFORMATION__VAR_UPDATES = 1;

	/**
	 * The number of structural features of the '<em>Var Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_TRANSFORMATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.impl.VarUpdateImpl <em>Var Update</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.impl.VarUpdateImpl
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVarUpdate()
	 * @generated
	 */
	int VAR_UPDATE = 12;

	/**
	 * The feature id for the '<em><b>Variable</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_UPDATE__VARIABLE = 0;

	/**
	 * The feature id for the '<em><b>Expression</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_UPDATE__EXPRESSION = 1;

	/**
	 * The number of structural features of the '<em>Var Update</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_UPDATE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.TNormType <em>TNorm Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.TNormType
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getTNormType()
	 * @generated
	 */
	int TNORM_TYPE = 13;

	/**
	 * The meta object id for the '{@link fuzzyAutomaton.FuzzyRelationType <em>Fuzzy Relation Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see fuzzyAutomaton.FuzzyRelationType
	 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyRelationType()
	 * @generated
	 */
	int FUZZY_RELATION_TYPE = 14;


	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.FuzzyAutomaton <em>Fuzzy Automaton</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzy Automaton</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton
	 * @generated
	 */
	EClass getFuzzyAutomaton();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyAutomaton#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton#getName()
	 * @see #getFuzzyAutomaton()
	 * @generated
	 */
	EAttribute getFuzzyAutomaton_Name();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyAutomaton#getTNorm <em>TNorm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TNorm</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton#getTNorm()
	 * @see #getFuzzyAutomaton()
	 * @generated
	 */
	EAttribute getFuzzyAutomaton_TNorm();

	/**
	 * Returns the meta object for the containment reference list '{@link fuzzyAutomaton.FuzzyAutomaton#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton#getStates()
	 * @see #getFuzzyAutomaton()
	 * @generated
	 */
	EReference getFuzzyAutomaton_States();

	/**
	 * Returns the meta object for the containment reference list '{@link fuzzyAutomaton.FuzzyAutomaton#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton#getTransitions()
	 * @see #getFuzzyAutomaton()
	 * @generated
	 */
	EReference getFuzzyAutomaton_Transitions();

	/**
	 * Returns the meta object for the containment reference '{@link fuzzyAutomaton.FuzzyAutomaton#getVariableSet <em>Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Variable Set</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton#getVariableSet()
	 * @see #getFuzzyAutomaton()
	 * @generated
	 */
	EReference getFuzzyAutomaton_VariableSet();

	/**
	 * Returns the meta object for the containment reference list '{@link fuzzyAutomaton.FuzzyAutomaton#getTransitionFeatures <em>Transition Features</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transition Features</em>'.
	 * @see fuzzyAutomaton.FuzzyAutomaton#getTransitionFeatures()
	 * @see #getFuzzyAutomaton()
	 * @generated
	 */
	EReference getFuzzyAutomaton_TransitionFeatures();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see fuzzyAutomaton.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.State#getIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see fuzzyAutomaton.State#getIsInitial()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_IsInitial();

	/**
	 * Returns the meta object for the reference list '{@link fuzzyAutomaton.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming</em>'.
	 * @see fuzzyAutomaton.State#getIncoming()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Incoming();

	/**
	 * Returns the meta object for the reference list '{@link fuzzyAutomaton.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see fuzzyAutomaton.State#getOutgoing()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_Outgoing();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see fuzzyAutomaton.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link fuzzyAutomaton.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see fuzzyAutomaton.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link fuzzyAutomaton.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see fuzzyAutomaton.Transition#getTarget()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Target();

	/**
	 * Returns the meta object for the reference '{@link fuzzyAutomaton.Transition#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Feature</em>'.
	 * @see fuzzyAutomaton.Transition#getFeature()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Feature();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.VariableSet <em>Variable Set</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable Set</em>'.
	 * @see fuzzyAutomaton.VariableSet
	 * @generated
	 */
	EClass getVariableSet();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.VariableSet#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.VariableSet#getName()
	 * @see #getVariableSet()
	 * @generated
	 */
	EAttribute getVariableSet_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fuzzyAutomaton.VariableSet#getVariables <em>Variables</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variables</em>'.
	 * @see fuzzyAutomaton.VariableSet#getVariables()
	 * @see #getVariableSet()
	 * @generated
	 */
	EReference getVariableSet_Variables();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.Variable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable</em>'.
	 * @see fuzzyAutomaton.Variable
	 * @generated
	 */
	EClass getVariable();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.Variable#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.Variable#getName()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Name();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.Variable#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see fuzzyAutomaton.Variable#getValue()
	 * @see #getVariable()
	 * @generated
	 */
	EAttribute getVariable_Value();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.TransitionFeature <em>Transition Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition Feature</em>'.
	 * @see fuzzyAutomaton.TransitionFeature
	 * @generated
	 */
	EClass getTransitionFeature();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.TransitionFeature#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.TransitionFeature#getName()
	 * @see #getTransitionFeature()
	 * @generated
	 */
	EAttribute getTransitionFeature_Name();

	/**
	 * Returns the meta object for the reference list '{@link fuzzyAutomaton.TransitionFeature#getFeatureToTransition <em>Feature To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Feature To Transition</em>'.
	 * @see fuzzyAutomaton.TransitionFeature#getFeatureToTransition()
	 * @see #getTransitionFeature()
	 * @generated
	 */
	EReference getTransitionFeature_FeatureToTransition();

	/**
	 * Returns the meta object for the containment reference '{@link fuzzyAutomaton.TransitionFeature#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action</em>'.
	 * @see fuzzyAutomaton.TransitionFeature#getAction()
	 * @see #getTransitionFeature()
	 * @generated
	 */
	EReference getTransitionFeature_Action();

	/**
	 * Returns the meta object for the containment reference '{@link fuzzyAutomaton.TransitionFeature#getFuzzyConstraint <em>Fuzzy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fuzzy Constraint</em>'.
	 * @see fuzzyAutomaton.TransitionFeature#getFuzzyConstraint()
	 * @see #getTransitionFeature()
	 * @generated
	 */
	EReference getTransitionFeature_FuzzyConstraint();

	/**
	 * Returns the meta object for the containment reference '{@link fuzzyAutomaton.TransitionFeature#getVarTransformation <em>Var Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Var Transformation</em>'.
	 * @see fuzzyAutomaton.TransitionFeature#getVarTransformation()
	 * @see #getTransitionFeature()
	 * @generated
	 */
	EReference getTransitionFeature_VarTransformation();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see fuzzyAutomaton.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see fuzzyAutomaton.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the reference list '{@link fuzzyAutomaton.Input#getParameters <em>Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Parameters</em>'.
	 * @see fuzzyAutomaton.Input#getParameters()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Parameters();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see fuzzyAutomaton.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute list '{@link fuzzyAutomaton.Output#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Expression</em>'.
	 * @see fuzzyAutomaton.Output#getExpression()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Expression();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.FuzzyConstraint <em>Fuzzy Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzy Constraint</em>'.
	 * @see fuzzyAutomaton.FuzzyConstraint
	 * @generated
	 */
	EClass getFuzzyConstraint();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyConstraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.FuzzyConstraint#getName()
	 * @see #getFuzzyConstraint()
	 * @generated
	 */
	EAttribute getFuzzyConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyConstraint#getTNorm <em>TNorm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TNorm</em>'.
	 * @see fuzzyAutomaton.FuzzyConstraint#getTNorm()
	 * @see #getFuzzyConstraint()
	 * @generated
	 */
	EAttribute getFuzzyConstraint_TNorm();

	/**
	 * Returns the meta object for the containment reference list '{@link fuzzyAutomaton.FuzzyConstraint#getFuzzyRelations <em>Fuzzy Relations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fuzzy Relations</em>'.
	 * @see fuzzyAutomaton.FuzzyConstraint#getFuzzyRelations()
	 * @see #getFuzzyConstraint()
	 * @generated
	 */
	EReference getFuzzyConstraint_FuzzyRelations();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.FuzzyRelation <em>Fuzzy Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fuzzy Relation</em>'.
	 * @see fuzzyAutomaton.FuzzyRelation
	 * @generated
	 */
	EClass getFuzzyRelation();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyRelation#getTFRelation <em>TF Relation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>TF Relation</em>'.
	 * @see fuzzyAutomaton.FuzzyRelation#getTFRelation()
	 * @see #getFuzzyRelation()
	 * @generated
	 */
	EAttribute getFuzzyRelation_TFRelation();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyRelation#getExpression1 <em>Expression1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression1</em>'.
	 * @see fuzzyAutomaton.FuzzyRelation#getExpression1()
	 * @see #getFuzzyRelation()
	 * @generated
	 */
	EAttribute getFuzzyRelation_Expression1();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyRelation#getExpression2 <em>Expression2</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression2</em>'.
	 * @see fuzzyAutomaton.FuzzyRelation#getExpression2()
	 * @see #getFuzzyRelation()
	 * @generated
	 */
	EAttribute getFuzzyRelation_Expression2();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyRelation#getExpression3 <em>Expression3</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression3</em>'.
	 * @see fuzzyAutomaton.FuzzyRelation#getExpression3()
	 * @see #getFuzzyRelation()
	 * @generated
	 */
	EAttribute getFuzzyRelation_Expression3();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.FuzzyRelation#getDelta <em>Delta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delta</em>'.
	 * @see fuzzyAutomaton.FuzzyRelation#getDelta()
	 * @see #getFuzzyRelation()
	 * @generated
	 */
	EAttribute getFuzzyRelation_Delta();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.VarTransformation <em>Var Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Transformation</em>'.
	 * @see fuzzyAutomaton.VarTransformation
	 * @generated
	 */
	EClass getVarTransformation();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.VarTransformation#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see fuzzyAutomaton.VarTransformation#getName()
	 * @see #getVarTransformation()
	 * @generated
	 */
	EAttribute getVarTransformation_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link fuzzyAutomaton.VarTransformation#getVarUpdates <em>Var Updates</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Var Updates</em>'.
	 * @see fuzzyAutomaton.VarTransformation#getVarUpdates()
	 * @see #getVarTransformation()
	 * @generated
	 */
	EReference getVarTransformation_VarUpdates();

	/**
	 * Returns the meta object for class '{@link fuzzyAutomaton.VarUpdate <em>Var Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var Update</em>'.
	 * @see fuzzyAutomaton.VarUpdate
	 * @generated
	 */
	EClass getVarUpdate();

	/**
	 * Returns the meta object for the reference '{@link fuzzyAutomaton.VarUpdate#getVariable <em>Variable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Variable</em>'.
	 * @see fuzzyAutomaton.VarUpdate#getVariable()
	 * @see #getVarUpdate()
	 * @generated
	 */
	EReference getVarUpdate_Variable();

	/**
	 * Returns the meta object for the attribute '{@link fuzzyAutomaton.VarUpdate#getExpression <em>Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Expression</em>'.
	 * @see fuzzyAutomaton.VarUpdate#getExpression()
	 * @see #getVarUpdate()
	 * @generated
	 */
	EAttribute getVarUpdate_Expression();

	/**
	 * Returns the meta object for enum '{@link fuzzyAutomaton.TNormType <em>TNorm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>TNorm Type</em>'.
	 * @see fuzzyAutomaton.TNormType
	 * @generated
	 */
	EEnum getTNormType();

	/**
	 * Returns the meta object for enum '{@link fuzzyAutomaton.FuzzyRelationType <em>Fuzzy Relation Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Fuzzy Relation Type</em>'.
	 * @see fuzzyAutomaton.FuzzyRelationType
	 * @generated
	 */
	EEnum getFuzzyRelationType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FuzzyAutomatonFactory getFuzzyAutomatonFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl <em>Fuzzy Automaton</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyAutomaton()
		 * @generated
		 */
		EClass FUZZY_AUTOMATON = eINSTANCE.getFuzzyAutomaton();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_AUTOMATON__NAME = eINSTANCE.getFuzzyAutomaton_Name();

		/**
		 * The meta object literal for the '<em><b>TNorm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_AUTOMATON__TNORM = eINSTANCE.getFuzzyAutomaton_TNorm();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_AUTOMATON__STATES = eINSTANCE.getFuzzyAutomaton_States();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_AUTOMATON__TRANSITIONS = eINSTANCE.getFuzzyAutomaton_Transitions();

		/**
		 * The meta object literal for the '<em><b>Variable Set</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_AUTOMATON__VARIABLE_SET = eINSTANCE.getFuzzyAutomaton_VariableSet();

		/**
		 * The meta object literal for the '<em><b>Transition Features</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_AUTOMATON__TRANSITION_FEATURES = eINSTANCE.getFuzzyAutomaton_TransitionFeatures();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.StateImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__IS_INITIAL = eINSTANCE.getState_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Incoming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__INCOMING = eINSTANCE.getState_Incoming();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__OUTGOING = eINSTANCE.getState_Outgoing();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.TransitionImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TARGET = eINSTANCE.getTransition_Target();

		/**
		 * The meta object literal for the '<em><b>Feature</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__FEATURE = eINSTANCE.getTransition_Feature();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.VariableSetImpl <em>Variable Set</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.VariableSetImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVariableSet()
		 * @generated
		 */
		EClass VARIABLE_SET = eINSTANCE.getVariableSet();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE_SET__NAME = eINSTANCE.getVariableSet_Name();

		/**
		 * The meta object literal for the '<em><b>Variables</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_SET__VARIABLES = eINSTANCE.getVariableSet_Variables();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.VariableImpl <em>Variable</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.VariableImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVariable()
		 * @generated
		 */
		EClass VARIABLE = eINSTANCE.getVariable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__NAME = eINSTANCE.getVariable_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VARIABLE__VALUE = eINSTANCE.getVariable_Value();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.TransitionFeatureImpl <em>Transition Feature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.TransitionFeatureImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getTransitionFeature()
		 * @generated
		 */
		EClass TRANSITION_FEATURE = eINSTANCE.getTransitionFeature();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION_FEATURE__NAME = eINSTANCE.getTransitionFeature_Name();

		/**
		 * The meta object literal for the '<em><b>Feature To Transition</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_FEATURE__FEATURE_TO_TRANSITION = eINSTANCE.getTransitionFeature_FeatureToTransition();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_FEATURE__ACTION = eINSTANCE.getTransitionFeature_Action();

		/**
		 * The meta object literal for the '<em><b>Fuzzy Constraint</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_FEATURE__FUZZY_CONSTRAINT = eINSTANCE.getTransitionFeature_FuzzyConstraint();

		/**
		 * The meta object literal for the '<em><b>Var Transformation</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION_FEATURE__VAR_TRANSFORMATION = eINSTANCE.getTransitionFeature_VarTransformation();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.ActionImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.InputImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Parameters</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__PARAMETERS = eINSTANCE.getInput_Parameters();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.OutputImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__EXPRESSION = eINSTANCE.getOutput_Expression();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.FuzzyConstraintImpl <em>Fuzzy Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.FuzzyConstraintImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyConstraint()
		 * @generated
		 */
		EClass FUZZY_CONSTRAINT = eINSTANCE.getFuzzyConstraint();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_CONSTRAINT__NAME = eINSTANCE.getFuzzyConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>TNorm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_CONSTRAINT__TNORM = eINSTANCE.getFuzzyConstraint_TNorm();

		/**
		 * The meta object literal for the '<em><b>Fuzzy Relations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUZZY_CONSTRAINT__FUZZY_RELATIONS = eINSTANCE.getFuzzyConstraint_FuzzyRelations();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.FuzzyRelationImpl <em>Fuzzy Relation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.FuzzyRelationImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyRelation()
		 * @generated
		 */
		EClass FUZZY_RELATION = eINSTANCE.getFuzzyRelation();

		/**
		 * The meta object literal for the '<em><b>TF Relation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_RELATION__TF_RELATION = eINSTANCE.getFuzzyRelation_TFRelation();

		/**
		 * The meta object literal for the '<em><b>Expression1</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_RELATION__EXPRESSION1 = eINSTANCE.getFuzzyRelation_Expression1();

		/**
		 * The meta object literal for the '<em><b>Expression2</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_RELATION__EXPRESSION2 = eINSTANCE.getFuzzyRelation_Expression2();

		/**
		 * The meta object literal for the '<em><b>Expression3</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_RELATION__EXPRESSION3 = eINSTANCE.getFuzzyRelation_Expression3();

		/**
		 * The meta object literal for the '<em><b>Delta</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUZZY_RELATION__DELTA = eINSTANCE.getFuzzyRelation_Delta();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.VarTransformationImpl <em>Var Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.VarTransformationImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVarTransformation()
		 * @generated
		 */
		EClass VAR_TRANSFORMATION = eINSTANCE.getVarTransformation();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_TRANSFORMATION__NAME = eINSTANCE.getVarTransformation_Name();

		/**
		 * The meta object literal for the '<em><b>Var Updates</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_TRANSFORMATION__VAR_UPDATES = eINSTANCE.getVarTransformation_VarUpdates();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.impl.VarUpdateImpl <em>Var Update</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.impl.VarUpdateImpl
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getVarUpdate()
		 * @generated
		 */
		EClass VAR_UPDATE = eINSTANCE.getVarUpdate();

		/**
		 * The meta object literal for the '<em><b>Variable</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_UPDATE__VARIABLE = eINSTANCE.getVarUpdate_Variable();

		/**
		 * The meta object literal for the '<em><b>Expression</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_UPDATE__EXPRESSION = eINSTANCE.getVarUpdate_Expression();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.TNormType <em>TNorm Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.TNormType
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getTNormType()
		 * @generated
		 */
		EEnum TNORM_TYPE = eINSTANCE.getTNormType();

		/**
		 * The meta object literal for the '{@link fuzzyAutomaton.FuzzyRelationType <em>Fuzzy Relation Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see fuzzyAutomaton.FuzzyRelationType
		 * @see fuzzyAutomaton.impl.FuzzyAutomatonPackageImpl#getFuzzyRelationType()
		 * @generated
		 */
		EEnum FUZZY_RELATION_TYPE = eINSTANCE.getFuzzyRelationType();

	}

} //FuzzyAutomatonPackage
