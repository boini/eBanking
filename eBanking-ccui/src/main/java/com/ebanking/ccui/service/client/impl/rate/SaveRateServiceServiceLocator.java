/**
 * SaveRateServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.rate;

public class SaveRateServiceServiceLocator extends org.apache.axis.client.Service implements SaveRateServiceService {

    public SaveRateServiceServiceLocator() {
    }


    public SaveRateServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaveRateServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SaveRateService
    private java.lang.String SaveRateService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/rate/SaveRateService";

    public java.lang.String getSaveRateServiceAddress() {
        return SaveRateService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaveRateServiceWSDDServiceName = "SaveRateService";

    public java.lang.String getSaveRateServiceWSDDServiceName() {
        return SaveRateServiceWSDDServiceName;
    }

    public void setSaveRateServiceWSDDServiceName(java.lang.String name) {
        SaveRateServiceWSDDServiceName = name;
    }

    public SaveRateService_PortType getSaveRateService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SaveRateService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaveRateService(endpoint);
    }

    public SaveRateService_PortType getSaveRateService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SaveRateServiceSoapBindingStub _stub = new SaveRateServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSaveRateServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaveRateServiceEndpointAddress(java.lang.String address) {
        SaveRateService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SaveRateService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SaveRateServiceSoapBindingStub _stub = new SaveRateServiceSoapBindingStub(new java.net.URL(SaveRateService_address), this);
                _stub.setPortName(getSaveRateServiceWSDDServiceName());
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
        if ("SaveRateService".equals(inputPortName)) {
            return getSaveRateService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://rate.impl.service.ws.ebanking.com", "SaveRateServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://rate.impl.service.ws.ebanking.com", "SaveRateService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SaveRateService".equals(portName)) {
            setSaveRateServiceEndpointAddress(address);
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
