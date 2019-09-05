/*
 * 
 */
package fuzzyAutomaton.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FuzzyAutomatonModelingAssistantProviderOfTransitionFeatureEditPart
		extends fuzzyAutomaton.diagram.providers.FuzzyAutomatonModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(4);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Input_3002);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Output_3003);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarTransformation_3006);
		return types;
	}

}
