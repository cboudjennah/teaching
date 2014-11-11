/**
 */
package tdse3.tdse3;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ped Light</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link tdse3.tdse3.PedLight#getColors <em>Colors</em>}</li>
 * </ul>
 * </p>
 *
 * @see tdse3.tdse3.Tdse3Package#getPedLight()
 * @model
 * @generated
 */
public interface PedLight extends EObject {
	/**
	 * Returns the value of the '<em><b>Colors</b></em>' attribute list.
	 * The list contents are of type {@link tdse3.tdse3.colors}.
	 * The literals are from the enumeration {@link tdse3.tdse3.colors}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colors</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colors</em>' attribute list.
	 * @see tdse3.tdse3.colors
	 * @see tdse3.tdse3.Tdse3Package#getPedLight_Colors()
	 * @model upper="2"
	 * @generated
	 */
	EList<colors> getColors();

} // PedLight
