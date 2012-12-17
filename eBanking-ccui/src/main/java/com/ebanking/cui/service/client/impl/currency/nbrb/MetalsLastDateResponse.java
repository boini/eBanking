/**
 * MetalsLastDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class MetalsLastDateResponse  implements java.io.Serializable {
    private java.util.Calendar metalsLastDateResult;

    public MetalsLastDateResponse() {
    }

    public MetalsLastDateResponse(
           java.util.Calendar metalsLastDateResult) {
           this.metalsLastDateResult = metalsLastDateResult;
    }


    /**
     * Gets the metalsLastDateResult value for this MetalsLastDateResponse.
     * 
     * @return metalsLastDateResult
     */
    public java.util.Calendar getMetalsLastDateResult() {
        return metalsLastDateResult;
    }


    /**
     * Sets the metalsLastDateResult value for this MetalsLastDateResponse.
     * 
     * @param metalsLastDateResult
     */
    public void setMetalsLastDateResult(java.util.Calendar metalsLastDateResult) {
        this.metalsLastDateResult = metalsLastDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetalsLastDateResponse)) return false;
        MetalsLastDateResponse other = (MetalsLastDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metalsLastDateResult==null && other.getMetalsLastDateResult()==null) || 
             (this.metalsLastDateResult!=null &&
              this.metalsLastDateResult.equals(other.getMetalsLastDateResult())));
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
        if (getMetalsLastDateResult() != null) {
            _hashCode += getMetalsLastDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetalsLastDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">MetalsLastDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metalsLastDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "MetalsLastDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
