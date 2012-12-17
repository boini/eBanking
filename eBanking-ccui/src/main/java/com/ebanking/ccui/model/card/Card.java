/**
 * Card.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.model.card;

public class Card  implements java.io.Serializable {
    private CardAccount cardAccount;

    private java.lang.Long cardAccountID;

    private long cardId;

    private java.lang.String cardNumber;

    private CardType cardType;

    private java.lang.Double creditLimit;

    private java.lang.String cvv;

    private java.util.Calendar expirationDate;

    public Card() {
    }

    public Card(
           CardAccount cardAccount,
           java.lang.Long cardAccountID,
           long cardId,
           java.lang.String cardNumber,
           CardType cardType,
           java.lang.Double creditLimit,
           java.lang.String cvv,
           java.util.Calendar expirationDate) {
           this.cardAccount = cardAccount;
           this.cardAccountID = cardAccountID;
           this.cardId = cardId;
           this.cardNumber = cardNumber;
           this.cardType = cardType;
           this.creditLimit = creditLimit;
           this.cvv = cvv;
           this.expirationDate = expirationDate;
    }


    /**
     * Gets the cardAccount value for this Card.
     * 
     * @return cardAccount
     */
    public CardAccount getCardAccount() {
        return cardAccount;
    }


    /**
     * Sets the cardAccount value for this Card.
     * 
     * @param cardAccount
     */
    public void setCardAccount(CardAccount cardAccount) {
        this.cardAccount = cardAccount;
    }


    /**
     * Gets the cardAccountID value for this Card.
     * 
     * @return cardAccountID
     */
    public java.lang.Long getCardAccountID() {
        return cardAccountID;
    }


    /**
     * Sets the cardAccountID value for this Card.
     * 
     * @param cardAccountID
     */
    public void setCardAccountID(java.lang.Long cardAccountID) {
        this.cardAccountID = cardAccountID;
    }


    /**
     * Gets the cardId value for this Card.
     * 
     * @return cardId
     */
    public long getCardId() {
        return cardId;
    }


    /**
     * Sets the cardId value for this Card.
     * 
     * @param cardId
     */
    public void setCardId(long cardId) {
        this.cardId = cardId;
    }


    /**
     * Gets the cardNumber value for this Card.
     * 
     * @return cardNumber
     */
    public java.lang.String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this Card.
     * 
     * @param cardNumber
     */
    public void setCardNumber(java.lang.String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the cardType value for this Card.
     * 
     * @return cardType
     */
    public CardType getCardType() {
        return cardType;
    }


    /**
     * Sets the cardType value for this Card.
     * 
     * @param cardType
     */
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }


    /**
     * Gets the creditLimit value for this Card.
     * 
     * @return creditLimit
     */
    public java.lang.Double getCreditLimit() {
        return creditLimit;
    }


    /**
     * Sets the creditLimit value for this Card.
     * 
     * @param creditLimit
     */
    public void setCreditLimit(java.lang.Double creditLimit) {
        this.creditLimit = creditLimit;
    }


    /**
     * Gets the cvv value for this Card.
     * 
     * @return cvv
     */
    public java.lang.String getCvv() {
        return cvv;
    }


    /**
     * Sets the cvv value for this Card.
     * 
     * @param cvv
     */
    public void setCvv(java.lang.String cvv) {
        this.cvv = cvv;
    }


    /**
     * Gets the expirationDate value for this Card.
     * 
     * @return expirationDate
     */
    public java.util.Calendar getExpirationDate() {
        return expirationDate;
    }


    /**
     * Sets the expirationDate value for this Card.
     * 
     * @param expirationDate
     */
    public void setExpirationDate(java.util.Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Card)) return false;
        Card other = (Card) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardAccount==null && other.getCardAccount()==null) || 
             (this.cardAccount!=null &&
              this.cardAccount.equals(other.getCardAccount()))) &&
            ((this.cardAccountID==null && other.getCardAccountID()==null) || 
             (this.cardAccountID!=null &&
              this.cardAccountID.equals(other.getCardAccountID()))) &&
            this.cardId == other.getCardId() &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.cardType==null && other.getCardType()==null) || 
             (this.cardType!=null &&
              this.cardType.equals(other.getCardType()))) &&
            ((this.creditLimit==null && other.getCreditLimit()==null) || 
             (this.creditLimit!=null &&
              this.creditLimit.equals(other.getCreditLimit()))) &&
            ((this.cvv==null && other.getCvv()==null) || 
             (this.cvv!=null &&
              this.cvv.equals(other.getCvv()))) &&
            ((this.expirationDate==null && other.getExpirationDate()==null) || 
             (this.expirationDate!=null &&
              this.expirationDate.equals(other.getExpirationDate())));
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
        if (getCardAccount() != null) {
            _hashCode += getCardAccount().hashCode();
        }
        if (getCardAccountID() != null) {
            _hashCode += getCardAccountID().hashCode();
        }
        _hashCode += new Long(getCardId()).hashCode();
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getCardType() != null) {
            _hashCode += getCardType().hashCode();
        }
        if (getCreditLimit() != null) {
            _hashCode += getCreditLimit().hashCode();
        }
        if (getCvv() != null) {
            _hashCode += getCvv().hashCode();
        }
        if (getExpirationDate() != null) {
            _hashCode += getExpirationDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Card.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "Card"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "CardAccount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAccountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardAccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "CardType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "creditLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cvv");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cvv"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "expirationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
