/*
 * 
 */
package fuzzyAutomaton.diagram.providers;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.service.AbstractProvider;
import org.eclipse.gmf.runtime.common.core.service.IOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.GetParserOperation;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParser;
import org.eclipse.gmf.runtime.common.ui.services.parser.IParserProvider;
import org.eclipse.gmf.runtime.common.ui.services.parser.ParserService;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.gmf.runtime.emf.ui.services.parser.ParserHintAdapter;
import org.eclipse.gmf.runtime.notation.View;

/**
 * @generated
 */
public class FuzzyAutomatonParserProvider extends AbstractProvider implements IParserProvider {

	/**
	* @generated
	*/
	private IParser variableSetName_5002Parser;

	/**
	* @generated
	*/
	private IParser getVariableSetName_5002Parser() {
		if (variableSetName_5002Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVariableSet_Name() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			variableSetName_5002Parser = parser;
		}
		return variableSetName_5002Parser;
	}

	/**
	* @generated
	*/
	private IParser transitionFeatureName_5005Parser;

	/**
	* @generated
	*/
	private IParser getTransitionFeatureName_5005Parser() {
		if (transitionFeatureName_5005Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getTransitionFeature_Name() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			transitionFeatureName_5005Parser = parser;
		}
		return transitionFeatureName_5005Parser;
	}

	/**
	* @generated
	*/
	private IParser variableName_5003Parser;

	/**
	* @generated
	*/
	private IParser getVariableName_5003Parser() {
		if (variableName_5003Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVariable_Name() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			variableName_5003Parser = parser;
		}
		return variableName_5003Parser;
	}

	/**
	* @generated
	*/
	private IParser inputName_5006Parser;

	/**
	* @generated
	*/
	private IParser getInputName_5006Parser() {
		if (inputName_5006Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getAction_Name() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			inputName_5006Parser = parser;
		}
		return inputName_5006Parser;
	}

	/**
	* @generated
	*/
	private IParser outputName_5007Parser;

	/**
	* @generated
	*/
	private IParser getOutputName_5007Parser() {
		if (outputName_5007Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getAction_Name() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			outputName_5007Parser = parser;
		}
		return outputName_5007Parser;
	}

	/**
	* @generated
	*/
	private IParser fuzzyConstraintNameTNorm_5008Parser;

	/**
	* @generated
	*/
	private IParser getFuzzyConstraintNameTNorm_5008Parser() {
		if (fuzzyConstraintNameTNorm_5008Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyConstraint_Name(),
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyConstraint_TNorm() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{0} ({1})"); //$NON-NLS-1$
			parser.setEditorPattern("{0} ({1})"); //$NON-NLS-1$
			parser.setEditPattern("{0} ({1})"); //$NON-NLS-1$
			fuzzyConstraintNameTNorm_5008Parser = parser;
		}
		return fuzzyConstraintNameTNorm_5008Parser;
	}

	/**
	* @generated
	*/
	private IParser fuzzyRelationTFRelationExpression1Expression2Expression3Delta_5011Parser;

	/**
	* @generated
	*/
	private IParser getFuzzyRelationTFRelationExpression1Expression2Expression3Delta_5011Parser() {
		if (fuzzyRelationTFRelationExpression1Expression2Expression3Delta_5011Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation_TFRelation(),
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation_Expression1(),
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation_Expression2(),
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation_Expression3(),
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getFuzzyRelation_Delta() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			parser.setViewPattern("{1} {0} {2} {0} {3} {4}"); //$NON-NLS-1$
			parser.setEditorPattern("{1} {0} {2} {0} {3} {4}"); //$NON-NLS-1$
			parser.setEditPattern("{1} {0} {2} {0} {3} {4}"); //$NON-NLS-1$
			fuzzyRelationTFRelationExpression1Expression2Expression3Delta_5011Parser = parser;
		}
		return fuzzyRelationTFRelationExpression1Expression2Expression3Delta_5011Parser;
	}

	/**
	* @generated
	*/
	private IParser varTransformationName_5009Parser;

