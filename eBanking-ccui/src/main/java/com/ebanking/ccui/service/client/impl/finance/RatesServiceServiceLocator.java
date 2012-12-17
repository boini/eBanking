/**
 * RatesServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.finance;

public class RatesServiceServiceLocator extends org.apache.axis.client.Service implements RatesServiceService {

    public RatesServiceServiceLocator() {
    }


    public RatesServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RatesServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RatesService
    private java.lang.String RatesService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/finance/RatesService";

    public java.lang.String getRatesServiceAddress() {
        return RatesService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RatesServiceWSDDServiceName = "RatesService";

    public java.lang.String getRatesServiceWSDDServiceName() {
        return RatesServiceWSDDServiceName;
    }

    public void setRatesServiceWSDDServiceName(java.lang.String name) {
        RatesServiceWSDDServiceName = name;
    }

    public RatesService_PortType getRatesService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RatesService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRatesService(endpoint);
    }

    public RatesService_PortType getRatesService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            RatesServiceSoapBindingStub _stub = new RatesServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getRatesServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRatesServiceEndpointAddress(java.lang.String address) {
        RatesService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (RatesService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                RatesServiceSoapBindingStub _stub = new RatesServiceSoapBindingStub(new java.net.URL(RatesService_address), this);
                _stub.setPortName(getRatesServiceWSDDServiceName());
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
        if ("RatesService".equals(inputPortName)) {
            return getRatesService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://finance.impl.service.ws.ebanking.com", "RatesServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://finance.impl.service.ws.ebanking.com", "RatesService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RatesService".equals(portName)) {
            setRatesServiceEndpointAddress(address);
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
