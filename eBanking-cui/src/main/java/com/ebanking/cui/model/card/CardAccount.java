/**
 * CardAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.card;

import com.ebanking.cui.model.account.Client;
import com.ebanking.cui.model.finance.Currency;

public class CardAccount implements java.io.Serializable {
    private Double balance;

    private long cardAccountId;

    private Object[] cards;

    private Client client;

    private Currency currency;

    private String number;

    public CardAccount() {
    }

    public CardAccount(
            Double balance,
            long cardAccountId,
            Object[] cards,
            Client client,
            Currency currency,
            String number) {
           this.balance = balance;
           this.cardAccountId = cardAccountId;
           this.cards = cards;
           this.client = client;
           this.currency = currency;
           this.number = number;
    }


    /**
     * Gets the balance value for this CardAccount.
     *
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CardAccount.
     *
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the cardAccountId value for this CardAccount.
     *
     * @return cardAccountId
     */
    public long getCardAccountId() {
        return cardAccountId;
    }


    /**
     * Sets the cardAccountId value for this CardAccount.
     *
     * @param cardAccountId
     */
    public void setCardAccountId(long cardAccountId) {
        this.cardAccountId = cardAccountId;
    }


    /**
     * Gets the cards value for this CardAccount.
     *
     * @return cards
     */
    public Object[] getCards() {
        return cards;
    }


    /**
     * Sets the cards value for this CardAccount.
     *
     * @param cards
     */
    public void setCards(Object[] cards) {
        this.cards = cards;
    }


    /**
     * Gets the client value for this CardAccount.
     *
     * @return client
     */
    public Client getClient() {
        return client;
    }


    /**
     * Sets the client value for this CardAccount.
     *
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }


    /**
     * Gets the currency value for this CardAccount.
     *
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this CardAccount.
     *
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the number value for this CardAccount.
     *
     * @return number
     */
    public String getNumber() {
        return number;
    }


    /**
     * Sets the number value for this CardAccount.
     *
     * @param number
     */
    public void setNumber(String number) {
        this.number = number;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CardAccount)) return false;
        CardAccount other = (CardAccount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
            ((this.balance==null && other.getBalance()==null) ||
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            this.cardAccountId == other.getCardAccountId() &&
            ((this.cards==null && other.getCards()==null) ||
             (this.cards!=null &&
              java.util.Arrays.equals(this.cards, other.getCards()))) &&
            ((this.client==null && other.getClient()==null) ||
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.currency==null && other.getCurrency()==null) ||
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.number==null && other.getNumber()==null) ||
             (this.number!=null &&
              this.number.equals(other.getNumber())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        _hashCode += new Long(getCardAccountId()).hashCode();
        if (getCards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCards());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCards(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getNumber() != null) {
            _hashCode += getNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardAccount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "CardAccount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAccountId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardAccountId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://card.impl.service.ws.ebanking.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "Client"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Currency"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "number"));
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
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
