/*
* 
*/
package fuzzyAutomaton.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class TransitionFeatureTransitionFeatureVarTransformationCompartmentItemSemanticEditPolicy
		extends fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransitionFeatureTransitionFeatureVarTransformationCompartmentItemSemanticEditPolicy() {
		super(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarTransformation_3006 == req
				.getElementType()) {
			return getGEFWrapper(new fuzzyAutomaton.diagram.edit.commands.VarTransformationCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
