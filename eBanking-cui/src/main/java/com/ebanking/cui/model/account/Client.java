package com.ebanking.cui.model.account;

import com.ebanking.cui.model.address.Address;

import java.util.Date;

public class Client {
    private long clientId;
    private String firstname;
    private String middlename;
    private String lastname;
    private Date dateOfBirth;
    private String phoneNumber;
    private String mobileNumber;
    private String personalCode;
    private String secretWord;
    private String email;
    private Address address;

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }

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

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getPersonalCode() {
        return personalCode;
    }

    public void setPersonalCode(String personalCode) {
        this.personalCode = personalCode;
    }

    public String getSecretWord() {
        return secretWord;
    }

    public void setSecretWord(String secretWord) {
        this.secretWord = secretWord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Client client = (Client) o;

        if (clientId != client.clientId) return false;
        if (!address.equals(client.address)) return false;
        if (dateOfBirth != null ? !dateOfBirth.equals(client.dateOfBirth) : client.dateOfBirth != null) return false;
        if (!email.equals(client.email)) return false;
        if (!firstname.equals(client.firstname)) return false;
        if (!lastname.equals(client.lastname)) return false;
        if (!middlename.equals(client.middlename)) return false;
        if (mobileNumber != null ? !mobileNumber.equals(client.mobileNumber) : client.mobileNumber != null)
            return false;
        if (!personalCode.equals(client.personalCode)) return false;
        if (phoneNumber != null ? !phoneNumber.equals(client.phoneNumber) : client.phoneNumber != null) return false;
        if (!secretWord.equals(client.secretWord)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (clientId ^ (clientId >>> 32));
        result = 31 * result + firstname.hashCode();
        result = 31 * result + middlename.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + (dateOfBirth != null ? dateOfBirth.hashCode() : 0);
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (mobileNumber != null ? mobileNumber.hashCode() : 0);
        result = 31 * result + personalCode.hashCode();
        result = 31 * result + secretWord.hashCode();
        result = 31 * result + email.hashCode();
        result = 31 * result + address.hashCode();
        return result;
    }
}
