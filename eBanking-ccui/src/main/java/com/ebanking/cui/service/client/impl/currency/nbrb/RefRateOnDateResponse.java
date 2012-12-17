/**
 * RefRateOnDateResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class RefRateOnDateResponse  implements java.io.Serializable {
    private RefRateOnDateResponseRefRateOnDateResult refRateOnDateResult;

    public RefRateOnDateResponse() {
    }

    public RefRateOnDateResponse(
           RefRateOnDateResponseRefRateOnDateResult refRateOnDateResult) {
           this.refRateOnDateResult = refRateOnDateResult;
    }


    /**
     * Gets the refRateOnDateResult value for this RefRateOnDateResponse.
     * 
     * @return refRateOnDateResult
     */
    public RefRateOnDateResponseRefRateOnDateResult getRefRateOnDateResult() {
        return refRateOnDateResult;
    }


    /**
     * Sets the refRateOnDateResult value for this RefRateOnDateResponse.
     * 
     * @param refRateOnDateResult
     */
    public void setRefRateOnDateResult(RefRateOnDateResponseRefRateOnDateResult refRateOnDateResult) {
        this.refRateOnDateResult = refRateOnDateResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefRateOnDateResponse)) return false;
        RefRateOnDateResponse other = (RefRateOnDateResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refRateOnDateResult==null && other.getRefRateOnDateResult()==null) || 
             (this.refRateOnDateResult!=null &&
              this.refRateOnDateResult.equals(other.getRefRateOnDateResult())));
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
        if (getRefRateOnDateResult() != null) {
            _hashCode += getRefRateOnDateResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefRateOnDateResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">RefRateOnDateResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refRateOnDateResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "RefRateOnDateResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>RefRateOnDateResponse>RefRateOnDateResult"));
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
