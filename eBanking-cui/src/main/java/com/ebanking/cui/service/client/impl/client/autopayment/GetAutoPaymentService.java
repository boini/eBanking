package com.ebanking.cui.service.client.impl.client.autopayment;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.GetAutoPaymentRQ;
import com.ebanking.cui.service.response.GetAutoPaymentRS;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/21/12
 * Time: 9:11 AM
 * To change this template use File | Settings | File Templates.
 */
public class GetAutoPaymentService implements ServiceClient<GetAutoPaymentRQ, GetAutoPaymentRS> {
    @Override
    public GetAutoPaymentRS execute(GetAutoPaymentRQ request) throws EBankingException {
        GetAutoPaymentServiceServiceLocator locator = new GetAutoPaymentServiceServiceLocator();
        try {
            GetAutoPaymentService_PortType service = locator.getGetAutoPaymentService();
            GetAutoPaymentRS getAutoPaymentRS = service.execute(request);
            return getAutoPaymentRS;
        } catch (ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        } catch (RemoteException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
        return null;
    }
}
