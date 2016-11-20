package src;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import dk.dtu.imm.fastmoney.BankServiceStub;
import ws.lameduck.LameduckServiceStub;

import javax.ws.rs.*;
import javax.xml.ws.WebServiceRef;

/**
 * Created by liyiran on 2016/11/19.
 */
@Path("/lame_duck/reservation")
public class LameDuckService {
    private BankServiceStub service;
    @POST
    //TODO: 2016/11/19 spelling error here
    public LameduckServiceStub.BookFlightResponse bookFlight(LameduckServiceStub.BookFlighRequest request) {
        //TODO implement this method
//        boolean isSuccess = false;
//        BankServiceStub.CreditCardInfoType creditCardInfo = new BankServiceStub.CreditCardInfoType();
//        BankServiceStub.ExpirationDate_type0 expirationDate = new BankServiceStub.ExpirationDate_type0();
//        expirationDate.setMonth(request.getCreditCardInfo().getExpirationDate().getMonth());
//        expirationDate.setYear(request.getCreditCardInfo().getExpirationDate().getYear());
//        creditCardInfo.setExpirationDate(expirationDate);
//        creditCardInfo.setName(request.getCreditCardInfo().getName());
//        creditCardInfo.setNumber(request.getCreditCardInfo().getNumber());
//
//        if (service.validateCreditCard(9, creditCardInfo, (int) flightinformation.getPrice())) {
//            BankServiceStub.AccountType account = new BankServiceStub.AccountType();
//            account.setName("CheapBird");
//            account.setNumber("50208813");
//            isSuccess = service.chargeCreditCard(9, creditCardInfo, 100, account);
//            map.put(binput.getBookingNumber(), account);
//        }
//
//        creditCardInfo.setExpirationDate(expirationDate);
//
//        return isSuccess;
        throw new NotSupportedException();
    }

    @DELETE
    public LameduckServiceStub.CancelFlightResponse cancelFlight(LameduckServiceStub.CancelFlightRequest request) {
        throw new NotSupportedException();
    }

//    private boolean chargeCreditCard(int group, dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo, int amount, dk.dtu.imm.fastmoney.types.AccountType account) throws CreditCardFaultMessage {
//        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
//        // If the calling of port operations may lead to race condition some synchronization is required.
//        dk.dtu.imm.fastmoney.BankPortType port = service.getBankPort();
//        return port.chargeCreditCard(group, creditCardInfo, amount, account);
//    }
}
