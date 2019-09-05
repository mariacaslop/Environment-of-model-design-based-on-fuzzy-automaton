/*
* 
*/
package fuzzyAutomaton.diagram.part;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.structure.DiagramStructure;

/**
 * This registry is used to determine which type of visual object should be
 * created for the corresponding Diagram, Node, ChildNode or Link represented
 * by a domain model object.
 * 
 * @generated
 */
public class FuzzyAutomatonVisualIDRegistry {

	/**
	* @generated
	*/
	private static final String DEBUG_KEY = "es.ucm.modelling.fuzzyautomaton.diagram/debug/visualID"; //$NON-NLS-1$

	/**
	* @generated
	*/
	public static int getVisualID(View view) {
		if (view instanceof Diagram) {
			if (fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID.equals(view.getType())) {
				return fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view.getType());
	}

	/**
	* @generated
	*/
	public static String getModelID(View view) {
		View diagram = view.getDiagram();
		while (view != diagram) {
			EAnnotation annotation = view.getEAnnotation("Shortcut"); //$NON-NLS-1$
			if (annotation != null) {
				return (String) annotation.getDetails().get("modelID"); //$NON-NLS-1$
			}
			view = (View) view.eContainer();
		}
		return diagram != null ? diagram.getType() : null;
	}

	/**
	* @generated
	*/
	public static int getVisualID(String type) {
		try {
			return Integer.parseInt(type);
		} catch (NumberFormatException e) {
			if (Boolean.TRUE.toString().equalsIgnoreCase(Platform.getDebugOption(DEBUG_KEY))) {
				fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
						.logError("Unable to parse view type as a visualID number: " + type);
			}
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static String getType(int visualID) {
		return Integer.toString(visualID);
	}

	/**
	* @generated
	*/
	public static int getDiagramVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyAutomaton().isSuperTypeOf(domainElement.eClass())
				&& isDiagram((fuzzyAutomaton.FuzzyAutomaton) domainElement)) {
			return fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static int getNodeVisualID(View containerView, EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		String containerModelID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getModelID(containerView);
		if (!fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID.equals(containerModelID)
				&& !"fza".equals(containerModelID)) { //$NON-NLS-1$
			return -1;
		}
		int containerVisualID;
		if (fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID;
			} else {
				return -1;
			}
		}
		switch (containerVisualID) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getState().isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID;
			}
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVariableSet().isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID;
			}
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransitionFeature()
					.isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVariable().isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getInput().isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID;
			}
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getOutput().isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyConstraint()
					.isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVarTransformation()
					.isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation()
					.isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVarUpdate().isSuperTypeOf(domainElement.eClass())) {
				return fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID;
			}
			break;
		}
		return -1;
	}

	/**
	* @generated
	*/
	public static boolean canCreateNode(View containerView, int nodeVisualID) {
		String containerModelID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getModelID(containerView);
		if (!fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID.equals(containerModelID)
				&& !"fza".equals(containerModelID)) { //$NON-NLS-1$
			return false;
		}
		int containerVisualID;
		if (fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID.equals(containerModelID)) {
			containerVisualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(containerView);
		} else {
			if (containerView instanceof Diagram) {
				containerVisualID = fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID;
			} else {
				return false;
			}
		}
		switch (containerVisualID) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VariableSetNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.TransitionFeatureNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VariableNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.InputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.OutputNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.FuzzyRelationTFRelationExpression1ExEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VarTransformationNameEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VarUpdateExpressionEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			if (fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID:
			if (fuzzyAutomaton.diagram.edit.parts.WrappingLabelEditPart.VISUAL_ID == nodeVisualID) {
				return true;
			}
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static int getLinkWithClassVisualID(EObject domainElement) {
		if (domainElement == null) {
			return -1;
		}
		if (fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransition().isSuperTypeOf(domainElement.eClass())) {
			return fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID;
		}
		return -1;
	}

	/**
	* User can change implementation of this method to handle some specific
	* situations not covered by default logic.
	* 
	* @generated
	*/
	private static boolean isDiagram(fuzzyAutomaton.FuzzyAutomaton element) {
		return true;
	}

	/**
	* @generated
	*/
	public static boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
		if (candidate == -1) {
			//unrecognized id is always bad
			return false;
		}
		int basic = getNodeVisualID(containerView, domainElement);
		return basic == candidate;
	}

	/**
	* @generated
	*/
	public static boolean isCompartmentVisualID(int visualID) {
		switch (visualID) {
		case fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static boolean isSemanticLeafVisualID(int visualID) {
		switch (visualID) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			return false;
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return true;
		default:
			break;
		}
		return false;
	}

	/**
	* @generated
	*/
	public static final DiagramStructure TYPED_INSTANCE = new DiagramStructure() {
		/**
		* @generated
		*/
		@Override

		public int getVisualID(View view) {
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view);
		}

		/**
		* @generated
		*/
		@Override

		public String getModelID(View view) {
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getModelID(view);
		}

		/**
		* @generated
		*/
		@Override

		public int getNodeVisualID(View containerView, EObject domainElement) {
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(containerView,
					domainElement);
		}

		/**
		* @generated
		*/
		@Override

		public boolean checkNodeVisualID(View containerView, EObject domainElement, int candidate) {
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.checkNodeVisualID(containerView,
					domainElement, candidate);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isCompartmentVisualID(int visualID) {
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.isCompartmentVisualID(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public boolean isSemanticLeafVisualID(int visualID) {
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.isSemanticLeafVisualID(visualID);
		}
	};

}
