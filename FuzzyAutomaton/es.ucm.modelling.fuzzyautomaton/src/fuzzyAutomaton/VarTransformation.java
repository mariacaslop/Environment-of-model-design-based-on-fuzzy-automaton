/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Var Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.VarTransformation#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.VarTransformation#getVarUpdates <em>Var Updates</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getVarTransformation()
 * @model annotation="gmf.node label='name' label.readOnly='true' tool.name='Var Transformation'"
 * @generated
 */
public interface VarTransformation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Var Transformation"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getVarTransformation_Name()
	 * @model default="Var Transformation" required="true" changeable="false"
	 * @generated
	 */
	String getName();

	/**
	 * Returns the value of the '<em><b>Var Updates</b></em>' containment reference list.
	 * The list contents are of type {@link fuzzyAutomaton.VarUpdate}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Var Updates</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Var Updates</em>' containment reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getVarTransformation_VarUpdates()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<VarUpdate> getVarUpdates();

} // VarTransformation
