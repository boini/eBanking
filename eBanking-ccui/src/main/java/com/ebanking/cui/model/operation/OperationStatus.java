/**
 * OperationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.operation;

public class OperationStatus  implements java.io.Serializable {
    private java.lang.String description;

    private java.lang.String operationStatus;

    private long operationStatusId;

    public OperationStatus() {
    }

    public OperationStatus(
           java.lang.String description,
           java.lang.String operationStatus,
           long operationStatusId) {
           this.description = description;
           this.operationStatus = operationStatus;
           this.operationStatusId = operationStatusId;
    }


    /**
     * Gets the description value for this OperationStatus.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OperationStatus.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the operationStatus value for this OperationStatus.
     * 
     * @return operationStatus
     */
    public java.lang.String getOperationStatus() {
        return operationStatus;
    }


    /**
     * Sets the operationStatus value for this OperationStatus.
     * 
     * @param operationStatus
     */
    public void setOperationStatus(java.lang.String operationStatus) {
        this.operationStatus = operationStatus;
    }


    /**
     * Gets the operationStatusId value for this OperationStatus.
     * 
     * @return operationStatusId
     */
    public long getOperationStatusId() {
        return operationStatusId;
    }


    /**
     * Sets the operationStatusId value for this OperationStatus.
     * 
     * @param operationStatusId
     */
    public void setOperationStatusId(long operationStatusId) {
        this.operationStatusId = operationStatusId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationStatus)) return false;
        OperationStatus other = (OperationStatus) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.operationStatus==null && other.getOperationStatus()==null) || 
             (this.operationStatus!=null &&
              this.operationStatus.equals(other.getOperationStatus()))) &&
            this.operationStatusId == other.getOperationStatusId();
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
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getOperationStatus() != null) {
            _hashCode += getOperationStatus().hashCode();
        }
        _hashCode += new Long(getOperationStatusId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationStatus.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "OperationStatus"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operationStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationStatusId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "operationStatusId"));
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
