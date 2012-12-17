/**
 * ClientCardsServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.client.card;

public class ClientCardsServiceServiceLocator extends org.apache.axis.client.Service implements ClientCardsServiceService {

    public ClientCardsServiceServiceLocator() {
    }


    public ClientCardsServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ClientCardsServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ClientCardsService
    private java.lang.String ClientCardsService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/card/ClientCardsService";

    public java.lang.String getClientCardsServiceAddress() {
        return ClientCardsService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ClientCardsServiceWSDDServiceName = "ClientCardsService";

    public java.lang.String getClientCardsServiceWSDDServiceName() {
        return ClientCardsServiceWSDDServiceName;
    }

    public void setClientCardsServiceWSDDServiceName(java.lang.String name) {
        ClientCardsServiceWSDDServiceName = name;
    }

    public ClientCardsService_PortType getClientCardsService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ClientCardsService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getClientCardsService(endpoint);
    }

    public ClientCardsService_PortType getClientCardsService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ClientCardsServiceSoapBindingStub _stub = new ClientCardsServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getClientCardsServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setClientCardsServiceEndpointAddress(java.lang.String address) {
        ClientCardsService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ClientCardsService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ClientCardsServiceSoapBindingStub _stub = new ClientCardsServiceSoapBindingStub(new java.net.URL(ClientCardsService_address), this);
                _stub.setPortName(getClientCardsServiceWSDDServiceName());
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
        if ("ClientCardsService".equals(inputPortName)) {
            return getClientCardsService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://card.impl.service.ws.ebanking.com", "ClientCardsServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://card.impl.service.ws.ebanking.com", "ClientCardsService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ClientCardsService".equals(portName)) {
            setClientCardsServiceEndpointAddress(address);
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
