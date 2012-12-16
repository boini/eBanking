package com.ebanking.cui.presentation.action.client.password;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;


/**
 * Created with IntelliJ IDEA.
 * User: charley
 * Date: 09.12.12
 * Time: 13:37
 * To change this template use File | Settings | File Templates.
 */
public class ChangePasswordAction extends ActionSupport {
    public String execute() throws Exception {
        return "success";
    }
}
