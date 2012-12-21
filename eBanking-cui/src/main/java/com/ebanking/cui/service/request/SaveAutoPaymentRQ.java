/**
 * SaveAutoPaymentRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.request;

import com.ebanking.cui.model.operation.AutoPayment;

public class SaveAutoPaymentRQ  implements java.io.Serializable {
    private AutoPayment autoPayment;

    private long operationId;

    private java.lang.String period;

    public SaveAutoPaymentRQ() {
    }

    public SaveAutoPaymentRQ(
           AutoPayment autoPayment,
           long operationId,
           java.lang.String period) {
           this.autoPayment = autoPayment;
           this.operationId = operationId;
           this.period = period;
    }


    /**
     * Gets the autoPayment value for this SaveAutoPaymentRQ.
     * 
     * @return autoPayment
     */
    public AutoPayment getAutoPayment() {
        return autoPayment;
    }


    /**
     * Sets the autoPayment value for this SaveAutoPaymentRQ.
     * 
     * @param autoPayment
     */
    public void setAutoPayment(AutoPayment autoPayment) {
        this.autoPayment = autoPayment;
    }


    /**
     * Gets the operationId value for this SaveAutoPaymentRQ.
     * 
     * @return operationId
     */
    public long getOperationId() {
        return operationId;
    }


    /**
     * Sets the operationId value for this SaveAutoPaymentRQ.
     * 
     * @param operationId
     */
    public void setOperationId(long operationId) {
        this.operationId = operationId;
    }


    /**
     * Gets the period value for this SaveAutoPaymentRQ.
     * 
     * @return period
     */
    public java.lang.String getPeriod() {
        return period;
    }


    /**
     * Sets the period value for this SaveAutoPaymentRQ.
     * 
     * @param period
     */
    public void setPeriod(java.lang.String period) {
        this.period = period;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveAutoPaymentRQ)) return false;
        SaveAutoPaymentRQ other = (SaveAutoPaymentRQ) obj;
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
            this.operationId == other.getOperationId() &&
            ((this.period==null && other.getPeriod()==null) || 
             (this.period!=null &&
              this.period.equals(other.getPeriod())));
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
        _hashCode += new Long(getOperationId()).hashCode();
        if (getPeriod() != null) {
            _hashCode += getPeriod().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveAutoPaymentRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "SaveAutoPaymentRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPayment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "autoPayment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "AutoPayment"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "operationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "period"));
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
