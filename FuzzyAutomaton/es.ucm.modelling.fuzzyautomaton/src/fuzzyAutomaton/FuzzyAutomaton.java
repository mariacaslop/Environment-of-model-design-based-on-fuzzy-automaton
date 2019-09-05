/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Automaton</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.FuzzyAutomaton#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyAutomaton#getTNorm <em>TNorm</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyAutomaton#getStates <em>States</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyAutomaton#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyAutomaton#getVariableSet <em>Variable Set</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyAutomaton#getTransitionFeatures <em>Transition Features</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton()
 * @model annotation="gmf.diagram model.extension='fza' diagram.extension='fza_diagram'"
 * @generated
 */
public interface FuzzyAutomaton extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyAutomaton#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>TNorm</b></em>' attribute.
	 * The literals are from the enumeration {@link fuzzyAutomaton.TNormType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TNorm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TNorm</em>' attribute.
	 * @see fuzzyAutomaton.TNormType
	 * @see #setTNorm(TNormType)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton_TNorm()
	 * @model required="true"
	 * @generated
	 */
	TNormType getTNorm();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyAutomaton#getTNorm <em>TNorm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TNorm</em>' attribute.
	 * @see fuzzyAutomaton.TNormType
	 * @see #getTNorm()
	 * @generated
	 */
	void setTNorm(TNormType value);

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link fuzzyAutomaton.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link fuzzyAutomaton.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>Variable Set</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variable Set</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable Set</em>' containment reference.
	 * @see #setVariableSet(VariableSet)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton_VariableSet()
	 * @model containment="true" required="true"
	 * @generated
	 */
	VariableSet getVariableSet();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyAutomaton#getVariableSet <em>Variable Set</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Variable Set</em>' containment reference.
	 * @see #getVariableSet()
	 * @generated
	 */
	void setVariableSet(VariableSet value);

	/**
	 * Returns the value of the '<em><b>Transition Features</b></em>' containment reference list.
	 * The list contents are of type {@link fuzzyAutomaton.TransitionFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition Features</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition Features</em>' containment reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyAutomaton_TransitionFeatures()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TransitionFeature> getTransitionFeatures();

} // FuzzyAutomaton
