/**
 */
package fuzzyAutomaton.provider;


import fuzzyAutomaton.FuzzyAutomaton;
import fuzzyAutomaton.FuzzyAutomatonFactory;
import fuzzyAutomaton.FuzzyAutomatonPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link fuzzyAutomaton.FuzzyAutomaton} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FuzzyAutomatonItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuzzyAutomatonItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNamePropertyDescriptor(object);
			addTNormPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzyAutomaton_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzyAutomaton_name_feature", "_UI_FuzzyAutomaton_type"),
				 FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the TNorm feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTNormPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FuzzyAutomaton_tNorm_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FuzzyAutomaton_tNorm_feature", "_UI_FuzzyAutomaton_type"),
				 FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__TNORM,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__STATES);
			childrenFeatures.add(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__TRANSITIONS);
			childrenFeatures.add(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__VARIABLE_SET);
			childrenFeatures.add(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__TRANSITION_FEATURES);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FuzzyAutomaton.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FuzzyAutomaton"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FuzzyAutomaton)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FuzzyAutomaton_type") :
			getString("_UI_FuzzyAutomaton_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FuzzyAutomaton.class)) {
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__NAME:
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TNORM:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__STATES:
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITIONS:
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__VARIABLE_SET:
			case FuzzyAutomatonPackage.FUZZY_AUTOMATON__TRANSITION_FEATURES:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__STATES,
				 FuzzyAutomatonFactory.eINSTANCE.createState()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__TRANSITIONS,
				 FuzzyAutomatonFactory.eINSTANCE.createTransition()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__VARIABLE_SET,
				 FuzzyAutomatonFactory.eINSTANCE.createVariableSet()));

		newChildDescriptors.add
			(createChildParameter
				(FuzzyAutomatonPackage.Literals.FUZZY_AUTOMATON__TRANSITION_FEATURES,
				 FuzzyAutomatonFactory.eINSTANCE.createTransitionFeature()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return FuzzyAutomatonEditPlugin.INSTANCE;
	}

}
