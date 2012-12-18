/**
 * CorporationService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.corporation;

import com.ebanking.ccui.service.request.CorporationRQ;
import com.ebanking.ccui.service.response.CorporationRS;

public interface CorporationService_PortType extends java.rmi.Remote {
    public CorporationRS execute(CorporationRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
