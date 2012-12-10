package com.ebanking.cui.presentation.form.payments;

/**
 * Created with IntelliJ IDEA.
 * User: vasilii91
 * Date: 12/10/12
 * Time: 5:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhonePaymentForm extends CommunicationsPaymentForm {
    private static final String CREDENTIAL_KEY = "Credentials=";

    public String getCredential() {
        return credential;
    }

    public void setCredential(String credential) {
        this.credential = credential;
    }

    private String credential;

    public String getKey() {
        return super.getKey() + ";" + CREDENTIAL_KEY + credential;
    }

}
