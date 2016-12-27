/**
 */
package MetaModel.impl;

import MetaModel.EvolutionStyle;
import MetaModel.FinalState;
import MetaModel.InitialState;
import MetaModel.MetaModelPackage;
import MetaModel.State;
import MetaModel.Transition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Evolution Style</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getName <em>Name</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getFinalArchitecture <em>Final Architecture</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getStates <em>States</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getInitialArchitecture <em>Initial Architecture</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EvolutionStyleImpl extends MinimalEObjectImpl.Container implements EvolutionStyle {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFinalArchitecture() <em>Final Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FinalState finalArchitecture;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<State> states;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialArchitecture() <em>Initial Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialArchitecture()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialArchitecture;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EvolutionStyleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.EVOLUTION_STYLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState getFinalArchitecture() {
		if (finalArchitecture != null && finalArchitecture.eIsProxy()) {
			InternalEObject oldFinalArchitecture = (InternalEObject)finalArchitecture;
			finalArchitecture = (FinalState)eResolveProxy(oldFinalArchitecture);
			if (finalArchitecture != oldFinalArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE, oldFinalArchitecture, finalArchitecture));
			}
		}
		return finalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState basicGetFinalArchitecture() {
		return finalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalArchitecture(FinalState newFinalArchitecture) {
		FinalState oldFinalArchitecture = finalArchitecture;
		finalArchitecture = newFinalArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE, oldFinalArchitecture, finalArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<State>(State.class, this, MetaModelPackage.EVOLUTION_STYLE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Transition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentEList<Transition>(Transition.class, this, MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState getInitialArchitecture() {
		if (initialArchitecture != null && initialArchitecture.eIsProxy()) {
			InternalEObject oldInitialArchitecture = (InternalEObject)initialArchitecture;
			initialArchitecture = (InitialState)eResolveProxy(oldInitialArchitecture);
			if (initialArchitecture != oldInitialArchitecture) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE, oldInitialArchitecture, initialArchitecture));
			}
		}
		return initialArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InitialState basicGetInitialArchitecture() {
		return initialArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialArchitecture(InitialState newInitialArchitecture) {
		InitialState oldInitialArchitecture = initialArchitecture;
		initialArchitecture = newInitialArchitecture;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE, oldInitialArchitecture, initialArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaModelPackage.EVOLUTION_STYLE__NAME:
				return getName();
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				if (resolve) return getFinalArchitecture();
				return basicGetFinalArchitecture();
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				return getStates();
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				return getTransitions();
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				if (resolve) return getInitialArchitecture();
				return basicGetInitialArchitecture();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MetaModelPackage.EVOLUTION_STYLE__NAME:
				setName((String)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				setFinalArchitecture((FinalState)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends State>)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				setInitialArchitecture((InitialState)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MetaModelPackage.EVOLUTION_STYLE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				setFinalArchitecture((FinalState)null);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				getStates().clear();
				return;
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				getTransitions().clear();
				return;
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				setInitialArchitecture((InitialState)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MetaModelPackage.EVOLUTION_STYLE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				return finalArchitecture != null;
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				return states != null && !states.isEmpty();
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				return initialArchitecture != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //EvolutionStyleImpl
