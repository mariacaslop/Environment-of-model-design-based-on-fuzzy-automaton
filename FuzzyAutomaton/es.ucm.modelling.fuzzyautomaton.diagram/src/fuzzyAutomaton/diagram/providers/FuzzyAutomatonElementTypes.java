/*
 * 
 */
package fuzzyAutomaton.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypeImages;
import org.eclipse.gmf.tooling.runtime.providers.DiagramElementTypes;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.swt.graphics.Image;

/**
 * @generated
 */
public class FuzzyAutomatonElementTypes {

	/**
	* @generated
	*/
	private FuzzyAutomatonElementTypes() {
	}

	/**
	* @generated
	*/
	private static Map<IElementType, ENamedElement> elements;

	/**
	* @generated
	*/
	private static DiagramElementTypeImages elementTypeImages = new DiagramElementTypeImages(
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.getItemProvidersAdapterFactory());

	/**
	* @generated
	*/
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	* @generated
	*/
	public static final IElementType FuzzyAutomaton_1000 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.FuzzyAutomaton_1000"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType State_2001 = getElementType("es.ucm.modelling.fuzzyautomaton.diagram.State_2001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VariableSet_2002 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.VariableSet_2002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransitionFeature_2004 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.TransitionFeature_2004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Variable_3001 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.Variable_3001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Input_3002 = getElementType("es.ucm.modelling.fuzzyautomaton.diagram.Input_3002"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Output_3003 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.Output_3003"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FuzzyConstraint_3004 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.FuzzyConstraint_3004"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType FuzzyRelation_3005 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.FuzzyRelation_3005"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VarTransformation_3006 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.VarTransformation_3006"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType VarUpdate_3007 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.VarUpdate_3007"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType Transition_4001 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.Transition_4001"); //$NON-NLS-1$
	/**
	* @generated
	*/
	public static final IElementType TransitionFeatureFeatureToTransition_4003 = getElementType(
			"es.ucm.modelling.fuzzyautomaton.diagram.TransitionFeatureFeatureToTransition_4003"); //$NON-NLS-1$

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		return elementTypeImages.getImageDescriptor(element);
	}

	/**
	* @generated
	*/
	public static Image getImage(ENamedElement element) {
		return elementTypeImages.getImage(element);
	}

	/**
	* @generated
	*/
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		return getImageDescriptor(getElement(hint));
	}

	/**
	* @generated
	*/
	public static Image getImage(IAdaptable hint) {
		return getImage(getElement(hint));
	}

	/**
	* Returns 'type' of the ecore object associated with the hint.
	* 
	* @generated
	*/
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(FuzzyAutomaton_1000, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyAutomaton());

			elements.put(State_2001, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getState());

			elements.put(VariableSet_2002, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVariableSet());

			elements.put(TransitionFeature_2004, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransitionFeature());

			elements.put(Variable_3001, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVariable());

			elements.put(Input_3002, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getInput());

			elements.put(Output_3003, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getOutput());

			elements.put(FuzzyConstraint_3004, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyConstraint());

			elements.put(FuzzyRelation_3005, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation());

			elements.put(VarTransformation_3006, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVarTransformation());

			elements.put(VarUpdate_3007, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVarUpdate());

			elements.put(Transition_4001, fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransition());

			elements.put(TransitionFeatureFeatureToTransition_4003,
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransitionFeature_FeatureToTransition());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	* @generated
	*/
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	* @generated
	*/
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(FuzzyAutomaton_1000);
			KNOWN_ELEMENT_TYPES.add(State_2001);
			KNOWN_ELEMENT_TYPES.add(VariableSet_2002);
			KNOWN_ELEMENT_TYPES.add(TransitionFeature_2004);
			KNOWN_ELEMENT_TYPES.add(Variable_3001);
			KNOWN_ELEMENT_TYPES.add(Input_3002);
			KNOWN_ELEMENT_TYPES.add(Output_3003);
			KNOWN_ELEMENT_TYPES.add(FuzzyConstraint_3004);
			KNOWN_ELEMENT_TYPES.add(FuzzyRelation_3005);
			KNOWN_ELEMENT_TYPES.add(VarTransformation_3006);
			KNOWN_ELEMENT_TYPES.add(VarUpdate_3007);
			KNOWN_ELEMENT_TYPES.add(Transition_4001);
			KNOWN_ELEMENT_TYPES.add(TransitionFeatureFeatureToTransition_4003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	* @generated
	*/
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID:
			return FuzzyAutomaton_1000;
		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID:
			return State_2001;
		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID:
			return VariableSet_2002;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID:
			return TransitionFeature_2004;
		case fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID:
			return Variable_3001;
		case fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID:
			return Input_3002;
		case fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID:
			return Output_3003;
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID:
			return FuzzyConstraint_3004;
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID:
			return FuzzyRelation_3005;
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID:
			return VarTransformation_3006;
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID:
			return VarUpdate_3007;
		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID:
			return Transition_4001;
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID:
			return TransitionFeatureFeatureToTransition_4003;
		}
		return null;
	}

	/**
	* @generated
	*/
	public static final DiagramElementTypes TYPED_INSTANCE = new DiagramElementTypes(elementTypeImages) {

		/**
		* @generated
		*/
		@Override

		public boolean isKnownElementType(IElementType elementType) {
			return fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.isKnownElementType(elementType);
		}

		/**
		* @generated
		*/
		@Override

		public IElementType getElementTypeForVisualId(int visualID) {
			return fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getElementType(visualID);
		}

		/**
		* @generated
		*/
		@Override

		public ENamedElement getDefiningNamedElement(IAdaptable elementTypeAdapter) {
			return fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getElement(elementTypeAdapter);
		}
	};

}
