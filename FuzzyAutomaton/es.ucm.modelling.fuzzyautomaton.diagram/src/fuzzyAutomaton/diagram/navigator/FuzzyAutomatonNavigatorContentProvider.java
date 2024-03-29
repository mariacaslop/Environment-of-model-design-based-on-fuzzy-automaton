/*
* 
*/
package fuzzyAutomaton.diagram.navigator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.emf.workspace.util.WorkspaceSynchronizer;
import org.eclipse.gmf.runtime.emf.core.GMFEditingDomainFactory;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.Edge;
import org.eclipse.gmf.runtime.notation.Node;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.ui.IMemento;
import org.eclipse.ui.navigator.ICommonContentExtensionSite;
import org.eclipse.ui.navigator.ICommonContentProvider;

/**
 * @generated
 */
public class FuzzyAutomatonNavigatorContentProvider implements ICommonContentProvider {

	/**
	* @generated
	*/
	private static final Object[] EMPTY_ARRAY = new Object[0];

	/**
	* @generated
	*/
	private Viewer myViewer;

	/**
	* @generated
	*/
	private AdapterFactoryEditingDomain myEditingDomain;

	/**
	* @generated
	*/
	private WorkspaceSynchronizer myWorkspaceSynchronizer;

	/**
	* @generated
	*/
	private Runnable myViewerRefreshRunnable;

	/**
	* @generated
	*/
	@SuppressWarnings({ "unchecked", "serial", "rawtypes" })
	public FuzzyAutomatonNavigatorContentProvider() {
		TransactionalEditingDomain editingDomain = GMFEditingDomainFactory.INSTANCE.createEditingDomain();
		myEditingDomain = (AdapterFactoryEditingDomain) editingDomain;
		myEditingDomain.setResourceToReadOnlyMap(new HashMap() {
			public Object get(Object key) {
				if (!containsKey(key)) {
					put(key, Boolean.TRUE);
				}
				return super.get(key);
			}
		});
		myViewerRefreshRunnable = new Runnable() {
			public void run() {
				if (myViewer != null) {
					myViewer.refresh();
				}
			}
		};
		myWorkspaceSynchronizer = new WorkspaceSynchronizer(editingDomain, new WorkspaceSynchronizer.Delegate() {
			public void dispose() {
			}

			public boolean handleResourceChanged(final Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceDeleted(Resource resource) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}

			public boolean handleResourceMoved(Resource resource, final URI newURI) {
				unloadAllResources();
				asyncRefresh();
				return true;
			}
		});
	}

	/**
	* @generated
	*/
	public void dispose() {
		myWorkspaceSynchronizer.dispose();
		myWorkspaceSynchronizer = null;
		myViewerRefreshRunnable = null;
		myViewer = null;
		unloadAllResources();
		((TransactionalEditingDomain) myEditingDomain).dispose();
		myEditingDomain = null;
	}

