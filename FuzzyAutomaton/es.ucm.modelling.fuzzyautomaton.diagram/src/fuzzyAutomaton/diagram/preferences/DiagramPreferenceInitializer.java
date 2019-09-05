/*
 * 
 */
package fuzzyAutomaton.diagram.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

/**
 * @generated
 */
public class DiagramPreferenceInitializer extends AbstractPreferenceInitializer {

	/**
	* @generated
	*/
	public void initializeDefaultPreferences() {
		IPreferenceStore store = getPreferenceStore();
		fuzzyAutomaton.diagram.preferences.DiagramGeneralPreferencePage.initDefaults(store);
		fuzzyAutomaton.diagram.preferences.DiagramAppearancePreferencePage.initDefaults(store);
		fuzzyAutomaton.diagram.preferences.DiagramConnectionsPreferencePage.initDefaults(store);
		fuzzyAutomaton.diagram.preferences.DiagramPrintingPreferencePage.initDefaults(store);
		fuzzyAutomaton.diagram.preferences.DiagramRulersAndGridPreferencePage.initDefaults(store);

	}

	/**
	* @generated
	*/
	protected IPreferenceStore getPreferenceStore() {
		return fuzzyAutomaton.diagram.part.FuzzyAutomatonDiagramEditorPlugin.getInstance().getPreferenceStore();
	}
}
