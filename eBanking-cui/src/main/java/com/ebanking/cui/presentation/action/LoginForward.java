package com.ebanking.cui.presentation.action;

import com.ebanking.cui.session.HttpSessionUtil;
import com.ebanking.cui.session.UserHttpSession;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.Map;

public class LoginForward extends ActionSupport {

    public String execute() throws Exception {
        Map attributes = ActionContext.getContext().getSession();
        UserHttpSession userHttpSession = new UserHttpSession();
        userHttpSession.setSession(attributes);
        HttpSessionUtil.setUserHttpSession(userHttpSession);
        return "success";
    }
}
