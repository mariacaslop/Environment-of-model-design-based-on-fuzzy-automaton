/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link fuzzyAutomaton.Transition#getTarget <em>Target</em>}</li>
 *   <li>{@link fuzzyAutomaton.Transition#getFeature <em>Feature</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransition()
 * @model annotation="gmf.link source='source' target='target' target.decoration='arrow' color='255,140,0' width='3' tool.name='Transition' tool.description='Add a transition'"
 * @generated
 */
public interface Transition extends EObject {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fuzzyAutomaton.State#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(State)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransition_Source()
	 * @see fuzzyAutomaton.State#getOutgoing
	 * @model opposite="outgoing" required="true"
	 * @generated
	 */
	State getSource();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(State value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fuzzyAutomaton.State#getIncoming <em>Incoming</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(State)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransition_Target()
	 * @see fuzzyAutomaton.State#getIncoming
	 * @model opposite="incoming" required="true"
	 * @generated
	 */
	State getTarget();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.Transition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(State value);

	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link fuzzyAutomaton.TransitionFeature#getFeatureToTransition <em>Feature To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(TransitionFeature)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getTransition_Feature()
	 * @see fuzzyAutomaton.TransitionFeature#getFeatureToTransition
	 * @model opposite="featureToTransition" required="true"
	 * @generated
	 */
	TransitionFeature getFeature();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.Transition#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(TransitionFeature value);

} // Transition
