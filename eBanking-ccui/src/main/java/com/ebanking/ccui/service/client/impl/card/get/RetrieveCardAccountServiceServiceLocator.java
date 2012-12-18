/**
 * RetrieveCardAccountServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.card.get;

public class RetrieveCardAccountServiceServiceLocator extends org.apache.axis.client.Service implements RetrieveCardAccountServiceService {

    public RetrieveCardAccountServiceServiceLocator() {
    }


    public RetrieveCardAccountServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RetrieveCardAccountServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RetrieveCardAccountService
    private java.lang.String RetrieveCardAccountService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/getCardAccount/RetrieveCardAccountService";

    public java.lang.String getRetrieveCardAccountServiceAddress() {
        return RetrieveCardAccountService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RetrieveCardAccountServiceWSDDServiceName = "RetrieveCardAccountService";

    public java.lang.String getRetrieveCardAccountServiceWSDDServiceName() {
        return RetrieveCardAccountServiceWSDDServiceName;
    }

    public void setRetrieveCardAccountServiceWSDDServiceName(java.lang.String name) {
        RetrieveCardAccountServiceWSDDServiceName = name;
    }

    public RetrieveCardAccountService_PortType getRetrieveCardAccountService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RetrieveCardAccountService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRetrieveCardAccountService(endpoint);
    }

    public RetrieveCardAccountService_PortType getRetrieveCardAccountService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RetrieveCardAccountServiceSoapBindingStub _stub = new RetrieveCardAccountServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRetrieveCardAccountServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRetrieveCardAccountServiceEndpointAddress(java.lang.String address) {
        RetrieveCardAccountService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (RetrieveCardAccountService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                RetrieveCardAccountServiceSoapBindingStub _stub = new RetrieveCardAccountServiceSoapBindingStub(new java.net.URL(RetrieveCardAccountService_address), this);
                _stub.setPortName(getRetrieveCardAccountServiceWSDDServiceName());
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
        if ("RetrieveCardAccountService".equals(inputPortName)) {
            return getRetrieveCardAccountService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://getCardAccount.impl.service.ws.ebanking.com", "RetrieveCardAccountServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://getCardAccount.impl.service.ws.ebanking.com", "RetrieveCardAccountService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RetrieveCardAccountService".equals(portName)) {
            setRetrieveCardAccountServiceEndpointAddress(address);
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
