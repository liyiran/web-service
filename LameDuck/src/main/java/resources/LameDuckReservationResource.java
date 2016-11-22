package resources;



import database.Database;
import dk.dtu.imm.fastmoney.BankService;
import dk.dtu.imm.fastmoney.CreditCardFaultMessage;
import dk.dtu.imm.fastmoney.types.AccountType;
import dk.dtu.imm.fastmoney.types.CreditCardInfoType;
import ws.lameduck.BookFlighRequest;
import ws.lameduck.CancelFlightRequest;
import ws.lameduck.FlightInformation;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.xml.datatype.DatatypeConfigurationException;
import java.text.ParseException;
import java.util.logging.Logger;

/**
 * Created by liyiran on 2016/11/19.
 */
@Path("/lame_duck/reservation")
public class LameDuckReservationResource {
    private BankService bankServiceStub = new BankService();
    private Database database = null;
    private Logger logger = Logger.getLogger(LameDuckReservationResource.class.getName());
    public LameDuckReservationResource(){
        try {
            database = new Database();
        } catch (ParseException e) {
            logger.warning(e.getMessage());
        } catch (DatatypeConfigurationException e) {
            logger.warning(e.getMessage());
        }
    }
    @PUT
    @Path("{bookingNumber}")
    @Consumes("application/xml")
    @Produces("application/json")
    //TODO: 2016/11/19 spelling error here
    public boolean bookFlight(@PathParam("bookingNumber") String bookingNumber, BookFlighRequest request) {
        //TODO: check if there is a booking with this booking number
        boolean isSuccess;
        FlightInformation flightInformation = database.getFlightInformation();

        CreditCardInfoType creditCardInfo = new CreditCardInfoType();
        CreditCardInfoType.ExpirationDate expirationDate = new CreditCardInfoType.ExpirationDate();
        expirationDate.setMonth(request.getCreditCardInfo().getExpirationDate().getMonth());
        expirationDate.setYear(request.getCreditCardInfo().getExpirationDate().getYear());
        creditCardInfo.setExpirationDate(expirationDate);
        creditCardInfo.setName(request.getCreditCardInfo().getName());
        creditCardInfo.setNumber(request.getCreditCardInfo().getNumber());
        creditCardInfo.setExpirationDate(expirationDate);
        try{
            if (validateCreditCard(9, creditCardInfo, new Double(flightInformation.getPrice()).intValue())) {
                AccountType account = new AccountType();
                account.setName("CheapBird");
                account.setNumber("50208813");
                isSuccess = chargeCreditCard(9, creditCardInfo, 100, account);
                database.addPaidReservation(request.getBookingNumber(), account);
                return isSuccess;
            } else {
                return false;
            }
        }catch (CreditCardFaultMessage e){
            return false;
        }
    }

    @DELETE
    @Path("{bookingNumber}")
    @Consumes("application/xml")
    @Produces("application/json")
    public boolean cancelFlight(@PathParam("bookingNumber") String bookingNumber, CancelFlightRequest request) {
        boolean isSuccess = false ;
        try {
            if(database.getPaidReseration(bookingNumber) == null) {
                return false;
            }
            dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo = new dk.dtu.imm.fastmoney.types.CreditCardInfoType();
            CreditCardInfoType.ExpirationDate expirationDate = new  CreditCardInfoType.ExpirationDate();
            expirationDate.setMonth(request.getCreditCardInfo().getExpirationDate().getMonth());
            expirationDate.setYear(request.getCreditCardInfo().getExpirationDate().getYear());
            creditCardInfo.setExpirationDate(expirationDate);
            creditCardInfo.setName(request.getCreditCardInfo().getName());
            creditCardInfo.setNumber(request.getCreditCardInfo().getNumber());
            isSuccess = refundCreditCard(9,creditCardInfo, (int) request.getPriceOfFlight(),database.getPaidReseration(request.getBookingNumber()));

        } catch (CreditCardFaultMessage ex) {
            logger.warning(ex.getMessage());
        }
        return isSuccess ;
    }

    private boolean chargeCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dk.dtu.imm.fastmoney.BankPortType port = bankServiceStub.getBankPort();
        return port.chargeCreditCard(group, creditCardInfo, amount, account);
    }

    private boolean refundCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dk.dtu.imm.fastmoney.BankPortType port = bankServiceStub.getBankPort();
        return port.refundCreditCard(group, creditCardInfo, amount, account);
    }
    //TODO: Strange method. the amount should be double why it int?
    private boolean validateCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount) throws CreditCardFaultMessage {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        dk.dtu.imm.fastmoney.BankPortType port = bankServiceStub.getBankPort();
        return port.validateCreditCard(group, creditCardInfo, amount);
    }
}
