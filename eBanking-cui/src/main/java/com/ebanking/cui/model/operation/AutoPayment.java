/**
 * AutoPayment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.operation;

public class AutoPayment  implements java.io.Serializable {
    private long autoPaymentId;

    private AutoPaymentType autoPaymentType;

    private java.util.Calendar nextDate;

    private Operation operation;

    public AutoPayment() {
    }

    public AutoPayment(
           long autoPaymentId,
           AutoPaymentType autoPaymentType,
           java.util.Calendar nextDate,
           Operation operation) {
           this.autoPaymentId = autoPaymentId;
           this.autoPaymentType = autoPaymentType;
           this.nextDate = nextDate;
           this.operation = operation;
    }


    /**
     * Gets the autoPaymentId value for this AutoPayment.
     * 
     * @return autoPaymentId
     */
    public long getAutoPaymentId() {
        return autoPaymentId;
    }


    /**
     * Sets the autoPaymentId value for this AutoPayment.
     * 
     * @param autoPaymentId
     */
    public void setAutoPaymentId(long autoPaymentId) {
        this.autoPaymentId = autoPaymentId;
    }


    /**
     * Gets the autoPaymentType value for this AutoPayment.
     * 
     * @return autoPaymentType
     */
    public AutoPaymentType getAutoPaymentType() {
        return autoPaymentType;
    }


    /**
     * Sets the autoPaymentType value for this AutoPayment.
     * 
     * @param autoPaymentType
     */
    public void setAutoPaymentType(AutoPaymentType autoPaymentType) {
        this.autoPaymentType = autoPaymentType;
    }


    /**
     * Gets the nextDate value for this AutoPayment.
     * 
     * @return nextDate
     */
    public java.util.Calendar getNextDate() {
        return nextDate;
    }


    /**
     * Sets the nextDate value for this AutoPayment.
     * 
     * @param nextDate
     */
    public void setNextDate(java.util.Calendar nextDate) {
        this.nextDate = nextDate;
    }


    /**
     * Gets the operation value for this AutoPayment.
     * 
     * @return operation
     */
    public Operation getOperation() {
        return operation;
    }


    /**
     * Sets the operation value for this AutoPayment.
     * 
     * @param operation
     */
    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutoPayment)) return false;
        AutoPayment other = (AutoPayment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.autoPaymentId == other.getAutoPaymentId() &&
            ((this.autoPaymentType==null && other.getAutoPaymentType()==null) || 
             (this.autoPaymentType!=null &&
              this.autoPaymentType.equals(other.getAutoPaymentType()))) &&
            ((this.nextDate==null && other.getNextDate()==null) || 
             (this.nextDate!=null &&
              this.nextDate.equals(other.getNextDate()))) &&
            ((this.operation==null && other.getOperation()==null) || 
             (this.operation!=null &&
              this.operation.equals(other.getOperation())));
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
        _hashCode += new Long(getAutoPaymentId()).hashCode();
        if (getAutoPaymentType() != null) {
            _hashCode += getAutoPaymentType().hashCode();
        }
        if (getNextDate() != null) {
            _hashCode += getNextDate().hashCode();
        }
        if (getOperation() != null) {
            _hashCode += getOperation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutoPayment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "AutoPayment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPaymentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "autoPaymentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autoPaymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "autoPaymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "AutoPaymentType"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "nextDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "Operation"));
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
