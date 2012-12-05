/**
 * PaymentServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.payment;

public class PaymentServiceServiceLocator extends org.apache.axis.client.Service implements PaymentServiceService {

    public PaymentServiceServiceLocator() {
    }


    public PaymentServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PaymentServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for PaymentService
    private java.lang.String PaymentService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/payment/PaymentService";

    public java.lang.String getPaymentServiceAddress() {
        return PaymentService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String PaymentServiceWSDDServiceName = "PaymentService";

    public java.lang.String getPaymentServiceWSDDServiceName() {
        return PaymentServiceWSDDServiceName;
    }

    public void setPaymentServiceWSDDServiceName(java.lang.String name) {
        PaymentServiceWSDDServiceName = name;
    }

    public PaymentService_PortType getPaymentService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(PaymentService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getPaymentService(endpoint);
    }

    public PaymentService_PortType getPaymentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PaymentServiceSoapBindingStub _stub = new PaymentServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getPaymentServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setPaymentServiceEndpointAddress(java.lang.String address) {
        PaymentService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PaymentService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                PaymentServiceSoapBindingStub _stub = new PaymentServiceSoapBindingStub(new java.net.URL(PaymentService_address), this);
                _stub.setPortName(getPaymentServiceWSDDServiceName());
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
        if ("PaymentService".equals(inputPortName)) {
            return getPaymentService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://payment.impl.service.ws.ebanking.com", "PaymentServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://payment.impl.service.ws.ebanking.com", "PaymentService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("PaymentService".equals(portName)) {
            setPaymentServiceEndpointAddress(address);
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
