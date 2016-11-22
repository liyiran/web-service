
package dk.dtu.imm.fastmoney;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import dk.dtu.imm.fastmoney.types.AccountType;
import dk.dtu.imm.fastmoney.types.CreditCardInfoType;


/**
 * <p>chargeCreditCard complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="chargeCreditCard">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="group" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="creditCardInfo" type="{http://types.fastmoney.imm.dtu.dk}creditCardInfoType"/>
 *         &lt;element name="amount" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="account" type="{http://types.fastmoney.imm.dtu.dk}accountType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "chargeCreditCard", propOrder = {
    "group",
    "creditCardInfo",
    "amount",
    "account"
})
public class ChargeCreditCard {

    protected int group;
    @XmlElement(required = true)
    protected CreditCardInfoType creditCardInfo;
    protected int amount;
    @XmlElement(required = true)
    protected AccountType account;

    /**
     * \u83b7\u53d6group\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public int getGroup() {
        return group;
    }

    /**
     * \u8bbe\u7f6egroup\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setGroup(int value) {
        this.group = value;
    }

    /**
     * \u83b7\u53d6creditCardInfo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link CreditCardInfoType }
     *     
     */
    public CreditCardInfoType getCreditCardInfo() {
        return creditCardInfo;
    }

    /**
     * \u8bbe\u7f6ecreditCardInfo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link CreditCardInfoType }
     *     
     */
    public void setCreditCardInfo(CreditCardInfoType value) {
        this.creditCardInfo = value;
    }

    /**
     * \u83b7\u53d6amount\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public int getAmount() {
        return amount;
    }

    /**
     * \u8bbe\u7f6eamount\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setAmount(int value) {
        this.amount = value;
    }

    /**
     * \u83b7\u53d6account\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link AccountType }
     *     
     */
    public AccountType getAccount() {
        return account;
    }

    /**
     * \u8bbe\u7f6eaccount\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link AccountType }
     *     
     */
    public void setAccount(AccountType value) {
        this.account = value;
    }

}
