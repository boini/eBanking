package com.ebanking.cui.session;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.form.ClientCardsInfoForm;
import com.ebanking.cui.presentation.form.ClientInfoForm;
import com.ebanking.cui.presentation.form.MobilePaymentForm;
import com.ebanking.cui.presentation.form.NBRBCurrencyRatesForm;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 7:54 AM
 * To change this template use File | Settings | File Templates.
 */
public class HttpSessionUtil {

    private static final String CLIENT_ACCOUNT ="clientAccount";
    private static final String CLIENT_CARDS_FORM = "clientCardsForm";
    private static final String CLIENT_INFO_FORM = "clientInfoForm";
    private static final String NBRB_RATES_FORM = "nbrbCurrencyRatesForm";
    private static final String MOBILE_PAYMENT_FORM = "mobilePaymentForm";

    private static UserHttpSession userHttpSession;

    public static UserHttpSession getUserHttpSession() {
        return userHttpSession;
    }

    public static void setUserHttpSession(UserHttpSession userHttpSession) {
        HttpSessionUtil.userHttpSession = userHttpSession;
    }

    private static void addAttribute(String key, Object value) {
        userHttpSession.setAttribute(key, value);
    }

    private static Object getAttribute(String key) {
        return userHttpSession.getAttribute(key);
    }

    public static Account getClientAccount() {
        Account account = (Account) getAttribute(CLIENT_ACCOUNT);
        return account;
    }

    public static void setClientAccount(Account account) {
        addAttribute(CLIENT_ACCOUNT, account);
    }

    public static void setClientCardsForm(ClientCardsInfoForm clientCardsForm) {
        addAttribute(CLIENT_CARDS_FORM, clientCardsForm);
    }

    public static ClientCardsInfoForm getClientCardsForm() {
        return (ClientCardsInfoForm) getAttribute(CLIENT_CARDS_FORM);
    }

    public static void setClientInfoForm(ClientInfoForm clientInfoForm) {
        addAttribute(CLIENT_INFO_FORM, clientInfoForm);
    }

    public static ClientInfoForm getClientInfoForm() {
        return (ClientInfoForm) getAttribute(CLIENT_INFO_FORM);
    }

    public static void setNbrbRatesForm(NBRBCurrencyRatesForm nbrbRatesForm) {
        addAttribute(NBRB_RATES_FORM, nbrbRatesForm);
    }

    public static NBRBCurrencyRatesForm getNbrbRatesForm() {
        return (NBRBCurrencyRatesForm) getAttribute(NBRB_RATES_FORM);
    }

    public static void setMobilePaymentForm(MobilePaymentForm mobilePaymentForm) {
        addAttribute(MOBILE_PAYMENT_FORM, mobilePaymentForm);
    }

    public static MobilePaymentForm getMobilePaymentForm() {
        return (MobilePaymentForm) getAttribute(MOBILE_PAYMENT_FORM);
    }
}
