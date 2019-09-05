/*
* 
*/
package fuzzyAutomaton.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentItemSemanticEditPolicy
		extends fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentItemSemanticEditPolicy() {
		super(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyRelation_3005 == req.getElementType()) {
			return getGEFWrapper(new fuzzyAutomaton.diagram.edit.commands.FuzzyRelationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
