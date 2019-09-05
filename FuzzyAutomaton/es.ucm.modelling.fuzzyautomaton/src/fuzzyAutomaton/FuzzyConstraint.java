/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Constraint</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.FuzzyConstraint#getName <em>Name</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyConstraint#getTNorm <em>TNorm</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyConstraint#getFuzzyRelations <em>Fuzzy Relations</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyConstraint()
 * @model annotation="gmf.node label='name, tNorm' label.readOnly='true' tool.name='Fuzzy Constraint' label.pattern='{0} ({1})'"
 * @generated
 */
public interface FuzzyConstraint extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>"Fuzzy Constraint"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyConstraint_Name()
	 * @model default="Fuzzy Constraint" required="true" changeable="false"
	 * @generated
	 */
	String getName();

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
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyConstraint_TNorm()
	 * @model required="true"
	 * @generated
	 */
	TNormType getTNorm();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyConstraint#getTNorm <em>TNorm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TNorm</em>' attribute.
	 * @see fuzzyAutomaton.TNormType
	 * @see #getTNorm()
	 * @generated
	 */
	void setTNorm(TNormType value);

	/**
	 * Returns the value of the '<em><b>Fuzzy Relations</b></em>' containment reference list.
	 * The list contents are of type {@link fuzzyAutomaton.FuzzyRelation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fuzzy Relations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fuzzy Relations</em>' containment reference list.
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyConstraint_FuzzyRelations()
	 * @model containment="true" required="true"
	 *        annotation="gmf.compartment layout='list'"
	 * @generated
	 */
	EList<FuzzyRelation> getFuzzyRelations();

} // FuzzyConstraint
