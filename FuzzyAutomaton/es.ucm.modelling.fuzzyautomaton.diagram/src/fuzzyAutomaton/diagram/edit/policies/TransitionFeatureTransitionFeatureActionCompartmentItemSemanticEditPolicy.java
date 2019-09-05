/*
* 
*/
package fuzzyAutomaton.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TransitionFeatureTransitionFeatureActionCompartmentItemSemanticEditPolicy
		extends fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransitionFeatureTransitionFeatureActionCompartmentItemSemanticEditPolicy() {
		super(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Input_3002 == req.getElementType()) {
			return getGEFWrapper(new fuzzyAutomaton.diagram.edit.commands.InputCreateCommand(req));
		}
		if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Output_3003 == req.getElementType()) {
			return getGEFWrapper(new fuzzyAutomaton.diagram.edit.commands.OutputCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
