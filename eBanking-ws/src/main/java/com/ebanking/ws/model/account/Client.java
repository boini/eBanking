package com.ebanking.ws.model.account;

import com.ebanking.ws.model.address.Address;
import org.hibernate.annotations.*;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "CLIENT")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CLIENT_ID")
    private long clientId;

    @Column(name = "FIRSTNAME", nullable = false)
    private String firstname;
    @Column(name = "MIDDLENAME", nullable = false)
    private String middlename;
    @Column(name = "LASTNAME", nullable = false)
    private String lastname;
    @Column(name = "DATE_OF_BIRTH", nullable = false)
    private Date dateOfBirth;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;
    @Column(name = "PERSONAL_NUMBER", nullable = false)
    private String personalCode;
    @Column(name = "SECRET_WORD", nullable = false)
    private String secretWord;
    @Column(name = "EMAIL", nullable = false)
    private String email;

    @ManyToOne
    @Cascade(CascadeType.ALL)
    @JoinColumn(name = "ADDRESS_ID")
    private Address address;

    /*private Set cardAccounts;
    private List operations;*/

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

    /*public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Set getCardAccounts() {
        return cardAccounts;
    }

    public void setCardAccounts(Set cardAccounts) {
        this.cardAccounts = cardAccounts;
    }

    public List getOperations() {
        return operations;
    }

    public void setOperations(List operations) {
        this.operations = operations;
    }*/

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

/*    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", firstname='" + firstname + '\'' +
                ", middlename='" + middlename + '\'' +
                ", lastname='" + lastname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", personalCode='" + personalCode + '\'' +
                ", secretWord='" + secretWord + '\'' +
                ", email='" + email + '\'' +
                ", address=" + address +
                '}';
    }*/
}
