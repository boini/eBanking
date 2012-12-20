/**
 * ChargeRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.request;

public class ChargeRQ  implements java.io.Serializable {
    private double amount;

    private java.util.Calendar date;

    private long fromBankAccount;

    private long toCardAccount;

    public ChargeRQ() {
    }

    public ChargeRQ(
           double amount,
           java.util.Calendar date,
           long fromBankAccount,
           long toCardAccount) {
           this.amount = amount;
           this.date = date;
           this.fromBankAccount = fromBankAccount;
           this.toCardAccount = toCardAccount;
    }


    /**
     * Gets the amount value for this ChargeRQ.
     * 
     * @return amount
     */
    public double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this ChargeRQ.
     * 
     * @param amount
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }


    /**
     * Gets the date value for this ChargeRQ.
     * 
     * @return date
     */
    public java.util.Calendar getDate() {
        return date;
    }


    /**
     * Sets the date value for this ChargeRQ.
     * 
     * @param date
     */
    public void setDate(java.util.Calendar date) {
        this.date = date;
    }


    /**
     * Gets the fromBankAccount value for this ChargeRQ.
     * 
     * @return fromBankAccount
     */
    public long getFromBankAccount() {
        return fromBankAccount;
    }


    /**
     * Sets the fromBankAccount value for this ChargeRQ.
     * 
     * @param fromBankAccount
     */
    public void setFromBankAccount(long fromBankAccount) {
        this.fromBankAccount = fromBankAccount;
    }


    /**
     * Gets the toCardAccount value for this ChargeRQ.
     * 
     * @return toCardAccount
     */
    public long getToCardAccount() {
        return toCardAccount;
    }


    /**
     * Sets the toCardAccount value for this ChargeRQ.
     * 
     * @param toCardAccount
     */
    public void setToCardAccount(long toCardAccount) {
        this.toCardAccount = toCardAccount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChargeRQ)) return false;
        ChargeRQ other = (ChargeRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.amount == other.getAmount() &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            this.fromBankAccount == other.getFromBankAccount() &&
            this.toCardAccount == other.getToCardAccount();
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
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        _hashCode += new Long(getFromBankAccount()).hashCode();
        _hashCode += new Long(getToCardAccount()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChargeRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "ChargeRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromBankAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "fromBankAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCardAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "toCardAccount"));
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
