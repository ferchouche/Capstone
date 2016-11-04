/**
 */
package MetaModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link MetaModel.Path#getName <em>Name</em>}</li>
 *   <li>{@link MetaModel.Path#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link MetaModel.Path#getStates <em>States</em>}</li>
 *   <li>{@link MetaModel.Path#getInitialArchitecture <em>Initial Architecture</em>}</li>
 *   <li>{@link MetaModel.Path#getFinalArchitecture <em>Final Architecture</em>}</li>
 * </ul>
 *
 * @see MetaModel.MetaModelPackage#getPath()
 * @model
 * @generated
 */
public interface Path extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see MetaModel.MetaModelPackage#getPath_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link MetaModel.Path#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link MetaModel.Transition}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see MetaModel.MetaModelPackage#getPath_Transitions()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Transition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link MetaModel.State}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see MetaModel.MetaModelPackage#getPath_States()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<State> getStates();

	/**
	 * Returns the value of the '<em><b>Initial Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Architecture</em>' reference.
	 * @see #setInitialArchitecture(InitialState)
	 * @see MetaModel.MetaModelPackage#getPath_InitialArchitecture()
	 * @model required="true"
	 * @generated
	 */
	InitialState getInitialArchitecture();

	/**
	 * Sets the value of the '{@link MetaModel.Path#getInitialArchitecture <em>Initial Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Architecture</em>' reference.
	 * @see #getInitialArchitecture()
	 * @generated
	 */
	void setInitialArchitecture(InitialState value);

	/**
	 * Returns the value of the '<em><b>Final Architecture</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Final Architecture</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Final Architecture</em>' reference.
	 * @see #setFinalArchitecture(FinalState)
	 * @see MetaModel.MetaModelPackage#getPath_FinalArchitecture()
	 * @model required="true"
	 * @generated
	 */
	FinalState getFinalArchitecture();

	/**
	 * Sets the value of the '{@link MetaModel.Path#getFinalArchitecture <em>Final Architecture</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Final Architecture</em>' reference.
	 * @see #getFinalArchitecture()
	 * @generated
	 */
	void setFinalArchitecture(FinalState value);

} // Path
