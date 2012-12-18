/**
 * CorporationServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.corporation;

public class CorporationServiceServiceLocator extends org.apache.axis.client.Service implements CorporationServiceService {

    public CorporationServiceServiceLocator() {
    }


    public CorporationServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CorporationServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CorporationService
    private java.lang.String CorporationService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/corporation/CorporationService";

    public java.lang.String getCorporationServiceAddress() {
        return CorporationService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CorporationServiceWSDDServiceName = "CorporationService";

    public java.lang.String getCorporationServiceWSDDServiceName() {
        return CorporationServiceWSDDServiceName;
    }

    public void setCorporationServiceWSDDServiceName(java.lang.String name) {
        CorporationServiceWSDDServiceName = name;
    }

    public CorporationService_PortType getCorporationService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CorporationService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCorporationService(endpoint);
    }

    public CorporationService_PortType getCorporationService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CorporationServiceSoapBindingStub _stub = new CorporationServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCorporationServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCorporationServiceEndpointAddress(java.lang.String address) {
        CorporationService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CorporationService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                CorporationServiceSoapBindingStub _stub = new CorporationServiceSoapBindingStub(new java.net.URL(CorporationService_address), this);
                _stub.setPortName(getCorporationServiceWSDDServiceName());
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
        if ("CorporationService".equals(inputPortName)) {
            return getCorporationService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://corporation.impl.service.ws.ebanking.com", "CorporationServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://corporation.impl.service.ws.ebanking.com", "CorporationService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CorporationService".equals(portName)) {
            setCorporationServiceEndpointAddress(address);
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
