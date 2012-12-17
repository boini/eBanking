/**
 * RetrieveClientServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.client.retrieve;

public class RetrieveClientServiceServiceLocator extends org.apache.axis.client.Service implements RetrieveClientServiceService {

    public RetrieveClientServiceServiceLocator() {
    }


    public RetrieveClientServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RetrieveClientServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RetrieveClientService
    private java.lang.String RetrieveClientService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/retrieveClient/RetrieveClientService";

    public java.lang.String getRetrieveClientServiceAddress() {
        return RetrieveClientService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RetrieveClientServiceWSDDServiceName = "RetrieveClientService";

    public java.lang.String getRetrieveClientServiceWSDDServiceName() {
        return RetrieveClientServiceWSDDServiceName;
    }

    public void setRetrieveClientServiceWSDDServiceName(java.lang.String name) {
        RetrieveClientServiceWSDDServiceName = name;
    }

    public RetrieveClientService_PortType getRetrieveClientService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RetrieveClientService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRetrieveClientService(endpoint);
    }

    public RetrieveClientService_PortType getRetrieveClientService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RetrieveClientServiceSoapBindingStub _stub = new RetrieveClientServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRetrieveClientServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRetrieveClientServiceEndpointAddress(java.lang.String address) {
        RetrieveClientService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (RetrieveClientService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                RetrieveClientServiceSoapBindingStub _stub = new RetrieveClientServiceSoapBindingStub(new java.net.URL(RetrieveClientService_address), this);
                _stub.setPortName(getRetrieveClientServiceWSDDServiceName());
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
        if ("RetrieveClientService".equals(inputPortName)) {
            return getRetrieveClientService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://retrieveClient.impl.service.ws.ebanking.com", "RetrieveClientServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://retrieveClient.impl.service.ws.ebanking.com", "RetrieveClientService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RetrieveClientService".equals(portName)) {
            setRetrieveClientServiceEndpointAddress(address);
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
