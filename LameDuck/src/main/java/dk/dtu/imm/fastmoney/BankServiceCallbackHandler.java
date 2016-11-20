/**
 * BankServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package dk.dtu.imm.fastmoney;


/**
 *  BankServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class BankServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public BankServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public BankServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for chargeCreditCard method
     * override this method for handling normal response from chargeCreditCard operation
     */
    public void receiveResultchargeCreditCard(
        dk.dtu.imm.fastmoney.BankServiceStub.ChargeCreditCardResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from chargeCreditCard operation
     */
    public void receiveErrorchargeCreditCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for refundCreditCard method
     * override this method for handling normal response from refundCreditCard operation
     */
    public void receiveResultrefundCreditCard(
        dk.dtu.imm.fastmoney.BankServiceStub.RefundCreditCardResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from refundCreditCard operation
     */
    public void receiveErrorrefundCreditCard(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for validateCreditCard method
     * override this method for handling normal response from validateCreditCard operation
     */
    public void receiveResultvalidateCreditCard(
        dk.dtu.imm.fastmoney.BankServiceStub.ValidateCreditCardResponseE result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from validateCreditCard operation
     */
    public void receiveErrorvalidateCreditCard(java.lang.Exception e) {
    }
}
