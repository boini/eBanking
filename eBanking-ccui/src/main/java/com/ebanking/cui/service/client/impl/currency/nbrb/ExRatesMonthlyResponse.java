/**
 * ExRatesMonthlyResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class ExRatesMonthlyResponse  implements java.io.Serializable {
    private ExRatesMonthlyResponseExRatesMonthlyResult exRatesMonthlyResult;

    public ExRatesMonthlyResponse() {
    }

    public ExRatesMonthlyResponse(
           ExRatesMonthlyResponseExRatesMonthlyResult exRatesMonthlyResult) {
           this.exRatesMonthlyResult = exRatesMonthlyResult;
    }


    /**
     * Gets the exRatesMonthlyResult value for this ExRatesMonthlyResponse.
     * 
     * @return exRatesMonthlyResult
     */
    public ExRatesMonthlyResponseExRatesMonthlyResult getExRatesMonthlyResult() {
        return exRatesMonthlyResult;
    }


    /**
     * Sets the exRatesMonthlyResult value for this ExRatesMonthlyResponse.
     * 
     * @param exRatesMonthlyResult
     */
    public void setExRatesMonthlyResult(ExRatesMonthlyResponseExRatesMonthlyResult exRatesMonthlyResult) {
        this.exRatesMonthlyResult = exRatesMonthlyResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExRatesMonthlyResponse)) return false;
        ExRatesMonthlyResponse other = (ExRatesMonthlyResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exRatesMonthlyResult==null && other.getExRatesMonthlyResult()==null) || 
             (this.exRatesMonthlyResult!=null &&
              this.exRatesMonthlyResult.equals(other.getExRatesMonthlyResult())));
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
        if (getExRatesMonthlyResult() != null) {
            _hashCode += getExRatesMonthlyResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExRatesMonthlyResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">ExRatesMonthlyResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exRatesMonthlyResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "ExRatesMonthlyResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>ExRatesMonthlyResponse>ExRatesMonthlyResult"));
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
