package com.ebanking.ws.service;

import java.lang.ref.ReferenceQueue;
import java.security.interfaces.RSAKey;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/27/12
 * Time: 11:11 AM
 * To change this template use File | Settings | File Templates.
 */
public interface Service<RQ, RS> {
    RS execute(RQ request);
}
