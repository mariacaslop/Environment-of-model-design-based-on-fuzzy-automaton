package es.ucm.modelling.fuzzyautomaton.m2t;

import java.io.File;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.epsilon.common.parse.problem.ParseProblem;
import org.eclipse.epsilon.common.util.StringUtil;
import org.eclipse.epsilon.egl.EglFileGeneratingTemplateFactory;
import org.eclipse.epsilon.egl.EglTemplateFactoryModuleAdapter;
import org.eclipse.epsilon.egl.util.FileUtil;
import org.eclipse.epsilon.eol.dt.launching.EclipseContextManager;
import org.eclipse.epsilon.eol.models.Model;


public class TransformFuzzyAutomatonToCode {
	
	public static void executeEGL(final Model sourceModel, EObject node, final String pathToEGL,
			final File outputFile) throws Exception {
		
		final EglFileGeneratingTemplateFactory factory = new EglFileGeneratingTemplateFactory();
		final EglTemplateFactoryModuleAdapter eglModule = new EglTemplateFactoryModuleAdapter(factory);
		eglModule.parse(TransformFuzzyAutomatonToCode.class.getResource(pathToEGL).toURI());

		EclipseContextManager.setup(eglModule.getContext());
		eglModule.getContext().getModelRepository().addModel(sourceModel);
		
		if (eglModule.getParseProblems().size() > 0) {
			System.err.println("There are some parse errors: ");
			
			for (ParseProblem problem : eglModule.getParseProblems()) {
			    System.err.println(problem.toString());
			}
			
		 }

		// Save the code generated from a fuzzy automaton model to a file
		final String result = StringUtil.toString(eglModule.execute());		
		FileUtil.write(outputFile, result);
		
		eglModule.getContext().getModelRepository().dispose();
		
		System.out.println("Generated fuzzy automaton code: \n" + result);
	}
	
}
