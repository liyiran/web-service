package database;

import com.google.common.base.Predicate;
import com.google.common.collect.Collections2;
import org.apache.commons.lang3.time.DateUtils;
import ws.lameduck.LameduckServiceStub;


import javax.annotation.Nullable;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by zhenghuayu on 2016/11/19.
 */
public class Database {
    private final LameduckServiceStub.Airport airportCPH;
    private final LameduckServiceStub.Airport airportCDG;
    private final LameduckServiceStub.Address addressCPH;
    private final LameduckServiceStub.Address addressCDG;
    private final LameduckServiceStub.Flight flightSASDK303;

    private ArrayList<LameduckServiceStub.Flight> flightList;

    public Database() throws ParseException {
         /*
        new Airport
        */

        airportCPH = new LameduckServiceStub.Airport();
        airportCPH.setName("CPH LUFTHAVN");

        addressCPH = new LameduckServiceStub.Address();
        addressCPH.setCity("Copenhagen");
        addressCPH.setCountry("Denmark");
        addressCPH.setState("Greater Copenhagen");
        addressCPH.setStreet("Kartsup 1");
        addressCPH.setZip("2200");

        airportCPH.setAddress(addressCPH);

        /*
        new Airport
        */

        airportCDG = new LameduckServiceStub.Airport();
        airportCDG.setName("Paris charle de gualle");

        addressCDG = new LameduckServiceStub.Address();
        addressCDG.setCity("Paris");
        addressCDG.setCountry("France");
        addressCDG.setState("Paris");
        addressCDG.setStreet("Main street");
        addressCDG.setZip("15000");

        airportCDG.setAddress(addressCPH);

        /*

       create flight

       */

        flightSASDK303 = new LameduckServiceStub.Flight();
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

        flightList = new ArrayList<LameduckServiceStub.Flight>();
        flightList.add(flightSASDK303);
    }
    public Collection<LameduckServiceStub.Flight> getFlight(final String departureAirportName, final String arrivalAirportName, final Calendar departureDateTime){

        return Collections2.filter(flightList, new Predicate<LameduckServiceStub.Flight>() {
            public boolean apply(@Nullable LameduckServiceStub.Flight flight) {
                return flight.getDepartingFrom().getName().equals(departureAirportName)
                        && flight.getArrivingAt().getName().equals(arrivalAirportName)
                        && flight.getDepartureDateTime().getTimeInMillis() == departureDateTime.getTimeInMillis();
            }
        });
    }
}
