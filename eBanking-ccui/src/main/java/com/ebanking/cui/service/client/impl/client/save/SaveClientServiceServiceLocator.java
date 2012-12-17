/**
 * SaveClientServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.client.save;

public class SaveClientServiceServiceLocator extends org.apache.axis.client.Service implements SaveClientServiceService {

    public SaveClientServiceServiceLocator() {
    }


    public SaveClientServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SaveClientServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SaveClientService
    private java.lang.String SaveClientService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/saveClient/SaveClientService";

    public java.lang.String getSaveClientServiceAddress() {
        return SaveClientService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SaveClientServiceWSDDServiceName = "SaveClientService";

    public java.lang.String getSaveClientServiceWSDDServiceName() {
        return SaveClientServiceWSDDServiceName;
    }

    public void setSaveClientServiceWSDDServiceName(java.lang.String name) {
        SaveClientServiceWSDDServiceName = name;
    }

    public SaveClientService_PortType getSaveClientService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SaveClientService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSaveClientService(endpoint);
    }

    public SaveClientService_PortType getSaveClientService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            SaveClientServiceSoapBindingStub _stub = new SaveClientServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getSaveClientServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSaveClientServiceEndpointAddress(java.lang.String address) {
        SaveClientService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (SaveClientService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                SaveClientServiceSoapBindingStub _stub = new SaveClientServiceSoapBindingStub(new java.net.URL(SaveClientService_address), this);
                _stub.setPortName(getSaveClientServiceWSDDServiceName());
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
        if ("SaveClientService".equals(inputPortName)) {
            return getSaveClientService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://saveClient.impl.service.ws.ebanking.com", "SaveClientServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://saveClient.impl.service.ws.ebanking.com", "SaveClientService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SaveClientService".equals(portName)) {
            setSaveClientServiceEndpointAddress(address);
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
