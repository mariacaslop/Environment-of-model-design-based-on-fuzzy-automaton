/*
 * 
 */
package fuzzyAutomaton.diagram.providers;

/**
 * @generated
 */
public class ElementInitializers {

	protected ElementInitializers() {
		// use #getInstance to access cached instance
	}

	/**
	* @generated
	*/
	public static ElementInitializers getInstance() {
		ElementInitializers cached = fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
				.getElementInitializers();
		if (cached == null) {
			fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance()
					.setElementInitializers(cached = new ElementInitializers());
		}
		return cached;
	}
}
