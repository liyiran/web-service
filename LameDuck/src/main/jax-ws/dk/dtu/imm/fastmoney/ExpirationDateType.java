
package dk.dtu.imm.fastmoney;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>expirationDateType complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="expirationDateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="month" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="year" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "expirationDateType", propOrder = {
    "month",
    "year"
})
public class ExpirationDateType {

    protected int month;
    protected int year;

    /**
     * \u83b7\u53d6month\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public int getMonth() {
        return month;
    }

    /**
     * \u8bbe\u7f6emonth\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setMonth(int value) {
        this.month = value;
    }

    /**
     * \u83b7\u53d6year\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public int getYear() {
        return year;
    }

    /**
     * \u8bbe\u7f6eyear\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setYear(int value) {
        this.year = value;
    }

}
