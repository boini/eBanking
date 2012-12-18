/**
 * CorporationRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.response;

import com.ebanking.ccui.model.account.BankAccount;
import com.ebanking.ccui.model.account.Corporation;

public class CorporationRS  implements java.io.Serializable {
    private BankAccount[] bankAccounts;

    private Corporation[] corporations;

    private java.lang.String exception;

    private boolean success;

    public CorporationRS() {
    }

    public CorporationRS(
           BankAccount[] bankAccounts,
           Corporation[] corporations,
           java.lang.String exception,
           boolean success) {
           this.bankAccounts = bankAccounts;
           this.corporations = corporations;
           this.exception = exception;
           this.success = success;
    }


    /**
     * Gets the bankAccounts value for this CorporationRS.
     * 
     * @return bankAccounts
     */
    public BankAccount[] getBankAccounts() {
        return bankAccounts;
    }


    /**
     * Sets the bankAccounts value for this CorporationRS.
     * 
     * @param bankAccounts
     */
    public void setBankAccounts(BankAccount[] bankAccounts) {
        this.bankAccounts = bankAccounts;
    }


    /**
     * Gets the corporations value for this CorporationRS.
     * 
     * @return corporations
     */
    public Corporation[] getCorporations() {
        return corporations;
    }


    /**
     * Sets the corporations value for this CorporationRS.
     * 
     * @param corporations
     */
    public void setCorporations(Corporation[] corporations) {
        this.corporations = corporations;
    }


    /**
     * Gets the exception value for this CorporationRS.
     * 
     * @return exception
     */
    public java.lang.String getException() {
        return exception;
    }


    /**
     * Sets the exception value for this CorporationRS.
     * 
     * @param exception
     */
    public void setException(java.lang.String exception) {
        this.exception = exception;
    }


    /**
     * Gets the success value for this CorporationRS.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this CorporationRS.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CorporationRS)) return false;
        CorporationRS other = (CorporationRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankAccounts==null && other.getBankAccounts()==null) || 
             (this.bankAccounts!=null &&
              java.util.Arrays.equals(this.bankAccounts, other.getBankAccounts()))) &&
            ((this.corporations==null && other.getCorporations()==null) || 
             (this.corporations!=null &&
              java.util.Arrays.equals(this.corporations, other.getCorporations()))) &&
            ((this.exception==null && other.getException()==null) || 
             (this.exception!=null &&
              this.exception.equals(other.getException()))) &&
            this.success == other.isSuccess();
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
        if (getBankAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankAccounts(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorporations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorporations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorporations(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getException() != null) {
            _hashCode += getException().hashCode();
        }
        _hashCode += (isSuccess() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CorporationRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "CorporationRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "bankAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "BankAccount"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://corporation.impl.service.ws.ebanking.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "corporations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://account.model.ws.ebanking.com", "Corporation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://corporation.impl.service.ws.ebanking.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exception");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "exception"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("success");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "success"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
