/**
 * ChangeLoginService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.login;

import com.ebanking.cui.service.request.ChangeLoginRQ;
import com.ebanking.cui.service.response.ChangeLoginRS;

public interface ChangeLoginService_PortType extends java.rmi.Remote {
    public ChangeLoginRS execute(ChangeLoginRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
