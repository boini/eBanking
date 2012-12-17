/**
 * ExRates.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.currency.nbrb;

public interface ExRates extends javax.xml.rpc.Service {
    public java.lang.String getExRatesSoapAddress();

    public ExRatesSoap_PortType getExRatesSoap() throws javax.xml.rpc.ServiceException;

    public ExRatesSoap_PortType getExRatesSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
