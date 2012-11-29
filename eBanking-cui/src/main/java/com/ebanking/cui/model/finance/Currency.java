/**
 * Currency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.finance;

public class Currency  implements java.io.Serializable {
    private java.lang.String currencyCode;

    private java.lang.String currencyDescription;

    private long currencyId;

    public Currency() {
    }

    public Currency(
           java.lang.String currencyCode,
           java.lang.String currencyDescription,
           long currencyId) {
           this.currencyCode = currencyCode;
           this.currencyDescription = currencyDescription;
           this.currencyId = currencyId;
    }


    /**
     * Gets the currencyCode value for this Currency.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this Currency.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the currencyDescription value for this Currency.
     * 
     * @return currencyDescription
     */
    public java.lang.String getCurrencyDescription() {
        return currencyDescription;
    }


    /**
     * Sets the currencyDescription value for this Currency.
     * 
     * @param currencyDescription
     */
    public void setCurrencyDescription(java.lang.String currencyDescription) {
        this.currencyDescription = currencyDescription;
    }


    /**
     * Gets the currencyId value for this Currency.
     * 
     * @return currencyId
     */
    public long getCurrencyId() {
        return currencyId;
    }


    /**
     * Sets the currencyId value for this Currency.
     * 
     * @param currencyId
     */
    public void setCurrencyId(long currencyId) {
        this.currencyId = currencyId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Currency)) return false;
        Currency other = (Currency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.currencyDescription==null && other.getCurrencyDescription()==null) || 
             (this.currencyDescription!=null &&
              this.currencyDescription.equals(other.getCurrencyDescription()))) &&
            this.currencyId == other.getCurrencyId();
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getCurrencyDescription() != null) {
            _hashCode += getCurrencyDescription().hashCode();
        }
        _hashCode += new Long(getCurrencyId()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Currency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Currency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "currencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "currencyDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "currencyId"));
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
