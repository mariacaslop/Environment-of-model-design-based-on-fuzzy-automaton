
/*
 * 
 */
package fuzzyAutomaton.diagram.part;

import java.util.Collections;

import org.eclipse.gef.palette.PaletteContainer;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.palette.PaletteRoot;
import org.eclipse.gef.palette.ToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultLinkToolEntry;
import org.eclipse.gmf.tooling.runtime.part.DefaultNodeToolEntry;

/**
 * @generated
 */
public class FuzzyAutomatonPaletteFactory {

	/**
	* @generated
	*/
	public void fillPalette(PaletteRoot paletteRoot) {
		paletteRoot.add(createObjects1Group());
		paletteRoot.add(createConnections2Group());
	}

	/**
	* Creates "Objects" palette tool group
	* @generated
	*/
	private PaletteContainer createObjects1Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(fuzzyAutomaton.diagram.part.Messages.Objects1Group_title);
		paletteContainer.setId("createObjects1Group"); //$NON-NLS-1$
		paletteContainer.add(createFuzzyConstraint1CreationTool());
		paletteContainer.add(createFuzzyRelation2CreationTool());
		paletteContainer.add(createInputAction3CreationTool());
		paletteContainer.add(createOutputAction4CreationTool());
		paletteContainer.add(createState5CreationTool());
		paletteContainer.add(createTransitionFeatures6CreationTool());
		paletteContainer.add(createVarTransformation7CreationTool());
		paletteContainer.add(createVarUpdate8CreationTool());
		paletteContainer.add(createVariable9CreationTool());
		paletteContainer.add(createVariableSet10CreationTool());
		return paletteContainer;
	}

	/**
	* Creates "Connections" palette tool group
	* @generated
	*/
	private PaletteContainer createConnections2Group() {
		PaletteDrawer paletteContainer = new PaletteDrawer(
				fuzzyAutomaton.diagram.part.Messages.Connections2Group_title);
		paletteContainer.setId("createConnections2Group"); //$NON-NLS-1$
		paletteContainer.add(createFeatureToTransition1CreationTool());
		paletteContainer.add(createTransition2CreationTool());
		return paletteContainer;
	}

	/**
	* @generated
	*/
	private ToolEntry createFuzzyConstraint1CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.FuzzyConstraint1CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.FuzzyConstraint1CreationTool_desc, Collections.singletonList(
						fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004));
		entry.setId("createFuzzyConstraint1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyConstraint_3004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFuzzyRelation2CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.FuzzyRelation2CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.FuzzyRelation2CreationTool_desc, Collections
						.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyRelation_3005));
		entry.setId("createFuzzyRelation2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyRelation_3005));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createInputAction3CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.InputAction3CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.InputAction3CreationTool_desc,
				Collections.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Input_3002));
		entry.setId("createInputAction3CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Input_3002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createOutputAction4CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.OutputAction4CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.OutputAction4CreationTool_desc,
				Collections.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Output_3003));
		entry.setId("createOutputAction4CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Output_3003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createState5CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.State5CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.State5CreationTool_desc,
				Collections.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.State_2001));
		entry.setId("createState5CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.State_2001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransitionFeatures6CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.TransitionFeatures6CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.TransitionFeatures6CreationTool_desc, Collections.singletonList(
						fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004));
		entry.setId("createTransitionFeatures6CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getImageDescriptor(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeature_2004));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVarTransformation7CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.VarTransformation7CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.VarTransformation7CreationTool_desc, Collections.singletonList(
						fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarTransformation_3006));
		entry.setId("createVarTransformation7CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getImageDescriptor(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarTransformation_3006));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVarUpdate8CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.VarUpdate8CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.VarUpdate8CreationTool_desc,
				Collections.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarUpdate_3007));
		entry.setId("createVarUpdate8CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VarUpdate_3007));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVariable9CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.Variable9CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.Variable9CreationTool_desc,
				Collections.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Variable_3001));
		entry.setId("createVariable9CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Variable_3001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createVariableSet10CreationTool() {
		DefaultNodeToolEntry entry = new DefaultNodeToolEntry(
				fuzzyAutomaton.diagram.part.Messages.VariableSet10CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.VariableSet10CreationTool_desc, Collections
						.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VariableSet_2002));
		entry.setId("createVariableSet10CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.VariableSet_2002));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createFeatureToTransition1CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				fuzzyAutomaton.diagram.part.Messages.FeatureToTransition1CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.FeatureToTransition1CreationTool_desc, Collections.singletonList(
						fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003));
		entry.setId("createFeatureToTransition1CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getImageDescriptor(
				fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.TransitionFeatureFeatureToTransition_4003));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

	/**
	* @generated
	*/
	private ToolEntry createTransition2CreationTool() {
		DefaultLinkToolEntry entry = new DefaultLinkToolEntry(
				fuzzyAutomaton.diagram.part.Messages.Transition2CreationTool_title,
				fuzzyAutomaton.diagram.part.Messages.Transition2CreationTool_desc,
				Collections.singletonList(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001));
		entry.setId("createTransition2CreationTool"); //$NON-NLS-1$
		entry.setSmallIcon(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes
				.getImageDescriptor(fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.Transition_4001));
		entry.setLargeIcon(entry.getSmallIcon());
		return entry;
	}

}
