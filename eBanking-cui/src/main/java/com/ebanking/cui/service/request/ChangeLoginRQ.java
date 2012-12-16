/**
 * ChangeLoginRQ.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.request;

public class ChangeLoginRQ  implements java.io.Serializable {
    private java.lang.String currentLogin;

    private java.lang.String newLogin;

    private java.lang.String password;

    public ChangeLoginRQ() {
    }

    public ChangeLoginRQ(
           java.lang.String currentLogin,
           java.lang.String newLogin,
           java.lang.String password) {
           this.currentLogin = currentLogin;
           this.newLogin = newLogin;
           this.password = password;
    }


    /**
     * Gets the currentLogin value for this ChangeLoginRQ.
     * 
     * @return currentLogin
     */
    public java.lang.String getCurrentLogin() {
        return currentLogin;
    }


    /**
     * Sets the currentLogin value for this ChangeLoginRQ.
     * 
     * @param currentLogin
     */
    public void setCurrentLogin(java.lang.String currentLogin) {
        this.currentLogin = currentLogin;
    }


    /**
     * Gets the newLogin value for this ChangeLoginRQ.
     * 
     * @return newLogin
     */
    public java.lang.String getNewLogin() {
        return newLogin;
    }


    /**
     * Sets the newLogin value for this ChangeLoginRQ.
     * 
     * @param newLogin
     */
    public void setNewLogin(java.lang.String newLogin) {
        this.newLogin = newLogin;
    }


    /**
     * Gets the password value for this ChangeLoginRQ.
     * 
     * @return password
     */
    public java.lang.String getPassword() {
        return password;
    }


    /**
     * Sets the password value for this ChangeLoginRQ.
     * 
     * @param password
     */
    public void setPassword(java.lang.String password) {
        this.password = password;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ChangeLoginRQ)) return false;
        ChangeLoginRQ other = (ChangeLoginRQ) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.currentLogin==null && other.getCurrentLogin()==null) || 
             (this.currentLogin!=null &&
              this.currentLogin.equals(other.getCurrentLogin()))) &&
            ((this.newLogin==null && other.getNewLogin()==null) || 
             (this.newLogin!=null &&
              this.newLogin.equals(other.getNewLogin()))) &&
            ((this.password==null && other.getPassword()==null) || 
             (this.password!=null &&
              this.password.equals(other.getPassword())));
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
        if (getCurrentLogin() != null) {
            _hashCode += getCurrentLogin().hashCode();
        }
        if (getNewLogin() != null) {
            _hashCode += getNewLogin().hashCode();
        }
        if (getPassword() != null) {
            _hashCode += getPassword().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ChangeLoginRQ.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "ChangeLoginRQ"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "currentLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newLogin");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "newLogin"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new javax.xml.namespace.QName("http://request.service.ws.ebanking.com", "password"));
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
