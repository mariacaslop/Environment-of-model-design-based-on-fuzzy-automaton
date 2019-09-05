/**
 */
package fuzzyAutomaton.impl;

import fuzzyAutomaton.FuzzyAutomaton;
import fuzzyAutomaton.FuzzyAutomatonPackage;
import fuzzyAutomaton.State;
import fuzzyAutomaton.TNormType;
import fuzzyAutomaton.Transition;
import fuzzyAutomaton.TransitionFeature;
import fuzzyAutomaton.VariableSet;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Automaton</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl#getTNorm <em>TNorm</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl#getStates <em>States</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyAutomatonImpl#getTransitionFeatures <em>Transition Features</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyAutomatonImpl extends EObjectImpl implements FuzzyAutomaton {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getTNorm() <em>TNorm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTNorm()
	 * @generated
	 * @ordered
	 */
	protected static final TNormType TNORM_EDEFAULT = TNormType.HAMACHER;

	/**
	 * The cached value of the '{@link #getTNorm() <em>TNorm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTNorm()
	 * @generated
	 * @ordered
	 */
	protected TNormType tNorm = TNORM_EDEFAULT;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getVariableSet() <em>Variable Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVariableSet()
	 * @generated
	 * @ordered
	 */
	protected VariableSet variableSet;

	/**
	 * The cached value of the '{@link #getTransitionFeatures() <em>Transition Features</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitionFeatures()
	 * @generated
	 * @ordered
	 */
	protected EList<TransitionFeature> transitionFeatures;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyAutomatonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_AUTOMATON__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TNormType getTNorm() {
		return tNorm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTNorm(TNormType newTNorm) {
		TNormType oldTNorm = tNorm;
		tNorm = newTNorm == null ? TNORM_EDEFAULT : newTNorm;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_AUTOMATON__TNORM, oldTNorm, tNorm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableSet getVariableSet() {
		return variableSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVariableSet(VariableSet newVariableSet, NotificationChain msgs) {
		VariableSet oldVariableSet = variableSet;
		variableSet = newVariableSet;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET, oldVariableSet, newVariableSet);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVariableSet(VariableSet newVariableSet) {
		if (newVariableSet != variableSet) {
			NotificationChain msgs = null;
			if (variableSet != null)
				msgs = ((InternalEObject)variableSet).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET, null, msgs);
			if (newVariableSet != null)
				msgs = ((InternalEObject)newVariableSet).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET, null, msgs);
			msgs = basicSetVariableSet(newVariableSet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET, newVariableSet, newVariableSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TransitionFeature> getTransitionFeatures() {
		if (transitionFeatures == null) {
			transitionFeatures = new EObjectContainmentEList<TransitionFeature>(TransitionFeature.class, this, FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES);
		}
		return transitionFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET:
				return basicSetVariableSet(null, msgs);
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES:
				return ((InternalEList<?>)getTransitionFeatures()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__NAME:
				return getName();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TNORM:
				return getTNorm();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES:
				return getStates();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS:
				return getTransitions();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET:
				return getVariableSet();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES:
				return getTransitionFeatures();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__NAME:
				setName((String)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TNORM:
				setTNorm((TNormType)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET:
				setVariableSet((VariableSet)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES:
				getTransitionFeatures().clear();
				getTransitionFeatures().addAll((Collection<? extends TransitionFeature>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__NAME:
				setName(NAME_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TNORM:
				setTNorm(TNORM_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES:
				getStates().clear();
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS:
				getTransitions().clear();
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET:
				setVariableSet((VariableSet)null);
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES:
				getTransitionFeatures().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TNORM:
				return tNorm != TNORM_EDEFAULT;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES:
				return states != null && !states.isEmpty();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET:
				return variableSet != null;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES:
				return transitionFeatures != null && !transitionFeatures.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", tNorm: ");
		result.append(tNorm);
		result.append(')');
		return result.toString();
	}

} //FuzzyAutomatonImpl
