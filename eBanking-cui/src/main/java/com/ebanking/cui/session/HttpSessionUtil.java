package com.ebanking.cui.session;

import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.presentation.form.*;
import com.ebanking.cui.presentation.form.payments.CommunicationsPaymentForm;
import com.ebanking.cui.presentation.form.payments.ElectricityPaymentForm;
import com.ebanking.cui.presentation.form.payments.PhonePaymentForm;
import com.ebanking.cui.presentation.form.payments.RentPaymentForm;
import com.ebanking.cui.presentation.form.transfer.TransferForm;

public class HttpSessionUtil {

    private static final String CLIENT_ACCOUNT ="clientAccount";
    private static final String CLIENT_CARDS_FORM = "clientCardsForm";
    private static final String CLIENT_INFO_FORM = "clientInfoForm";
    private static final String CLIENT_OPERATION_HISTORY_FORM = "clientOperationHistoryForm";
    private static final String NBRB_RATES_FORM = "nbrbCurrencyRatesForm";
    private static final String COMMUNICATIONS_PAYMENT_FORM = "communicationsPaymentForm";
    private static final String PHONE_PAYMENT_FORM = "phonePaymentForm";
    private static final String RENT_PAYMENT_FORM = "rentPaymentForm";
    private static final String ELECTRICITY_PAYMENT_FORM = "electricityPaymentForm";
    private static final String RATES_FORM = "ratesForm";
    private static final String TRANSFER_FORM = "transferForm";
    private static final String AUTO_PAYMENT_FORM = "autoPaymentForm";

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

    public static void setCommunicationsPaymentForm(CommunicationsPaymentForm communicationsPaymentForm) {
        addAttribute(COMMUNICATIONS_PAYMENT_FORM, communicationsPaymentForm);
    }

    public static CommunicationsPaymentForm getCommunicationsPaymentForm() {
        return (CommunicationsPaymentForm) getAttribute(COMMUNICATIONS_PAYMENT_FORM);
    }

    public static void setClientOperationHistoryForm(ClientOpertaionHistoryForm clientOperationHistoryForm) {
        addAttribute(CLIENT_OPERATION_HISTORY_FORM, clientOperationHistoryForm);
    }

    public static ClientOpertaionHistoryForm getClientOperationHistoryForm() {
        return (ClientOpertaionHistoryForm) getAttribute(CLIENT_OPERATION_HISTORY_FORM);
    }

    public static void setPhonePaymentForm(PhonePaymentForm phonePaymentForm) {
        addAttribute(PHONE_PAYMENT_FORM, phonePaymentForm);
    }

    public static PhonePaymentForm getPhonePaymentForm() {
        return (PhonePaymentForm) getAttribute(PHONE_PAYMENT_FORM);
    }

    public static void setRentPaymentForm(RentPaymentForm rentPaymentForm) {
        addAttribute(RENT_PAYMENT_FORM, rentPaymentForm);
    }

    public static RentPaymentForm getRentPaymentForm() {
        return (RentPaymentForm) getAttribute(RENT_PAYMENT_FORM);
    }

    public static void setElectricityPaymentForm(ElectricityPaymentForm electricityPaymentForm) {
        addAttribute(ELECTRICITY_PAYMENT_FORM, electricityPaymentForm);
    }

    public static ElectricityPaymentForm getElectricityPaymentForm() {
        return (ElectricityPaymentForm) getAttribute(ELECTRICITY_PAYMENT_FORM);
    }

    public static void setRatesForm(RatesForm ratesForm) {
        addAttribute(RATES_FORM, ratesForm);
    }

    public static RatesForm getRatesForm() {
        return (RatesForm) getAttribute(RATES_FORM);
    }

    public static void setTransferForm(TransferForm transferForm) {
        addAttribute(TRANSFER_FORM, transferForm);
    }
    public static TransferForm getTransferForm() {
        return (TransferForm) getAttribute(TRANSFER_FORM);
    }

    public static void setAutoPaymentForm(AutoPaymentForm autoPaymentForm) {
        addAttribute(AUTO_PAYMENT_FORM, autoPaymentForm);
    }

    public static AutoPaymentForm getAutoPaymentForm() {
        return (AutoPaymentForm) getAttribute(AUTO_PAYMENT_FORM);
    }

    public static void invalidate() {
        userHttpSession.remove(RATES_FORM);
        userHttpSession.remove(TRANSFER_FORM);
        userHttpSession.remove(CLIENT_ACCOUNT);
        userHttpSession.remove(CLIENT_INFO_FORM);
        userHttpSession.remove(CLIENT_CARDS_FORM);
        userHttpSession.remove(CLIENT_OPERATION_HISTORY_FORM);
        userHttpSession.remove(COMMUNICATIONS_PAYMENT_FORM);
        userHttpSession.remove(ELECTRICITY_PAYMENT_FORM);
        userHttpSession.remove(NBRB_RATES_FORM);
        userHttpSession.remove(PHONE_PAYMENT_FORM);
        userHttpSession.remove(RENT_PAYMENT_FORM);
        userHttpSession.remove(AUTO_PAYMENT_FORM);
    }
}
