package src;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import com.google.common.collect.Iterables;
import com.google.common.collect.Lists;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.List;

import ws.lameduck.LameduckServiceStub;
import ws.lameduck.LameduckServiceStub.*;

import javax.annotation.Nullable;

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

    public Database() throws ParseException {
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
        Calendar departureDateTime = Calendar.getInstance();
        departureDateTime.setTime(DateUtils.parseDate("2016-11-12 16:00", "yyyy-MM-dd hh:mm"));
        flightSASDK303.setDepartureDateTime(departureDateTime);
        Calendar arrivalDateTime = Calendar.getInstance();
        arrivalDateTime.setTime(DateUtils.parseDate("2016-11-12 17:30", "yyyy-MM-dd hh:mm"));
        flightSASDK303.setArrivalDateTime(arrivalDateTime);

       /*
      create flights hashmap
       */

        flightList = new ArrayList<Flight>();
        flightList.add(flightSASDK303);
    }
    public Collection<Flight> getFlight(final String departureAirportName, final String arrivalAirportName, final Calendar departureDateTime){

        return Collections2.filter(flightList, new Predicate<Flight>() {
            public boolean apply(@Nullable Flight flight) {
                return flight.getDepartingFrom().getName().equals(departureAirportName)
                        && flight.getArrivingAt().getName().equals(arrivalAirportName)
                        && flight.getDepartureDateTime().equals(departureDateTime);
            }
        });
    }
}
