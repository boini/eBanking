/**
 * RatesRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.request;

import com.ebanking.ccui.model.finance.Currency;

public class RatesRQ  implements java.io.Serializable {
    private Currency[] currencies;

    public RatesRQ() {
    }

    public RatesRQ(
           Currency[] currencies) {
           this.currencies = currencies;
    }


    /**
     * Gets the currencies value for this RatesRQ.
     * 
     * @return currencies
     */
    public Currency[] getCurrencies() {
        return currencies;
    }


    /**
     * Sets the currencies value for this RatesRQ.
     * 
     * @param currencies
     */
    public void setCurrencies(Currency[] currencies) {
        this.currencies = currencies;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RatesRQ)) return false;
        RatesRQ other = (RatesRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencies==null && other.getCurrencies()==null) || 
             (this.currencies!=null &&
              java.util.Arrays.equals(this.currencies, other.getCurrencies())));
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
        if (getCurrencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCurrencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCurrencies(), i);
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
        new org.apache.axis.description.TypeDesc(RatesRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "RatesRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "currencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Currency"));
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
