
package ws.lameduck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>flight complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="flight">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="departingFrom" type="{http://lameduck.ws}airport"/>
 *         &lt;element name="arrivingAt" type="{http://lameduck.ws}airport"/>
 *         &lt;element name="airline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="departureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="arrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="flightNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="noOfPassengers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="noOfRegisteredPassengers" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flight", propOrder = {
    "departingFrom",
    "arrivingAt",
    "airline",
    "departureDateTime",
    "arrivalDateTime",
    "flightNumber",
    "noOfPassengers",
    "noOfRegisteredPassengers"
})
public class Flight {

    @XmlElement(required = true)
    protected Airport departingFrom;
    @XmlElement(required = true)
    protected Airport arrivingAt;
    @XmlElement(required = true)
    protected String airline;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar departureDateTime;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar arrivalDateTime;
    @XmlElement(required = true)
    protected String flightNumber;
    protected int noOfPassengers;
    protected int noOfRegisteredPassengers;

    /**
     * \u83b7\u53d6departingFrom\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getDepartingFrom() {
        return departingFrom;
    }

    /**
     * \u8bbe\u7f6edepartingFrom\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setDepartingFrom(Airport value) {
        this.departingFrom = value;
    }

    /**
     * \u83b7\u53d6arrivingAt\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link Airport }
     *     
     */
    public Airport getArrivingAt() {
        return arrivingAt;
    }

    /**
     * \u8bbe\u7f6earrivingAt\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link Airport }
     *     
     */
    public void setArrivingAt(Airport value) {
        this.arrivingAt = value;
    }

    /**
     * \u83b7\u53d6airline\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirline() {
        return airline;
    }

    /**
     * \u8bbe\u7f6eairline\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirline(String value) {
        this.airline = value;
    }

    /**
     * \u83b7\u53d6departureDateTime\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDepartureDateTime() {
        return departureDateTime;
    }

    /**
     * \u8bbe\u7f6edepartureDateTime\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDepartureDateTime(XMLGregorianCalendar value) {
        this.departureDateTime = value;
    }

    /**
     * \u83b7\u53d6arrivalDateTime\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getArrivalDateTime() {
        return arrivalDateTime;
    }

    /**
     * \u8bbe\u7f6earrivalDateTime\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setArrivalDateTime(XMLGregorianCalendar value) {
        this.arrivalDateTime = value;
    }

    /**
     * \u83b7\u53d6flightNumber\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * \u8bbe\u7f6eflightNumber\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * \u83b7\u53d6noOfPassengers\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public int getNoOfPassengers() {
        return noOfPassengers;
    }

    /**
     * \u8bbe\u7f6enoOfPassengers\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setNoOfPassengers(int value) {
        this.noOfPassengers = value;
    }

    /**
     * \u83b7\u53d6noOfRegisteredPassengers\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public int getNoOfRegisteredPassengers() {
        return noOfRegisteredPassengers;
    }

    /**
     * \u8bbe\u7f6enoOfRegisteredPassengers\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setNoOfRegisteredPassengers(int value) {
        this.noOfRegisteredPassengers = value;
    }

}
