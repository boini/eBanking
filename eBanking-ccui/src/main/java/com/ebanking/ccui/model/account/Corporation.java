/**
 * Corporation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.model.account;

public class Corporation  implements java.io.Serializable {
    private java.lang.Object[] bankAccountList;

    private long corporationId;

    private java.lang.String corporationName;

    private java.lang.String description;

    public Corporation() {
    }

    public Corporation(
           java.lang.Object[] bankAccountList,
           long corporationId,
           java.lang.String corporationName,
           java.lang.String description) {
           this.bankAccountList = bankAccountList;
           this.corporationId = corporationId;
           this.corporationName = corporationName;
           this.description = description;
    }


    /**
     * Gets the bankAccountList value for this Corporation.
     * 
     * @return bankAccountList
     */
    public java.lang.Object[] getBankAccountList() {
        return bankAccountList;
    }


    /**
     * Sets the bankAccountList value for this Corporation.
     * 
     * @param bankAccountList
     */
    public void setBankAccountList(java.lang.Object[] bankAccountList) {
        this.bankAccountList = bankAccountList;
    }


    /**
     * Gets the corporationId value for this Corporation.
     * 
     * @return corporationId
     */
    public long getCorporationId() {
        return corporationId;
    }


    /**
     * Sets the corporationId value for this Corporation.
     * 
     * @param corporationId
     */
    public void setCorporationId(long corporationId) {
        this.corporationId = corporationId;
    }


    /**
     * Gets the corporationName value for this Corporation.
     * 
     * @return corporationName
     */
    public java.lang.String getCorporationName() {
        return corporationName;
    }


    /**
     * Sets the corporationName value for this Corporation.
     * 
     * @param corporationName
     */
    public void setCorporationName(java.lang.String corporationName) {
        this.corporationName = corporationName;
    }


    /**
     * Gets the description value for this Corporation.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this Corporation.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Corporation)) return false;
        Corporation other = (Corporation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bankAccountList==null && other.getBankAccountList()==null) || 
             (this.bankAccountList!=null &&
              java.util.Arrays.equals(this.bankAccountList, other.getBankAccountList()))) &&
            this.corporationId == other.getCorporationId() &&
            ((this.corporationName==null && other.getCorporationName()==null) || 
             (this.corporationName!=null &&
              this.corporationName.equals(other.getCorporationName()))) &&
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
        if (getBankAccountList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBankAccountList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBankAccountList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Long(getCorporationId()).hashCode();
        if (getCorporationName() != null) {
            _hashCode += getCorporationName().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Corporation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://cardAccount.model.ws.ebanking.com", "Corporation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankAccountList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cardAccount.model.ws.ebanking.com", "bankAccountList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setNillable(true);
        elemField.setItemQName(new javax.xml.namespace.QName("http://info.impl.service.ws.ebanking.com", "item"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporationId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cardAccount.model.ws.ebanking.com", "corporationId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cardAccount.model.ws.ebanking.com", "corporationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://cardAccount.model.ws.ebanking.com", "description"));
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
