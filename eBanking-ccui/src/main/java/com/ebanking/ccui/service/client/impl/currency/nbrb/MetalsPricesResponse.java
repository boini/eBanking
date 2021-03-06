/**
 * MetalsPricesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.currency.nbrb;

public class MetalsPricesResponse  implements java.io.Serializable {
    private MetalsPricesResponseMetalsPricesResult metalsPricesResult;

    public MetalsPricesResponse() {
    }

    public MetalsPricesResponse(
           MetalsPricesResponseMetalsPricesResult metalsPricesResult) {
           this.metalsPricesResult = metalsPricesResult;
    }


    /**
     * Gets the metalsPricesResult value for this MetalsPricesResponse.
     * 
     * @return metalsPricesResult
     */
    public MetalsPricesResponseMetalsPricesResult getMetalsPricesResult() {
        return metalsPricesResult;
    }


    /**
     * Sets the metalsPricesResult value for this MetalsPricesResponse.
     * 
     * @param metalsPricesResult
     */
    public void setMetalsPricesResult(MetalsPricesResponseMetalsPricesResult metalsPricesResult) {
        this.metalsPricesResult = metalsPricesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetalsPricesResponse)) return false;
        MetalsPricesResponse other = (MetalsPricesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metalsPricesResult==null && other.getMetalsPricesResult()==null) || 
             (this.metalsPricesResult!=null &&
              this.metalsPricesResult.equals(other.getMetalsPricesResult())));
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
        if (getMetalsPricesResult() != null) {
            _hashCode += getMetalsPricesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetalsPricesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">MetalsPricesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metalsPricesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "MetalsPricesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>MetalsPricesResponse>MetalsPricesResult"));
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
