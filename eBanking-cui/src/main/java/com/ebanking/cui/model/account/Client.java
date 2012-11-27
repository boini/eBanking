/**
 * Client.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.account;

import com.ebanking.cui.model.address.Address;

public class Client  implements java.io.Serializable {
    private Address address;

    private long clientId;

    private java.util.Calendar dateOfBirth;

    private java.lang.String email;

    private java.lang.String firstname;

    private java.lang.String lastname;

    private java.lang.String middlename;

    private java.lang.String mobileNumber;

    private java.lang.String personalCode;

    private java.lang.String phoneNumber;

    private java.lang.String secretWord;

    public Client() {
    }

    public Client(
           Address address,
           long clientId,
           java.util.Calendar dateOfBirth,
           java.lang.String email,
           java.lang.String firstname,
           java.lang.String lastname,
           java.lang.String middlename,
           java.lang.String mobileNumber,
           java.lang.String personalCode,
           java.lang.String phoneNumber,
           java.lang.String secretWord) {
           this.address = address;
           this.clientId = clientId;
           this.dateOfBirth = dateOfBirth;
           this.email = email;
           this.firstname = firstname;
           this.lastname = lastname;
           this.middlename = middlename;
           this.mobileNumber = mobileNumber;
           this.personalCode = personalCode;
           this.phoneNumber = phoneNumber;
           this.secretWord = secretWord;
    }


    /**
     * Gets the address value for this Client.
     * 
     * @return address
     */
    public Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Client.
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * Gets the clientId value for this Client.
     * 
     * @return clientId
     */
    public long getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this Client.
     * 
     * @param clientId
     */
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the dateOfBirth value for this Client.
     * 
     * @return dateOfBirth
     */
    public java.util.Calendar getDateOfBirth() {
        return dateOfBirth;
    }


    /**
     * Sets the dateOfBirth value for this Client.
     * 
     * @param dateOfBirth
     */
    public void setDateOfBirth(java.util.Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    /**
     * Gets the email value for this Client.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Client.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the firstname value for this Client.
     * 
     * @return firstname
     */
    public java.lang.String getFirstname() {
        return firstname;
    }


    /**
     * Sets the firstname value for this Client.
     * 
     * @param firstname
     */
    public void setFirstname(java.lang.String firstname) {
        this.firstname = firstname;
    }


    /**
     * Gets the lastname value for this Client.
     * 
     * @return lastname
     */
    public java.lang.String getLastname() {
        return lastname;
    }


    /**
     * Sets the lastname value for this Client.
     * 
     * @param lastname
     */
    public void setLastname(java.lang.String lastname) {
        this.lastname = lastname;
    }


    /**
     * Gets the middlename value for this Client.
     * 
     * @return middlename
     */
    public java.lang.String getMiddlename() {
        return middlename;
    }


    /**
     * Sets the middlename value for this Client.
     * 
     * @param middlename
     */
    public void setMiddlename(java.lang.String middlename) {
        this.middlename = middlename;
    }


    /**
     * Gets the mobileNumber value for this Client.
     * 
     * @return mobileNumber
     */
    public java.lang.String getMobileNumber() {
        return mobileNumber;
    }


    /**
     * Sets the mobileNumber value for this Client.
     * 
     * @param mobileNumber
     */
    public void setMobileNumber(java.lang.String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }


    /**
     * Gets the personalCode value for this Client.
     * 
     * @return personalCode
     */
    public java.lang.String getPersonalCode() {
        return personalCode;
    }


    /**
     * Sets the personalCode value for this Client.
     * 
     * @param personalCode
     */
    public void setPersonalCode(java.lang.String personalCode) {
        this.personalCode = personalCode;
    }


    /**
     * Gets the phoneNumber value for this Client.
     * 
     * @return phoneNumber
     */
    public java.lang.String getPhoneNumber() {
        return phoneNumber;
    }


    /**
     * Sets the phoneNumber value for this Client.
     * 
     * @param phoneNumber
     */
    public void setPhoneNumber(java.lang.String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    /**
     * Gets the secretWord value for this Client.
     * 
     * @return secretWord
     */
    public java.lang.String getSecretWord() {
        return secretWord;
    }


    /**
     * Sets the secretWord value for this Client.
     * 
     * @param secretWord
     */
    public void setSecretWord(java.lang.String secretWord) {
        this.secretWord = secretWord;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Client)) return false;
        Client other = (Client) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            this.clientId == other.getClientId() &&
            ((this.dateOfBirth==null && other.getDateOfBirth()==null) || 
             (this.dateOfBirth!=null &&
              this.dateOfBirth.equals(other.getDateOfBirth()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.firstname==null && other.getFirstname()==null) || 
             (this.firstname!=null &&
              this.firstname.equals(other.getFirstname()))) &&
            ((this.lastname==null && other.getLastname()==null) || 
             (this.lastname!=null &&
              this.lastname.equals(other.getLastname()))) &&
            ((this.middlename==null && other.getMiddlename()==null) || 
             (this.middlename!=null &&
              this.middlename.equals(other.getMiddlename()))) &&
            ((this.mobileNumber==null && other.getMobileNumber()==null) || 
             (this.mobileNumber!=null &&
              this.mobileNumber.equals(other.getMobileNumber()))) &&
            ((this.personalCode==null && other.getPersonalCode()==null) || 
             (this.personalCode!=null &&
              this.personalCode.equals(other.getPersonalCode()))) &&
            ((this.phoneNumber==null && other.getPhoneNumber()==null) || 
             (this.phoneNumber!=null &&
              this.phoneNumber.equals(other.getPhoneNumber()))) &&
            ((this.secretWord==null && other.getSecretWord()==null) || 
             (this.secretWord!=null &&
              this.secretWord.equals(other.getSecretWord())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        _hashCode += new Long(getClientId()).hashCode();
        if (getDateOfBirth() != null) {
            _hashCode += getDateOfBirth().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFirstname() != null) {
            _hashCode += getFirstname().hashCode();
        }
        if (getLastname() != null) {
            _hashCode += getLastname().hashCode();
        }
        if (getMiddlename() != null) {
            _hashCode += getMiddlename().hashCode();
        }
        if (getMobileNumber() != null) {
            _hashCode += getMobileNumber().hashCode();
        }
        if (getPersonalCode() != null) {
            _hashCode += getPersonalCode().hashCode();
        }
        if (getPhoneNumber() != null) {
            _hashCode += getPhoneNumber().hashCode();
        }
        if (getSecretWord() != null) {
            _hashCode += getSecretWord().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Client.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "Client"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateOfBirth");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "dateOfBirth"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "firstname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "lastname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("middlename");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "middlename"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mobileNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "mobileNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("personalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "personalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phoneNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "phoneNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secretWord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "secretWord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
