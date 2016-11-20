/**
 * CancelFlightOperationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package ws.lameduck;

public class CancelFlightOperationFault extends java.lang.Exception {
    private static final long serialVersionUID = 1479585083795L;
    private ws.lameduck.LameduckServiceStub.FaultElement faultMessage;

    public CancelFlightOperationFault() {
        super("CancelFlightOperationFault");
    }

    public CancelFlightOperationFault(java.lang.String s) {
        super(s);
    }

    public CancelFlightOperationFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public CancelFlightOperationFault(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        ws.lameduck.LameduckServiceStub.FaultElement msg) {
        faultMessage = msg;
    }

    public ws.lameduck.LameduckServiceStub.FaultElement getFaultMessage() {
        return faultMessage;
    }
}
