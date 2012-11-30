package com.ebanking.cui.presentation.form;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/30/12
 * Time: 4:12 AM
 * To change this template use File | Settings | File Templates.
 */
public class ClientInfoForm {
    private String firstname;
    private String middlename;
    private String lastname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFullName() {
        return lastname + " " + firstname + " " + middlename;
    }
}
