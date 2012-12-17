/**
 * SaveClientService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.client.save;

import com.ebanking.cui.service.request.SaveClientRQ;
import com.ebanking.cui.service.response.SaveClientRS;

public interface SaveClientService_PortType extends java.rmi.Remote {
    public SaveClientRS execute(SaveClientRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
