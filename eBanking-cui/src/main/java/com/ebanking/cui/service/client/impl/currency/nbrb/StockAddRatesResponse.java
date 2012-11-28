/**
 * StockAddRatesResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public class StockAddRatesResponse  implements java.io.Serializable {
    private StockAddRatesResponseStockAddRatesResult stockAddRatesResult;

    public StockAddRatesResponse() {
    }

    public StockAddRatesResponse(
           StockAddRatesResponseStockAddRatesResult stockAddRatesResult) {
           this.stockAddRatesResult = stockAddRatesResult;
    }


    /**
     * Gets the stockAddRatesResult value for this StockAddRatesResponse.
     * 
     * @return stockAddRatesResult
     */
    public StockAddRatesResponseStockAddRatesResult getStockAddRatesResult() {
        return stockAddRatesResult;
    }


    /**
     * Sets the stockAddRatesResult value for this StockAddRatesResponse.
     * 
     * @param stockAddRatesResult
     */
    public void setStockAddRatesResult(StockAddRatesResponseStockAddRatesResult stockAddRatesResult) {
        this.stockAddRatesResult = stockAddRatesResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StockAddRatesResponse)) return false;
        StockAddRatesResponse other = (StockAddRatesResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.stockAddRatesResult==null && other.getStockAddRatesResult()==null) || 
             (this.stockAddRatesResult!=null &&
              this.stockAddRatesResult.equals(other.getStockAddRatesResult())));
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
        if (getStockAddRatesResult() != null) {
            _hashCode += getStockAddRatesResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StockAddRatesResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">StockAddRatesResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stockAddRatesResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.nbrb.by/", "StockAddRatesResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.nbrb.by/", ">>StockAddRatesResponse>StockAddRatesResult"));
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
