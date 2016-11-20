/**
 * LameduckServiceCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package ws.lameduck;


/**
 *  LameduckServiceCallbackHandler Callback class, Users can extend this class and implement
 *  their own receiveResult and receiveError methods.
 */
public abstract class LameduckServiceCallbackHandler {
    protected Object clientData;

    /**
     * User can pass in any object that needs to be accessed once the NonBlocking
     * Web service call is finished and appropriate method of this CallBack is called.
     * @param clientData Object mechanism by which the user can pass in user data
     * that will be avilable at the time this callback is called.
     */
    public LameduckServiceCallbackHandler(Object clientData) {
        this.clientData = clientData;
    }

    /**
     * Please use this constructor if you don't want to set any clientData
     */
    public LameduckServiceCallbackHandler() {
        this.clientData = null;
    }

    /**
     * Get the client data
     */
    public Object getClientData() {
        return clientData;
    }

    /**
     * auto generated Axis2 call back method for cancelFlightOperation method
     * override this method for handling normal response from cancelFlightOperation operation
     */
    public void receiveResultcancelFlightOperation(
        ws.lameduck.LameduckServiceStub.CancelFlightResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from cancelFlightOperation operation
     */
    public void receiveErrorcancelFlightOperation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for getFlightsOperation method
     * override this method for handling normal response from getFlightsOperation operation
     */
    public void receiveResultgetFlightsOperation(
        ws.lameduck.LameduckServiceStub.GetFlightsResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from getFlightsOperation operation
     */
    public void receiveErrorgetFlightsOperation(java.lang.Exception e) {
    }

    /**
     * auto generated Axis2 call back method for bookFlightOperation method
     * override this method for handling normal response from bookFlightOperation operation
     */
    public void receiveResultbookFlightOperation(
        ws.lameduck.LameduckServiceStub.BookFlightResponse result) {
    }

    /**
     * auto generated Axis2 Error handler
     * override this method for handling error response from bookFlightOperation operation
     */
    public void receiveErrorbookFlightOperation(java.lang.Exception e) {
    }
}
