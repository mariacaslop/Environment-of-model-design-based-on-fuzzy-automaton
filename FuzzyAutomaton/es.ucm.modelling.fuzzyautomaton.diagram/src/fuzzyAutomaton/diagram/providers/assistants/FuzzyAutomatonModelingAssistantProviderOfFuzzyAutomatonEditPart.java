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
public class FuzzyAutomatonModelingAssistantProviderOfFuzzyAutomatonEditPart
		extends fuzzyAutomaton.diagram.providers.FuzzyAutomatonModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(3);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.State_2001);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VariableSet_2002);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004);
		return types;
	}

}
