package com.ebanking.ccui.presentation.action;

import com.ebanking.ccui.session.HttpSessionUtil;
import com.opensymphony.xwork2.ActionSupport;

public class LogoutForward extends ActionSupport {
    public String execute() throws Exception {
        HttpSessionUtil.invalidate();
        return "success";
    }
}
