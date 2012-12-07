/**
 * CardOperationHistoryRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.response;

import com.ebanking.cui.model.operation.Operation;

public class CardOperationHistoryRS  implements java.io.Serializable {
    private Operation[] operations;

    public CardOperationHistoryRS() {
    }

    public CardOperationHistoryRS(
           Operation[] operations) {
           this.operations = operations;
    }


    /**
     * Gets the operations value for this CardOperationHistoryRS.
     * 
     * @return operations
     */
    public Operation[] getOperations() {
        return operations;
    }


    /**
     * Sets the operations value for this CardOperationHistoryRS.
     * 
     * @param operations
     */
    public void setOperations(Operation[] operations) {
        this.operations = operations;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardOperationHistoryRS)) return false;
        CardOperationHistoryRS other = (CardOperationHistoryRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.operations==null && other.getOperations()==null) || 
             (this.operations!=null &&
              java.util.Arrays.equals(this.operations, other.getOperations())));
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
        if (getOperations() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOperations());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOperations(), i);
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
        new org.apache.axis.description.TypeDesc(CardOperationHistoryRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "CardOperationHistoryRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operations");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "operations"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://operation.model.ws.ebanking.com", "Operation"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://info.impl.service.ws.ebanking.com", "item"));
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
