/**
 * Rate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.model.finance;

public class Rate  implements java.io.Serializable {
    private Currency currency;

    private double purchase;

    private long rateId;

    private double sale;

    public Rate() {
    }

    public Rate(
           Currency currency,
           double purchase,
           long rateId,
           double sale) {
           this.currency = currency;
           this.purchase = purchase;
           this.rateId = rateId;
           this.sale = sale;
    }


    /**
     * Gets the currency value for this Rate.
     * 
     * @return currency
     */
    public Currency getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this Rate.
     * 
     * @param currency
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }


    /**
     * Gets the purchase value for this Rate.
     * 
     * @return purchase
     */
    public double getPurchase() {
        return purchase;
    }


    /**
     * Sets the purchase value for this Rate.
     * 
     * @param purchase
     */
    public void setPurchase(double purchase) {
        this.purchase = purchase;
    }


    /**
     * Gets the rateId value for this Rate.
     * 
     * @return rateId
     */
    public long getRateId() {
        return rateId;
    }


    /**
     * Sets the rateId value for this Rate.
     * 
     * @param rateId
     */
    public void setRateId(long rateId) {
        this.rateId = rateId;
    }


    /**
     * Gets the sale value for this Rate.
     * 
     * @return sale
     */
    public double getSale() {
        return sale;
    }


    /**
     * Sets the sale value for this Rate.
     * 
     * @param sale
     */
    public void setSale(double sale) {
        this.sale = sale;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Rate)) return false;
        Rate other = (Rate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
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
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        _hashCode += new Double(getPurchase()).hashCode();
        _hashCode += new Long(getRateId()).hashCode();
        _hashCode += new Double(getSale()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Rate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Rate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "Currency"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchase");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "purchase"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rateId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "rateId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sale");
        elemField.setXmlName(new javax.xml.namespace.QName("http://finance.model.ws.ebanking.com", "sale"));
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
