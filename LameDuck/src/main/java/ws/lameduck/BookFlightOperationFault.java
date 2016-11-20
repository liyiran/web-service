/**
 * BookFlightOperationFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package ws.lameduck;

public class BookFlightOperationFault extends java.lang.Exception {
    private static final long serialVersionUID = 1479648098521L;
    private ws.lameduck.LameduckServiceStub.FaultElement faultMessage;

    public BookFlightOperationFault() {
        super("BookFlightOperationFault");
    }

    public BookFlightOperationFault(java.lang.String s) {
        super(s);
    }

    public BookFlightOperationFault(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public BookFlightOperationFault(java.lang.Throwable cause) {
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
