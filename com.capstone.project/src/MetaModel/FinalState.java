/**
 */
package MetaModel;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Final State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModel.FinalState#getPrev <em>Prev</em>}</li>
 * </ul>
 *
 * @see MetaModel.MetaModelPackage#getFinalState()
 * @model
 * @generated
 */
public interface FinalState extends State {

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
	 * @see MetaModel.MetaModelPackage#getFinalState_Prev()
	 * @model required="true"
	 * @generated
	 */
	EList<State> getPrev();
} // FinalState
