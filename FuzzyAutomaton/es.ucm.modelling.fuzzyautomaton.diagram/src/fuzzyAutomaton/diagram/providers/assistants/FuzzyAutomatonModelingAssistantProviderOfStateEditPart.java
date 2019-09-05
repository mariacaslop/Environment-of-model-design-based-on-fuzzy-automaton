/*
 * 
 */
package fuzzyAutomaton.diagram.providers.assistants;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;

/**
 * @generated
 */
public class FuzzyAutomatonModelingAssistantProviderOfStateEditPart
		extends fuzzyAutomaton.diagram.providers.FuzzyAutomatonModelingAssistantProvider {

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSource(IAdaptable source) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSource((fuzzyAutomaton.diagram.edit.parts.StateEditPart) sourceEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSource(fuzzyAutomaton.diagram.edit.parts.StateEditPart source) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnSourceAndTarget(IAdaptable source, IAdaptable target) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnSourceAndTarget((fuzzyAutomaton.diagram.edit.parts.StateEditPart) sourceEditPart,
				targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnSourceAndTarget(fuzzyAutomaton.diagram.edit.parts.StateEditPart source,
			IGraphicalEditPart targetEditPart) {
		List<IElementType> types = new LinkedList<IElementType>();
		if (targetEditPart instanceof fuzzyAutomaton.diagram.edit.parts.StateEditPart) {
			types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForTarget(IAdaptable source, IElementType relationshipType) {
		IGraphicalEditPart sourceEditPart = (IGraphicalEditPart) source.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForTarget((fuzzyAutomaton.diagram.edit.parts.StateEditPart) sourceEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForTarget(fuzzyAutomaton.diagram.edit.parts.StateEditPart source,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001) {
			types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.State_2001);
		}
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getRelTypesOnTarget(IAdaptable target) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetRelTypesOnTarget((fuzzyAutomaton.diagram.edit.parts.StateEditPart) targetEditPart);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetRelTypesOnTarget(fuzzyAutomaton.diagram.edit.parts.StateEditPart target) {
		List<IElementType> types = new ArrayList<IElementType>(1);
		types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001);
		return types;
	}

	/**
	* @generated
	*/
	@Override

	public List<IElementType> getTypesForSource(IAdaptable target, IElementType relationshipType) {
		IGraphicalEditPart targetEditPart = (IGraphicalEditPart) target.getAdapter(IGraphicalEditPart.class);
		return doGetTypesForSource((fuzzyAutomaton.diagram.edit.parts.StateEditPart) targetEditPart, relationshipType);
	}

	/**
	* @generated
	*/
	public List<IElementType> doGetTypesForSource(fuzzyAutomaton.diagram.edit.parts.StateEditPart target,
			IElementType relationshipType) {
		List<IElementType> types = new ArrayList<IElementType>();
		if (relationshipType == fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001) {
			types.add(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.State_2001);
		}
		return types;
	}

}
