import database.Database;
import org.apache.commons.lang3.time.DateUtils;
import org.junit.Assert;
import org.junit.Test;

import ws.lameduck.*;


import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;

/**
 * Created by liyiran on 2016/11/19.
 */
public class DatabaseTest {
    @Test
    public void testDatabase() throws ParseException {
        Calendar departureDateTime = Calendar.getInstance();
        departureDateTime.setTime(DateUtils.parseDate("2016-11-12 16:00", "yyyy-MM-dd hh:mm"));
        Database database = new Database();
        Collection<LameduckServiceStub.Flight> flights = database.getFlight("CPH LUFTHAVN",
                "Paris charle de gualle",
                departureDateTime
        );
        Assert.assertEquals(1, flights.size());
    }
    @Test
    public void testDatabaseWrongAirport() throws ParseException {
        Calendar departureDateTime = Calendar.getInstance();
        departureDateTime.setTime(DateUtils.parseDate("2016-11-12 16:00", "yyyy-MM-dd hh:mm"));
        Database database = new Database();
        Collection<LameduckServiceStub.Flight> flights = database.getFlight("LUFTHAVN",
                "Paris charle de gualle",
                departureDateTime
        );
        Assert.assertEquals(0, flights.size());
    }

    @Test
    public void testDatabaseWrongDateTime() throws ParseException {
        Calendar departureDateTime = Calendar.getInstance();
        departureDateTime.setTime(DateUtils.parseDate("2016-11-13 16:00", "yyyy-MM-dd hh:mm"));
        Database database = new Database();
        Collection<LameduckServiceStub.Flight> flights = database.getFlight("LUFTHAVN",
                "Paris charle de gualle",
                departureDateTime
        );
        Assert.assertEquals(0, flights.size());
    }
}
