/**
 * AppLogRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.request;

public class AppLogRQ  implements java.io.Serializable {
    private java.lang.String actionSearch;

    private java.util.Calendar fromDate;

    private java.lang.String messageSearch;

    private java.util.Calendar toDate;

    public AppLogRQ() {
    }

    public AppLogRQ(
           java.lang.String actionSearch,
           java.util.Calendar fromDate,
           java.lang.String messageSearch,
           java.util.Calendar toDate) {
           this.actionSearch = actionSearch;
           this.fromDate = fromDate;
           this.messageSearch = messageSearch;
           this.toDate = toDate;
    }


    /**
     * Gets the actionSearch value for this AppLogRQ.
     * 
     * @return actionSearch
     */
    public java.lang.String getActionSearch() {
        return actionSearch;
    }


    /**
     * Sets the actionSearch value for this AppLogRQ.
     * 
     * @param actionSearch
     */
    public void setActionSearch(java.lang.String actionSearch) {
        this.actionSearch = actionSearch;
    }


    /**
     * Gets the fromDate value for this AppLogRQ.
     * 
     * @return fromDate
     */
    public java.util.Calendar getFromDate() {
        return fromDate;
    }


    /**
     * Sets the fromDate value for this AppLogRQ.
     * 
     * @param fromDate
     */
    public void setFromDate(java.util.Calendar fromDate) {
        this.fromDate = fromDate;
    }


    /**
     * Gets the messageSearch value for this AppLogRQ.
     * 
     * @return messageSearch
     */
    public java.lang.String getMessageSearch() {
        return messageSearch;
    }


    /**
     * Sets the messageSearch value for this AppLogRQ.
     * 
     * @param messageSearch
     */
    public void setMessageSearch(java.lang.String messageSearch) {
        this.messageSearch = messageSearch;
    }


    /**
     * Gets the toDate value for this AppLogRQ.
     * 
     * @return toDate
     */
    public java.util.Calendar getToDate() {
        return toDate;
    }


    /**
     * Sets the toDate value for this AppLogRQ.
     * 
     * @param toDate
     */
    public void setToDate(java.util.Calendar toDate) {
        this.toDate = toDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AppLogRQ)) return false;
        AppLogRQ other = (AppLogRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.actionSearch==null && other.getActionSearch()==null) || 
             (this.actionSearch!=null &&
              this.actionSearch.equals(other.getActionSearch()))) &&
            ((this.fromDate==null && other.getFromDate()==null) || 
             (this.fromDate!=null &&
              this.fromDate.equals(other.getFromDate()))) &&
            ((this.messageSearch==null && other.getMessageSearch()==null) || 
             (this.messageSearch!=null &&
              this.messageSearch.equals(other.getMessageSearch()))) &&
            ((this.toDate==null && other.getToDate()==null) || 
             (this.toDate!=null &&
              this.toDate.equals(other.getToDate())));
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
        if (getActionSearch() != null) {
            _hashCode += getActionSearch().hashCode();
        }
        if (getFromDate() != null) {
            _hashCode += getFromDate().hashCode();
        }
        if (getMessageSearch() != null) {
            _hashCode += getMessageSearch().hashCode();
        }
        if (getToDate() != null) {
            _hashCode += getToDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AppLogRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "AppLogRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("actionSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "actionSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "fromDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageSearch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "messageSearch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "toDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
