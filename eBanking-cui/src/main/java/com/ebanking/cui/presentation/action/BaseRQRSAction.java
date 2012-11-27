package com.ebanking.cui.presentation.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Base request-response action for all the action classes
 * @param <RQ> Request type
 * @param <RS> Response type
 */
public abstract class BaseRQRSAction<RQ, RS> extends Action {

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
     * @param mapping ActionMapping instance
     * @param form ActionForm to use
     * @param request Http request instance
     * @param response Http response instance
     * @return ActionForward object
     * @throws Exception In case of error
     */
    public ActionForward execute(ActionMapping mapping, ActionForm form,
                                 HttpServletRequest request, HttpServletResponse response) throws Exception {
        final RQ requestObject = prepareRequest();

        // TODO add integration with web service call
        final RS responseObject = null;

        String actionForwardPath = processResponse(responseObject);
        return mapping.findForward(actionForwardPath);
    }
}