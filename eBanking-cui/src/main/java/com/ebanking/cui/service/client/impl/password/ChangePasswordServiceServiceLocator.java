/**
 * ChangePasswordServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.password;

public class ChangePasswordServiceServiceLocator extends org.apache.axis.client.Service implements ChangePasswordServiceService {

    public ChangePasswordServiceServiceLocator() {
    }


    public ChangePasswordServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ChangePasswordServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ChangePasswordService
    private java.lang.String ChangePasswordService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/password/ChangePasswordService";

    public java.lang.String getChangePasswordServiceAddress() {
        return ChangePasswordService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ChangePasswordServiceWSDDServiceName = "ChangePasswordService";

    public java.lang.String getChangePasswordServiceWSDDServiceName() {
        return ChangePasswordServiceWSDDServiceName;
    }

    public void setChangePasswordServiceWSDDServiceName(java.lang.String name) {
        ChangePasswordServiceWSDDServiceName = name;
    }

    public ChangePasswordService_PortType getChangePasswordService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ChangePasswordService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getChangePasswordService(endpoint);
    }

    public ChangePasswordService_PortType getChangePasswordService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ChangePasswordServiceSoapBindingStub _stub = new ChangePasswordServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getChangePasswordServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setChangePasswordServiceEndpointAddress(java.lang.String address) {
        ChangePasswordService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ChangePasswordService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ChangePasswordServiceSoapBindingStub _stub = new ChangePasswordServiceSoapBindingStub(new java.net.URL(ChangePasswordService_address), this);
                _stub.setPortName(getChangePasswordServiceWSDDServiceName());
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
        if ("ChangePasswordService".equals(inputPortName)) {
            return getChangePasswordService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://password.impl.service.ws.ebanking.com", "ChangePasswordServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://password.impl.service.ws.ebanking.com", "ChangePasswordService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ChangePasswordService".equals(portName)) {
            setChangePasswordServiceEndpointAddress(address);
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