	/**
	* @generated
	*/
	private IParser getVarTransformationName_5009Parser() {
		if (varTransformationName_5009Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVarTransformation_Name() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			varTransformationName_5009Parser = parser;
		}
		return varTransformationName_5009Parser;
	}

	/**
	* @generated
	*/
	private IParser varUpdateExpression_5010Parser;

	/**
	* @generated
	*/
	private IParser getVarUpdateExpression_5010Parser() {
		if (varUpdateExpression_5010Parser == null) {
			EAttribute[] features = new EAttribute[] {
					fuzzyAutomaton.FuzzyAutomatonPackage.eINSTANCE.getVarUpdate_Expression() };
			fuzzyAutomaton.diagram.parsers.MessageFormatParser parser = new fuzzyAutomaton.diagram.parsers.MessageFormatParser(
					features);
			varUpdateExpression_5010Parser = parser;
		}
		return varUpdateExpression_5010Parser;
	}

	/**
	* @generated
	*/
	protected IParser getParser(int visualID) {
		switch (visualID) {
		case fuzzyAutomaton.diagram.edit.parts.VariableSetNameEditPart.VISUAL_ID:
			return getVariableSetName_5002Parser();
		case fuzzyAutomaton.diagram.edit.parts.TransitionFeatureNameEditPart.VISUAL_ID:
			return getTransitionFeatureName_5005Parser();
		case fuzzyAutomaton.diagram.edit.parts.VariableNameEditPart.VISUAL_ID:
			return getVariableName_5003Parser();
		case fuzzyAutomaton.diagram.edit.parts.InputNameEditPart.VISUAL_ID:
			return getInputName_5006Parser();
		case fuzzyAutomaton.diagram.edit.parts.OutputNameEditPart.VISUAL_ID:
			return getOutputName_5007Parser();
		case fuzzyAutomaton.diagram.edit.parts.FuzzyConstraintNameTNormEditPart.VISUAL_ID:
			return getFuzzyConstraintNameTNorm_5008Parser();
		case fuzzyAutomaton.diagram.edit.parts.FuzzyRelationTFRelationExpression1ExEditPart.VISUAL_ID:
			return getFuzzyRelationTFRelationExpression1Expression2Expression3Delta_5011Parser();
		case fuzzyAutomaton.diagram.edit.parts.VarTransformationNameEditPart.VISUAL_ID:
			return getVarTransformationName_5009Parser();
		case fuzzyAutomaton.diagram.edit.parts.VarUpdateExpressionEditPart.VISUAL_ID:
			return getVarUpdateExpression_5010Parser();
		}
		return null;
	}

	/**
	* Utility method that consults ParserService
	* @generated
	*/
	public static IParser getParser(IElementType type, EObject object, String parserHint) {
		return ParserService.getInstance().getParser(new HintAdapter(type, object, parserHint));
	}

	/**
	* @generated
	*/
	public IParser getParser(IAdaptable hint) {
		String vid = (String) hint.getAdapter(String.class);
		if (vid != null) {
			return getParser(fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(vid));
		}
		View view = (View) hint.getAdapter(View.class);
		if (view != null) {
			return getParser(fuzzyAutomaton.diagram.part.FuzzyAutomatonVisualIDRegistry.getVisualID(view));
		}
		return null;
	}

	/**
	* @generated
	*/
	public boolean provides(IOperation operation) {
		if (operation instanceof GetParserOperation) {
			IAdaptable hint = ((GetParserOperation) operation).getHint();
			if (fuzzyAutomaton.diagram.providers.FuzzyAutomatonElementTypes.getElement(hint) == null) {
				return false;
			}
			return getParser(hint) != null;
		}
		return false;
	}

	/**
	* @generated
	*/
	private static class HintAdapter extends ParserHintAdapter {

		/**
		* @generated
		*/
		private final IElementType elementType;

		/**
		* @generated
		*/
		public HintAdapter(IElementType type, EObject object, String parserHint) {
			super(object, parserHint);
			assert type != null;
			elementType = type;
		}

		/**
		* @generated
		*/
		public Object getAdapter(Class adapter) {
			if (IElementType.class.equals(adapter)) {
				return elementType;
			}
			return super.getAdapter(adapter);
		}
	}

}
