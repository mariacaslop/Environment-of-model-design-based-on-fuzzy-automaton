/**
 */
package fuzzyAutomaton.impl;

import fuzzyAutomaton.Action;
import fuzzyAutomaton.FuzzyAutomaton;
import fuzzyAutomaton.FuzzyAutomatonFactory;
import fuzzyAutomaton.FuzzyAutomatonPackage;
import fuzzyAutomaton.FuzzyConstraint;
import fuzzyAutomaton.FuzzyRelation;
import fuzzyAutomaton.FuzzyRelationType;
import fuzzyAutomaton.Input;
import fuzzyAutomaton.Output;
import fuzzyAutomaton.State;
import fuzzyAutomaton.TNormType;
import fuzzyAutomaton.Transition;
import fuzzyAutomaton.TransitionFeature;
import fuzzyAutomaton.VarTransformation;
import fuzzyAutomaton.VarUpdate;
import fuzzyAutomaton.Variable;
import fuzzyAutomaton.VariableSet;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzyAutomatonPackageImpl extends EPackageImpl implements FuzzyAutomatonPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzyAutomatonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transitionFeatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzyConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fuzzyRelationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varTransformationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varUpdateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum tNormTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fuzzyRelationTypeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FuzzyAutomatonPackageImpl() {
		super(eNS_URI, FuzzyAutomatonFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link FuzzyAutomatonPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FuzzyAutomatonPackage init() {
		if (isInited) return (FuzzyAutomatonPackage)EPackage.Registry.INSTANCE.getEPackage(FuzzyAutomatonPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFuzzyAutomatonPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FuzzyAutomatonPackageImpl theFuzzyAutomatonPackage = registeredFuzzyAutomatonPackage instanceof FuzzyAutomatonPackageImpl ? (FuzzyAutomatonPackageImpl)registeredFuzzyAutomatonPackage : new FuzzyAutomatonPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFuzzyAutomatonPackage.createPackageContents();

		// Initialize created meta-data
		theFuzzyAutomatonPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFuzzyAutomatonPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FuzzyAutomatonPackage.eNS_URI, theFuzzyAutomatonPackage);
		return theFuzzyAutomatonPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzyAutomaton() {
		return fuzzyAutomatonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyAutomaton_Name() {
		return (EAttribute)fuzzyAutomatonEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyAutomaton_TNorm() {
		return (EAttribute)fuzzyAutomatonEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzyAutomaton_States() {
		return (EReference)fuzzyAutomatonEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzyAutomaton_Transitions() {
		return (EReference)fuzzyAutomatonEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzyAutomaton_VariableSet() {
		return (EReference)fuzzyAutomatonEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzyAutomaton_TransitionFeatures() {
		return (EReference)fuzzyAutomatonEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getState() {
		return stateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getState_IsInitial() {
		return (EAttribute)stateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Incoming() {
		return (EReference)stateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getState_Outgoing() {
		return (EReference)stateEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransition() {
		return transitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Source() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Target() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransition_Feature() {
		return (EReference)transitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableSet() {
		return variableSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariableSet_Name() {
		return (EAttribute)variableSetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableSet_Variables() {
		return (EReference)variableSetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariable() {
		return variableEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Name() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVariable_Value() {
		return (EAttribute)variableEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransitionFeature() {
		return transitionFeatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransitionFeature_Name() {
		return (EAttribute)transitionFeatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionFeature_FeatureToTransition() {
		return (EReference)transitionFeatureEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionFeature_Action() {
		return (EReference)transitionFeatureEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionFeature_FuzzyConstraint() {
		return (EReference)transitionFeatureEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransitionFeature_VarTransformation() {
		return (EReference)transitionFeatureEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAction_Name() {
		return (EAttribute)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInput_Parameters() {
		return (EReference)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOutput_Expression() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzyConstraint() {
		return fuzzyConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyConstraint_Name() {
		return (EAttribute)fuzzyConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyConstraint_TNorm() {
		return (EAttribute)fuzzyConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuzzyConstraint_FuzzyRelations() {
		return (EReference)fuzzyConstraintEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuzzyRelation() {
		return fuzzyRelationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyRelation_TFRelation() {
		return (EAttribute)fuzzyRelationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyRelation_Expression1() {
		return (EAttribute)fuzzyRelationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyRelation_Expression2() {
		return (EAttribute)fuzzyRelationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyRelation_Expression3() {
		return (EAttribute)fuzzyRelationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuzzyRelation_Delta() {
		return (EAttribute)fuzzyRelationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarTransformation() {
		return varTransformationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarTransformation_Name() {
		return (EAttribute)varTransformationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarTransformation_VarUpdates() {
		return (EReference)varTransformationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarUpdate() {
		return varUpdateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarUpdate_Variable() {
		return (EReference)varUpdateEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarUpdate_Expression() {
		return (EAttribute)varUpdateEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTNormType() {
		return tNormTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFuzzyRelationType() {
		return fuzzyRelationTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyAutomatonFactory getFuzzyAutomatonFactory() {
		return (FuzzyAutomatonFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		fuzzyAutomatonEClass = createEClass(FUZZY_AUTOMATON);
		createEAttribute(fuzzyAutomatonEClass, FUZZY_AUTOMATON__NAME);
		createEAttribute(fuzzyAutomatonEClass, FUZZY_AUTOMATON__TNORM);
		createEReference(fuzzyAutomatonEClass, FUZZY_AUTOMATON__STATES);
		createEReference(fuzzyAutomatonEClass, FUZZY_AUTOMATON__TRANSITIONS);
		createEReference(fuzzyAutomatonEClass, FUZZY_AUTOMATON__VARIABLE_SET);
		createEReference(fuzzyAutomatonEClass, FUZZY_AUTOMATON__TRANSITION_FEATURES);

		stateEClass = createEClass(STATE);
		createEAttribute(stateEClass, STATE__IS_INITIAL);
		createEReference(stateEClass, STATE__INCOMING);
		createEReference(stateEClass, STATE__OUTGOING);

		transitionEClass = createEClass(TRANSITION);
		createEReference(transitionEClass, TRANSITION__SOURCE);
		createEReference(transitionEClass, TRANSITION__TARGET);
		createEReference(transitionEClass, TRANSITION__FEATURE);

		variableSetEClass = createEClass(VARIABLE_SET);
		createEAttribute(variableSetEClass, VARIABLE_SET__NAME);
		createEReference(variableSetEClass, VARIABLE_SET__VARIABLES);

		variableEClass = createEClass(VARIABLE);
		createEAttribute(variableEClass, VARIABLE__NAME);
		createEAttribute(variableEClass, VARIABLE__VALUE);

		transitionFeatureEClass = createEClass(TRANSITION_FEATURE);
		createEAttribute(transitionFeatureEClass, TRANSITION_FEATURE__NAME);
		createEReference(transitionFeatureEClass, TRANSITION_FEATURE__FEATURE_TO_TRANSITION);
		createEReference(transitionFeatureEClass, TRANSITION_FEATURE__ACTION);
		createEReference(transitionFeatureEClass, TRANSITION_FEATURE__FUZZY_CONSTRAINT);
		createEReference(transitionFeatureEClass, TRANSITION_FEATURE__VAR_TRANSFORMATION);

		actionEClass = createEClass(ACTION);
		createEAttribute(actionEClass, ACTION__NAME);

		inputEClass = createEClass(INPUT);
		createEReference(inputEClass, INPUT__PARAMETERS);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__EXPRESSION);

		fuzzyConstraintEClass = createEClass(FUZZY_CONSTRAINT);
		createEAttribute(fuzzyConstraintEClass, FUZZY_CONSTRAINT__NAME);
		createEAttribute(fuzzyConstraintEClass, FUZZY_CONSTRAINT__TNORM);
		createEReference(fuzzyConstraintEClass, FUZZY_CONSTRAINT__FUZZY_RELATIONS);

		fuzzyRelationEClass = createEClass(FUZZY_RELATION);
		createEAttribute(fuzzyRelationEClass, FUZZY_RELATION__TF_RELATION);
		createEAttribute(fuzzyRelationEClass, FUZZY_RELATION__EXPRESSION1);
		createEAttribute(fuzzyRelationEClass, FUZZY_RELATION__EXPRESSION2);
		createEAttribute(fuzzyRelationEClass, FUZZY_RELATION__EXPRESSION3);
		createEAttribute(fuzzyRelationEClass, FUZZY_RELATION__DELTA);

		varTransformationEClass = createEClass(VAR_TRANSFORMATION);
		createEAttribute(varTransformationEClass, VAR_TRANSFORMATION__NAME);
		createEReference(varTransformationEClass, VAR_TRANSFORMATION__VAR_UPDATES);

		varUpdateEClass = createEClass(VAR_UPDATE);
		createEReference(varUpdateEClass, VAR_UPDATE__VARIABLE);
		createEAttribute(varUpdateEClass, VAR_UPDATE__EXPRESSION);

		// Create enums
		tNormTypeEEnum = createEEnum(TNORM_TYPE);
		fuzzyRelationTypeEEnum = createEEnum(FUZZY_RELATION_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inputEClass.getESuperTypes().add(this.getAction());
		outputEClass.getESuperTypes().add(this.getAction());

		// Initialize classes and features; add operations and parameters
		initEClass(fuzzyAutomatonEClass, FuzzyAutomaton.class, "FuzzyAutomaton", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuzzyAutomaton_Name(), ecorePackage.getEString(), "name", null, 1, 1, FuzzyAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzyAutomaton_TNorm(), this.getTNormType(), "tNorm", null, 1, 1, FuzzyAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzyAutomaton_States(), this.getState(), null, "states", null, 1, -1, FuzzyAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzyAutomaton_Transitions(), this.getTransition(), null, "transitions", null, 1, -1, FuzzyAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzyAutomaton_VariableSet(), this.getVariableSet(), null, "variableSet", null, 1, 1, FuzzyAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzyAutomaton_TransitionFeatures(), this.getTransitionFeature(), null, "transitionFeatures", null, 1, -1, FuzzyAutomaton.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(stateEClass, State.class, "State", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getState_IsInitial(), ecorePackage.getEBooleanObject(), "isInitial", "false", 1, 1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Incoming(), this.getTransition(), this.getTransition_Target(), "incoming", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getState_Outgoing(), this.getTransition(), this.getTransition_Source(), "outgoing", null, 0, -1, State.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionEClass, Transition.class, "Transition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransition_Source(), this.getState(), this.getState_Outgoing(), "source", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Target(), this.getState(), this.getState_Incoming(), "target", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransition_Feature(), this.getTransitionFeature(), this.getTransitionFeature_FeatureToTransition(), "feature", null, 1, 1, Transition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableSetEClass, VariableSet.class, "VariableSet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariableSet_Name(), ecorePackage.getEString(), "name", "Variable Set", 1, 1, VariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVariableSet_Variables(), this.getVariable(), null, "variables", null, 1, -1, VariableSet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableEClass, Variable.class, "Variable", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVariable_Name(), ecorePackage.getEString(), "name", null, 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVariable_Value(), ecorePackage.getEDoubleObject(), "value", "0", 1, 1, Variable.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transitionFeatureEClass, TransitionFeature.class, "TransitionFeature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransitionFeature_Name(), ecorePackage.getEString(), "name", "Transition Feature", 1, 1, TransitionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionFeature_FeatureToTransition(), this.getTransition(), this.getTransition_Feature(), "featureToTransition", null, 1, -1, TransitionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionFeature_Action(), this.getAction(), null, "action", null, 1, 1, TransitionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionFeature_FuzzyConstraint(), this.getFuzzyConstraint(), null, "fuzzyConstraint", null, 0, 1, TransitionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTransitionFeature_VarTransformation(), this.getVarTransformation(), null, "varTransformation", null, 0, 1, TransitionFeature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAction_Name(), ecorePackage.getEString(), "name", null, 1, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInput_Parameters(), this.getVariable(), null, "parameters", null, 0, -1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Expression(), ecorePackage.getEString(), "expression", null, 0, -1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuzzyConstraintEClass, FuzzyConstraint.class, "FuzzyConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuzzyConstraint_Name(), ecorePackage.getEString(), "name", "Fuzzy Constraint", 1, 1, FuzzyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzyConstraint_TNorm(), this.getTNormType(), "tNorm", null, 1, 1, FuzzyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuzzyConstraint_FuzzyRelations(), this.getFuzzyRelation(), null, "fuzzyRelations", null, 1, -1, FuzzyConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fuzzyRelationEClass, FuzzyRelation.class, "FuzzyRelation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuzzyRelation_TFRelation(), this.getFuzzyRelationType(), "tFRelation", null, 1, 1, FuzzyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzyRelation_Expression1(), ecorePackage.getEString(), "expression1", null, 1, 1, FuzzyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzyRelation_Expression2(), ecorePackage.getEString(), "expression2", null, 1, 1, FuzzyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzyRelation_Expression3(), ecorePackage.getEString(), "expression3", null, 0, 1, FuzzyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFuzzyRelation_Delta(), ecorePackage.getEDoubleObject(), "delta", "0", 1, 1, FuzzyRelation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varTransformationEClass, VarTransformation.class, "VarTransformation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarTransformation_Name(), ecorePackage.getEString(), "name", "Var Transformation", 1, 1, VarTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarTransformation_VarUpdates(), this.getVarUpdate(), null, "varUpdates", null, 1, -1, VarTransformation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varUpdateEClass, VarUpdate.class, "VarUpdate", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVarUpdate_Variable(), this.getVariable(), null, "variable", null, 1, 1, VarUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarUpdate_Expression(), ecorePackage.getEString(), "expression", null, 1, 1, VarUpdate.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(tNormTypeEEnum, TNormType.class, "TNormType");
		addEEnumLiteral(tNormTypeEEnum, TNormType.HAMACHER);
		addEEnumLiteral(tNormTypeEEnum, TNormType.GODEL);

		initEEnum(fuzzyRelationTypeEEnum, FuzzyRelationType.class, "FuzzyRelationType");
		addEEnumLiteral(fuzzyRelationTypeEEnum, FuzzyRelationType.EQ);
		addEEnumLiteral(fuzzyRelationTypeEEnum, FuzzyRelationType.GTE);
		addEEnumLiteral(fuzzyRelationTypeEEnum, FuzzyRelationType.LTE);
		addEEnumLiteral(fuzzyRelationTypeEEnum, FuzzyRelationType.TERN);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// gmf.diagram
		createGmfAnnotations();
		// gmf.node
		createGmf_1Annotations();
		// gmf.link
		createGmf_2Annotations();
		// gmf.compartment
		createGmf_3Annotations();
	}

	/**
	 * Initializes the annotations for <b>gmf.diagram</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmfAnnotations() {
		String source = "gmf.diagram";
		addAnnotation
		  (fuzzyAutomatonEClass,
		   source,
		   new String[] {
			   "model.extension", "fza",
			   "diagram.extension", "fza_diagram"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.node</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_1Annotations() {
		String source = "gmf.node";
		addAnnotation
		  (stateEClass,
		   source,
		   new String[] {
			   "label.placement", "none",
			   "margin", "10",
			   "figure", "ellipse",
			   "resizable", "false",
			   "tool.name", "State",
			   "border.width", "2",
			   "border.color", "154,205,50",
			   "color", "154,205,50"
		   });
		addAnnotation
		  (variableSetEClass,
		   source,
		   new String[] {
			   "label.readOnly", "true",
			   "size", "125,150",
			   "label", "name",
			   "tool.name", "Variable Set"
		   });
		addAnnotation
		  (variableEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Variable",
			   "resizable", "false"
		   });
		addAnnotation
		  (transitionFeatureEClass,
		   source,
		   new String[] {
			   "label.readOnly", "true",
			   "label", "name",
			   "size", "160,160",
			   "tool.name", "Transition Features"
		   });
		addAnnotation
		  (inputEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Input Action",
			   "size", "150,25"
		   });
		addAnnotation
		  (outputEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "tool.name", "Output Action",
			   "size", "150,25"
		   });
		addAnnotation
		  (fuzzyConstraintEClass,
		   source,
		   new String[] {
			   "label", "name, tNorm",
			   "label.readOnly", "true",
			   "tool.name", "Fuzzy Constraint",
			   "label.pattern", "{0} ({1})"
		   });
		addAnnotation
		  (fuzzyRelationEClass,
		   source,
		   new String[] {
			   "label", "tFRelation, expression1, expression2, expression3, delta",
			   "label.readOnly", "true",
			   "label.parser", "MessageFormatParser",
			   "label.pattern", "{1} {0} {2} {0} {3} {4}",
			   "size", "150,25",
			   "tool.name", "Fuzzy Relation"
		   });
		addAnnotation
		  (varTransformationEClass,
		   source,
		   new String[] {
			   "label", "name",
			   "label.readOnly", "true",
			   "tool.name", "Var Transformation"
		   });
		addAnnotation
		  (varUpdateEClass,
		   source,
		   new String[] {
			   "label", "expression",
			   "tool.name", "Var Update",
			   "label.readOnly", "true",
			   "label.icon", "false",
			   "size", "150,25"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.link</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_2Annotations() {
		String source = "gmf.link";
		addAnnotation
		  (transitionEClass,
		   source,
		   new String[] {
			   "source", "source",
			   "target", "target",
			   "target.decoration", "arrow",
			   "color", "255,140,0",
			   "width", "3",
			   "tool.name", "Transition",
			   "tool.description", "Add a transition"
		   });
		addAnnotation
		  (getTransitionFeature_FeatureToTransition(),
		   source,
		   new String[] {
			   "style", "dash",
			   "width", "3",
			   "color", "105,105,105"
		   });
	}

	/**
	 * Initializes the annotations for <b>gmf.compartment</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGmf_3Annotations() {
		String source = "gmf.compartment";
		addAnnotation
		  (getVariableSet_Variables(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getTransitionFeature_Action(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getTransitionFeature_FuzzyConstraint(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getTransitionFeature_VarTransformation(),
		   source,
		   new String[] {
			   "layout", "list",
			   "collapsible", "false"
		   });
		addAnnotation
		  (getFuzzyConstraint_FuzzyRelations(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
		addAnnotation
		  (getVarTransformation_VarUpdates(),
		   source,
		   new String[] {
			   "layout", "list"
		   });
	}

} //FuzzyAutomatonPackageImpl
