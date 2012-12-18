/**
 * AddCardServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.card.add;

public class AddCardServiceServiceLocator extends org.apache.axis.client.Service implements AddCardServiceService {

    public AddCardServiceServiceLocator() {
    }


    public AddCardServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AddCardServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AddCardService
    private java.lang.String AddCardService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/addCard/AddCardService";

    public java.lang.String getAddCardServiceAddress() {
        return AddCardService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AddCardServiceWSDDServiceName = "AddCardService";

    public java.lang.String getAddCardServiceWSDDServiceName() {
        return AddCardServiceWSDDServiceName;
    }

    public void setAddCardServiceWSDDServiceName(java.lang.String name) {
        AddCardServiceWSDDServiceName = name;
    }

    public AddCardService_PortType getAddCardService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AddCardService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAddCardService(endpoint);
    }

    public AddCardService_PortType getAddCardService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            AddCardServiceSoapBindingStub _stub = new AddCardServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAddCardServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAddCardServiceEndpointAddress(java.lang.String address) {
        AddCardService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (AddCardService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                AddCardServiceSoapBindingStub _stub = new AddCardServiceSoapBindingStub(new java.net.URL(AddCardService_address), this);
                _stub.setPortName(getAddCardServiceWSDDServiceName());
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
        if ("AddCardService".equals(inputPortName)) {
            return getAddCardService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://addCard.impl.service.ws.ebanking.com", "AddCardServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://addCard.impl.service.ws.ebanking.com", "AddCardService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AddCardService".equals(portName)) {
            setAddCardServiceEndpointAddress(address);
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
