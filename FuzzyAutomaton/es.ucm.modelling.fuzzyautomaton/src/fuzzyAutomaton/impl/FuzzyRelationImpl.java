/**
 */
package fuzzyAutomaton.impl;

import fuzzyAutomaton.FuzzyAutomatonPackage;
import fuzzyAutomaton.FuzzyRelation;
import fuzzyAutomaton.FuzzyRelationType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fuzzy Relation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyRelationImpl#getTFRelation <em>TF Relation</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyRelationImpl#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyRelationImpl#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyRelationImpl#getExpression3 <em>Expression3</em>}</li>
 *   <li>{@link fuzzyAutomaton.impl.FuzzyRelationImpl#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FuzzyRelationImpl extends EObjectImpl implements FuzzyRelation {
	/**
	 * The default value of the '{@link #getTFRelation() <em>TF Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTFRelation()
	 * @generated
	 * @ordered
	 */
	protected static final FuzzyRelationType TF_RELATION_EDEFAULT = FuzzyRelationType.EQ;

	/**
	 * The cached value of the '{@link #getTFRelation() <em>TF Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTFRelation()
	 * @generated
	 * @ordered
	 */
	protected FuzzyRelationType tFRelation = TF_RELATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression1() <em>Expression1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression1()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression1() <em>Expression1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression1()
	 * @generated
	 * @ordered
	 */
	protected String expression1 = EXPRESSION1_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression2() <em>Expression2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression2()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression2() <em>Expression2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression2()
	 * @generated
	 * @ordered
	 */
	protected String expression2 = EXPRESSION2_EDEFAULT;

	/**
	 * The default value of the '{@link #getExpression3() <em>Expression3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression3()
	 * @generated
	 * @ordered
	 */
	protected static final String EXPRESSION3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getExpression3() <em>Expression3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExpression3()
	 * @generated
	 * @ordered
	 */
	protected String expression3 = EXPRESSION3_EDEFAULT;

	/**
	 * The default value of the '{@link #getDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected static final Double DELTA_EDEFAULT = new Double(0.0);

	/**
	 * The cached value of the '{@link #getDelta() <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelta()
	 * @generated
	 * @ordered
	 */
	protected Double delta = DELTA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuzzyRelationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FuzzyAutomatonPackage.Literals.FUZZY_RELATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyRelationType getTFRelation() {
		return tFRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTFRelation(FuzzyRelationType newTFRelation) {
		FuzzyRelationType oldTFRelation = tFRelation;
		tFRelation = newTFRelation == null ? TF_RELATION_EDEFAULT : newTFRelation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_RELATION__TF_RELATION, oldTFRelation, tFRelation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression1() {
		return expression1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression1(String newExpression1) {
		String oldExpression1 = expression1;
		expression1 = newExpression1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION1, oldExpression1, expression1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression2() {
		return expression2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression2(String newExpression2) {
		String oldExpression2 = expression2;
		expression2 = newExpression2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION2, oldExpression2, expression2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getExpression3() {
		return expression3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExpression3(String newExpression3) {
		String oldExpression3 = expression3;
		expression3 = newExpression3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION3, oldExpression3, expression3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDelta() {
		return delta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDelta(Double newDelta) {
		Double oldDelta = delta;
		delta = newDelta;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FuzzyAutomatonPackage.FUZZY_RELATION__DELTA, oldDelta, delta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_RELATION__TF_RELATION:
				return getTFRelation();
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION1:
				return getExpression1();
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION2:
				return getExpression2();
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION3:
				return getExpression3();
			case FuzzyAutomatonPackage.FUZZY_RELATION__DELTA:
				return getDelta();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case FuzzyAutomatonPackage.FUZZY_RELATION__TF_RELATION:
				setTFRelation((FuzzyRelationType)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION1:
				setExpression1((String)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION2:
				setExpression2((String)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION3:
				setExpression3((String)newValue);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__DELTA:
				setDelta((Double)newValue);
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
			case FuzzyAutomatonPackage.FUZZY_RELATION__TF_RELATION:
				setTFRelation(TF_RELATION_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION1:
				setExpression1(EXPRESSION1_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION2:
				setExpression2(EXPRESSION2_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION3:
				setExpression3(EXPRESSION3_EDEFAULT);
				return;
			case FuzzyAutomatonPackage.FUZZY_RELATION__DELTA:
				setDelta(DELTA_EDEFAULT);
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
			case FuzzyAutomatonPackage.FUZZY_RELATION__TF_RELATION:
				return tFRelation != TF_RELATION_EDEFAULT;
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION1:
				return EXPRESSION1_EDEFAULT == null ? expression1 != null : !EXPRESSION1_EDEFAULT.equals(expression1);
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION2:
				return EXPRESSION2_EDEFAULT == null ? expression2 != null : !EXPRESSION2_EDEFAULT.equals(expression2);
			case FuzzyAutomatonPackage.FUZZY_RELATION__EXPRESSION3:
				return EXPRESSION3_EDEFAULT == null ? expression3 != null : !EXPRESSION3_EDEFAULT.equals(expression3);
			case FuzzyAutomatonPackage.FUZZY_RELATION__DELTA:
				return DELTA_EDEFAULT == null ? delta != null : !DELTA_EDEFAULT.equals(delta);
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
		result.append(" (tFRelation: ");
		result.append(tFRelation);
		result.append(", expression1: ");
		result.append(expression1);
		result.append(", expression2: ");
		result.append(expression2);
		result.append(", expression3: ");
		result.append(expression3);
		result.append(", delta: ");
		result.append(delta);
		result.append(')');
		return result.toString();
	}

} //FuzzyRelationImpl
