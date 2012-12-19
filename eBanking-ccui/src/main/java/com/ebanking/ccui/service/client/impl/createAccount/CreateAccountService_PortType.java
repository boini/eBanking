/**
 * CreateAccountService_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ebanking.ccui.service.client.impl.createAccount;

import com.ebanking.ccui.service.request.CreateAccountRQ;
import com.ebanking.ccui.service.response.CreateAccountRS;

public interface CreateAccountService_PortType extends java.rmi.Remote {
    public CreateAccountRS execute(CreateAccountRQ request) throws java.rmi.RemoteException;
    public java.lang.Object execute(java.lang.Object x0) throws java.rmi.RemoteException;
}
