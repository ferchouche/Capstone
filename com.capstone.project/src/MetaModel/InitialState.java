/**
 */
package MetaModel;


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
	 * Returns the value of the '<em><b>Next</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Next</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' reference.
	 * @see #setNext(State)
	 * @see MetaModel.MetaModelPackage#getInitialState_Next()
	 * @model required="true"
	 * @generated
	 */
	State getNext();

	/**
	 * Sets the value of the '{@link MetaModel.InitialState#getNext <em>Next</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(State value);
} // InitialState
