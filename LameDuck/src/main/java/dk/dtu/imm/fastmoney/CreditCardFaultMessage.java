/**
 * CreditCardFaultMessage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.4  Built on : Oct 21, 2016 (10:47:34 BST)
 */
package dk.dtu.imm.fastmoney;

public class CreditCardFaultMessage extends java.lang.Exception {
    private static final long serialVersionUID = 1479675123806L;
    private dk.dtu.imm.fastmoney.BankServiceStub.CreditCardFault faultMessage;

    public CreditCardFaultMessage() {
        super("CreditCardFaultMessage");
    }

    public CreditCardFaultMessage(java.lang.String s) {
        super(s);
    }

    public CreditCardFaultMessage(java.lang.String s, java.lang.Throwable ex) {
        super(s, ex);
    }

    public CreditCardFaultMessage(java.lang.Throwable cause) {
        super(cause);
    }

    public void setFaultMessage(
        dk.dtu.imm.fastmoney.BankServiceStub.CreditCardFault msg) {
        faultMessage = msg;
    }

    public dk.dtu.imm.fastmoney.BankServiceStub.CreditCardFault getFaultMessage() {
        return faultMessage;
    }
}
