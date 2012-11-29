/**
 * CardAccountRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.response;

import com.ebanking.cui.model.card.CardAccount;

public class CardAccountRS  implements java.io.Serializable {
    private CardAccount[] cardAccounts;

    public CardAccountRS() {
    }

    public CardAccountRS(
           CardAccount[] cardAccounts) {
           this.cardAccounts = cardAccounts;
    }


    /**
     * Gets the cardAccounts value for this CardAccountRS.
     * 
     * @return cardAccounts
     */
    public CardAccount[] getCardAccounts() {
        return cardAccounts;
    }


    /**
     * Sets the cardAccounts value for this CardAccountRS.
     * 
     * @param cardAccounts
     */
    public void setCardAccounts(CardAccount[] cardAccounts) {
        this.cardAccounts = cardAccounts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardAccountRS)) return false;
        CardAccountRS other = (CardAccountRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cardAccounts==null && other.getCardAccounts()==null) || 
             (this.cardAccounts!=null &&
              java.util.Arrays.equals(this.cardAccounts, other.getCardAccounts())));
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
        if (getCardAccounts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCardAccounts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCardAccounts(), i);
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
        new org.apache.axis.description.TypeDesc(CardAccountRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "CardAccountRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardAccounts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "cardAccounts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "CardAccount"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://card.impl.service.ws.ebanking.com", "item"));
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
