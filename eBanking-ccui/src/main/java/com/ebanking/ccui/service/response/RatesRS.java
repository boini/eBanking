/**
 * RatesRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.response;

import com.ebanking.ccui.model.finance.Rate;

public class RatesRS  implements java.io.Serializable {
    private Rate[] rates;

    public RatesRS() {
    }

    public RatesRS(
           Rate[] rates) {
           this.rates = rates;
    }


    /**
     * Gets the rates value for this RatesRS.
     * 
     * @return rates
     */
    public Rate[] getRates() {
        return rates;
    }


    /**
     * Sets the rates value for this RatesRS.
     * 
     * @param rates
     */
    public void setRates(Rate[] rates) {
        this.rates = rates;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatesRS)) return false;
        RatesRS other = (RatesRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.rates==null && other.getRates()==null) || 
             (this.rates!=null &&
              java.util.Arrays.equals(this.rates, other.getRates())));
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
        if (getRates() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRates());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRates(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RatesRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "RatesRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rates");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "rates"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Rate"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://finance.impl.service.ws.ebanking.com", "item"));
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
