package com.ebanking.cui.presentation.action.transfer;

import com.ebanking.cui.presentation.action.BaseRQRSAction;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.ClientCardsRQ;
import com.ebanking.cui.service.response.ClientCardsRS;
import com.opensymphony.xwork2.ActionSupport;

public class TransferForwardAction extends ActionSupport {
    public String execute() throws Exception {
        return "success";
    }
}
