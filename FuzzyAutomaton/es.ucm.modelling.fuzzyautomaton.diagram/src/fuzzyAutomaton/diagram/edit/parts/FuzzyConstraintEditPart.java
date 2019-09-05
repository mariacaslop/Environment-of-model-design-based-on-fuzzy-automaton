/*
 * 
 */
package fuzzyAutomaton.diagram.edit.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.RectangleFigure;
import org.eclipse.draw2d.RoundedRectangle;
import org.eclipse.draw2d.Shape;
import org.eclipse.draw2d.StackLayout;
import org.eclipse.draw2d.geometry.Dimension;
import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.Request;
import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.LayoutEditPolicy;
import org.eclipse.gef.editpolicies.NonResizableEditPolicy;
import org.eclipse.gef.requests.CreateRequest;
import org.eclipse.gmf.runtime.diagram.core.edithelpers.CreateElementRequestAdapter;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeNodeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles;
import org.eclipse.gmf.runtime.diagram.ui.requests.CreateViewAndElementRequest;
import org.eclipse.gmf.runtime.draw2d.ui.figures.ConstrainedToolbarLayout;
import org.eclipse.gmf.runtime.draw2d.ui.figures.WrappingLabel;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.gef.ui.figures.DefaultSizeNodeFigure;
import org.eclipse.gmf.runtime.gef.ui.figures.NodeFigure;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.tooling.runtime.edit.policies.reparent.CreationEditPolicyWithCustomReparent;
import org.eclipse.swt.graphics.Color;

/**
 * @generated
 */
public class FuzzyConstraintEditPart extends ShapeNodeEditPart {

	/**
	* @generated
	*/
	public static final int VISUAL_ID = 3004;

	/**
	* @generated
	*/
	protected IFigure contentPane;

	/**
	* @generated
	*/
	protected IFigure primaryShape;

	/**
	* @generated
	*/
	public FuzzyConstraintEditPart(View view) {
		super(view);
	}

	/**
	* @generated
	*/
	protected void createDefaultEditPolicies() {
		installEditPolicy(EditPolicyRoles.CREATION_ROLE, new CreationEditPolicyWithCustomReparent(
				fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.TYPED_INSTANCE));
		super.createDefaultEditPolicies();
		installEditPolicy(EditPolicyRoles.SEMANTIC_ROLE,
				new fuzzyAutomaton.diagram.edit.policies.FuzzyConstraintItemSemanticEditPolicy());
		installEditPolicy(EditPolicy.LAYOUT_ROLE, createLayoutEditPolicy());
		installEditPolicy(EditPolicyRoles.OPEN_ROLE, new fuzzyAutomaton.diagram.edit.policies.OpenDiagramEditPolicy()); // XXX need an SCR to runtime to have another abstract superclass that would let children add reasonable editpolicies
		// removeEditPolicy(org.eclipse.gmf.runtime.diagram.ui.editpolicies.EditPolicyRoles.CONNECTION_HANDLES_ROLE);
	}

	/**
	* @generated
	*/
	protected LayoutEditPolicy createLayoutEditPolicy() {
		org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy lep = new org.eclipse.gmf.runtime.diagram.ui.editpolicies.LayoutEditPolicy() {

			protected EditPolicy createChildEditPolicy(EditPart child) {
				EditPolicy result = child.getEditPolicy(EditPolicy.PRIMARY_DRAG_ROLE);
				if (result == null) {
					result = new NonResizableEditPolicy();
				}
				return result;
			}

			protected Command getMoveChildrenCommand(Request request) {
				return null;
			}

			protected Command getCreateCommand(CreateRequest request) {
				return null;
			}
		};
		return lep;
	}

	/**
	* @generated
	*/
	protected IFigure createNodeShape() {
		return primaryShape = new FuzzyConstraintFigure();
	}

	/**
	* @generated
	*/
	public FuzzyConstraintFigure getPrimaryShape() {
		return (FuzzyConstraintFigure) primaryShape;
	}

