/*
 * 
 */
package fuzzyAutomaton.diagram.edit.parts;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.tools.CellEditorLocator;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ITextAwareEditPart;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.directedit.locator.CellEditorLocatorAccess;

/**
 * @generated
 */
public class FuzzyAutomatonEditPartFactory implements EditPartFactory {

	/**
	* @generated
	*/
	public EditPart createEditPart(EditPart context, Object model) {
		if (model instanceof View) {
			View view = (View) model;
			switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {

			case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.StateEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VariableSetNameEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VariableSetNameEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureNameEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionFeatureNameEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VariableEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VariableNameEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VariableNameEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.InputEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.InputNameEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.InputNameEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.OutputEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.OutputNameEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.OutputNameEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationTFRelationExpression1ExEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.FuzzyRelationTFRelationExpression1ExEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VarTransformationNameEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VarTransformationNameEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VarUpdateExpressionEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VarUpdateExpressionEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart(
						view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart(
						view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart(
						view);

			case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart(
						view);

			case fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart(
						view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart(view);

			case fuzzyAutomaton.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID:
				return new fuzzyAutomaton.diagram.edit.parts.WrappingLabelEditPart(view);

			}
		}
		return createUnrecognizedEditPart(context, model);
	}

	/**
	* @generated
	*/
	private EditPart createUnrecognizedEditPart(EditPart context, Object model) {
		// Handle creation of unrecognized child node EditParts here
		return null;
	}

	/**
	* @generated
	*/
	public static CellEditorLocator getTextCellEditorLocator(ITextAwareEditPart source) {
		return CellEditorLocatorAccess.INSTANCE.getTextCellEditorLocator(source);
	}

}
