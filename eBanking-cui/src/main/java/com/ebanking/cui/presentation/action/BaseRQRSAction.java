package com.ebanking.cui.presentation.action;

import com.ebanking.cui.service.client.ServiceClient;
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
    protected abstract RQ prepareRequest();

    /**
     * Process response instance
     * @param responseObject Response object to process
     * @return Action forward path
     */
    protected abstract String processResponse(RS responseObject);

    /**
     * Action execute method. Prepares request, makes call to web services layer,
     * process response and finds path to action forward
     * @throws Exception In case of error
     */
    public String execute() throws Exception {
        final RQ requestObject = prepareRequest();

        final RS responseObject = serviceClient.execute(requestObject);

        String actionForwardPath = processResponse(responseObject);
        return actionForwardPath;
    }
}
