/**
 * ExRatesDailyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.currency.nbrb;

public class ExRatesDailyResponse  implements java.io.Serializable {
    private ExRatesDailyResponseExRatesDailyResult exRatesDailyResult;

    public ExRatesDailyResponse() {
    }

    public ExRatesDailyResponse(
           ExRatesDailyResponseExRatesDailyResult exRatesDailyResult) {
           this.exRatesDailyResult = exRatesDailyResult;
    }


    /**
     * Gets the exRatesDailyResult value for this ExRatesDailyResponse.
     * 
     * @return exRatesDailyResult
     */
    public ExRatesDailyResponseExRatesDailyResult getExRatesDailyResult() {
        return exRatesDailyResult;
    }


    /**
     * Sets the exRatesDailyResult value for this ExRatesDailyResponse.
     * 
     * @param exRatesDailyResult
     */
    public void setExRatesDailyResult(ExRatesDailyResponseExRatesDailyResult exRatesDailyResult) {
        this.exRatesDailyResult = exRatesDailyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExRatesDailyResponse)) return false;
        ExRatesDailyResponse other = (ExRatesDailyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exRatesDailyResult==null && other.getExRatesDailyResult()==null) || 
             (this.exRatesDailyResult!=null &&
              this.exRatesDailyResult.equals(other.getExRatesDailyResult())));
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
        if (getExRatesDailyResult() != null) {
            _hashCode += getExRatesDailyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExRatesDailyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">ExRatesDailyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exRatesDailyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "ExRatesDailyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>ExRatesDailyResponse>ExRatesDailyResult"));
        elemField.setMinOccurs(0);
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
