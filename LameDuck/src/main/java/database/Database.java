package database;


import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import dk.dtu.imm.fastmoney.types.AccountType;
import org.apache.commons.lang3.time.DateUtils;
import ws.lameduck.Address;
import ws.lameduck.Airport;
import ws.lameduck.Flight;
import ws.lameduck.FlightInformation;

import javax.annotation.Nullable;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

/**
 * Created by zhenghuayu on 2016/11/19.
 */
public class Database {
    private final Airport airportCPH;
    private final Airport airportCDG;
    private final Address addressCPH;
    private final Address addressCDG;
    private final Flight flightSASDK303;

    private ArrayList<Flight> flightList;

    private Map<String, AccountType> paidReservation = new ConcurrentHashMap<String, AccountType>();

    public Database() throws ParseException, DatatypeConfigurationException {
         /*
        new Airport
        */

        airportCPH = new Airport();
        airportCPH.setName("CPH LUFTHAVN");

        addressCPH = new Address();
        addressCPH.setCity("Copenhagen");
        addressCPH.setCountry("Denmark");
        addressCPH.setState("Greater Copenhagen");
        addressCPH.setStreet("Kartsup 1");
        addressCPH.setZip("2200");

        airportCPH.setAddress(addressCPH);

        /*
        new Airport
        */

        airportCDG = new Airport();
        airportCDG.setName("Paris charle de gualle");

        addressCDG = new Address();
        addressCDG.setCity("Paris");
        addressCDG.setCountry("France");
        addressCDG.setState("Paris");
        addressCDG.setStreet("Main street");
        addressCDG.setZip("15000");

        airportCDG.setAddress(addressCPH);

        /*

       create flight

       */

        flightSASDK303 = new Flight();
        flightSASDK303.setAirline("SAS");
        flightSASDK303.setDepartingFrom(airportCPH);
        flightSASDK303.setArrivingAt(airportCDG);
        flightSASDK303.setFlightNumber("DK303");
        flightSASDK303.setNoOfPassengers(150);
        flightSASDK303.setNoOfRegisteredPassengers(0);
        GregorianCalendar departureDateTime = new GregorianCalendar();
        departureDateTime.setTime(DateUtils.parseDate("2016-11-12 16:00", "yyyy-MM-dd hh:mm"));
        departureDateTime.setTimeZone(java.util.TimeZone.getDefault());
        flightSASDK303.setDepartureDateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(departureDateTime));
        GregorianCalendar arrivalDateTime = new GregorianCalendar();
        arrivalDateTime.setTime(DateUtils.parseDate("2016-11-12 17:30", "yyyy-MM-dd hh:mm"));
        arrivalDateTime.setTimeZone(java.util.TimeZone.getDefault());
        flightSASDK303.setArrivalDateTime(DatatypeFactory.newInstance().newXMLGregorianCalendar(arrivalDateTime));

       /*
      create flights hashmap
       */

        flightList = new ArrayList<Flight>();
        flightList.add(flightSASDK303);
    }

    public Collection<Flight> getFlight(final String departureAirportName, final String arrivalAirportName, final GregorianCalendar departureDateTime) {

        return Collections2.filter(flightList, new Predicate<Flight>() {
            public boolean apply(@Nullable Flight flight) {
                try {
                    XMLGregorianCalendar departureXMLDateTime = DatatypeFactory.newInstance().newXMLGregorianCalendar(departureDateTime);
                    return flight.getDepartingFrom().getName().equals(departureAirportName)
                            && flight.getArrivingAt().getName().equals(arrivalAirportName)
                            && flight.getDepartureDateTime().equals(departureXMLDateTime);
                } catch (DatatypeConfigurationException e) {
                    Logger.getLogger(Database.class.getName()).warning(e.getMessage());
                }
                return false;
            }
        });
    }

    public FlightInformation getFlightInformation() {
        FlightInformation flightInformation = new FlightInformation();
        flightInformation.setAirlineReservationServiceName(flightSASDK303.getAirline());
        flightInformation.setBookingNo("000001");
        flightInformation.setFlight(flightSASDK303);
        flightInformation.setPrice(100.00);
        return flightInformation;
    }

    public void addPaidReservation(String bookingNumber, AccountType accountType) {
        paidReservation.put(bookingNumber, accountType);
    }

    public AccountType getPaidReseration(String bookingNumber){
        return paidReservation.get(bookingNumber);
    }
}
