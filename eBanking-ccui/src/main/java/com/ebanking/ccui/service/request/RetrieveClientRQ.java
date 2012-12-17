/**
 * RetrieveClientRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.request;

public class RetrieveClientRQ  implements java.io.Serializable {
    private long clientId;

    private java.lang.String searchField;

    private java.lang.String searchKey;

    private java.lang.String type;

    public RetrieveClientRQ() {
    }

    public RetrieveClientRQ(
           long clientId,
           java.lang.String searchField,
           java.lang.String searchKey,
           java.lang.String type) {
           this.clientId = clientId;
           this.searchField = searchField;
           this.searchKey = searchKey;
           this.type = type;
    }


    /**
     * Gets the clientId value for this RetrieveClientRQ.
     * 
     * @return clientId
     */
    public long getClientId() {
        return clientId;
    }


    /**
     * Sets the clientId value for this RetrieveClientRQ.
     * 
     * @param clientId
     */
    public void setClientId(long clientId) {
        this.clientId = clientId;
    }


    /**
     * Gets the searchField value for this RetrieveClientRQ.
     * 
     * @return searchField
     */
    public java.lang.String getSearchField() {
        return searchField;
    }


    /**
     * Sets the searchField value for this RetrieveClientRQ.
     * 
     * @param searchField
     */
    public void setSearchField(java.lang.String searchField) {
        this.searchField = searchField;
    }


    /**
     * Gets the searchKey value for this RetrieveClientRQ.
     * 
     * @return searchKey
     */
    public java.lang.String getSearchKey() {
        return searchKey;
    }


    /**
     * Sets the searchKey value for this RetrieveClientRQ.
     * 
     * @param searchKey
     */
    public void setSearchKey(java.lang.String searchKey) {
        this.searchKey = searchKey;
    }


    /**
     * Gets the type value for this RetrieveClientRQ.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RetrieveClientRQ.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RetrieveClientRQ)) return false;
        RetrieveClientRQ other = (RetrieveClientRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clientId == other.getClientId() &&
            ((this.searchField==null && other.getSearchField()==null) || 
             (this.searchField!=null &&
              this.searchField.equals(other.getSearchField()))) &&
            ((this.searchKey==null && other.getSearchKey()==null) || 
             (this.searchKey!=null &&
              this.searchKey.equals(other.getSearchKey()))) &&
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType())));
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
        _hashCode += new Long(getClientId()).hashCode();
        if (getSearchField() != null) {
            _hashCode += getSearchField().hashCode();
        }
        if (getSearchKey() != null) {
            _hashCode += getSearchKey().hashCode();
        }
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RetrieveClientRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "RetrieveClientRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "clientId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchField");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "searchField"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("searchKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "searchKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "type"));
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
