/**
 */
package fuzzyAutomaton.impl;

import fuzzyAutomaton.FuzzyAutomatonPackage;
import fuzzyAutomaton.FuzzyConstraint;
import fuzzyAutomaton.FuzzyRelation;

import fuzzyAutomaton.TNormType;
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
 * An implementation of the model object '<em><b>Fuzzy Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyConstraintImpl#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyConstraintImpl#getTNorm <em>TNorm</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyConstraintImpl#getFuzzyRelations <em>Fuzzy Relations</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyConstraintImpl extends EObjectImpl implements FuzzyConstraint {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "Fuzzy Constraint";

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
	 * The cached value of the '{@link #getFuzzyRelations() <em>Fuzzy Relations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuzzyRelations()
	 * @generated
	 * @ordered
	 */
	protected EList<FuzzyRelation> fuzzyRelations;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyConstraintImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzyAutomatonPackage.Literals.FUZZY_CONSTRAINT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_CONSTRAINT__TNORM, oldTNorm, tNorm));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuzzyRelation> getFuzzyRelations() {
		if (fuzzyRelations == null) {
			fuzzyRelations = new EObjectContainmentEList<FuzzyRelation>(FuzzyRelation.class, this, FuzzyAutomatonPackage.FUZZY_CONSTRAINT__FUZZY_RELATIONS);
		}
		return fuzzyRelations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__FUZZY_RELATIONS:
				return ((InternalEList<?>)getFuzzyRelations()).basicRemove(otherEnd, msgs);
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
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__NAME:
				return getName();
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__TNORM:
				return getTNorm();
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__FUZZY_RELATIONS:
				return getFuzzyRelations();
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
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__TNORM:
				setTNorm((TNormType)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__FUZZY_RELATIONS:
				getFuzzyRelations().clear();
				getFuzzyRelations().addAll((Collection<? extends FuzzyRelation>)newValue);
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
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__TNORM:
				setTNorm(TNORM_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__FUZZY_RELATIONS:
				getFuzzyRelations().clear();
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
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__TNORM:
				return tNorm != TNORM_EDEFAULT;
			case FuzzyAutomatonPackage.FUZZY_CONSTRAINT__FUZZY_RELATIONS:
				return fuzzyRelations != null && !fuzzyRelations.isEmpty();
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

} //FuzzyConstraintImpl
