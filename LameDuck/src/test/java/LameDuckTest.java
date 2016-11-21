/*
 * $Id$
 *
 * Copyright (c) 2015 WorldTicket A/S
 * All rights reserved.
 */


import static com.jayway.restassured.RestAssured.given;

import io.dropwizard.testing.junit.DropwizardAppRule;
import org.eclipse.jetty.server.Response;
import org.junit.ClassRule;
import org.junit.Test;
import src.Configuration;
import src.LameDuckApplication;

/**
 * @author Yiran Li(Yli))  / WorldTicket A/S
 * @version $Revision$ $Date$ 21/11/2016
 */
public class LameDuckTest {
    @ClassRule
    public static final DropwizardAppRule<Configuration> rule =
            new DropwizardAppRule(LameDuckApplication.class, LameDuckTest.class.getClassLoader().getResource("LameDuck.yml").getPath());
    @Test
    public void testGetFlight() {
        given().queryParam("from", "CPH LUFTHAVN").queryParam("to","Paris charle de gualle").queryParam("departureDateTime", "2016-11-12 16:00")
                .when().get(resourceFlightPath())
                .then().statusCode(Response.SC_OK);
    }
    public void testMakeAndCancelReservation() {

    }
    public void testMakeWrongReservation() {

    }
    public void testCancelNonExistReseration() {

    }

    private static String resourceFlightPath() {
        return String.format("http://localhost:%d/flight/", rule.getLocalPort());
    }
}
