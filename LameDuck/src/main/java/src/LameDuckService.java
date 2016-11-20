package src;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import ws.lameduck.LameduckServiceStub;

import javax.ws.rs.*;

/**
 * Created by liyiran on 2016/11/19.
 */
@Path("/lame_duck/reservation")
public class LameDuckService {
    @POST
    //TODO: 2016/11/19 spelling error here
    public LameduckServiceStub.BookFlightResponse bookFlight(LameduckServiceStub.BookFlighRequest request) {
        //TODO implement this method
        boolean isSuccess = false;
        dk.dtu.imm.fastmoney.types.CreditCardInfoType creditCardInfo = new dk.dtu.imm.fastmoney.types.CreditCardInfoType();
        CreditCardInfoType.ExpirationDate expirationDate = new CreditCardInfoType.ExpirationDate();
        expirationDate.setMonth(binput.getCreditCardInfo().getExpirationDate().getMonth());
        expirationDate.setYear(binput.getCreditCardInfo().getExpirationDate().getYear());
        creditCardInfo.setExpirationDate(expirationDate);
        creditCardInfo.setName(binput.getCreditCardInfo().getName());
        creditCardInfo.setNumber(binput.getCreditCardInfo().getNumber());

        if (validateCreditCard(9, creditCardInfo, (int) flightinformation.getPrice())) {
            dk.dtu.imm.fastmoney.types.AccountType account = new dk.dtu.imm.fastmoney.types.AccountType();
            account.setName("CheapBird");
            account.setNumber("50208813");
            isSuccess = chargeCreditCard(9, creditCardInfo, 100, account);
            map.put(binput.getBookingNumber(), account);
        }

        creditCardInfo.setExpirationDate(expirationDate);

        return isSuccess;
    }

    @DELETE
    public LameduckServiceStub.CancelFlightResponse cancelFlight(LameduckServiceStub.CancelFlightRequest request) {

    }

}
