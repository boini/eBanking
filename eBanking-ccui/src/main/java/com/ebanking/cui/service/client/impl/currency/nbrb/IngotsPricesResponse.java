/**
 * IngotsPricesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class IngotsPricesResponse  implements java.io.Serializable {
    private IngotsPricesResponseIngotsPricesResult ingotsPricesResult;

    public IngotsPricesResponse() {
    }

    public IngotsPricesResponse(
           IngotsPricesResponseIngotsPricesResult ingotsPricesResult) {
           this.ingotsPricesResult = ingotsPricesResult;
    }


    /**
     * Gets the ingotsPricesResult value for this IngotsPricesResponse.
     * 
     * @return ingotsPricesResult
     */
    public IngotsPricesResponseIngotsPricesResult getIngotsPricesResult() {
        return ingotsPricesResult;
    }


    /**
     * Sets the ingotsPricesResult value for this IngotsPricesResponse.
     * 
     * @param ingotsPricesResult
     */
    public void setIngotsPricesResult(IngotsPricesResponseIngotsPricesResult ingotsPricesResult) {
        this.ingotsPricesResult = ingotsPricesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IngotsPricesResponse)) return false;
        IngotsPricesResponse other = (IngotsPricesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ingotsPricesResult==null && other.getIngotsPricesResult()==null) || 
             (this.ingotsPricesResult!=null &&
              this.ingotsPricesResult.equals(other.getIngotsPricesResult())));
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
        if (getIngotsPricesResult() != null) {
            _hashCode += getIngotsPricesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IngotsPricesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">IngotsPricesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingotsPricesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "IngotsPricesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>IngotsPricesResponse>IngotsPricesResult"));
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
