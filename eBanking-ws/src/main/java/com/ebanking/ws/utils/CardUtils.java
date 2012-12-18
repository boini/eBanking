package com.ebanking.ws.utils;

import com.ebanking.ws.model.card.Card;
/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 04.12.12
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
public class CardUtils {

    public static final int CARD_NUMBER_LENGTH = 16;
    private static final String CARD_NUMBER_PLACEHOLDER = "XXXXXXXX";

    public static void hideCardInfo(Card card) {
        String cardNumber = card.getCardNumber();
        if (cardNumber != null) {
            card.setCardNumber(hiddenCardNumber(cardNumber));
        }
    }

    private static String hiddenCardNumber(String cardNumber) {
        int length = cardNumber.length();
        //for the case when someone like me enters non 16-symbol card number to the DB
        if (length != CARD_NUMBER_LENGTH) {
            String output = length == 0 ? CARD_NUMBER_PLACEHOLDER :
                            cardNumber.substring(0,1) + CARD_NUMBER_PLACEHOLDER + cardNumber.substring(length-2,length);
            System.out.println("Bad joke. Invalid card number: "+output);
            return output;
        }

        return cardNumber.substring(0,4) + CARD_NUMBER_PLACEHOLDER + cardNumber.substring(length-4, length);
    }

}
