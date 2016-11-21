
package ws.lameduck;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>flightInformation complex type\u7684 Java \u7c7b\u3002
 * 
 * <p>\u4ee5\u4e0b\u6a21\u5f0f\u7247\u6bb5\u6307\u5b9a\u5305\u542b\u5728\u6b64\u7c7b\u4e2d\u7684\u9884\u671f\u5185\u5bb9\u3002
 * 
 * <pre>
 * &lt;complexType name="flightInformation">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="bookingNo" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         &lt;element name="airlineReservationServiceName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="flight" type="{http://lameduck.ws}flight"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "flightInformation", propOrder = {
    "bookingNo",
    "price",
    "airlineReservationServiceName",
    "flight"
})
public class FlightInformation {

    @XmlElement(required = true)
    protected String bookingNo;
    protected double price;
    @XmlElement(required = true)
    protected String airlineReservationServiceName;
    @XmlElement(required = true)
    protected Flight flight;

    /**
     * \u83b7\u53d6bookingNo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingNo() {
        return bookingNo;
    }

    /**
     * \u8bbe\u7f6ebookingNo\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingNo(String value) {
        this.bookingNo = value;
    }

    /**
     * \u83b7\u53d6price\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public double getPrice() {
        return price;
    }

    /**
     * \u8bbe\u7f6eprice\u5c5e\u6027\u7684\u503c\u3002
     * 
     */
    public void setPrice(double value) {
        this.price = value;
    }

    /**
     * \u83b7\u53d6airlineReservationServiceName\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirlineReservationServiceName() {
        return airlineReservationServiceName;
    }

    /**
     * \u8bbe\u7f6eairlineReservationServiceName\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirlineReservationServiceName(String value) {
        this.airlineReservationServiceName = value;
    }

    /**
     * \u83b7\u53d6flight\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @return
     *     possible object is
     *     {@link Flight }
     *     
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * \u8bbe\u7f6eflight\u5c5e\u6027\u7684\u503c\u3002
     * 
     * @param value
     *     allowed object is
     *     {@link Flight }
     *     
     */
    public void setFlight(Flight value) {
        this.flight = value;
    }

}
