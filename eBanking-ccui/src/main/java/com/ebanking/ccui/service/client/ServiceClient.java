package com.ebanking.ccui.service.client;

import com.ebanking.ccui.exception.EBankingException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/27/12
 * Time: 10:50 AM
 * To change this template use File | Settings | File Templates.
 */
public interface ServiceClient<RQ, RS> {
    RS execute(RQ request) throws EBankingException;
}
