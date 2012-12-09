/**
 * CardOperationHistoryServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.info.card;

public class CardOperationHistoryServiceServiceLocator extends org.apache.axis.client.Service implements CardOperationHistoryServiceService {

    public CardOperationHistoryServiceServiceLocator() {
    }


    public CardOperationHistoryServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public CardOperationHistoryServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for CardOperationHistoryService
    private java.lang.String CardOperationHistoryService_address = "http://localhost:8082/services/com/ebanking/ws/service/impl/info/CardOperationHistoryService";

    public java.lang.String getCardOperationHistoryServiceAddress() {
        return CardOperationHistoryService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String CardOperationHistoryServiceWSDDServiceName = "CardOperationHistoryService";

    public java.lang.String getCardOperationHistoryServiceWSDDServiceName() {
        return CardOperationHistoryServiceWSDDServiceName;
    }

    public void setCardOperationHistoryServiceWSDDServiceName(java.lang.String name) {
        CardOperationHistoryServiceWSDDServiceName = name;
    }

    public CardOperationHistoryService_PortType getCardOperationHistoryService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(CardOperationHistoryService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getCardOperationHistoryService(endpoint);
    }

    public CardOperationHistoryService_PortType getCardOperationHistoryService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            CardOperationHistoryServiceSoapBindingStub _stub = new CardOperationHistoryServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getCardOperationHistoryServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setCardOperationHistoryServiceEndpointAddress(java.lang.String address) {
        CardOperationHistoryService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (CardOperationHistoryService_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                CardOperationHistoryServiceSoapBindingStub _stub = new CardOperationHistoryServiceSoapBindingStub(new java.net.URL(CardOperationHistoryService_address), this);
                _stub.setPortName(getCardOperationHistoryServiceWSDDServiceName());
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
        if ("CardOperationHistoryService".equals(inputPortName)) {
            return getCardOperationHistoryService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://info.impl.service.ws.ebanking.com", "CardOperationHistoryServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://info.impl.service.ws.ebanking.com", "CardOperationHistoryService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("CardOperationHistoryService".equals(portName)) {
            setCardOperationHistoryServiceEndpointAddress(address);
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
