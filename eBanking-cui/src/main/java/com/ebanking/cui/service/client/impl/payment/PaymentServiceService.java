/**
 * PaymentServiceService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.payment;

public interface PaymentServiceService extends javax.xml.rpc.Service {
    public java.lang.String getPaymentServiceAddress();

    public PaymentService_PortType getPaymentService() throws javax.xml.rpc.ServiceException;

    public PaymentService_PortType getPaymentService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