	/**
	* @generated
	*/
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		myViewer = viewer;
	}

	/**
	* @generated
	*/
	void unloadAllResources() {
		for (Resource nextResource : myEditingDomain.getResourceSet().getResources()) {
			nextResource.unload();
		}
	}

	/**
	* @generated
	*/
	void asyncRefresh() {
		if (myViewer != null && !myViewer.getControl().isDisposed()) {
			myViewer.getControl().getDisplay().asyncExec(myViewerRefreshRunnable);
		}
	}

	/**
	* @generated
	*/
	public Object[] getElements(Object inputElement) {
		return getChildren(inputElement);
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
	public void init(ICommonContentExtensionSite aConfig) {
	}

	/**
	* @generated
	*/
	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof IFile) {
			IFile file = (IFile) parentElement;
			URI fileURI = URI.createPlatformResourceURI(file.getFullPath().toString(), true);
			Resource resource = myEditingDomain.getResourceSet().getResource(fileURI, true);
			ArrayList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem> result = new ArrayList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem>();
			ArrayList<View> topViews = new ArrayList<View>(resource.getContents().size());
			for (EObject o : resource.getContents()) {
				if (o instanceof View) {
					topViews.add((View) o);
				}
			}
			result.addAll(createNavigatorItems(
					selectViewsByType(topViews, fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID),
					file, false));
			return result.toArray();
		}

		if (parentElement instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup group = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup) parentElement;
			return group.getChildren();
		}

		if (parentElement instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem navigatorItem = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) parentElement;
			if (navigatorItem.isLeaf() || !isOwnView(navigatorItem.getView())) {
				return EMPTY_ARRAY;
			}
			return getViewChildren(navigatorItem.getView(), parentElement);
		}

		/*
		* Due to plugin.xml restrictions this code will be called only for views representing
		* shortcuts to this diagram elements created on other diagrams. 
		*/
		if (parentElement instanceof IAdaptable) {
			View view = (View) ((IAdaptable) parentElement).getAdapter(View.class);
			if (view != null) {
				return getViewChildren(view, parentElement);
			}
		}

		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Object[] getViewChildren(View view, Object parentElement) {
		switch (fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view)) {

		case fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			result.addAll(getForeignShortcuts((Diagram) view, parentElement));
			Diagram sv = (Diagram) view;
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup links = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_FuzzyAutomaton_1000_links,
					"icons/linksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			connectedViews = getDiagramLinksByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID));
			links.addChildren(createNavigatorItems(connectedViews, links, false));
			if (!links.isEmpty()) {
				result.add(links);
			}
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Node sv = (Node) view;
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup incominglinks = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_State_2001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup outgoinglinks = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_State_2001_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getIncomingLinksByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			incominglinks.addChildren(createNavigatorItems(connectedViews, incominglinks, true));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.VariableSetEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.VariableSetVariableSetVariablesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.VariableEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Node sv = (Node) view;
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup outgoinglinks = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_TransitionFeature_2004_outgoinglinks,
					"icons/outgoingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.InputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureActionCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.OutputEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureFuzzyConstraintCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.TransitionFeatureTransitionFeatureVarTransformationCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			connectedViews = getOutgoingLinksByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID));
			outgoinglinks.addChildren(createNavigatorItems(connectedViews, outgoinglinks, true));
			if (!outgoinglinks.isEmpty()) {
				result.add(outgoinglinks);
			}
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintFuzzyConstraintFuzzyRelationsCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.FuzzyRelationEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.VarTransformationEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Node sv = (Node) view;
			Collection<View> connectedViews;
			connectedViews = getChildrenByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getType(
							fuzzyAutomaton.diagram.edit.parts.VarTransformationVarTransformationVarUpdatesCompartmentEditPart.VISUAL_ID));
			connectedViews = getChildrenByType(connectedViews,
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.VarUpdateEditPart.VISUAL_ID));
			result.addAll(createNavigatorItems(connectedViews, parentElement, false));
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.TransitionEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup target = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_Transition_4001_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup source = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_Transition_4001_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup incominglinks = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_Transition_4001_incominglinks,
					"icons/incomingLinksNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksTargetByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID));
			target.addChildren(createNavigatorItems(connectedViews, target, true));
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.StateEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			if (!incominglinks.isEmpty()) {
				result.add(incominglinks);
			}
			return result.toArray();
		}

		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureFeatureToTransitionEditPart.VISUAL_ID: {
			LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem> result = new LinkedList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem>();
			Edge sv = (Edge) view;
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup target = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_TransitionFeatureFeatureToTransition_4003_target,
					"icons/linkTargetNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup source = new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorGroup(
					fuzzyAutomaton.diagram.part.Messages.NavigatorGroupName_TransitionFeatureFeatureToTransition_4003_source,
					"icons/linkSourceNavigatorGroup.gif", parentElement); //$NON-NLS-1$
			Collection<View> connectedViews;
			connectedViews = getLinksSourceByType(Collections.singleton(sv),
					fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry
							.getType(fuzzyAutomaton.diagram.edit.parts.TransitionFeatureEditPart.VISUAL_ID));
			source.addChildren(createNavigatorItems(connectedViews, source, true));
			if (!target.isEmpty()) {
				result.add(target);
			}
			if (!source.isEmpty()) {
				result.add(source);
			}
			return result.toArray();
		}
		}
		return EMPTY_ARRAY;
	}

	/**
	* @generated
	*/
	private Collection<View> getLinksSourceByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeSource = nextEdge.getSource();
			if (type.equals(nextEdgeSource.getType()) && isOwnView(nextEdgeSource)) {
				result.add(nextEdgeSource);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getLinksTargetByType(Collection<Edge> edges, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (Edge nextEdge : edges) {
			View nextEdgeTarget = nextEdge.getTarget();
			if (type.equals(nextEdgeTarget.getType()) && isOwnView(nextEdgeTarget)) {
				result.add(nextEdgeTarget);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getOutgoingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getSourceEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getIncomingLinksByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getTargetEdges(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getChildrenByType(Collection<? extends View> nodes, String type) {
		LinkedList<View> result = new LinkedList<View>();
		for (View nextNode : nodes) {
			result.addAll(selectViewsByType(nextNode.getChildren(), type));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<View> getDiagramLinksByType(Collection<Diagram> diagrams, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (Diagram nextDiagram : diagrams) {
			result.addAll(selectViewsByType(nextDiagram.getEdges(), type));
		}
		return result;
	}

	// TODO refactor as static method
	/**
	 * @generated
	 */
	private Collection<View> selectViewsByType(Collection<View> views, String type) {
		ArrayList<View> result = new ArrayList<View>();
		for (View nextView : views) {
			if (type.equals(nextView.getType()) && isOwnView(nextView)) {
				result.add(nextView);
			}
		}
		return result;
	}

	/**
	 * @generated
	 */
	private boolean isOwnView(View view) {
		return fuzzyAutomaton.diagram.edit.parts.FuzzyAutomatonEditPart.MODEL_ID
				.equals(fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getModelID(view));
	}

	/**
	 * @generated
	 */
	private Collection<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem> createNavigatorItems(
			Collection<View> views, Object parent, boolean isLeafs) {
		ArrayList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem> result = new ArrayList<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem>(
				views.size());
		for (View nextView : views) {
			result.add(new fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem(nextView, parent, isLeafs));
		}
		return result;
	}

	/**
	 * @generated
	 */
	private Collection<fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem> getForeignShortcuts(
			Diagram diagram, Object parent) {
		LinkedList<View> result = new LinkedList<View>();
		for (Iterator<View> it = diagram.getChildren().iterator(); it.hasNext();) {
			View nextView = it.next();
			if (!isOwnView(nextView) && nextView.getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				result.add(nextView);
			}
		}
		return createNavigatorItems(result, parent, false);
	}

	/**
	* @generated
	*/
	public Object getParent(Object element) {
		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem abstractNavigatorItem = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonAbstractNavigatorItem) element;
			return abstractNavigatorItem.getParent();
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean hasChildren(Object element) {
		return element instanceof IFile || getChildren(element).length > 0;
	}

}
