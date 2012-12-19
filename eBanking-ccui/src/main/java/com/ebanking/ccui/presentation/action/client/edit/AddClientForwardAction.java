package com.ebanking.ccui.presentation.action.client.edit;

import com.ebanking.ccui.model.account.Client;
import com.ebanking.ccui.presentation.form.EditClientForm;
import com.ebanking.ccui.session.HttpSessionUtil;
import com.opensymphony.xwork2.ActionSupport;
import org.springframework.beans.factory.annotation.Autowired;

public class AddClientForwardAction extends ActionSupport {
    @Autowired
    private EditClientForm editClientForm;

    public String execute() throws Exception {
        Client client = new Client();
        editClientForm.setClient(client);
        HttpSessionUtil.setEditClientForm(editClientForm);
        return "success";
    }
}
