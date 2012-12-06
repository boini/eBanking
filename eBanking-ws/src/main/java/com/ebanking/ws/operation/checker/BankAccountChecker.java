package com.ebanking.ws.operation.checker;

import com.ebanking.ws.dao.BankAccountDAO;
import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.card.CardAccount;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/6/12
 * Time: 5:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountChecker {
    private BankAccountDAO bankAccountDAO;

    @Autowired
    public void setBankAccountDAO(BankAccountDAO bankAccountDAO) {
        this.bankAccountDAO = bankAccountDAO;
    }

    public boolean checkAccountForAmount(long bankAccountId, double amount) {
        BankAccount bankAccount = bankAccountDAO.getBankAccountById(bankAccountId);
        double balance = bankAccount.getAmount();
        return balance >= amount;
    }
}
