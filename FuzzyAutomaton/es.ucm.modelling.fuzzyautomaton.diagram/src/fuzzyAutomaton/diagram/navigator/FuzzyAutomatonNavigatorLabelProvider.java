/*
* 
*/
package fuzzyAutomaton.diagram.navigator;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.gmf.runtime.common.ui.services.parser.CommonParserHint;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserOptions;
import org.eclipse.gmf.runtime.emf.core.util.EObjectAdapter;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.jface.viewers.ITreePathLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.TreePath;
import org.eclipse.jface.viewers.ViewerLabel;
import org.eclipse.swt.graphics.Image;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonLabelProvider;

/**
 * @generated
 */
public class FuzzyAutomatonNavigatorLabelProvider extends LabelProvider
		implements ICommonLabelProvider, ITreePathLabelProvider {

	/**
	* @generated
	*/
	static {
		fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?UnknownElement", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
		fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance().getImageRegistry()
				.put("Navigator?ImageNotFound", ImageDescriptor.getMissingImageDescriptor()); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	public void updateLabel(ViewerLabel label, TreePath elementPath) {
		Object element = elementPath.getLastSegment();
		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem
				&& !isOwnView(((fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) element).getView())) {
			return;
		}
		label.setText(getText(element));
		label.setImage(getImage(element));
	}

	/**
	* @generated
	*/
	public Image getImage(Object element) {
		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup group = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup) element;
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.getBundledImage(group.getIcon());
		}

		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem navigatorItem = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return super.getImage(element);
			}
			return getImage(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getImage(view);
			}
		}

		return super.getImage(element);
	}

	/**
	* @generated
	*/
	public Image getImage(View view) {
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			return getImage("Navigator?Diagram?fuzzyAutomaton?FuzzyAutomaton", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyAutomaton_1000);
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?fuzzyAutomaton?State", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.State_2001);
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?fuzzyAutomaton?VariableSet", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VariableSet_2002);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			return getImage("Navigator?TopLevelNode?fuzzyAutomaton?TransitionFeature", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004);
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?Variable", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Variable_3001);
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?Input", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Input_3002);
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?Output", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Output_3003);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?FuzzyConstraint", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?FuzzyRelation", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyRelation_3005);
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?VarTransformation", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarTransformation_3006);
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return getImage("Navigator?Node?fuzzyAutomaton?VarUpdate", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarUpdate_3007);
		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?fuzzyAutomaton?Transition", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID:
			return getImage("Navigator?Link?fuzzyAutomaton?TransitionFeature?featureToTransition", //$NON-NLS-1$
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003);
		}
		return getImage("Navigator?UnknownElement", null); //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private Image getImage(String key, IElementType elementType) {
		ImageRegistry imageRegistry = fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
				.getImageRegistry();
		Image image = imageRegistry.get(key);
		if (image == null && elementType != null
				&& fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.isKnownElementType(elementType)) {
			image = fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getImage(elementType);
			imageRegistry.put(key, image);
		}

		if (image == null) {
			image = imageRegistry.get("Navigator?ImageNotFound"); //$NON-NLS-1$
			imageRegistry.put(key, image);
		}
		return image;
	}

	/**
	* @generated
	*/
	public String getText(Object element) {
		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup group = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup) element;
			return group.getGroupName();
		}

		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem navigatorItem = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) element;
			if (!isOwnView(navigatorItem.getView())) {
				return null;
			}
			return getText(navigatorItem.getView());
		}

		// Due to plugin.xml content will be called only for "own" views
		if (element instanceof IAdaptable) {
			View view = (View) ((IAdaptable) element).getAdapter(View.class);
			if (view != null && isOwnView(view)) {
				return getText(view);
			}
		}

		return super.getText(element);
	}

	/**
	* @generated
	*/
	public String getText(View view) {
		if (view.getElement() != null && view.getElement().eIsProxy()) {
			return getUnresolvedDomainElementProxyText(view);
		}
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			return getFuzzyAutomaton_1000Text(view);
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001Text(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			return getVariableSet_2002Text(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			return getTransitionFeature_2004Text(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			return getVariable_3001Text(view);
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3002Text(view);
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3003Text(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			return getFuzzyConstraint_3004Text(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			return getFuzzyRelation_3005Text(view);
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			return getVarTransformation_3006Text(view);
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return getVarUpdate_3007Text(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001Text(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID:
			return getTransitionFeatureFeatureToTransition_4003Text(view);
		}
		return getUnknownElementText(view);
	}

	/**
	* @generated
	*/
	private String getFuzzyAutomaton_1000Text(View view) {
		fuzzyAutomaton.FuzzyAutomaton domainModelElement = (fuzzyAutomaton.FuzzyAutomaton) view.getElement();
		if (domainModelElement != null) {
			return domainModelElement.getName();
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 1000); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getState_2001Text(View view) {
		fuzzyAutomaton.State domainModelElement = (fuzzyAutomaton.State) view.getElement();
		if (domainModelElement != null) {
			return String.valueOf(domainModelElement.getIsInitial());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("No domain element for view with visualID = " + 2001); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVariableSet_2002Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VariableSet_2002,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.VariableSetNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5002); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransitionFeature_2004Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.TransitionFeatureNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5005); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVariable_3001Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Variable_3001,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.VariableNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getInput_3002Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Input_3002,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.InputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5006); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getOutput_3003Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Output_3003,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.OutputNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5007); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFuzzyConstraint_3004Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5008); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getFuzzyRelation_3005Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyRelation_3005,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
						fuzzyAutomaton.diagram.edit.parts.FuzzyRelationTFRelationExpression1ExEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5011); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVarTransformation_3006Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarTransformation_3006,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.VarTransformationNameEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5009); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getVarUpdate_3007Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarUpdate_3007,
				view.getElement() != null ? view.getElement() : view,
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
						.getType(fuzzyAutomaton.diagram.edit.parts.VarUpdateExpressionEditPart.VISUAL_ID));
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 5010); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getTransition_4001Text(View view) {
		return ""; //$NON-NLS-1$
	}

	/**
	* @generated
	*/
	private String getTransitionFeatureFeatureToTransition_4003Text(View view) {
		IParser parser = fuzzyAutomaton.diagram.providers.FuzzyAutomatonParserProvider.getParser(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003,
				view.getElement() != null ? view.getElement() : view, CommonParserHint.DESCRIPTION);
		if (parser != null) {
			return parser.getPrintString(new EObjectAdapter(view.getElement() != null ? view.getElement() : view),
					ParserOptions.NONE.intValue());
		} else {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.logError("Parser was not found for label " + 6003); //$NON-NLS-1$
			return ""; //$NON-NLS-1$
		}
	}

	/**
	* @generated
	*/
	private String getUnknownElementText(View view) {
		return "<UnknownElement Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	private String getUnresolvedDomainElementProxyText(View view) {
		return "<Unresolved domain element Visual_ID = " + view.getType() + ">"; //$NON-NLS-1$  //$NON-NLS-2$
	}

	/**
	* @generated
	*/
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public void restoreState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public void saveState(IMemento aMemento) {
	}

	/**
	* @generated
	*/
	public String getDescription(Object anElement) {
		return null;
	}

	/**
	* @generated
	*/
	private boolean isOwnView(View view) {
		return fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID
				.equals(fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getModelID(view));
	}

}
