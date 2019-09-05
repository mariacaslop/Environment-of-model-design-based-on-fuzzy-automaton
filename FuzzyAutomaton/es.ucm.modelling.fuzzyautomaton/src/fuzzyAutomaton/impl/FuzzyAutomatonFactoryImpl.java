/**
 */
package fuzzyAutomaton.impl;

import fuzzyAutomaton.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
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
public class FuzzyAutomatonFactoryImpl extends EFactoryImpl implements FuzzyAutomatonFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FuzzyAutomatonFactory init() {
		try {
			FuzzyAutomatonFactory theFuzzyAutomatonFactory = (FuzzyAutomatonFactory)EPackage.Registry.INSTANCE.getEFactory(FuzzyAutomatonPackage.eNS_URI);
			if (theFuzzyAutomatonFactory != null) {
				return theFuzzyAutomatonFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FuzzyAutomatonFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyAutomatonFactoryImpl() {
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
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON: return createFuzzyAutomaton();
			case FuzzyAutomatonPackage.STATE: return createState();
			case FuzzyAutomatonPackage.TRANSITION: return createTransition();
			case FuzzyAutomatonPackage.VARIABLE_SET: return createVariableSet();
			case FuzzyAutomatonPackage.VARIABLE: return createVariable();
			case FuzzyAutomatonPackage.TRANSITION_FEATURE: return createTransitionFeature();
			case FuzzyAutomatonPackage.INPUT: return createInput();
			case FuzzyAutomatonPackage.OUTPUT: return createOutput();
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT: return createFuzzyConstraint();
			case FuzzyAutomatonPackage.FUZZY_RELATION: return createFuzzyRelation();
			case FuzzyAutomatonPackage.VAR_TRANSFORMATION: return createVarTransformation();
			case FuzzyAutomatonPackage.VAR_UPDATE: return createVarUpdate();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case FuzzyAutomatonPackage.TNORM_TYPE:
				return createTNormTypeFromString(eDataType, initialValue);
			case FuzzyAutomatonPackage.FUZZY_RELATION_TYPE:
				return createFuzzyRelationTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case FuzzyAutomatonPackage.TNORM_TYPE:
				return convertTNormTypeToString(eDataType, instanceValue);
			case FuzzyAutomatonPackage.FUZZY_RELATION_TYPE:
				return convertFuzzyRelationTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyAutomaton createFuzzyAutomaton() {
		FuzzyAutomatonImpl fuzzyAutomaton = new FuzzyAutomatonImpl();
		return fuzzyAutomaton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSet createVariableSet() {
		VariableSetImpl variableSet = new VariableSetImpl();
		return variableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Variable createVariable() {
		VariableImpl variable = new VariableImpl();
		return variable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionFeature createTransitionFeature() {
		TransitionFeatureImpl transitionFeature = new TransitionFeatureImpl();
		return transitionFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyConstraint createFuzzyConstraint() {
		FuzzyConstraintImpl fuzzyConstraint = new FuzzyConstraintImpl();
		return fuzzyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyRelation createFuzzyRelation() {
		FuzzyRelationImpl fuzzyRelation = new FuzzyRelationImpl();
		return fuzzyRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarTransformation createVarTransformation() {
		VarTransformationImpl varTransformation = new VarTransformationImpl();
		return varTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarUpdate createVarUpdate() {
		VarUpdateImpl varUpdate = new VarUpdateImpl();
		return varUpdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNormType createTNormTypeFromString(EDataType eDataType, String initialValue) {
		TNormType result = TNormType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTNormTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyRelationType createFuzzyRelationTypeFromString(EDataType eDataType, String initialValue) {
		FuzzyRelationType result = FuzzyRelationType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFuzzyRelationTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyAutomatonPackage getFuzzyAutomatonPackage() {
		return (FuzzyAutomatonPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FuzzyAutomatonPackage getPackage() {
		return FuzzyAutomatonPackage.eINSTANCE;
	}

} //FuzzyAutomatonFactoryImpl
