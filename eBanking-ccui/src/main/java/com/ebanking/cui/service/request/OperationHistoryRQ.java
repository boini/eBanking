/**
 * OperationHistoryRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.request;

public class OperationHistoryRQ  implements java.io.Serializable {
    private java.util.Calendar fromDate;

    private long[] idList;

    private java.lang.String operationRequestType;

    private java.util.Calendar toDate;

    public OperationHistoryRQ() {
    }

    public OperationHistoryRQ(
           java.util.Calendar fromDate,
           long[] idList,
           java.lang.String operationRequestType,
           java.util.Calendar toDate) {
           this.fromDate = fromDate;
           this.idList = idList;
           this.operationRequestType = operationRequestType;
           this.toDate = toDate;
    }


    /**
     * Gets the fromDate value for this OperationHistoryRQ.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this OperationHistoryRQ.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the idList value for this OperationHistoryRQ.
     * 
     * @return idList
     */
    public long[] getIdList() {
        return idList;
    }


    /**
     * Sets the idList value for this OperationHistoryRQ.
     * 
     * @param idList
     */
    public void setIdList(long[] idList) {
        this.idList = idList;
    }


    /**
     * Gets the operationRequestType value for this OperationHistoryRQ.
     * 
     * @return operationRequestType
     */
    public java.lang.String getOperationRequestType() {
        return operationRequestType;
    }


    /**
     * Sets the operationRequestType value for this OperationHistoryRQ.
     * 
     * @param operationRequestType
     */
    public void setOperationRequestType(java.lang.String operationRequestType) {
        this.operationRequestType = operationRequestType;
    }


    /**
     * Gets the toDate value for this OperationHistoryRQ.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this OperationHistoryRQ.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof OperationHistoryRQ)) return false;
        OperationHistoryRQ other = (OperationHistoryRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.idList==null && other.getIdList()==null) || 
             (this.idList!=null &&
              java.util.Arrays.equals(this.idList, other.getIdList()))) &&
            ((this.operationRequestType==null && other.getOperationRequestType()==null) || 
             (this.operationRequestType!=null &&
              this.operationRequestType.equals(other.getOperationRequestType()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getIdList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getIdList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOperationRequestType() != null) {
            _hashCode += getOperationRequestType().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OperationHistoryRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "OperationHistoryRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "idList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://info.impl.service.ws.ebanking.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operationRequestType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "operationRequestType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "toDate"));
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
