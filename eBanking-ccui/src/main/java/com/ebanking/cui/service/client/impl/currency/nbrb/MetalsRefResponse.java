/**
 * MetalsRefResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class MetalsRefResponse  implements java.io.Serializable {
    private MetalsRefResponseMetalsRefResult metalsRefResult;

    public MetalsRefResponse() {
    }

    public MetalsRefResponse(
           MetalsRefResponseMetalsRefResult metalsRefResult) {
           this.metalsRefResult = metalsRefResult;
    }


    /**
     * Gets the metalsRefResult value for this MetalsRefResponse.
     * 
     * @return metalsRefResult
     */
    public MetalsRefResponseMetalsRefResult getMetalsRefResult() {
        return metalsRefResult;
    }


    /**
     * Sets the metalsRefResult value for this MetalsRefResponse.
     * 
     * @param metalsRefResult
     */
    public void setMetalsRefResult(MetalsRefResponseMetalsRefResult metalsRefResult) {
        this.metalsRefResult = metalsRefResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MetalsRefResponse)) return false;
        MetalsRefResponse other = (MetalsRefResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.metalsRefResult==null && other.getMetalsRefResult()==null) || 
             (this.metalsRefResult!=null &&
              this.metalsRefResult.equals(other.getMetalsRefResult())));
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
        if (getMetalsRefResult() != null) {
            _hashCode += getMetalsRefResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MetalsRefResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">MetalsRefResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("metalsRefResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "MetalsRefResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>MetalsRefResponse>MetalsRefResult"));
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
