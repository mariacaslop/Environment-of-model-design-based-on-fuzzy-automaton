/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.VariableSet#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.VariableSet#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getVariableSet()
 * @model annotation="gmf.node label.readOnly='true' size='125,150' label='name' tool.name='Variable Set'"
 * @generated
 */
public interface VariableSet extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Variable Set"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getVariableSet_Name()
	 * @model default="Variable Set" required="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link fuzzyAutomaton.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getVariableSet_Variables()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<Variable> getVariables();

} // VariableSet
