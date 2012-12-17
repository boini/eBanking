package com.ebanking.ccui.presentation.action;

import com.ebanking.ccui.session.HttpSessionUtil;
import com.ebanking.ccui.session.UserHttpSession;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

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
