/**
 * RatesService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.finance;

import com.ebanking.cui.service.request.RatesRQ;
import com.ebanking.cui.service.response.RatesRS;

public interface RatesService_PortType extends java.rmi.Remote {
    public RatesRS execute(RatesRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
