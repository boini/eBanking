/**
 * CurrenciesRefResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class CurrenciesRefResponse  implements java.io.Serializable {
    private CurrenciesRefResponseCurrenciesRefResult currenciesRefResult;

    public CurrenciesRefResponse() {
    }

    public CurrenciesRefResponse(
           CurrenciesRefResponseCurrenciesRefResult currenciesRefResult) {
           this.currenciesRefResult = currenciesRefResult;
    }


    /**
     * Gets the currenciesRefResult value for this CurrenciesRefResponse.
     * 
     * @return currenciesRefResult
     */
    public CurrenciesRefResponseCurrenciesRefResult getCurrenciesRefResult() {
        return currenciesRefResult;
    }


    /**
     * Sets the currenciesRefResult value for this CurrenciesRefResponse.
     * 
     * @param currenciesRefResult
     */
    public void setCurrenciesRefResult(CurrenciesRefResponseCurrenciesRefResult currenciesRefResult) {
        this.currenciesRefResult = currenciesRefResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CurrenciesRefResponse)) return false;
        CurrenciesRefResponse other = (CurrenciesRefResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currenciesRefResult==null && other.getCurrenciesRefResult()==null) || 
             (this.currenciesRefResult!=null &&
              this.currenciesRefResult.equals(other.getCurrenciesRefResult())));
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
        if (getCurrenciesRefResult() != null) {
            _hashCode += getCurrenciesRefResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrenciesRefResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">CurrenciesRefResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currenciesRefResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "CurrenciesRefResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>CurrenciesRefResponse>CurrenciesRefResult"));
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
