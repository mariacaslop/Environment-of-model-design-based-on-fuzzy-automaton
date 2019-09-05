/**
 */
package fuzzyAutomaton;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fuzzy Relation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fuzzyAutomaton.FuzzyRelation#getTFRelation <em>TF Relation</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyRelation#getExpression1 <em>Expression1</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyRelation#getExpression2 <em>Expression2</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyRelation#getExpression3 <em>Expression3</em>}</li>
 *   <li>{@link fuzzyAutomaton.FuzzyRelation#getDelta <em>Delta</em>}</li>
 * </ul>
 *
 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyRelation()
 * @model annotation="gmf.node label='tFRelation, expression1, expression2, expression3, delta' label.readOnly='true' label.parser='MessageFormatParser' label.pattern='{1} {0} {2} {0} {3} {4}' size='150,25' tool.name='Fuzzy Relation'"
 * @generated
 */
public interface FuzzyRelation extends EObject {
	/**
	 * Returns the value of the '<em><b>TF Relation</b></em>' attribute.
	 * The literals are from the enumeration {@link fuzzyAutomaton.FuzzyRelationType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>TF Relation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>TF Relation</em>' attribute.
	 * @see fuzzyAutomaton.FuzzyRelationType
	 * @see #setTFRelation(FuzzyRelationType)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyRelation_TFRelation()
	 * @model required="true"
	 * @generated
	 */
	FuzzyRelationType getTFRelation();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyRelation#getTFRelation <em>TF Relation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TF Relation</em>' attribute.
	 * @see fuzzyAutomaton.FuzzyRelationType
	 * @see #getTFRelation()
	 * @generated
	 */
	void setTFRelation(FuzzyRelationType value);

	/**
	 * Returns the value of the '<em><b>Expression1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression1</em>' attribute.
	 * @see #setExpression1(String)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyRelation_Expression1()
	 * @model required="true"
	 * @generated
	 */
	String getExpression1();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyRelation#getExpression1 <em>Expression1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression1</em>' attribute.
	 * @see #getExpression1()
	 * @generated
	 */
	void setExpression1(String value);

	/**
	 * Returns the value of the '<em><b>Expression2</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression2</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression2</em>' attribute.
	 * @see #setExpression2(String)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyRelation_Expression2()
	 * @model required="true"
	 * @generated
	 */
	String getExpression2();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyRelation#getExpression2 <em>Expression2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression2</em>' attribute.
	 * @see #getExpression2()
	 * @generated
	 */
	void setExpression2(String value);

	/**
	 * Returns the value of the '<em><b>Expression3</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Expression3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Expression3</em>' attribute.
	 * @see #setExpression3(String)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyRelation_Expression3()
	 * @model
	 * @generated
	 */
	String getExpression3();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyRelation#getExpression3 <em>Expression3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Expression3</em>' attribute.
	 * @see #getExpression3()
	 * @generated
	 */
	void setExpression3(String value);

	/**
	 * Returns the value of the '<em><b>Delta</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delta</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delta</em>' attribute.
	 * @see #setDelta(Double)
	 * @see fuzzyAutomaton.FuzzyAutomatonPackage#getFuzzyRelation_Delta()
	 * @model default="0" required="true"
	 * @generated
	 */
	Double getDelta();

	/**
	 * Sets the value of the '{@link fuzzyAutomaton.FuzzyRelation#getDelta <em>Delta</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Delta</em>' attribute.
	 * @see #getDelta()
	 * @generated
	 */
	void setDelta(Double value);

} // FuzzyRelation
