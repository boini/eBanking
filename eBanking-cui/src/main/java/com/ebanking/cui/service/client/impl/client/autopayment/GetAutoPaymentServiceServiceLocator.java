/**
 * GetAutoPaymentServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.client.autopayment;

public class GetAutoPaymentServiceServiceLocator extends org.apache.axis.client.Service implements GetAutoPaymentServiceService {

    public GetAutoPaymentServiceServiceLocator() {
    }


    public GetAutoPaymentServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public GetAutoPaymentServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for GetAutoPaymentService
    private java.lang.String GetAutoPaymentService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/autopayment/GetAutoPaymentService";

    public java.lang.String getGetAutoPaymentServiceAddress() {
        return GetAutoPaymentService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String GetAutoPaymentServiceWSDDServiceName = "GetAutoPaymentService";

    public java.lang.String getGetAutoPaymentServiceWSDDServiceName() {
        return GetAutoPaymentServiceWSDDServiceName;
    }

    public void setGetAutoPaymentServiceWSDDServiceName(java.lang.String name) {
        GetAutoPaymentServiceWSDDServiceName = name;
    }

    public GetAutoPaymentService_PortType getGetAutoPaymentService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(GetAutoPaymentService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getGetAutoPaymentService(endpoint);
    }

    public GetAutoPaymentService_PortType getGetAutoPaymentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            GetAutoPaymentServiceSoapBindingStub _stub = new GetAutoPaymentServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getGetAutoPaymentServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setGetAutoPaymentServiceEndpointAddress(java.lang.String address) {
        GetAutoPaymentService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (GetAutoPaymentService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                GetAutoPaymentServiceSoapBindingStub _stub = new GetAutoPaymentServiceSoapBindingStub(new java.net.URL(GetAutoPaymentService_address), this);
                _stub.setPortName(getGetAutoPaymentServiceWSDDServiceName());
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
        if ("GetAutoPaymentService".equals(inputPortName)) {
            return getGetAutoPaymentService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://autopayment.impl.service.ws.ebanking.com", "GetAutoPaymentServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://autopayment.impl.service.ws.ebanking.com", "GetAutoPaymentService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("GetAutoPaymentService".equals(portName)) {
            setGetAutoPaymentServiceEndpointAddress(address);
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
