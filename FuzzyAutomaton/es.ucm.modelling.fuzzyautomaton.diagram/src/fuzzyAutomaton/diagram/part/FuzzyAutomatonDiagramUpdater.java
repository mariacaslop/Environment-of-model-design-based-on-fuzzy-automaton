/*
* 
*/
package fuzzyAutomaton.diagram.part;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.update.DiagramUpdater;

/**
 * @generated
 */
public class FuzzyAutomatonDiagramUpdater {

	/**
	* @generated
	*/
	public static boolean isShortcutOrphaned(View view) {
		return !view.isSetElement() || view.getElement() == null || view.getElement().eIsProxy();
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getSemanticChildren(View view) {
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			return getFuzzyAutomaton_1000SemanticChildren(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID:
			return getVariableSetVariableSetVariablesCompartment_7001SemanticChildren(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID:
			return getTransitionFeatureTransitionFeatureActionCompartment_7002SemanticChildren(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID:
			return getTransitionFeatureTransitionFeatureFuzzyConstraintCompartment_7003SemanticChildren(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID:
			return getTransitionFeatureTransitionFeatureVarTransformationCompartment_7005SemanticChildren(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID:
			return getFuzzyConstraintFuzzyConstraintFuzzyRelationsCompartment_7004SemanticChildren(view);
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID:
			return getVarTransformationVarTransformationVarUpdatesCompartment_7006SemanticChildren(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getFuzzyAutomaton_1000SemanticChildren(
			View view) {
		if (!view.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.FuzzyAutomaton modelElement = (fuzzyAutomaton.FuzzyAutomaton) view.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		for (Iterator<?> it = modelElement.getStates().iterator(); it.hasNext();) {
			fuzzyAutomaton.State childElement = (fuzzyAutomaton.State) it.next();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		{
			fuzzyAutomaton.VariableSet childElement = modelElement.getVariableSet();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
			}
		}
		for (Iterator<?> it = modelElement.getTransitionFeatures().iterator(); it.hasNext();) {
			fuzzyAutomaton.TransitionFeature childElement = (fuzzyAutomaton.TransitionFeature) it.next();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getVariableSetVariableSetVariablesCompartment_7001SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.VariableSet modelElement = (fuzzyAutomaton.VariableSet) containerView.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVariables().iterator(); it.hasNext();) {
			fuzzyAutomaton.Variable childElement = (fuzzyAutomaton.Variable) it.next();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getTransitionFeatureTransitionFeatureActionCompartment_7002SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.TransitionFeature modelElement = (fuzzyAutomaton.TransitionFeature) containerView.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		{
			fuzzyAutomaton.Action childElement = modelElement.getAction();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
			}
			if (visualID == fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getTransitionFeatureTransitionFeatureFuzzyConstraintCompartment_7003SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.TransitionFeature modelElement = (fuzzyAutomaton.TransitionFeature) containerView.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		{
			fuzzyAutomaton.FuzzyConstraint childElement = modelElement.getFuzzyConstraint();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getTransitionFeatureTransitionFeatureVarTransformationCompartment_7005SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.TransitionFeature modelElement = (fuzzyAutomaton.TransitionFeature) containerView.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		{
			fuzzyAutomaton.VarTransformation childElement = modelElement.getVarTransformation();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getFuzzyConstraintFuzzyConstraintFuzzyRelationsCompartment_7004SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.FuzzyConstraint modelElement = (fuzzyAutomaton.FuzzyConstraint) containerView.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		for (Iterator<?> it = modelElement.getFuzzyRelations().iterator(); it.hasNext();) {
			fuzzyAutomaton.FuzzyRelation childElement = (fuzzyAutomaton.FuzzyRelation) it.next();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getVarTransformationVarTransformationVarUpdatesCompartment_7006SemanticChildren(
			View view) {
		if (false == view.eContainer() instanceof View) {
			return Collections.emptyList();
		}
		View containerView = (View) view.eContainer();
		if (!containerView.isSetElement()) {
			return Collections.emptyList();
		}
		fuzzyAutomaton.VarTransformation modelElement = (fuzzyAutomaton.VarTransformation) containerView.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor>();
		for (Iterator<?> it = modelElement.getVarUpdates().iterator(); it.hasNext();) {
			fuzzyAutomaton.VarUpdate childElement = (fuzzyAutomaton.VarUpdate) it.next();
			int visualID = fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getNodeVisualID(view,
					childElement);
			if (visualID == fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor(childElement, visualID));
				continue;
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getContainedLinks(View view) {
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			return getFuzzyAutomaton_1000ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			return getVariableSet_2002ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			return getTransitionFeature_2004ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			return getVariable_3001ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3002ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3003ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			return getFuzzyConstraint_3004ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			return getFuzzyRelation_3005ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			return getVarTransformation_3006ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return getVarUpdate_3007ContainedLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001ContainedLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getIncomingLinks(View view) {
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			return getVariableSet_2002IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			return getTransitionFeature_2004IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			return getVariable_3001IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3002IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3003IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			return getFuzzyConstraint_3004IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			return getFuzzyRelation_3005IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			return getVarTransformation_3006IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return getVarUpdate_3007IncomingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001IncomingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutgoingLinks(View view) {
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return getState_2001OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			return getVariableSet_2002OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			return getTransitionFeature_2004OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			return getVariable_3001OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return getInput_3002OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return getOutput_3003OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			return getFuzzyConstraint_3004OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			return getFuzzyRelation_3005OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			return getVarTransformation_3006OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return getVarUpdate_3007OutgoingLinks(view);
		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return getTransition_4001OutgoingLinks(view);
		}
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyAutomaton_1000ContainedLinks(
			View view) {
		fuzzyAutomaton.FuzzyAutomaton modelElement = (fuzzyAutomaton.FuzzyAutomaton) view.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		result.addAll(getContainedTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getState_2001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVariableSet_2002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getTransitionFeature_2004ContainedLinks(
			View view) {
		fuzzyAutomaton.TransitionFeature modelElement = (fuzzyAutomaton.TransitionFeature) view.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TransitionFeature_FeatureToTransition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVariable_3001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getInput_3002ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutput_3003ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyConstraint_3004ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyRelation_3005ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVarTransformation_3006ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVarUpdate_3007ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getTransition_4001ContainedLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getState_2001IncomingLinks(View view) {
		fuzzyAutomaton.State modelElement = (fuzzyAutomaton.State) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		result.addAll(getIncomingTypeModelFacetLinks_Transition_4001(modelElement, crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVariableSet_2002IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getTransitionFeature_2004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVariable_3001IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getInput_3002IncomingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutput_3003IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyConstraint_3004IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyRelation_3005IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVarTransformation_3006IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVarUpdate_3007IncomingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getTransition_4001IncomingLinks(
			View view) {
		fuzzyAutomaton.Transition modelElement = (fuzzyAutomaton.Transition) view.getElement();
		Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences = EcoreUtil.CrossReferencer
				.find(view.eResource().getResourceSet().getResources());
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		result.addAll(getIncomingFeatureModelFacetLinks_TransitionFeature_FeatureToTransition_4003(modelElement,
				crossReferences));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getState_2001OutgoingLinks(View view) {
		fuzzyAutomaton.State modelElement = (fuzzyAutomaton.State) view.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		result.addAll(getOutgoingTypeModelFacetLinks_Transition_4001(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVariableSet_2002OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getTransitionFeature_2004OutgoingLinks(
			View view) {
		fuzzyAutomaton.TransitionFeature modelElement = (fuzzyAutomaton.TransitionFeature) view.getElement();
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		result.addAll(getOutgoingFeatureModelFacetLinks_TransitionFeature_FeatureToTransition_4003(modelElement));
		return result;
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVariable_3001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getInput_3002OutgoingLinks(View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutput_3003OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyConstraint_3004OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getFuzzyRelation_3005OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVarTransformation_3006OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getVarUpdate_3007OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	 * @generated
	 */
	public static List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getTransition_4001OutgoingLinks(
			View view) {
		return Collections.emptyList();
	}

	/**
	* @generated
	*/
	private static Collection<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getContainedTypeModelFacetLinks_Transition_4001(
			fuzzyAutomaton.FuzzyAutomaton container) {
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof fuzzyAutomaton.Transition) {
				continue;
			}
			fuzzyAutomaton.Transition link = (fuzzyAutomaton.Transition) linkObject;
			if (fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID != fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			fuzzyAutomaton.State dst = link.getTarget();
			fuzzyAutomaton.State src = link.getSource();
			result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor(src, dst, link,
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001,
					fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getIncomingTypeModelFacetLinks_Transition_4001(
			fuzzyAutomaton.State target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() != fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransition_Target()
					|| false == setting.getEObject() instanceof fuzzyAutomaton.Transition) {
				continue;
			}
			fuzzyAutomaton.Transition link = (fuzzyAutomaton.Transition) setting.getEObject();
			if (fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID != fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			fuzzyAutomaton.State src = link.getSource();
			result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor(src, target, link,
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001,
					fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private static Collection<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getIncomingFeatureModelFacetLinks_TransitionFeature_FeatureToTransition_4003(
			fuzzyAutomaton.Transition target, Map<EObject, Collection<EStructuralFeature.Setting>> crossReferences) {
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		Collection<EStructuralFeature.Setting> settings = crossReferences.get(target);
		for (EStructuralFeature.Setting setting : settings) {
			if (setting.getEStructuralFeature() == fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE
					.getTransitionFeature_FeatureToTransition()) {
				result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor(setting.getEObject(), target,
						fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003,
						fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID));
			}
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutgoingTypeModelFacetLinks_Transition_4001(
			fuzzyAutomaton.State source) {
		fuzzyAutomaton.FuzzyAutomaton container = null;
		// Find container element for the link.
		// Climb up by containment hierarchy starting from the source
		// and return the first element that is instance of the container class.
		for (EObject element = source; element != null && container == null; element = element.eContainer()) {
			if (element instanceof fuzzyAutomaton.FuzzyAutomaton) {
				container = (fuzzyAutomaton.FuzzyAutomaton) element;
			}
		}
		if (container == null) {
			return Collections.emptyList();
		}
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		for (Iterator<?> links = container.getTransitions().iterator(); links.hasNext();) {
			EObject linkObject = (EObject) links.next();
			if (false == linkObject instanceof fuzzyAutomaton.Transition) {
				continue;
			}
			fuzzyAutomaton.Transition link = (fuzzyAutomaton.Transition) linkObject;
			if (fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID != fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
					.getLinkWithClassVisualID(link)) {
				continue;
			}
			fuzzyAutomaton.State dst = link.getTarget();
			fuzzyAutomaton.State src = link.getSource();
			if (src != source) {
				continue;
			}
			result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor(src, dst, link,
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001,
					fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	private static Collection<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutgoingFeatureModelFacetLinks_TransitionFeature_FeatureToTransition_4003(
			fuzzyAutomaton.TransitionFeature source) {
		LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> result = new LinkedList<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor>();
		for (Iterator<?> destinations = source.getFeatureToTransition().iterator(); destinations.hasNext();) {
			fuzzyAutomaton.Transition destination = (fuzzyAutomaton.Transition) destinations.next();
			result.add(new fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor(source, destination,
					fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003,
					fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID));
		}
		return result;
	}

	/**
	* @generated
	*/
	public static final DiagramUpdater TYPED_INSTANCE = new DiagramUpdater() {
		/**
		* @generated
		*/
		@Override

		public List<fuzzyAutomaton.diagram.part.FuzzyAutomatonNodeDescriptor> getSemanticChildren(View view) {
			return FuzzyAutomatonDiagramUpdater.getSemanticChildren(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getContainedLinks(View view) {
			return FuzzyAutomatonDiagramUpdater.getContainedLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getIncomingLinks(View view) {
			return FuzzyAutomatonDiagramUpdater.getIncomingLinks(view);
		}

		/**
		* @generated
		*/
		@Override

		public List<fuzzyAutomaton.diagram.part.FuzzyAutomatonLinkDescriptor> getOutgoingLinks(View view) {
			return FuzzyAutomatonDiagramUpdater.getOutgoingLinks(view);
		}
	};

}
