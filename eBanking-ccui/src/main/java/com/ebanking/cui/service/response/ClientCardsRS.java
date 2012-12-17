/**
 * ClientCardsRS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.response;

import com.ebanking.cui.model.card.Card;

public class ClientCardsRS  implements java.io.Serializable {
    private Card[] cards;

    public ClientCardsRS() {
    }

    public ClientCardsRS(
           Card[] cards) {
           this.cards = cards;
    }


    /**
     * Gets the cards value for this ClientCardsRS.
     * 
     * @return cards
     */
    public Card[] getCards() {
        return cards;
    }


    /**
     * Sets the cards value for this ClientCardsRS.
     * 
     * @param cards
     */
    public void setCards(Card[] cards) {
        this.cards = cards;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ClientCardsRS)) return false;
        ClientCardsRS other = (ClientCardsRS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cards==null && other.getCards()==null) || 
             (this.cards!=null &&
              java.util.Arrays.equals(this.cards, other.getCards())));
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
        if (getCards() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCards());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCards(), i);
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
        new org.apache.axis.description.TypeDesc(ClientCardsRS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "ClientCardsRS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cards");
        elemField.setXmlName(new javax.xml.namespace.QName("http://response.service.ws.ebanking.com", "cards"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "Card"));
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
