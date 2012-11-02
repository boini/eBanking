package com.ebanking.cui.presentation.action;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/2/12
 * Time: 7:22 AM
 * To change this template use File | Settings | File Templates.
 */
public class LoginForward extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
                                 HttpServletResponse response) throws Exception {
        return mapping.findForward("success");
    }
}
