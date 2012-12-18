/**
 * RetrieveAccountServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.account;

public class RetrieveAccountServiceServiceLocator extends org.apache.axis.client.Service implements RetrieveAccountServiceService {

    public RetrieveAccountServiceServiceLocator() {
    }


    public RetrieveAccountServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RetrieveAccountServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RetrieveAccountService
    private java.lang.String RetrieveAccountService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/account/RetrieveAccountService";

    public java.lang.String getRetrieveAccountServiceAddress() {
        return RetrieveAccountService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RetrieveAccountServiceWSDDServiceName = "RetrieveAccountService";

    public java.lang.String getRetrieveAccountServiceWSDDServiceName() {
        return RetrieveAccountServiceWSDDServiceName;
    }

    public void setRetrieveAccountServiceWSDDServiceName(java.lang.String name) {
        RetrieveAccountServiceWSDDServiceName = name;
    }

    public RetrieveAccountService_PortType getRetrieveAccountService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RetrieveAccountService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRetrieveAccountService(endpoint);
    }

    public RetrieveAccountService_PortType getRetrieveAccountService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RetrieveAccountServiceSoapBindingStub _stub = new RetrieveAccountServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRetrieveAccountServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRetrieveAccountServiceEndpointAddress(java.lang.String address) {
        RetrieveAccountService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (RetrieveAccountService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                RetrieveAccountServiceSoapBindingStub _stub = new RetrieveAccountServiceSoapBindingStub(new java.net.URL(RetrieveAccountService_address), this);
                _stub.setPortName(getRetrieveAccountServiceWSDDServiceName());
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
        if ("RetrieveAccountService".equals(inputPortName)) {
            return getRetrieveAccountService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://account.impl.service.ws.ebanking.com", "RetrieveAccountServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://account.impl.service.ws.ebanking.com", "RetrieveAccountService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RetrieveAccountService".equals(portName)) {
            setRetrieveAccountServiceEndpointAddress(address);
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
