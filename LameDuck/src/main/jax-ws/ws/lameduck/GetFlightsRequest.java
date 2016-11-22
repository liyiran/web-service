
package ws.lameduck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="fromLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="toLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="dateOfDeparture" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "fromLocation",
    "toLocation",
    "dateOfDeparture"
})
@XmlRootElement(name = "getFlightsRequest")
public class GetFlightsRequest {

    @XmlElement(required = true)
    protected String fromLocation;
    @XmlElement(required = true)
    protected String toLocation;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateOfDeparture;

    /**
     * \u83b7\u53d6fromLocation\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFromLocation() {
        return fromLocation;
    }

    /**
     * \u8bbe\u7f6efromLocation\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFromLocation(String value) {
        this.fromLocation = value;
    }

    /**
     * \u83b7\u53d6toLocation\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getToLocation() {
        return toLocation;
    }

    /**
     * \u8bbe\u7f6etoLocation\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setToLocation(String value) {
        this.toLocation = value;
    }

    /**
     * \u83b7\u53d6dateOfDeparture\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateOfDeparture() {
        return dateOfDeparture;
    }

    /**
     * \u8bbe\u7f6edateOfDeparture\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateOfDeparture(XMLGregorianCalendar value) {
        this.dateOfDeparture = value;
    }

}
