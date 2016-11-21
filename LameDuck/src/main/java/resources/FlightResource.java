/*
 * $Id$
 *
 * Copyright (c) 2015 WorldTicket A/S
 * All rights reserved.
 */
package resources;

import database.Database;
import org.apache.commons.lang3.time.DateUtils;
import ws.lameduck.Flight;
import ws.lameduck.FlightInformationArray;

import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.logging.Logger;

/**
 * @author Yiran Li(Yli))  / WorldTicket A/S
 * @version $Revision$ $Date$ 21/11/2016
 */
@Path("/flight")
@Produces(MediaType.APPLICATION_XML)
public class FlightResource {
    private Database database = null;
    private Logger logger = Logger.getLogger(FlightResource.class.getName());

    public FlightResource() {
        try {
            database = new Database();
        } catch (ParseException e) {
            logger.warning(e.getMessage());
        } catch (DatatypeConfigurationException e) {
            logger.warning(e.getMessage());
        }
    }

    @GET
    @Produces("application/xml")
    public FlightInformationArray getFlights(@QueryParam("from") String from, @QueryParam("to") String to, @QueryParam("departureDateTime") String dateString) throws ParseException {
        FlightInformationArray flightsArray = new FlightInformationArray();

        GregorianCalendar departureDateTime = new GregorianCalendar();
        departureDateTime.setTime(DateUtils.parseDate(dateString, "yyyy-MM-dd hh:mm"));
        Collection<Flight> flightInformationList = database.getFlight(from, to, departureDateTime);
        if (!flightInformationList.isEmpty()) {
            //TODO: we hardcode the flight information because it is wrong to construct it on the fly. It should be stored in the database
            flightsArray.getFlightinfo().add(database.getFlightInformation());
            return flightsArray;
        } else {
            throw new NotFoundException();
        }

    }
}
