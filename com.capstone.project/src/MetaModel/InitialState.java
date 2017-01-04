/**
 */
package MetaModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Initial State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModel.InitialState#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see MetaModel.MetaModelPackage#getInitialState()
 * @model
 * @generated
 */
public interface InitialState extends State {
	/**
	 * Returns the value of the '<em><b>Next</b></em>' reference list.
	 * The list contents are of type {@link MetaModel.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference list.
	 * @see MetaModel.MetaModelPackage#getInitialState_Next()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getNext();

} // InitialState
