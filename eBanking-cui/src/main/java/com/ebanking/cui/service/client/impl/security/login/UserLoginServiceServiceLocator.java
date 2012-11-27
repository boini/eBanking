/**
 * UserLoginServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.security.login;

public class UserLoginServiceServiceLocator extends org.apache.axis.client.Service implements com.ebanking.cui.service.client.impl.security.login.UserLoginServiceService {

    public UserLoginServiceServiceLocator() {
    }


    public UserLoginServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public UserLoginServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for UserLoginService
    private java.lang.String UserLoginService_address = "http://localhost:8080/services/com/ebanking/ws/service/security/UserLoginService";

    public java.lang.String getUserLoginServiceAddress() {
        return UserLoginService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String UserLoginServiceWSDDServiceName = "UserLoginService";

    public java.lang.String getUserLoginServiceWSDDServiceName() {
        return UserLoginServiceWSDDServiceName;
    }

    public void setUserLoginServiceWSDDServiceName(java.lang.String name) {
        UserLoginServiceWSDDServiceName = name;
    }

    public com.ebanking.cui.service.client.impl.security.login.UserLoginService_PortType getUserLoginService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(UserLoginService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getUserLoginService(endpoint);
    }

    public com.ebanking.cui.service.client.impl.security.login.UserLoginService_PortType getUserLoginService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.ebanking.cui.service.client.impl.security.login.UserLoginServiceSoapBindingStub _stub = new com.ebanking.cui.service.client.impl.security.login.UserLoginServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getUserLoginServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setUserLoginServiceEndpointAddress(java.lang.String address) {
        UserLoginService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.ebanking.cui.service.client.impl.security.login.UserLoginService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                com.ebanking.cui.service.client.impl.security.login.UserLoginServiceSoapBindingStub _stub = new com.ebanking.cui.service.client.impl.security.login.UserLoginServiceSoapBindingStub(new java.net.URL(UserLoginService_address), this);
                _stub.setPortName(getUserLoginServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("UserLoginService".equals(inputPortName)) {
            return getUserLoginService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://security.service.ws.ebanking.com", "UserLoginServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://security.service.ws.ebanking.com", "UserLoginService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("UserLoginService".equals(portName)) {
            setUserLoginServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
