/**
 * IngotsLastDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class IngotsLastDateResponse  implements java.io.Serializable {
    private java.util.Calendar ingotsLastDateResult;

    public IngotsLastDateResponse() {
    }

    public IngotsLastDateResponse(
           java.util.Calendar ingotsLastDateResult) {
           this.ingotsLastDateResult = ingotsLastDateResult;
    }


    /**
     * Gets the ingotsLastDateResult value for this IngotsLastDateResponse.
     * 
     * @return ingotsLastDateResult
     */
    public java.util.Calendar getIngotsLastDateResult() {
        return ingotsLastDateResult;
    }


    /**
     * Sets the ingotsLastDateResult value for this IngotsLastDateResponse.
     * 
     * @param ingotsLastDateResult
     */
    public void setIngotsLastDateResult(java.util.Calendar ingotsLastDateResult) {
        this.ingotsLastDateResult = ingotsLastDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IngotsLastDateResponse)) return false;
        IngotsLastDateResponse other = (IngotsLastDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.ingotsLastDateResult==null && other.getIngotsLastDateResult()==null) || 
             (this.ingotsLastDateResult!=null &&
              this.ingotsLastDateResult.equals(other.getIngotsLastDateResult())));
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
        if (getIngotsLastDateResult() != null) {
            _hashCode += getIngotsLastDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IngotsLastDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">IngotsLastDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ingotsLastDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "IngotsLastDateResult"));
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
