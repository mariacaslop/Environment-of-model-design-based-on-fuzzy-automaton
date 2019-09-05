/*
* 
*/
package fuzzyAutomaton.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.commands.DestroyReferenceCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.DestroyReferenceRequest;

/**
 * @generated
 */
public class TransitionFeatureFeatureToTransitionItemSemanticEditPolicy
		extends fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public TransitionFeatureFeatureToTransitionItemSemanticEditPolicy() {
		super(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003);
	}

	/**
	* @generated
	*/
	protected Command getDestroyReferenceCommand(DestroyReferenceRequest req) {
		return getGEFWrapper(new DestroyReferenceCommand(req));
	}

}
