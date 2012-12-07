/**
 * BankAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.account;

import com.ebanking.cui.model.finance.Currency;

public class BankAccount  implements java.io.Serializable {
    private double amount;

    private long bankAccountId;

    private Client client;

    private Corporation corporation;

    private Currency currency;

    public BankAccount() {
    }

    public BankAccount(
           double amount,
           long bankAccountId,
           Client client,
           Corporation corporation,
           Currency currency) {
           this.amount = amount;
           this.bankAccountId = bankAccountId;
           this.client = client;
           this.corporation = corporation;
           this.currency = currency;
    }


    /**
     * Gets the amount value for this BankAccount.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BankAccount.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the bankAccountId value for this BankAccount.
     * 
     * @return bankAccountId
     */
    public long getBankAccountId() {
        return bankAccountId;
    }


    /**
     * Sets the bankAccountId value for this BankAccount.
     * 
     * @param bankAccountId
     */
    public void setBankAccountId(long bankAccountId) {
        this.bankAccountId = bankAccountId;
    }


    /**
     * Gets the client value for this BankAccount.
     * 
     * @return client
     */
    public Client getClient() {
        return client;
    }


    /**
     * Sets the client value for this BankAccount.
     * 
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }


    /**
     * Gets the corporation value for this BankAccount.
     * 
     * @return corporation
     */
    public Corporation getCorporation() {
        return corporation;
    }


    /**
     * Sets the corporation value for this BankAccount.
     * 
     * @param corporation
     */
    public void setCorporation(Corporation corporation) {
        this.corporation = corporation;
    }


    /**
     * Gets the currency value for this BankAccount.
     * 
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this BankAccount.
     * 
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BankAccount)) return false;
        BankAccount other = (BankAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            this.bankAccountId == other.getBankAccountId() &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.corporation==null && other.getCorporation()==null) || 
             (this.corporation!=null &&
              this.corporation.equals(other.getCorporation()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        _hashCode += new Double(getAmount()).hashCode();
        _hashCode += new Long(getBankAccountId()).hashCode();
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getCorporation() != null) {
            _hashCode += getCorporation().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BankAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "BankAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "bankAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "Client"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "corporation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "Corporation"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Currency"));
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
