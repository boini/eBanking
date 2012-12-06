package com.ebanking.cui.presentation.action.payment.mobile;

import com.ebanking.cui.presentation.form.MobilePaymentForm;
import com.ebanking.cui.session.HttpSessionUtil;
import org.apache.struts2.ServletActionContext;
import org.springframework.beans.factory.annotation.Autowired;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 12/3/12
 * Time: 8:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class MobilePaymentForwardAction {

    public String execute() throws Exception {
        return "success";
    }
}
