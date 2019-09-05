/*
 * 
 */
package fuzzyAutomaton.diagram.edit.commands;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmf.runtime.common.core.command.CommandResult;
import org.eclipse.gmf.runtime.emf.type.core.commands.EditElementCommand;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientReferenceRelationshipRequest;
import org.eclipse.gmf.runtime.emf.type.core.requests.ReorientRelationshipRequest;

/**
 * @generated
 */
public class TransitionFeatureFeatureToTransitionReorientCommand extends EditElementCommand {

	/**
	* @generated
	*/
	private final int reorientDirection;

	/**
	* @generated
	*/
	private final EObject referenceOwner;

	/**
	* @generated
	*/
	private final EObject oldEnd;

	/**
	* @generated
	*/
	private final EObject newEnd;

	/**
	* @generated
	*/
	public TransitionFeatureFeatureToTransitionReorientCommand(ReorientReferenceRelationshipRequest request) {
		super(request.getLabel(), null, request);
		reorientDirection = request.getDirection();
		referenceOwner = request.getReferenceOwner();
		oldEnd = request.getOldRelationshipEnd();
		newEnd = request.getNewRelationshipEnd();
	}

	/**
	* @generated
	*/
	public boolean canExecute() {
		if (false == referenceOwner instanceof fuzzyAutomaton.TransitionFeature) {
			return false;
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return canReorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return canReorientTarget();
		}
		return false;
	}

	/**
	* @generated
	*/
	protected boolean canReorientSource() {
		if (!(oldEnd instanceof fuzzyAutomaton.Transition && newEnd instanceof fuzzyAutomaton.TransitionFeature)) {
			return false;
		}
		return fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransitionFeatureFeatureToTransition_4003(getNewSource(), getOldTarget());
	}

	/**
	* @generated
	*/
	protected boolean canReorientTarget() {
		if (!(oldEnd instanceof fuzzyAutomaton.Transition && newEnd instanceof fuzzyAutomaton.Transition)) {
			return false;
		}
		return fuzzyAutomaton.diagram.edit.policies.FuzzyAutomatonBaseItemSemanticEditPolicy.getLinkConstraints()
				.canExistTransitionFeatureFeatureToTransition_4003(getOldSource(), getNewTarget());
	}

	/**
	* @generated
	*/
	protected CommandResult doExecuteWithResult(IProgressMonitor monitor, IAdaptable info) throws ExecutionException {
		if (!canExecute()) {
			throw new ExecutionException("Invalid arguments in reorient link command"); //$NON-NLS-1$
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_SOURCE) {
			return reorientSource();
		}
		if (reorientDirection == ReorientRelationshipRequest.REORIENT_TARGET) {
			return reorientTarget();
		}
		throw new IllegalStateException();
	}

	/**
	* @generated
	*/
	protected CommandResult reorientSource() throws ExecutionException {
		getOldSource().getFeatureToTransition().remove(getOldTarget());
		getNewSource().getFeatureToTransition().add(getOldTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected CommandResult reorientTarget() throws ExecutionException {
		getOldSource().getFeatureToTransition().remove(getOldTarget());
		getOldSource().getFeatureToTransition().add(getNewTarget());
		return CommandResult.newOKCommandResult(referenceOwner);
	}

	/**
	* @generated
	*/
	protected fuzzyAutomaton.TransitionFeature getOldSource() {
		return (fuzzyAutomaton.TransitionFeature) referenceOwner;
	}

	/**
	* @generated
	*/
	protected fuzzyAutomaton.TransitionFeature getNewSource() {
		return (fuzzyAutomaton.TransitionFeature) newEnd;
	}

	/**
	* @generated
	*/
	protected fuzzyAutomaton.Transition getOldTarget() {
		return (fuzzyAutomaton.Transition) oldEnd;
	}

	/**
	* @generated
	*/
	protected fuzzyAutomaton.Transition getNewTarget() {
		return (fuzzyAutomaton.Transition) newEnd;
	}
}
