/**
 * ExRatesDynResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.currency.nbrb;

public class ExRatesDynResponse  implements java.io.Serializable {
    private ExRatesDynResponseExRatesDynResult exRatesDynResult;

    public ExRatesDynResponse() {
    }

    public ExRatesDynResponse(
           ExRatesDynResponseExRatesDynResult exRatesDynResult) {
           this.exRatesDynResult = exRatesDynResult;
    }


    /**
     * Gets the exRatesDynResult value for this ExRatesDynResponse.
     * 
     * @return exRatesDynResult
     */
    public ExRatesDynResponseExRatesDynResult getExRatesDynResult() {
        return exRatesDynResult;
    }


    /**
     * Sets the exRatesDynResult value for this ExRatesDynResponse.
     * 
     * @param exRatesDynResult
     */
    public void setExRatesDynResult(ExRatesDynResponseExRatesDynResult exRatesDynResult) {
        this.exRatesDynResult = exRatesDynResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ExRatesDynResponse)) return false;
        ExRatesDynResponse other = (ExRatesDynResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.exRatesDynResult==null && other.getExRatesDynResult()==null) || 
             (this.exRatesDynResult!=null &&
              this.exRatesDynResult.equals(other.getExRatesDynResult())));
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
        if (getExRatesDynResult() != null) {
            _hashCode += getExRatesDynResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ExRatesDynResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">ExRatesDynResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exRatesDynResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "ExRatesDynResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>ExRatesDynResponse>ExRatesDynResult"));
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
