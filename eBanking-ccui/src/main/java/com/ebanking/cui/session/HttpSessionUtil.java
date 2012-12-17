package com.ebanking.cui.session;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.form.*;

public class HttpSessionUtil {

    private static final String CLIENT_ACCOUNT ="clientAccount";
    private static final String CLIENT_CARDS_FORM = "clientCardsForm";
    private static final String CLIENT_INFO_FORM = "clientInfoForm";
    private static final String CLIENT_OPERATION_HISTORY_FORM = "clientOperationHistoryForm";
    private static final String NBRB_RATES_FORM = "nbrbCurrencyRatesForm";
    private static final String RATES_FORM = "ratesForm";

    private static final String RETRIEVE_CLIENT_FORM = "retrieveClientForm";
    private static final String EDIT_CLIENT_FORM = "editClientForm";

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

    public static void setClientOperationHistoryForm(ClientOpertaionHistoryForm clientOperationHistoryForm) {
        addAttribute(CLIENT_OPERATION_HISTORY_FORM, clientOperationHistoryForm);
    }

    public static ClientOpertaionHistoryForm getClientOperationHistoryForm() {
        return (ClientOpertaionHistoryForm) getAttribute(CLIENT_OPERATION_HISTORY_FORM);
    }

    public static void setRatesForm(RatesForm ratesForm) {
        addAttribute(RATES_FORM, ratesForm);
    }

    public static RatesForm getRatesForm() {
        return (RatesForm) getAttribute(RATES_FORM);
    }

    public static void setRetrieveClientForm(RetrieveClientForm retrieveClientForm) {
        addAttribute(RETRIEVE_CLIENT_FORM, retrieveClientForm);
    }

    public static RetrieveClientForm getRetrieveClientForm() {
        return (RetrieveClientForm) getAttribute(RETRIEVE_CLIENT_FORM);
    }

    public static EditClientForm getEditClientForm() {
        return (EditClientForm) getAttribute(EDIT_CLIENT_FORM);
    }

    public static void setEditClientForm(EditClientForm editClientForm) {
        addAttribute(EDIT_CLIENT_FORM, editClientForm);
    }

    public static void invalidate() {
        userHttpSession.remove(RATES_FORM);
        userHttpSession.remove(CLIENT_ACCOUNT);
        userHttpSession.remove(CLIENT_INFO_FORM);
        userHttpSession.remove(CLIENT_CARDS_FORM);
        userHttpSession.remove(CLIENT_OPERATION_HISTORY_FORM);
        userHttpSession.remove(NBRB_RATES_FORM);
        userHttpSession.remove(RETRIEVE_CLIENT_FORM);
        userHttpSession.remove(EDIT_CLIENT_FORM);
    }
}
