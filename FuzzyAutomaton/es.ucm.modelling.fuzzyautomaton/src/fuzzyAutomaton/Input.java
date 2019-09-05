/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Input</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.Input#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getInput()
 * @model annotation="gmf.node label='name' tool.name='Input Action' size='150,25'"
 * @generated
 */
public interface Input extends Action {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' reference list.
	 * The list contents are of type {@link fuzzyAutomaton.Variable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getInput_Parameters()
	 * @model
	 * @generated
	 */
	EList<Variable> getParameters();

} // Input
