package com.ebanking.ccui.service.client.impl.client.account;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.FetchAccountRQ;
import com.ebanking.ccui.service.response.FetchAccountRS;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 9:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class FetchAccountService implements ServiceClient<FetchAccountRQ, FetchAccountRS> {

    @Override
    public FetchAccountRS execute(FetchAccountRQ request) throws EBankingException{
        FetchClientAccountServiceLocator locator = new FetchClientAccountServiceLocator();
        try {
            FetchClientAccount_PortType service = locator.getFetchClientAccount();
            FetchAccountRS fetchAccountRS = (FetchAccountRS) service.execute(request);
            return fetchAccountRS;
        } catch (Exception e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            throw new EBankingException("Exception while executing FetchAccount service", e.getMessage());
        }
    }
}
