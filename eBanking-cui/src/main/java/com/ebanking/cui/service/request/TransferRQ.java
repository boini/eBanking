/**
 * TransferRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.request;

import com.ebanking.cui.model.account.Client;

public class TransferRQ  implements java.io.Serializable {
    private double amount;

    private Client client;

    private java.util.Calendar date;

    private long fromCardId;

    private long toCardId;

    public TransferRQ() {
    }

    public TransferRQ(
           double amount,
           Client client,
           java.util.Calendar date,
           long fromCardId,
           long toCardId) {
           this.amount = amount;
           this.client = client;
           this.date = date;
           this.fromCardId = fromCardId;
           this.toCardId = toCardId;
    }


    /**
     * Gets the amount value for this TransferRQ.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this TransferRQ.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the client value for this TransferRQ.
     * 
     * @return client
     */
    public Client getClient() {
        return client;
    }


    /**
     * Sets the client value for this TransferRQ.
     * 
     * @param client
     */
    public void setClient(Client client) {
        this.client = client;
    }


    /**
     * Gets the date value for this TransferRQ.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this TransferRQ.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the fromCardId value for this TransferRQ.
     * 
     * @return fromCardId
     */
    public long getFromCardId() {
        return fromCardId;
    }


    /**
     * Sets the fromCardId value for this TransferRQ.
     * 
     * @param fromCardId
     */
    public void setFromCardId(long fromCardId) {
        this.fromCardId = fromCardId;
    }


    /**
     * Gets the toCardId value for this TransferRQ.
     * 
     * @return toCardId
     */
    public long getToCardId() {
        return toCardId;
    }


    /**
     * Sets the toCardId value for this TransferRQ.
     * 
     * @param toCardId
     */
    public void setToCardId(long toCardId) {
        this.toCardId = toCardId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TransferRQ)) return false;
        TransferRQ other = (TransferRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            ((this.client==null && other.getClient()==null) || 
             (this.client!=null &&
              this.client.equals(other.getClient()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.fromCardId == other.getFromCardId() &&
            this.toCardId == other.getToCardId();
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
        if (getClient() != null) {
            _hashCode += getClient().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += new Long(getFromCardId()).hashCode();
        _hashCode += new Long(getToCardId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TransferRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "TransferRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("client");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "client"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "Client"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "fromCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCardId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "toCardId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
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
