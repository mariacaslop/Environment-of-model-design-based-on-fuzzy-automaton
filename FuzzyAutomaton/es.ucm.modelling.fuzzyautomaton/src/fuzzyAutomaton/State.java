/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.State#getIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link fuzzyAutomaton.State#getIncoming <em>Incoming</em>}</li>
 *   <li>{@link fuzzyAutomaton.State#getOutgoing <em>Outgoing</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getState()
 * @model annotation="gmf.node label.placement='none' margin='10' figure='ellipse' resizable='false' tool.name='State' border.width='2' border.color='154,205,50' color='154,205,50'"
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Initial</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(Boolean)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getState_IsInitial()
	 * @model default="false" required="true"
	 * @generated
	 */
	Boolean getIsInitial();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.State#getIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #getIsInitial()
	 * @generated
	 */
	void setIsInitial(Boolean value);

	/**
	 * Returns the value of the '<em><b>Incoming</b></em>' reference list.
	 * The list contents are of type {@link fuzzyAutomaton.Transition}.
	 * It is bidirectional and its opposite is '{@link fuzzyAutomaton.Transition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming</em>' reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getState_Incoming()
	 * @see fuzzyAutomaton.Transition#getTarget
	 * @model opposite="target"
	 * @generated
	 */
	EList<Transition> getIncoming();

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link fuzzyAutomaton.Transition}.
	 * It is bidirectional and its opposite is '{@link fuzzyAutomaton.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getState_Outgoing()
	 * @see fuzzyAutomaton.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoing();

} // State
