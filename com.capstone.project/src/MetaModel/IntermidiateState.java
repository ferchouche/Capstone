/**
 */
package MetaModel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Intermidiate State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModel.IntermidiateState#getNext <em>Next</em>}</li>
 *   <li>{@link MetaModel.IntermidiateState#getPrev <em>Prev</em>}</li>
 * </ul>
 *
 * @see MetaModel.MetaModelPackage#getIntermidiateState()
 * @model
 * @generated
 */
public interface IntermidiateState extends State {

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
	 * @see MetaModel.MetaModelPackage#getIntermidiateState_Next()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getNext();

	/**
	 * Returns the value of the '<em><b>Prev</b></em>' reference list.
	 * The list contents are of type {@link MetaModel.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prev</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prev</em>' reference list.
	 * @see MetaModel.MetaModelPackage#getIntermidiateState_Prev()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getPrev();
} // IntermidiateState