	/**
	* @generated
	*/
	protected boolean addFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart) {
			((fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart) childEditPart)
					.setLabel(getPrimaryShape().getFigureFuzzyConstraintLabelFigure());
			return true;
		}
		if (childEditPart instanceof fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFuzzyConstraintFuzzyRelationsCompartmentFigure();
			setupContentPane(pane); // FIXME each comparment should handle his content pane in his own way 
			pane.add(
					((fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean removeFixedChild(EditPart childEditPart) {
		if (childEditPart instanceof fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart) {
			return true;
		}
		if (childEditPart instanceof fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart) {
			IFigure pane = getPrimaryShape().getFuzzyConstraintFuzzyRelationsCompartmentFigure();
			pane.remove(
					((fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart) childEditPart)
							.getFigure());
			return true;
		}
		return false;
	}

	/**
	* @generated
	*/
	protected void addChildVisual(EditPart childEditPart, int index) {
		if (addFixedChild(childEditPart)) {
			return;
		}
		super.addChildVisual(childEditPart, -1);
	}

	/**
	* @generated
	*/
	protected void removeChildVisual(EditPart childEditPart) {
		if (removeFixedChild(childEditPart)) {
			return;
		}
		super.removeChildVisual(childEditPart);
	}

	/**
	* @generated
	*/
	protected IFigure getContentPaneFor(IGraphicalEditPart editPart) {
		if (editPart instanceof fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart) {
			return getPrimaryShape().getFuzzyConstraintFuzzyRelationsCompartmentFigure();
		}
		return getContentPane();
	}

	/**
	* @generated
	*/
	protected NodeFigure createNodePlate() {
		DefaultSizeNodeFigure result = new DefaultSizeNodeFigure(40, 40);
		return result;
	}

	/**
	* Creates figure for this edit part.
	* 
	* Body of this method does not depend on settings in generation model
	* so you may safely remove <i>generated</i> tag and modify it.
	* 
	* @generated
	*/
	protected NodeFigure createNodeFigure() {
		NodeFigure figure = createNodePlate();
		figure.setLayoutManager(new StackLayout());
		IFigure shape = createNodeShape();
		figure.add(shape);
		contentPane = setupContentPane(shape);
		return figure;
	}

	/**
	* Default implementation treats passed figure as content pane.
	* Respects layout one may have set for generated figure.
	* @param nodeShape instance of generated figure class
	* @generated
	*/
	protected IFigure setupContentPane(IFigure nodeShape) {
		if (nodeShape.getLayoutManager() == null) {
			ConstrainedToolbarLayout layout = new ConstrainedToolbarLayout();
			layout.setSpacing(5);
			nodeShape.setLayoutManager(layout);
		}
		return nodeShape; // use nodeShape itself as contentPane
	}

	/**
	* @generated
	*/
	public IFigure getContentPane() {
		if (contentPane != null) {
			return contentPane;
		}
		return super.getContentPane();
	}

	/**
	* @generated
	*/
	protected void setForegroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setForegroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setBackgroundColor(Color color) {
		if (primaryShape != null) {
			primaryShape.setBackgroundColor(color);
		}
	}

	/**
	* @generated
	*/
	protected void setLineWidth(int width) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineWidth(width);
		}
	}

	/**
	* @generated
	*/
	protected void setLineType(int style) {
		if (primaryShape instanceof Shape) {
			((Shape) primaryShape).setLineStyle(style);
		}
	}

	/**
	* @generated
	*/
	public EditPart getPrimaryChildEditPart() {
		return getChildBySemanticHint(fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
				.getType(fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart.VISUAL_ID));
	}

	/**
	* @generated
	*/
	public EditPart getTargetEditPart(Request request) {
		if (request instanceof CreateViewAndElementRequest) {
			CreateElementRequestAdapter adapter = ((CreateViewAndElementRequest) request).getViewAndElementDescriptor()
					.getCreateElementRequestAdapter();
			IElementType type = (IElementType) adapter.getAdapter(IElementType.class);
			if (type == fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.FuzzyRelation_3005) {
				return getChildBySemanticHint(fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
						fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID));
			}
		}
		return super.getTargetEditPart(request);
	}

	/**
	 * @generated
	 */
	public class FuzzyConstraintFigure extends RoundedRectangle {

		/**
		 * @generated
		 */
		private WrappingLabel fFigureFuzzyConstraintLabelFigure;
		/**
		 * @generated
		 */
		private RectangleFigure fFuzzyConstraintFuzzyRelationsCompartmentFigure;

		/**
		 * @generated
		 */
		public FuzzyConstraintFigure() {
			this.setCornerDimensions(new Dimension(getMapMode().DPtoLP(8), getMapMode().DPtoLP(8)));
			this.setOutline(false);
			createContents();
		}

		/**
		 * @generated
		 */
		private void createContents() {

			fFigureFuzzyConstraintLabelFigure = new WrappingLabel();

			fFigureFuzzyConstraintLabelFigure.setText("FuzzyConstraint");
			fFigureFuzzyConstraintLabelFigure
					.setMaximumSize(new Dimension(getMapMode().DPtoLP(10000), getMapMode().DPtoLP(50)));

			this.add(fFigureFuzzyConstraintLabelFigure);

			fFuzzyConstraintFuzzyRelationsCompartmentFigure = new RectangleFigure();

			fFuzzyConstraintFuzzyRelationsCompartmentFigure.setOutline(false);

			this.add(fFuzzyConstraintFuzzyRelationsCompartmentFigure);

		}

		/**
		 * @generated
		 */
		public WrappingLabel getFigureFuzzyConstraintLabelFigure() {
			return fFigureFuzzyConstraintLabelFigure;
		}

		/**
		 * @generated
		 */
		public RectangleFigure getFuzzyConstraintFuzzyRelationsCompartmentFigure() {
			return fFuzzyConstraintFuzzyRelationsCompartmentFigure;
		}

	}

}
