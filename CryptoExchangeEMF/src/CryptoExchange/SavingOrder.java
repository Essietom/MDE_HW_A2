/**
 */
package CryptoExchange;

import java.util.Date;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Saving Order</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link CryptoExchange.SavingOrder#getAmount <em>Amount</em>}</li>
 *   <li>{@link CryptoExchange.SavingOrder#getMatureDate <em>Mature Date</em>}</li>
 *   <li>{@link CryptoExchange.SavingOrder#getInterest <em>Interest</em>}</li>
 *   <li>{@link CryptoExchange.SavingOrder#getToken <em>Token</em>}</li>
 * </ul>
 *
 * @see CryptoExchange.CryptoExchangePackage#getSavingOrder()
 * @model
 * @generated
 */
public interface SavingOrder extends EObject {
	/**
	 * Returns the value of the '<em><b>Amount</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount</em>' attribute.
	 * @see #setAmount(float)
	 * @see CryptoExchange.CryptoExchangePackage#getSavingOrder_Amount()
	 * @model
	 * @generated
	 */
	float getAmount();

	/**
	 * Sets the value of the '{@link CryptoExchange.SavingOrder#getAmount <em>Amount</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Amount</em>' attribute.
	 * @see #getAmount()
	 * @generated
	 */
	void setAmount(float value);

	/**
	 * Returns the value of the '<em><b>Mature Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mature Date</em>' attribute.
	 * @see #setMatureDate(Date)
	 * @see CryptoExchange.CryptoExchangePackage#getSavingOrder_MatureDate()
	 * @model
	 * @generated
	 */
	Date getMatureDate();

	/**
	 * Sets the value of the '{@link CryptoExchange.SavingOrder#getMatureDate <em>Mature Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mature Date</em>' attribute.
	 * @see #getMatureDate()
	 * @generated
	 */
	void setMatureDate(Date value);

	/**
	 * Returns the value of the '<em><b>Interest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interest</em>' attribute.
	 * @see #setInterest(double)
	 * @see CryptoExchange.CryptoExchangePackage#getSavingOrder_Interest()
	 * @model
	 * @generated
	 */
	double getInterest();

	/**
	 * Sets the value of the '{@link CryptoExchange.SavingOrder#getInterest <em>Interest</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Interest</em>' attribute.
	 * @see #getInterest()
	 * @generated
	 */
	void setInterest(double value);

	/**
	 * Returns the value of the '<em><b>Token</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Token</em>' reference.
	 * @see #setToken(Token)
	 * @see CryptoExchange.CryptoExchangePackage#getSavingOrder_Token()
	 * @model required="true"
	 * @generated
	 */
	Token getToken();

	/**
	 * Sets the value of the '{@link CryptoExchange.SavingOrder#getToken <em>Token</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Token</em>' reference.
	 * @see #getToken()
	 * @generated
	 */
	void setToken(Token value);

} // SavingOrder