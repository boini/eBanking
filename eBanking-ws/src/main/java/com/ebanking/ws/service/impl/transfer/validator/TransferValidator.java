package com.ebanking.ws.service.impl.transfer.validator;

import com.ebanking.ws.service.request.TransferRQ;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 12/13/12
 * Time: 12:01 AM
 * To change this template use File | Settings | File Templates.
 */
public class TransferValidator {
    public static boolean validate(TransferRQ transferRQ) {
        return (transferRQ.getAmount() > 0 &&
                transferRQ.getClient() != null &&
                transferRQ.getDate() != null &&
                transferRQ.getFromCardId() > 0 &&
                transferRQ.getToCardId() > 0);
    }
}
