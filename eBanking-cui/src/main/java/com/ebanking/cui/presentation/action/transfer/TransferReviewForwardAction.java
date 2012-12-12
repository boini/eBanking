package com.ebanking.cui.presentation.action.transfer;

import com.ebanking.cui.model.finance.Currency;
import com.ebanking.cui.model.finance.Rate;
import com.ebanking.cui.presentation.form.RatesForm;
import com.ebanking.cui.presentation.form.transfer.TransferForm;
import com.ebanking.cui.session.HttpSessionUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

import java.math.BigDecimal;
import java.util.Date;

public class TransferReviewForwardAction extends ActionSupport {
    private static final String CURRENCY_CODE_BYR = "BYR";

    private long fromCardId;
    private long toCardId;
    private double amount;

    @Autowired
    private TransferForm transferForm;
    

    public void setFromCardId(long fromCardId) {
        this.fromCardId = fromCardId;
    }

    public void setToCardId(long toCardId) {
        this.toCardId = toCardId;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String execute() throws Exception {
        transferForm.setAmount(amount);
        transferForm.setFromCardId(fromCardId);
        transferForm.setToCardId(toCardId);
        transferForm.setCards(HttpSessionUtil.getClientCardsForm().getCards());
        transferForm.setDate(new Date());

        Rate[] rates = HttpSessionUtil.getRatesForm().getRates();
        Currency originCurrency = transferForm.getFromCard().getCardAccount().getCurrency();
        Currency currency = transferForm.getToCard().getCardAccount().getCurrency();

        boolean inCurrencyIsByr = CURRENCY_CODE_BYR.equals(originCurrency.getCurrencyCode());
        boolean outCurrencyIsByr = CURRENCY_CODE_BYR.equals(currency.getCurrencyCode());

        Rate inRate = null;
        Rate outRate = null;

        for (Rate rate : rates) {
            if (rate.getCurrency().equals(originCurrency)) {
                inRate = rate;
            }
            if (rate.getCurrency().equals(currency)) {
                outRate = rate;
            }
        }

        double rateCurToBr = inCurrencyIsByr ? 1.0 : inRate.getPurchase();
        double rateBrToCur = outCurrencyIsByr ? 1.0 : outRate.getSale();

        double result = amount * rateCurToBr / rateBrToCur;

        BigDecimal bd = BigDecimal.valueOf(result);
        bd = bd.setScale(2, BigDecimal.ROUND_HALF_UP);

        transferForm.setEquivalentAmount(bd.doubleValue());

        HttpSessionUtil.setTransferForm(transferForm);

        return "success";
    }
}
