/**
 * GetAutoPaymentRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.response;

import com.ebanking.cui.model.operation.AutoPayment;

public class GetAutoPaymentRS  implements java.io.Serializable {
    private AutoPayment autoPayment;

    private AutoPayment[] autoPayments;

    private java.lang.String exception;

    private boolean success;

    public GetAutoPaymentRS() {
    }

    public GetAutoPaymentRS(
           AutoPayment autoPayment,
           AutoPayment[] autoPayments,
           java.lang.String exception,
           boolean success) {
           this.autoPayment = autoPayment;
           this.autoPayments = autoPayments;
           this.exception = exception;
           this.success = success;
    }


    /**
     * Gets the autoPayment value for this GetAutoPaymentRS.
     * 
     * @return autoPayment
     */
    public AutoPayment getAutoPayment() {
        return autoPayment;
    }


    /**
     * Sets the autoPayment value for this GetAutoPaymentRS.
     * 
     * @param autoPayment
     */
    public void setAutoPayment(AutoPayment autoPayment) {
        this.autoPayment = autoPayment;
    }


    /**
     * Gets the autoPayments value for this GetAutoPaymentRS.
     * 
     * @return autoPayments
     */
    public AutoPayment[] getAutoPayments() {
        return autoPayments;
    }


    /**
     * Sets the autoPayments value for this GetAutoPaymentRS.
     * 
     * @param autoPayments
     */
    public void setAutoPayments(AutoPayment[] autoPayments) {
        this.autoPayments = autoPayments;
    }


    /**
     * Gets the exception value for this GetAutoPaymentRS.
     * 
     * @return exception
     */
    public java.lang.String getException() {
        return exception;
    }


    /**
     * Sets the exception value for this GetAutoPaymentRS.
     * 
     * @param exception
     */
    public void setException(java.lang.String exception) {
        this.exception = exception;
    }


    /**
     * Gets the success value for this GetAutoPaymentRS.
     * 
     * @return success
     */
    public boolean isSuccess() {
        return success;
    }


    /**
     * Sets the success value for this GetAutoPaymentRS.
     * 
     * @param success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetAutoPaymentRS)) return false;
        GetAutoPaymentRS other = (GetAutoPaymentRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autoPayment==null && other.getAutoPayment()==null) || 
             (this.autoPayment!=null &&
              this.autoPayment.equals(other.getAutoPayment()))) &&
            ((this.autoPayments==null && other.getAutoPayments()==null) || 
             (this.autoPayments!=null &&
              java.util.Arrays.equals(this.autoPayments, other.getAutoPayments()))) &&
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
        if (getAutoPayment() != null) {
            _hashCode += getAutoPayment().hashCode();
        }
        if (getAutoPayments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAutoPayments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAutoPayments(), i);
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
        new org.apache.axis.description.TypeDesc(GetAutoPaymentRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "GetAutoPaymentRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "autoPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "AutoPayment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "autoPayments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "AutoPayment"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://autopayment.impl.service.ws.ebanking.com", "item"));
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
