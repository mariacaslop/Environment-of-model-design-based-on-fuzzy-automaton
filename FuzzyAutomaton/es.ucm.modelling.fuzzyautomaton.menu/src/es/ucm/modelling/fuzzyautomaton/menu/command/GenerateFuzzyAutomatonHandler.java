
package es.ucm.modelling.fuzzyautomaton.menu.command;

import java.io.File;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.epsilon.emc.emf.InMemoryEmfModel;
import org.eclipse.epsilon.eol.models.Model;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.DirectoryDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.handlers.HandlerUtil;

import fuzzyAutomaton.FuzzyAutomaton;
import fuzzyAutomaton.FuzzyAutomatonPackage;
import fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditor;
import es.ucm.modelling.fuzzyautomaton.m2t.TransformFuzzyAutomatonToCode;


public class GenerateFuzzyAutomatonHandler extends AbstractHandler {
	
	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
			
		try {		
			
			Shell shell = HandlerUtil.getActiveWorkbenchWindowChecked(event).getShell();
			
			String domainName = "fuzzy-automaton";				
			IWorkspaceRoot myWorkspaceRoot = ResourcesPlugin.getWorkspace().getRoot();
			//IProject fuzzyAutomatonProject = myWorkspaceRoot.getProject(domainName + "_fza");
			IProject fuzzyAutomatonProject = myWorkspaceRoot.getProject(domainName);
							
			if (!fuzzyAutomatonProject.exists()) {
	        	MessageDialog.openError(shell, "Generate Fuzzy Automaton Code", "There are no fuzzy automaton to be transformed into code.");
	        	return null;	
			}		
		
			if(!HandlerUtil.getActiveEditor(event).getClass().getName().equals("fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditor")) {
							
				MessageDialog.openError(shell, "Generate Fuzzy Automaton Code", "A fuzzy automaton must be open.");
				return null;
			}
			
			// 1º Obtain the active editor's diagram
	        FuzzyAutomatonDiagramEditor fuzzyAutomatonDiagramEditor = (FuzzyAutomatonDiagramEditor) HandlerUtil.getActiveEditor(event);
	        
	        if (fuzzyAutomatonDiagramEditor == null || !((IWorkbenchPart) fuzzyAutomatonDiagramEditor).getTitle().endsWith("fza_diagram")) {
	        	MessageDialog.openError(shell, "Generate Fuzzy Automaton Code", "A fuzzy automaton must be open.");
	        	return null; 
	        }
	        
	        // 2º Save all changes made in the editor       
	        fuzzyAutomatonDiagramEditor.doSave(new NullProgressMonitor());
	        
			// 3º Check if there are some problems that must be solved
	                
			IResource ir = (IResource) HandlerUtil.getActiveEditorInput(event).getAdapter(IResource.class);
	        IMarker[] problems = null;
	        int depth = IResource.DEPTH_INFINITE;
			problems = ir.findMarkers(IMarker.PROBLEM, true, depth);
				
			// problems.length is the number of errors of the active editor (not total errors).
			if (problems.length > 0) {
				MessageDialog.openError(shell, "Generate Fuzzy Automaton Code", "There are some problems that must be solved before generating the code.");
	        	return null; 
			}
		 	
			String activeFuzzyAutomatonName = ((IWorkbenchPart) fuzzyAutomatonDiagramEditor).getTitle().replace(".fza_diagram","");
			
			// Open if necessary
			if (!fuzzyAutomatonProject.isOpen()) {
				fuzzyAutomatonProject.open(null);
			}
						
			URI activeFuzzyAutomatonModelUri = URI.createPlatformResourceURI(fuzzyAutomatonProject
					.getFile(activeFuzzyAutomatonName + ".fza").getFullPath().toString(), false);
							
		    ResourceSet resourceSet = new ResourceSetImpl(); 
		   	Resource fuzzyAutomatonModelResource = resourceSet.getResource(activeFuzzyAutomatonModelUri, true);
		   				
		    FuzzyAutomaton fuzzyAutomatonModel = (FuzzyAutomaton) fuzzyAutomatonModelResource.getContents().get(0);
			
			// 4º Select the directory to generate the fuzzy automaton. 
			
			String selectedDir = null; 
		    DirectoryDialog dirDialog = new DirectoryDialog(shell);
		    dirDialog.setText("Choose a folder where to save the generated fuzzy automaton code.");
		    selectedDir = dirDialog.open();
	    	    
		    if (selectedDir == null) {
	        	return null; 	    	
		    }					
		    
		    // 5º Transform the event pattern (except to actions) to EPL code 
		    
		    // FuzzyAutomatonPackage.eINSTANCE contains accessors for the meta objects 
			final Model sourceModel = new InMemoryEmfModel("SourceModel", fuzzyAutomatonModelResource, FuzzyAutomatonPackage.eINSTANCE);
			sourceModel.setStoredOnDisposal(false);
			sourceModel.setReadOnLoad(true);
			
			final String fuzzyAutomatonToTxtPath = "/egl/fuzzyautomaton-to-code.egl";			
			final File outputFuzzyAutomatonFile = new File(selectedDir, 
					fuzzyAutomatonModel.getName() + ".txt");		
			System.out.println("\noutputFuzzyAutomatonFile.getAbsolutePath(): " + outputFuzzyAutomatonFile.getAbsolutePath());
						
			TransformFuzzyAutomatonToCode.executeEGL(sourceModel, fuzzyAutomatonModel, fuzzyAutomatonToTxtPath, outputFuzzyAutomatonFile);
						
			MessageDialog.openInformation(shell, "Generate Fuzzy Automaton Code", 
		    		"The fuzzy automaton has been transformed into code.");	
			
		} catch (Exception e1) {
			e1.printStackTrace();
		}
				
		return null;
	}
}
