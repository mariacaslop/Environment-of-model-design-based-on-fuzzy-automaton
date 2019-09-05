/*
* 
*/
package fuzzyAutomaton.diagram.edit.policies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gmf.runtime.emf.type.core.requests.CreateElementRequest;

/**
 * @generated
 */
public class VariableSetVariableSetVariablesCompartmentItemSemanticEditPolicy
		extends fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy {

	/**
	* @generated
	*/
	public VariableSetVariableSetVariablesCompartmentItemSemanticEditPolicy() {
		super(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VariableSet_2002);
	}

	/**
	* @generated
	*/
	protected Command getCreateCommand(CreateElementRequest req) {
		if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Variable_3001 == req.getElementType()) {
			return getGEFWrapper(new fuzzyAutomaton.diagram.edit.commands.VariableCreateCommand(req));
		}
		return super.getCreateCommand(req);
	}

}
