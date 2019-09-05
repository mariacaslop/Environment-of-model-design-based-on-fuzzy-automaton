/*
 * 
 */
package fuzzyAutomaton.diagram.part;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.ErrorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.actions.WorkspaceModifyOperation;

/**
 * @generated
 */
public class FuzzyAutomatonCreationWizard extends Wizard implements INewWizard {

	/**
	* @generated
	*/
	private IWorkbench workbench;

	/**
	* @generated
	*/
	protected IStructuredSelection selection;

	/**
	* @generated
	*/
	protected fuzzyAutomaton.diagram.part.FuzzyAutomatonCreationWizardPage diagramModelFilePage;

	/**
	* @generated
	*/
	protected fuzzyAutomaton.diagram.part.FuzzyAutomatonCreationWizardPage domainModelFilePage;

	/**
	* @generated
	*/
	protected Resource diagram;

	/**
	* @generated
	*/
	private boolean openNewlyCreatedDiagramEditor = true;

	/**
	* @generated
	*/
	public IWorkbench getWorkbench() {
		return workbench;
	}

	/**
	* @generated
	*/
	public IStructuredSelection getSelection() {
		return selection;
	}

	/**
	* @generated
	*/
	public final Resource getDiagram() {
		return diagram;
	}

	/**
	* @generated
	*/
	public final boolean isOpenNewlyCreatedDiagramEditor() {
		return openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void setOpenNewlyCreatedDiagramEditor(boolean openNewlyCreatedDiagramEditor) {
		this.openNewlyCreatedDiagramEditor = openNewlyCreatedDiagramEditor;
	}

	/**
	* @generated
	*/
	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
		setWindowTitle(fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizardTitle);
		setDefaultPageImageDescriptor(fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin
				.getBundledImageDescriptor("icons/wizban/NewFuzzyAutomatonWizard.gif")); //$NON-NLS-1$
		setNeedsProgressMonitor(true);
	}

	/**
	* @generated
	*/
	public void addPages() {
		diagramModelFilePage = new fuzzyAutomaton.diagram.part.FuzzyAutomatonCreationWizardPage("DiagramModelFile", //$NON-NLS-1$
				getSelection(), "fza_diagram"); //$NON-NLS-1$
		diagramModelFilePage
				.setTitle(fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizard_DiagramModelFilePageTitle);
		diagramModelFilePage.setDescription(
				fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizard_DiagramModelFilePageDescription);
		addPage(diagramModelFilePage);

		domainModelFilePage = new fuzzyAutomaton.diagram.part.FuzzyAutomatonCreationWizardPage("DomainModelFile", //$NON-NLS-1$
				getSelection(), "fza") { //$NON-NLS-1$

			public void setVisible(boolean visible) {
				if (visible) {
					String fileName = diagramModelFilePage.getFileName();
					fileName = fileName.substring(0, fileName.length() - ".fza_diagram".length()); //$NON-NLS-1$
					setFileName(fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorUtil
							.getUniqueFileName(getContainerFullPath(), fileName, "fza")); //$NON-NLS-1$
				}
				super.setVisible(visible);
			}
		};
		domainModelFilePage
				.setTitle(fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizard_DomainModelFilePageTitle);
		domainModelFilePage.setDescription(
				fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizard_DomainModelFilePageDescription);
		addPage(domainModelFilePage);
	}

	/**
	* @generated
	*/
	public boolean performFinish() {
		IRunnableWithProgress op = new WorkspaceModifyOperation(null) {

			protected void execute(IProgressMonitor monitor) throws CoreException, InterruptedException {
				diagram = fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorUtil
						.createDiagram(diagramModelFilePage.getURI(), domainModelFilePage.getURI(), monitor);
				if (isOpenNewlyCreatedDiagramEditor() && diagram != null) {
					try {
						fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorUtil.openDiagram(diagram);
					} catch (PartInitException e) {
						ErrorDialog.openError(getContainer().getShell(),
								fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizardOpenEditorError, null,
								e.getStatus());
					}
				}
			}
		};
		try {
			getContainer().run(false, true, op);
		} catch (InterruptedException e) {
			return false;
		} catch (InvocationTargetException e) {
			if (e.getTargetException() instanceof CoreException) {
				ErrorDialog.openError(getContainer().getShell(),
						fuzzyAutomaton.diagram.part.Messages.FuzzyAutomatonCreationWizardCreationError, null,
						((CoreException) e.getTargetException()).getStatus());
			} else {
				fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
						.logError("Error creating diagram", e.getTargetException()); //$NON-NLS-1$
			}
			return false;
		}
		return diagram != null;
	}
}
