
package ws.lameduck;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws.lameduck package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _BookFlightResponse_QNAME = new QName("http://lameduck.ws", "bookFlightResponse");
    private final static QName _CancelFlightResponse_QNAME = new QName("http://lameduck.ws", "cancelFlightResponse");
    private final static QName _FaultElement_QNAME = new QName("http://lameduck.ws", "faultElement");
    private final static QName _GetFlightsResponse_QNAME = new QName("http://lameduck.ws", "getFlightsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws.lameduck
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link BookFlighRequest }
     * 
     */
    public BookFlighRequest createBookFlighRequest() {
        return new BookFlighRequest();
    }

    /**
     * Create an instance of {@link CreditCardInfoType }
     * 
     */
    public CreditCardInfoType createCreditCardInfoType() {
        return new CreditCardInfoType();
    }

    /**
     * Create an instance of {@link GetFlightsRequest }
     * 
     */
    public GetFlightsRequest createGetFlightsRequest() {
        return new GetFlightsRequest();
    }

    /**
     * Create an instance of {@link FlightInformationArray }
     * 
     */
    public FlightInformationArray createFlightInformationArray() {
        return new FlightInformationArray();
    }

    /**
     * Create an instance of {@link CancelFlightRequest }
     * 
     */
    public CancelFlightRequest createCancelFlightRequest() {
        return new CancelFlightRequest();
    }

    /**
     * Create an instance of {@link FlightInformation }
     * 
     */
    public FlightInformation createFlightInformation() {
        return new FlightInformation();
    }

    /**
     * Create an instance of {@link Flight }
     * 
     */
    public Flight createFlight() {
        return new Flight();
    }

    /**
     * Create an instance of {@link Address }
     * 
     */
    public Address createAddress() {
        return new Address();
    }

    /**
     * Create an instance of {@link AcountType }
     * 
     */
    public AcountType createAcountType() {
        return new AcountType();
    }

    /**
     * Create an instance of {@link Airport }
     * 
     */
    public Airport createAirport() {
        return new Airport();
    }

    /**
     * Create an instance of {@link ExpirationDate }
     * 
     */
    public ExpirationDate createExpirationDate() {
        return new ExpirationDate();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lameduck.ws", name = "bookFlightResponse")
    public JAXBElement<Boolean> createBookFlightResponse(Boolean value) {
        return new JAXBElement<Boolean>(_BookFlightResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lameduck.ws", name = "cancelFlightResponse")
    public JAXBElement<Boolean> createCancelFlightResponse(Boolean value) {
        return new JAXBElement<Boolean>(_CancelFlightResponse_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lameduck.ws", name = "faultElement")
    public JAXBElement<String> createFaultElement(String value) {
        return new JAXBElement<String>(_FaultElement_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FlightInformationArray }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://lameduck.ws", name = "getFlightsResponse")
    public JAXBElement<FlightInformationArray> createGetFlightsResponse(FlightInformationArray value) {
        return new JAXBElement<FlightInformationArray>(_GetFlightsResponse_QNAME, FlightInformationArray.class, null, value);
    }

}
