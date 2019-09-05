/**
 */
package fuzzyAutomaton.impl;

import fuzzyAutomaton.Action;
import fuzzyAutomaton.FuzzyAutomatonPackage;
import fuzzyAutomaton.FuzzyConstraint;
import fuzzyAutomaton.Transition;
import fuzzyAutomaton.TransitionFeature;
import fuzzyAutomaton.VarTransformation;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.impl.TransitionFeatureImpl#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.TransitionFeatureImpl#getFeatureToTransition <em>Feature To Transition</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.TransitionFeatureImpl#getAction <em>Action</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.TransitionFeatureImpl#getFuzzyConstraint <em>Fuzzy Constraint</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.TransitionFeatureImpl#getVarTransformation <em>Var Transformation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionFeatureImpl extends EObjectImpl implements TransitionFeature {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Transition Feature";

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
	 * The cached value of the '{@link #getFeatureToTransition() <em>Feature To Transition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureToTransition()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> featureToTransition;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Action action;

	/**
	 * The cached value of the '{@link #getFuzzyConstraint() <em>Fuzzy Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyConstraint()
	 * @generated
	 * @ordered
	 */
	protected FuzzyConstraint fuzzyConstraint;

	/**
	 * The cached value of the '{@link #getVarTransformation() <em>Var Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarTransformation()
	 * @generated
	 * @ordered
	 */
	protected VarTransformation varTransformation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzyAutomatonPackage.Literals.TRANSITION_FEATURE;
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
	public EList<Transition> getFeatureToTransition() {
		if (featureToTransition == null) {
			featureToTransition = new EObjectWithInverseResolvingEList<Transition>(Transition.class, this, FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION, FuzzyAutomatonPackage.TRANSITION__FEATURE);
		}
		return featureToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action getAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAction(Action newAction, NotificationChain msgs) {
		Action oldAction = action;
		action = newAction;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION, oldAction, newAction);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Action newAction) {
		if (newAction != action) {
			NotificationChain msgs = null;
			if (action != null)
				msgs = ((InternalEObject)action).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION, null, msgs);
			if (newAction != null)
				msgs = ((InternalEObject)newAction).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION, null, msgs);
			msgs = basicSetAction(newAction, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION, newAction, newAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyConstraint getFuzzyConstraint() {
		return fuzzyConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuzzyConstraint(FuzzyConstraint newFuzzyConstraint, NotificationChain msgs) {
		FuzzyConstraint oldFuzzyConstraint = fuzzyConstraint;
		fuzzyConstraint = newFuzzyConstraint;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT, oldFuzzyConstraint, newFuzzyConstraint);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuzzyConstraint(FuzzyConstraint newFuzzyConstraint) {
		if (newFuzzyConstraint != fuzzyConstraint) {
			NotificationChain msgs = null;
			if (fuzzyConstraint != null)
				msgs = ((InternalEObject)fuzzyConstraint).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT, null, msgs);
			if (newFuzzyConstraint != null)
				msgs = ((InternalEObject)newFuzzyConstraint).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT, null, msgs);
			msgs = basicSetFuzzyConstraint(newFuzzyConstraint, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT, newFuzzyConstraint, newFuzzyConstraint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarTransformation getVarTransformation() {
		return varTransformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVarTransformation(VarTransformation newVarTransformation, NotificationChain msgs) {
		VarTransformation oldVarTransformation = varTransformation;
		varTransformation = newVarTransformation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION, oldVarTransformation, newVarTransformation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarTransformation(VarTransformation newVarTransformation) {
		if (newVarTransformation != varTransformation) {
			NotificationChain msgs = null;
			if (varTransformation != null)
				msgs = ((InternalEObject)varTransformation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION, null, msgs);
			if (newVarTransformation != null)
				msgs = ((InternalEObject)newVarTransformation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION, null, msgs);
			msgs = basicSetVarTransformation(newVarTransformation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION, newVarTransformation, newVarTransformation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFeatureToTransition()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION:
				return ((InternalEList<?>)getFeatureToTransition()).basicRemove(otherEnd, msgs);
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION:
				return basicSetAction(null, msgs);
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT:
				return basicSetFuzzyConstraint(null, msgs);
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION:
				return basicSetVarTransformation(null, msgs);
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
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__NAME:
				return getName();
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION:
				return getFeatureToTransition();
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION:
				return getAction();
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT:
				return getFuzzyConstraint();
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION:
				return getVarTransformation();
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
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION:
				getFeatureToTransition().clear();
				getFeatureToTransition().addAll((Collection<? extends Transition>)newValue);
				return;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION:
				setAction((Action)newValue);
				return;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT:
				setFuzzyConstraint((FuzzyConstraint)newValue);
				return;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION:
				setVarTransformation((VarTransformation)newValue);
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
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION:
				getFeatureToTransition().clear();
				return;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION:
				setAction((Action)null);
				return;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT:
				setFuzzyConstraint((FuzzyConstraint)null);
				return;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION:
				setVarTransformation((VarTransformation)null);
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
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FEATURE_TO_TRANSITION:
				return featureToTransition != null && !featureToTransition.isEmpty();
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__ACTION:
				return action != null;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__FUZZY_CONSTRAINT:
				return fuzzyConstraint != null;
			case FuzzyAutomatonPackage.TRANSITION_FEATURE__VAR_TRANSFORMATION:
				return varTransformation != null;
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
		result.append(')');
		return result.toString();
	}

} //TransitionFeatureImpl
