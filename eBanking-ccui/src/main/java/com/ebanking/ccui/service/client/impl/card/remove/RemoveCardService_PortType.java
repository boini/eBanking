/**
 * RemoveCardService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.card.remove;

import com.ebanking.ccui.service.request.RemoveCardRQ;
import com.ebanking.ccui.service.response.RemoveCardRS;

public interface RemoveCardService_PortType extends java.rmi.Remote {
    public RemoveCardRS execute(RemoveCardRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
