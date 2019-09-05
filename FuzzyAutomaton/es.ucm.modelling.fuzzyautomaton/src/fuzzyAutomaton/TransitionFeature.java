/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.TransitionFeature#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.TransitionFeature#getFeatureToTransition <em>Feature To Transition</em>}</li>
 *   <li>{@link fuzzyAutomaton.TransitionFeature#getAction <em>Action</em>}</li>
 *   <li>{@link fuzzyAutomaton.TransitionFeature#getFuzzyConstraint <em>Fuzzy Constraint</em>}</li>
 *   <li>{@link fuzzyAutomaton.TransitionFeature#getVarTransformation <em>Var Transformation</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransitionFeature()
 * @model annotation="gmf.node label.readOnly='true' label='name' size='160,160' tool.name='Transition Features'"
 * @generated
 */
public interface TransitionFeature extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Transition Feature"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransitionFeature_Name()
	 * @model default="Transition Feature" required="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Feature To Transition</b></em>' reference list.
	 * The list contents are of type {@link fuzzyAutomaton.Transition}.
	 * It is bidirectional and its opposite is '{@link fuzzyAutomaton.Transition#getFeature <em>Feature</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature To Transition</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature To Transition</em>' reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransitionFeature_FeatureToTransition()
	 * @see fuzzyAutomaton.Transition#getFeature
	 * @model opposite="feature" required="true"
	 *        annotation="gmf.link style='dash' width='3' color='105,105,105'"
	 * @generated
	 */
	EList<Transition> getFeatureToTransition();

	/**
	 * Returns the value of the '<em><b>Action</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' containment reference.
	 * @see #setAction(Action)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransitionFeature_Action()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	Action getAction();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.TransitionFeature#getAction <em>Action</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' containment reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Action value);

	/**
	 * Returns the value of the '<em><b>Fuzzy Constraint</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuzzy Constraint</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuzzy Constraint</em>' containment reference.
	 * @see #setFuzzyConstraint(FuzzyConstraint)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransitionFeature_FuzzyConstraint()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	FuzzyConstraint getFuzzyConstraint();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.TransitionFeature#getFuzzyConstraint <em>Fuzzy Constraint</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fuzzy Constraint</em>' containment reference.
	 * @see #getFuzzyConstraint()
	 * @generated
	 */
	void setFuzzyConstraint(FuzzyConstraint value);

	/**
	 * Returns the value of the '<em><b>Var Transformation</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Transformation</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Transformation</em>' containment reference.
	 * @see #setVarTransformation(VarTransformation)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransitionFeature_VarTransformation()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false'"
	 * @generated
	 */
	VarTransformation getVarTransformation();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.TransitionFeature#getVarTransformation <em>Var Transformation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Var Transformation</em>' containment reference.
	 * @see #getVarTransformation()
	 * @generated
	 */
	void setVarTransformation(VarTransformation value);

} // TransitionFeature
