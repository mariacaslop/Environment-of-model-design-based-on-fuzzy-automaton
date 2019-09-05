/*
* 
*/
package fuzzyAutomaton.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentItemSemanticEditPolicy
		extends fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentItemSemanticEditPolicy() {
		super(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004 == req.getElementType()) {
			return getGEFWrapper(new fuzzyAutomaton.diagram.edit.commands.FuzzyConstraintCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
