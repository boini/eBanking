package com.ebanking.ws.operation.checker;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.model.card.CardAccount;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/6/12
 * Time: 5:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class CardAccountChecker {

    private CardAccountDAO cardAccountDAO;

    @Autowired
    public void setCardAccountDAO(CardAccountDAO cardAccountDAO) {
        this.cardAccountDAO = cardAccountDAO;
    }

    public boolean checkAccountForAmount(long cardAccountId, double amount) {
        CardAccount cardAccount = cardAccountDAO.getById(cardAccountId);
        double balance = cardAccount.getBalance();
        return balance >= amount;
    }
}
