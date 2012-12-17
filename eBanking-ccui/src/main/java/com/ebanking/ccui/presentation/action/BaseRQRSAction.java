package com.ebanking.ccui.presentation.action;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.service.client.ServiceClient;
import com.opensymphony.xwork2.ActionSupport;

/**
 * Base request-response action for all the action classes
 * @param <RQ> Request type
 * @param <RS> Response type
 */
public abstract class BaseRQRSAction<RQ, RS> extends ActionSupport {

    protected ServiceClient<RQ, RS> serviceClient;

    public abstract void setServiceClient(ServiceClient<RQ, RS> serviceClient);

    /**
     * Prepare request instance
     * @return Request instance
     */
    protected abstract RQ prepareRequest() throws EBankingException;

    /**
     * Process response instance
     * @param responseObject Response object to process
     * @return Action forward path
     */
    protected abstract String processResponse(RS responseObject) throws EBankingException;

    /**
     * Action execute method. Prepares request, makes call to web services layer,
     * process response and finds path to action forward
     * @throws Exception In case of error
     */
    public String execute() throws Exception {
        String actionForwardPath = "failure";
        try {
            final RQ requestObject = prepareRequest();

            final RS responseObject = serviceClient.execute(requestObject);

            actionForwardPath = processResponse(responseObject);
        } catch (EBankingException e) {
            //TODO: handle exception
        } catch (Exception e) {
            //TODO: handle exception
        }
        return actionForwardPath;
    }
}
