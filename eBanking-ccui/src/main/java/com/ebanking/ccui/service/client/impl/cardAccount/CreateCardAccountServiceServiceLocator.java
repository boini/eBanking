/**
 * CreateCardAccountServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.cardAccount;

public class CreateCardAccountServiceServiceLocator extends org.apache.axis.client.Service implements CreateCardAccountServiceService {

    public CreateCardAccountServiceServiceLocator() {
    }


    public CreateCardAccountServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreateCardAccountServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreateCardAccountService
    private java.lang.String CreateCardAccountService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/cardAccount/CreateCardAccountService";

    public java.lang.String getCreateCardAccountServiceAddress() {
        return CreateCardAccountService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreateCardAccountServiceWSDDServiceName = "CreateCardAccountService";

    public java.lang.String getCreateCardAccountServiceWSDDServiceName() {
        return CreateCardAccountServiceWSDDServiceName;
    }

    public void setCreateCardAccountServiceWSDDServiceName(java.lang.String name) {
        CreateCardAccountServiceWSDDServiceName = name;
    }

    public CreateCardAccountService_PortType getCreateCardAccountService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreateCardAccountService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreateCardAccountService(endpoint);
    }

    public CreateCardAccountService_PortType getCreateCardAccountService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CreateCardAccountServiceSoapBindingStub _stub = new CreateCardAccountServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreateCardAccountServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreateCardAccountServiceEndpointAddress(java.lang.String address) {
        CreateCardAccountService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CreateCardAccountService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                CreateCardAccountServiceSoapBindingStub _stub = new CreateCardAccountServiceSoapBindingStub(new java.net.URL(CreateCardAccountService_address), this);
                _stub.setPortName(getCreateCardAccountServiceWSDDServiceName());
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
        if ("CreateCardAccountService".equals(inputPortName)) {
            return getCreateCardAccountService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://cardAccount.impl.service.ws.ebanking.com", "CreateCardAccountServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://cardAccount.impl.service.ws.ebanking.com", "CreateCardAccountService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreateCardAccountService".equals(portName)) {
            setCreateCardAccountServiceEndpointAddress(address);
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
