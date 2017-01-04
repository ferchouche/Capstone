/**
 */
package MetaModel.impl;

import MetaModel.EvolutionStyle;
import MetaModel.FinalState;
import MetaModel.InitialState;
import MetaModel.IntermidiateState;
import MetaModel.MetaModelPackage;
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
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getInitialArchitecture <em>Initial Architecture</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getStates <em>States</em>}</li>
 *   <li>{@link MetaModel.impl.EvolutionStyleImpl#getFinalArchitecture <em>Final Architecture</em>}</li>
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
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<Transition> transitions;

	/**
	 * The cached value of the '{@link #getInitialArchitecture() <em>Initial Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInitialArchitecture()
	 * @generated
	 * @ordered
	 */
	protected InitialState initialArchitecture;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<IntermidiateState> states;

	/**
	 * The cached value of the '{@link #getFinalArchitecture() <em>Final Architecture</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinalArchitecture()
	 * @generated
	 * @ordered
	 */
	protected FinalState finalArchitecture;

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
		return initialArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInitialArchitecture(InitialState newInitialArchitecture, NotificationChain msgs) {
		InitialState oldInitialArchitecture = initialArchitecture;
		initialArchitecture = newInitialArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE, oldInitialArchitecture, newInitialArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInitialArchitecture(InitialState newInitialArchitecture) {
		if (newInitialArchitecture != initialArchitecture) {
			NotificationChain msgs = null;
			if (initialArchitecture != null)
				msgs = ((InternalEObject)initialArchitecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE, null, msgs);
			if (newInitialArchitecture != null)
				msgs = ((InternalEObject)newInitialArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE, null, msgs);
			msgs = basicSetInitialArchitecture(newInitialArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE, newInitialArchitecture, newInitialArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IntermidiateState> getStates() {
		if (states == null) {
			states = new EObjectContainmentEList<IntermidiateState>(IntermidiateState.class, this, MetaModelPackage.EVOLUTION_STYLE__STATES);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalState getFinalArchitecture() {
		return finalArchitecture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFinalArchitecture(FinalState newFinalArchitecture, NotificationChain msgs) {
		FinalState oldFinalArchitecture = finalArchitecture;
		finalArchitecture = newFinalArchitecture;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE, oldFinalArchitecture, newFinalArchitecture);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinalArchitecture(FinalState newFinalArchitecture) {
		if (newFinalArchitecture != finalArchitecture) {
			NotificationChain msgs = null;
			if (finalArchitecture != null)
				msgs = ((InternalEObject)finalArchitecture).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE, null, msgs);
			if (newFinalArchitecture != null)
				msgs = ((InternalEObject)newFinalArchitecture).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE, null, msgs);
			msgs = basicSetFinalArchitecture(newFinalArchitecture, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE, newFinalArchitecture, newFinalArchitecture));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				return basicSetInitialArchitecture(null, msgs);
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				return basicSetFinalArchitecture(null, msgs);
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
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				return getTransitions();
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				return getInitialArchitecture();
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				return getStates();
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				return getFinalArchitecture();
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
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends Transition>)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				setInitialArchitecture((InitialState)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends IntermidiateState>)newValue);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				setFinalArchitecture((FinalState)newValue);
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
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				getTransitions().clear();
				return;
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				setInitialArchitecture((InitialState)null);
				return;
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				getStates().clear();
				return;
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				setFinalArchitecture((FinalState)null);
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
			case MetaModelPackage.EVOLUTION_STYLE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case MetaModelPackage.EVOLUTION_STYLE__INITIAL_ARCHITECTURE:
				return initialArchitecture != null;
			case MetaModelPackage.EVOLUTION_STYLE__STATES:
				return states != null && !states.isEmpty();
			case MetaModelPackage.EVOLUTION_STYLE__FINAL_ARCHITECTURE:
				return finalArchitecture != null;
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
