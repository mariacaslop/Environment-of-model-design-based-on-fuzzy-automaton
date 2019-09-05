/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Output</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.Output#getExpression <em>Expression</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getOutput()
 * @model annotation="gmf.node label='name' tool.name='Output Action' size='150,25'"
 * @generated
 */
public interface Output extends Action {
	/**
	 * Returns the value of the '<em><b>Expression</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression</em>' attribute list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getOutput_Expression()
	 * @model
	 * @generated
	 */
	EList<String> getExpression();

} // Output
