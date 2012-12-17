/**
 * ChangePasswordService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.cui.service.client.impl.password;

import com.ebanking.cui.service.request.ChangePasswordRQ;
import com.ebanking.cui.service.response.ChangePasswordRS;

public interface ChangePasswordService_PortType extends java.rmi.Remote {
    public ChangePasswordRS execute(ChangePasswordRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
