/**
 * AppLogService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.log;

import com.ebanking.ccui.service.request.AppLogRQ;
import com.ebanking.ccui.service.response.AppLogRS;

public interface AppLogService_PortType extends java.rmi.Remote {
    public AppLogRS execute(AppLogRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
