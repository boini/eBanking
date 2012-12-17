/**
 * RefRateDynResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.currency.nbrb;

public class RefRateDynResponse  implements java.io.Serializable {
    private RefRateDynResponseRefRateDynResult refRateDynResult;

    public RefRateDynResponse() {
    }

    public RefRateDynResponse(
           RefRateDynResponseRefRateDynResult refRateDynResult) {
           this.refRateDynResult = refRateDynResult;
    }


    /**
     * Gets the refRateDynResult value for this RefRateDynResponse.
     * 
     * @return refRateDynResult
     */
    public RefRateDynResponseRefRateDynResult getRefRateDynResult() {
        return refRateDynResult;
    }


    /**
     * Sets the refRateDynResult value for this RefRateDynResponse.
     * 
     * @param refRateDynResult
     */
    public void setRefRateDynResult(RefRateDynResponseRefRateDynResult refRateDynResult) {
        this.refRateDynResult = refRateDynResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RefRateDynResponse)) return false;
        RefRateDynResponse other = (RefRateDynResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.refRateDynResult==null && other.getRefRateDynResult()==null) || 
             (this.refRateDynResult!=null &&
              this.refRateDynResult.equals(other.getRefRateDynResult())));
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
        if (getRefRateDynResult() != null) {
            _hashCode += getRefRateDynResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RefRateDynResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">RefRateDynResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refRateDynResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "RefRateDynResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>RefRateDynResponse>RefRateDynResult"));
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
