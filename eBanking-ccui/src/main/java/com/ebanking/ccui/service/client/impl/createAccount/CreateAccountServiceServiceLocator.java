/**
 * CreateAccountServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.createAccount;

public class CreateAccountServiceServiceLocator extends org.apache.axis.client.Service implements CreateAccountServiceService {

    public CreateAccountServiceServiceLocator() {
    }


    public CreateAccountServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CreateAccountServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CreateAccountService
    private java.lang.String CreateAccountService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/createAccount/CreateAccountService";

    public java.lang.String getCreateAccountServiceAddress() {
        return CreateAccountService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CreateAccountServiceWSDDServiceName = "CreateAccountService";

    public java.lang.String getCreateAccountServiceWSDDServiceName() {
        return CreateAccountServiceWSDDServiceName;
    }

    public void setCreateAccountServiceWSDDServiceName(java.lang.String name) {
        CreateAccountServiceWSDDServiceName = name;
    }

    public CreateAccountService_PortType getCreateAccountService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CreateAccountService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCreateAccountService(endpoint);
    }

    public CreateAccountService_PortType getCreateAccountService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CreateAccountServiceSoapBindingStub _stub = new CreateAccountServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCreateAccountServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCreateAccountServiceEndpointAddress(java.lang.String address) {
        CreateAccountService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CreateAccountService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                CreateAccountServiceSoapBindingStub _stub = new CreateAccountServiceSoapBindingStub(new java.net.URL(CreateAccountService_address), this);
                _stub.setPortName(getCreateAccountServiceWSDDServiceName());
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
        if ("CreateAccountService".equals(inputPortName)) {
            return getCreateAccountService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://createAccount.impl.service.ws.ebanking.com", "CreateAccountServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://createAccount.impl.service.ws.ebanking.com", "CreateAccountService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CreateAccountService".equals(portName)) {
            setCreateAccountServiceEndpointAddress(address);
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
