/**
 * SaveRateRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.request;

public class SaveRateRQ  implements java.io.Serializable {
    private double purchase;

    private long rateId;

    private double sale;

    public SaveRateRQ() {
    }

    public SaveRateRQ(
           double purchase,
           long rateId,
           double sale) {
           this.purchase = purchase;
           this.rateId = rateId;
           this.sale = sale;
    }


    /**
     * Gets the purchase value for this SaveRateRQ.
     * 
     * @return purchase
     */
    public double getPurchase() {
        return purchase;
    }


    /**
     * Sets the purchase value for this SaveRateRQ.
     * 
     * @param purchase
     */
    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }


    /**
     * Gets the rateId value for this SaveRateRQ.
     * 
     * @return rateId
     */
    public long getRateId() {
        return rateId;
    }


    /**
     * Sets the rateId value for this SaveRateRQ.
     * 
     * @param rateId
     */
    public void setRateId(long rateId) {
        this.rateId = rateId;
    }


    /**
     * Gets the sale value for this SaveRateRQ.
     * 
     * @return sale
     */
    public double getSale() {
        return sale;
    }


    /**
     * Sets the sale value for this SaveRateRQ.
     * 
     * @param sale
     */
    public void setSale(double sale) {
        this.sale = sale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SaveRateRQ)) return false;
        SaveRateRQ other = (SaveRateRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.purchase == other.getPurchase() &&
            this.rateId == other.getRateId() &&
            this.sale == other.getSale();
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
        _hashCode += new Double(getPurchase()).hashCode();
        _hashCode += new Long(getRateId()).hashCode();
        _hashCode += new Double(getSale()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SaveRateRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "SaveRateRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "purchase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "rateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "sale"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
