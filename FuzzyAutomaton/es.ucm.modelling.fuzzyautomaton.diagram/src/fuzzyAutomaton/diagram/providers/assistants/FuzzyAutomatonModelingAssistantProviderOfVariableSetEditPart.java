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
public class FuzzyAutomatonModelingAssistantProviderOfVariableSetEditPart
		extends fuzzyAutomaton.diagram.providers.FuzzyAutomatonModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForPopupBar(IAdaptable host) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Variable_3001);
		return types;
	}

}
