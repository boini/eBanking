package com.ebanking.ws.operation.transfer;

import com.ebanking.ws.dao.BankAccountDAO;
import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.card.CardAccount;
import com.ebanking.ws.operation.checker.BankAccountChecker;
import com.ebanking.ws.operation.checker.CardAccountChecker;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/6/12
 * Time: 6:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class MoneyTransfer {

    private CardAccountChecker cardAccountChecker;
    private BankAccountChecker bankAccountChecker;

    private BankAccountDAO bankAccountDAO;
    private CardAccountDAO cardAccountDAO;

    @Autowired
    public void setCardAccountChecker(CardAccountChecker cardAccountChecker) {
        this.cardAccountChecker = cardAccountChecker;
    }
    @Autowired
    public void setBankAccountChecker(BankAccountChecker bankAccountChecker) {
        this.bankAccountChecker = bankAccountChecker;
    }
    @Autowired
    public void setBankAccountDAO(BankAccountDAO bankAccountDAO) {
        this.bankAccountDAO = bankAccountDAO;
    }
    @Autowired
    public void setCardAccountDAO(CardAccountDAO cardAccountDAO) {
        this.cardAccountDAO = cardAccountDAO;
    }

    public boolean transfer(CardAccount cardAccount, BankAccount bankAccount, double amount) {
        if (cardAccountChecker.checkAccountForAmount(cardAccount.getCardAccountId(), amount)) {
            cardAccount.setBalance(cardAccount.getBalance() - amount);
            bankAccount.setAmount(bankAccount.getAmount() + amount);

            cardAccountDAO.saveOrUpdate(cardAccount);
            bankAccountDAO.saveOrUpdate(bankAccount);

            return true;
        }
        return false;
    }

    public boolean transfer(CardAccount cardAccount, CardAccount cardContractorAccount, double amount) {
        if (cardAccountChecker.checkAccountForAmount(cardAccount.getCardAccountId(), amount)) {
            cardAccount.setBalance(cardAccount.getBalance() - amount);
            cardContractorAccount.setBalance(cardContractorAccount.getBalance() + amount);

            cardAccountDAO.saveOrUpdate(cardAccount);
            cardAccountDAO.saveOrUpdate(cardContractorAccount);

            return true;
        }
        return false;
    }

    public boolean transfer(CardAccount cardAccount, CardAccount cardContractorAccount, double amount, double conversionCourse) {
        if (cardAccountChecker.checkAccountForAmount(cardAccount.getCardAccountId(), amount)) {
            cardAccount.setBalance(cardAccount.getBalance() - amount);
            cardContractorAccount.setBalance(cardContractorAccount.getBalance() + amount*conversionCourse);

            cardAccountDAO.saveOrUpdate(cardAccount);
            cardAccountDAO.saveOrUpdate(cardContractorAccount);

            return true;
        }
        return false;
    }
}
