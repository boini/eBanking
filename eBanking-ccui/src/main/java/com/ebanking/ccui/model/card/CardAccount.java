/**
 * CardAccount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.model.card;

import com.ebanking.ccui.model.account.Client;
import com.ebanking.ccui.model.finance.Currency;

public class CardAccount  implements java.io.Serializable {
    private java.lang.Double balance;

    private long cardAccountId;

    private java.lang.Object[] cards;

    private Client client;

    private Currency currency;

    public CardAccount() {
    }

    public CardAccount(
           java.lang.Double balance,
           long cardAccountId,
           java.lang.Object[] cards,
           Client client,
           Currency currency) {
           this.balance = balance;
           this.cardAccountId = cardAccountId;
           this.cards = cards;
           this.client = client;
           this.currency = currency;
    }


    /**
     * Gets the balance value for this CardAccount.
     * 
     * @return balance
     */
    public java.lang.Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this CardAccount.
     * 
     * @param balance
     */
    public void setBalance(java.lang.Double balance) {
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
    public java.lang.Object[] getCards() {
        return cards;
    }


    /**
     * Sets the cards value for this CardAccount.
     * 
     * @param cards
     */
    public void setCards(java.lang.Object[] cards) {
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

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        _hashCode += new Long(getCardAccountId()).hashCode();
        if (getCards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCards(), i);
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://cardAccount.model.ws.ebanking.com", "Client"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "currency"));
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
