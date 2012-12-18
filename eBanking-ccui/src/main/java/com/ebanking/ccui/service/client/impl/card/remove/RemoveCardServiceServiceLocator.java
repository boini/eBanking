/**
 * RemoveCardServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.card.remove;

public class RemoveCardServiceServiceLocator extends org.apache.axis.client.Service implements RemoveCardServiceService {

    public RemoveCardServiceServiceLocator() {
    }


    public RemoveCardServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RemoveCardServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RemoveCardService
    private java.lang.String RemoveCardService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/removeCard/RemoveCardService";

    public java.lang.String getRemoveCardServiceAddress() {
        return RemoveCardService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RemoveCardServiceWSDDServiceName = "RemoveCardService";

    public java.lang.String getRemoveCardServiceWSDDServiceName() {
        return RemoveCardServiceWSDDServiceName;
    }

    public void setRemoveCardServiceWSDDServiceName(java.lang.String name) {
        RemoveCardServiceWSDDServiceName = name;
    }

    public RemoveCardService_PortType getRemoveCardService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RemoveCardService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRemoveCardService(endpoint);
    }

    public RemoveCardService_PortType getRemoveCardService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RemoveCardServiceSoapBindingStub _stub = new RemoveCardServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRemoveCardServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRemoveCardServiceEndpointAddress(java.lang.String address) {
        RemoveCardService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (RemoveCardService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                RemoveCardServiceSoapBindingStub _stub = new RemoveCardServiceSoapBindingStub(new java.net.URL(RemoveCardService_address), this);
                _stub.setPortName(getRemoveCardServiceWSDDServiceName());
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
        if ("RemoveCardService".equals(inputPortName)) {
            return getRemoveCardService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://removeCard.impl.service.ws.ebanking.com", "RemoveCardServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://removeCard.impl.service.ws.ebanking.com", "RemoveCardService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RemoveCardService".equals(portName)) {
            setRemoveCardServiceEndpointAddress(address);
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
