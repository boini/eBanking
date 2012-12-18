/**
 * AppLogServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.log;

public class AppLogServiceServiceLocator extends org.apache.axis.client.Service implements AppLogServiceService {

    public AppLogServiceServiceLocator() {
    }


    public AppLogServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AppLogServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AppLogService
    private java.lang.String AppLogService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/log/AppLogService";

    public java.lang.String getAppLogServiceAddress() {
        return AppLogService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AppLogServiceWSDDServiceName = "AppLogService";

    public java.lang.String getAppLogServiceWSDDServiceName() {
        return AppLogServiceWSDDServiceName;
    }

    public void setAppLogServiceWSDDServiceName(java.lang.String name) {
        AppLogServiceWSDDServiceName = name;
    }

    public AppLogService_PortType getAppLogService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AppLogService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAppLogService(endpoint);
    }

    public AppLogService_PortType getAppLogService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            AppLogServiceSoapBindingStub _stub = new AppLogServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getAppLogServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAppLogServiceEndpointAddress(java.lang.String address) {
        AppLogService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (AppLogService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                AppLogServiceSoapBindingStub _stub = new AppLogServiceSoapBindingStub(new java.net.URL(AppLogService_address), this);
                _stub.setPortName(getAppLogServiceWSDDServiceName());
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
        if ("AppLogService".equals(inputPortName)) {
            return getAppLogService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://log.impl.service.ws.ebanking.com", "AppLogServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://log.impl.service.ws.ebanking.com", "AppLogService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AppLogService".equals(portName)) {
            setAppLogServiceEndpointAddress(address);
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
