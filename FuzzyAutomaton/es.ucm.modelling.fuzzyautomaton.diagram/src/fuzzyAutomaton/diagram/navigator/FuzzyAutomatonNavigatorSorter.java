/*
* 
*/
package fuzzyAutomaton.diagram.navigator;

import org.eclipse.jface.viewers.ViewerSorter;

/**
 * @generated
 */
public class FuzzyAutomatonNavigatorSorter extends ViewerSorter {

	/**
	* @generated
	*/
	private static final int GROUP_CATEGORY = 7008;

	/**
	* @generated
	*/
	private static final int SHORTCUTS_CATEGORY = 7007;

	/**
	* @generated
	*/
	public int category(Object element) {
		if (element instanceof fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) {
			fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem item = (fuzzyAutomaton.diagram.navigator.FuzzyAutomatonNavigatorItem) element;
			if (item.getView().getEAnnotation("Shortcut") != null) { //$NON-NLS-1$
				return SHORTCUTS_CATEGORY;
			}
			return fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(item.getView());
		}
		return GROUP_CATEGORY;
	}

}
