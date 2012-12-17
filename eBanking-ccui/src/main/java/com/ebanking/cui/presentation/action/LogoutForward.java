package com.ebanking.cui.presentation.action;

import com.ebanking.cui.session.HttpSessionUtil;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutForward extends ActionSupport {
    public String execute() throws Exception {
        HttpSessionUtil.invalidate();
        return "success";
    }
}
