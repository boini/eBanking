package com.ebanking.cui.presentation.action;

import com.ebanking.cui.session.HttpSessionUtil;
import com.ebanking.cui.session.UserHttpSession;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Map;

public class MainPageForwardAction extends ActionSupport {

    public String execute() throws Exception {
        return "success";
    }
}
