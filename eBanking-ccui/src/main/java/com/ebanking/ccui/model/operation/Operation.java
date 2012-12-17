/**
 * Operation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.model.operation;

import com.ebanking.ccui.model.account.BankAccount;
import com.ebanking.ccui.model.address.Address;
import com.ebanking.ccui.model.card.Card;

public class Operation  implements java.io.Serializable {
    private Address address;

    private Card card;

    private double cardAccountAmount;

    private BankAccount contractorAccount;

    private Card contractorCard;

    private long operationId;

    private java.lang.String operationKey;

    private OperationStatus operationStatus;

    private OperationType operationType;

    private java.util.Calendar processingDate;

    private double transactionAmount;

    private java.util.Calendar transactionDate;

    public Operation() {
    }

    public Operation(
           Address address,
           Card card,
           double cardAccountAmount,
           BankAccount contractorAccount,
           Card contractorCard,
           long operationId,
           java.lang.String operationKey,
           OperationStatus operationStatus,
           OperationType operationType,
           java.util.Calendar processingDate,
           double transactionAmount,
           java.util.Calendar transactionDate) {
           this.address = address;
           this.card = card;
           this.cardAccountAmount = cardAccountAmount;
           this.contractorAccount = contractorAccount;
           this.contractorCard = contractorCard;
           this.operationId = operationId;
           this.operationKey = operationKey;
           this.operationStatus = operationStatus;
           this.operationType = operationType;
           this.processingDate = processingDate;
           this.transactionAmount = transactionAmount;
           this.transactionDate = transactionDate;
    }


    /**
     * Gets the address value for this Operation.
     * 
     * @return address
     */
    public Address getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Operation.
     * 
     * @param address
     */
    public void setAddress(Address address) {
        this.address = address;
    }


    /**
     * Gets the card value for this Operation.
     * 
     * @return card
     */
    public Card getCard() {
        return card;
    }


    /**
     * Sets the card value for this Operation.
     * 
     * @param card
     */
    public void setCard(Card card) {
        this.card = card;
    }


    /**
     * Gets the cardAccountAmount value for this Operation.
     * 
     * @return cardAccountAmount
     */
    public double getCardAccountAmount() {
        return cardAccountAmount;
    }


    /**
     * Sets the cardAccountAmount value for this Operation.
     * 
     * @param cardAccountAmount
     */
    public void setCardAccountAmount(double cardAccountAmount) {
        this.cardAccountAmount = cardAccountAmount;
    }


    /**
     * Gets the contractorAccount value for this Operation.
     * 
     * @return contractorAccount
     */
    public BankAccount getContractorAccount() {
        return contractorAccount;
    }


    /**
     * Sets the contractorAccount value for this Operation.
     * 
     * @param contractorAccount
     */
    public void setContractorAccount(BankAccount contractorAccount) {
        this.contractorAccount = contractorAccount;
    }


    /**
     * Gets the contractorCard value for this Operation.
     * 
     * @return contractorCard
     */
    public Card getContractorCard() {
        return contractorCard;
    }


    /**
     * Sets the contractorCard value for this Operation.
     * 
     * @param contractorCard
     */
    public void setContractorCard(Card contractorCard) {
        this.contractorCard = contractorCard;
    }


    /**
     * Gets the operationId value for this Operation.
     * 
     * @return operationId
     */
    public long getOperationId() {
        return operationId;
    }


    /**
     * Sets the operationId value for this Operation.
     * 
     * @param operationId
     */
    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }


    /**
     * Gets the operationKey value for this Operation.
     * 
     * @return operationKey
     */
    public java.lang.String getOperationKey() {
        return operationKey;
    }


    /**
     * Sets the operationKey value for this Operation.
     * 
     * @param operationKey
     */
    public void setOperationKey(java.lang.String operationKey) {
        this.operationKey = operationKey;
    }


    /**
     * Gets the operationStatus value for this Operation.
     * 
     * @return operationStatus
     */
    public OperationStatus getOperationStatus() {
        return operationStatus;
    }


    /**
     * Sets the operationStatus value for this Operation.
     * 
     * @param operationStatus
     */
    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }


    /**
     * Gets the operationType value for this Operation.
     * 
     * @return operationType
     */
    public OperationType getOperationType() {
        return operationType;
    }


    /**
     * Sets the operationType value for this Operation.
     * 
     * @param operationType
     */
    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }


    /**
     * Gets the processingDate value for this Operation.
     * 
     * @return processingDate
     */
    public java.util.Calendar getProcessingDate() {
        return processingDate;
    }


    /**
     * Sets the processingDate value for this Operation.
     * 
     * @param processingDate
     */
    public void setProcessingDate(java.util.Calendar processingDate) {
        this.processingDate = processingDate;
    }


    /**
     * Gets the transactionAmount value for this Operation.
     * 
     * @return transactionAmount
     */
    public double getTransactionAmount() {
        return transactionAmount;
    }


    /**
     * Sets the transactionAmount value for this Operation.
     * 
     * @param transactionAmount
     */
    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }


    /**
     * Gets the transactionDate value for this Operation.
     * 
     * @return transactionDate
     */
    public java.util.Calendar getTransactionDate() {
        return transactionDate;
    }


    /**
     * Sets the transactionDate value for this Operation.
     * 
     * @param transactionDate
     */
    public void setTransactionDate(java.util.Calendar transactionDate) {
        this.transactionDate = transactionDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Operation)) return false;
        Operation other = (Operation) obj;
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
            ((this.card==null && other.getCard()==null) || 
             (this.card!=null &&
              this.card.equals(other.getCard()))) &&
            this.cardAccountAmount == other.getCardAccountAmount() &&
            ((this.contractorAccount==null && other.getContractorAccount()==null) || 
             (this.contractorAccount!=null &&
              this.contractorAccount.equals(other.getContractorAccount()))) &&
            ((this.contractorCard==null && other.getContractorCard()==null) || 
             (this.contractorCard!=null &&
              this.contractorCard.equals(other.getContractorCard()))) &&
            this.operationId == other.getOperationId() &&
            ((this.operationKey==null && other.getOperationKey()==null) || 
             (this.operationKey!=null &&
              this.operationKey.equals(other.getOperationKey()))) &&
            ((this.operationStatus==null && other.getOperationStatus()==null) || 
             (this.operationStatus!=null &&
              this.operationStatus.equals(other.getOperationStatus()))) &&
            ((this.operationType==null && other.getOperationType()==null) || 
             (this.operationType!=null &&
              this.operationType.equals(other.getOperationType()))) &&
            ((this.processingDate==null && other.getProcessingDate()==null) || 
             (this.processingDate!=null &&
              this.processingDate.equals(other.getProcessingDate()))) &&
            this.transactionAmount == other.getTransactionAmount() &&
            ((this.transactionDate==null && other.getTransactionDate()==null) || 
             (this.transactionDate!=null &&
              this.transactionDate.equals(other.getTransactionDate())));
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
        if (getCard() != null) {
            _hashCode += getCard().hashCode();
        }
        _hashCode += new Double(getCardAccountAmount()).hashCode();
        if (getContractorAccount() != null) {
            _hashCode += getContractorAccount().hashCode();
        }
        if (getContractorCard() != null) {
            _hashCode += getContractorCard().hashCode();
        }
        _hashCode += new Long(getOperationId()).hashCode();
        if (getOperationKey() != null) {
            _hashCode += getOperationKey().hashCode();
        }
        if (getOperationStatus() != null) {
            _hashCode += getOperationStatus().hashCode();
        }
        if (getOperationType() != null) {
            _hashCode += getOperationType().hashCode();
        }
        if (getProcessingDate() != null) {
            _hashCode += getProcessingDate().hashCode();
        }
        _hashCode += new Double(getTransactionAmount()).hashCode();
        if (getTransactionDate() != null) {
            _hashCode += getTransactionDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Operation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "Operation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "Address"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("card");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "card"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "Card"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAccountAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "cardAccountAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractorAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "contractorAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "BankAccount"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractorCard");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "contractorCard"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "Card"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operationKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "OperationStatus"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "OperationType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("processingDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "processingDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "transactionAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transactionDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "transactionDate"));
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
