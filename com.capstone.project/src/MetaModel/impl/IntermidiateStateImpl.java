/**
 */
package MetaModel.impl;

import MetaModel.IntermidiateState;
import MetaModel.MetaModelPackage;
import MetaModel.State;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermidiate State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link MetaModel.impl.IntermidiateStateImpl#getNext <em>Next</em>}</li>
 *   <li>{@link MetaModel.impl.IntermidiateStateImpl#getPrev <em>Prev</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IntermidiateStateImpl extends StateImpl implements IntermidiateState {
	/**
	 * The cached value of the '{@link #getNext() <em>Next</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNext()
	 * @generated
	 * @ordered
	 */
	protected EList<State> next;

	/**
	 * The cached value of the '{@link #getPrev() <em>Prev</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrev()
	 * @generated
	 * @ordered
	 */
	protected EList<State> prev;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermidiateStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaModelPackage.Literals.INTERMIDIATE_STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getNext() {
		if (next == null) {
			next = new EObjectResolvingEList<State>(State.class, this, MetaModelPackage.INTERMIDIATE_STATE__NEXT);
		}
		return next;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<State> getPrev() {
		if (prev == null) {
			prev = new EObjectResolvingEList<State>(State.class, this, MetaModelPackage.INTERMIDIATE_STATE__PREV);
		}
		return prev;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaModelPackage.INTERMIDIATE_STATE__NEXT:
				return getNext();
			case MetaModelPackage.INTERMIDIATE_STATE__PREV:
				return getPrev();
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
			case MetaModelPackage.INTERMIDIATE_STATE__NEXT:
				getNext().clear();
				getNext().addAll((Collection<? extends State>)newValue);
				return;
			case MetaModelPackage.INTERMIDIATE_STATE__PREV:
				getPrev().clear();
				getPrev().addAll((Collection<? extends State>)newValue);
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
			case MetaModelPackage.INTERMIDIATE_STATE__NEXT:
				getNext().clear();
				return;
			case MetaModelPackage.INTERMIDIATE_STATE__PREV:
				getPrev().clear();
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
			case MetaModelPackage.INTERMIDIATE_STATE__NEXT:
				return next != null && !next.isEmpty();
			case MetaModelPackage.INTERMIDIATE_STATE__PREV:
				return prev != null && !prev.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //IntermidiateStateImpl
