/**
 * CardType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.model.card;

public class CardType  implements java.io.Serializable {
    private long cardTypeId;

    private java.lang.String cardTypeName;

    private java.lang.String description;

    public CardType() {
    }

    public CardType(
           long cardTypeId,
           java.lang.String cardTypeName,
           java.lang.String description) {
           this.cardTypeId = cardTypeId;
           this.cardTypeName = cardTypeName;
           this.description = description;
    }


    /**
     * Gets the cardTypeId value for this CardType.
     * 
     * @return cardTypeId
     */
    public long getCardTypeId() {
        return cardTypeId;
    }


    /**
     * Sets the cardTypeId value for this CardType.
     * 
     * @param cardTypeId
     */
    public void setCardTypeId(long cardTypeId) {
        this.cardTypeId = cardTypeId;
    }


    /**
     * Gets the cardTypeName value for this CardType.
     * 
     * @return cardTypeName
     */
    public java.lang.String getCardTypeName() {
        return cardTypeName;
    }


    /**
     * Sets the cardTypeName value for this CardType.
     * 
     * @param cardTypeName
     */
    public void setCardTypeName(java.lang.String cardTypeName) {
        this.cardTypeName = cardTypeName;
    }


    /**
     * Gets the description value for this CardType.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CardType.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CardType)) return false;
        CardType other = (CardType) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.cardTypeId == other.getCardTypeId() &&
            ((this.cardTypeName==null && other.getCardTypeName()==null) || 
             (this.cardTypeName!=null &&
              this.cardTypeName.equals(other.getCardTypeName()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription())));
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
        _hashCode += new Long(getCardTypeId()).hashCode();
        if (getCardTypeName() != null) {
            _hashCode += getCardTypeName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CardType.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "CardType"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardTypeId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "cardTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://card.model.ws.ebanking.com", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
