/**
 * Address.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.model.address;

public class Address  implements java.io.Serializable {
    private long addressId;

    private City city;

    private java.lang.String flatNumber;

    private java.lang.String houseNumber;

    private java.lang.String region;

    public Address() {
    }

    public Address(
           long addressId,
           City city,
           java.lang.String flatNumber,
           java.lang.String houseNumber,
           java.lang.String region) {
           this.addressId = addressId;
           this.city = city;
           this.flatNumber = flatNumber;
           this.houseNumber = houseNumber;
           this.region = region;
    }


    /**
     * Gets the addressId value for this Address.
     * 
     * @return addressId
     */
    public long getAddressId() {
        return addressId;
    }


    /**
     * Sets the addressId value for this Address.
     * 
     * @param addressId
     */
    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }


    /**
     * Gets the city value for this Address.
     * 
     * @return city
     */
    public City getCity() {
        return city;
    }


    /**
     * Sets the city value for this Address.
     * 
     * @param city
     */
    public void setCity(City city) {
        this.city = city;
    }


    /**
     * Gets the flatNumber value for this Address.
     * 
     * @return flatNumber
     */
    public java.lang.String getFlatNumber() {
        return flatNumber;
    }


    /**
     * Sets the flatNumber value for this Address.
     * 
     * @param flatNumber
     */
    public void setFlatNumber(java.lang.String flatNumber) {
        this.flatNumber = flatNumber;
    }


    /**
     * Gets the houseNumber value for this Address.
     * 
     * @return houseNumber
     */
    public java.lang.String getHouseNumber() {
        return houseNumber;
    }


    /**
     * Sets the houseNumber value for this Address.
     * 
     * @param houseNumber
     */
    public void setHouseNumber(java.lang.String houseNumber) {
        this.houseNumber = houseNumber;
    }


    /**
     * Gets the region value for this Address.
     * 
     * @return region
     */
    public java.lang.String getRegion() {
        return region;
    }


    /**
     * Sets the region value for this Address.
     * 
     * @param region
     */
    public void setRegion(java.lang.String region) {
        this.region = region;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Address)) return false;
        Address other = (Address) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.addressId == other.getAddressId() &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.flatNumber==null && other.getFlatNumber()==null) || 
             (this.flatNumber!=null &&
              this.flatNumber.equals(other.getFlatNumber()))) &&
            ((this.houseNumber==null && other.getHouseNumber()==null) || 
             (this.houseNumber!=null &&
              this.houseNumber.equals(other.getHouseNumber()))) &&
            ((this.region==null && other.getRegion()==null) || 
             (this.region!=null &&
              this.region.equals(other.getRegion())));
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
        _hashCode += new Long(getAddressId()).hashCode();
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getFlatNumber() != null) {
            _hashCode += getFlatNumber().hashCode();
        }
        if (getHouseNumber() != null) {
            _hashCode += getHouseNumber().hashCode();
        }
        if (getRegion() != null) {
            _hashCode += getRegion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Address.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "Address"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "addressId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "City"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flatNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "flatNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("houseNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "houseNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("region");
        elemField.setXmlName(new javax.xml.namespace.QName("http://address.model.ws.ebanking.com", "region"));
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
