package com.ebanking.ws.service.impl.charge.validator;

import com.ebanking.ws.service.request.ChargeRQ;

public class ChargeValidator {
    public static boolean validate(ChargeRQ chargeRQ) {
        return (chargeRQ.getAmount() > 0 &&
                chargeRQ.getDate() != null &&
                chargeRQ.getToCardAccount() > 0);
    }
}
