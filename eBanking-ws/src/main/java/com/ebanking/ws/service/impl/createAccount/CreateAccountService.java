package com.ebanking.ws.service.impl.createAccount;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.dao.RoleDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.account.Role;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.CreateAccountRQ;
import com.ebanking.ws.service.response.CreateAccountRS;

public class CreateAccountService extends SpringSupportService implements Service<CreateAccountRQ, CreateAccountRS> {
    private AccountDAO accountDAO;
    private ClientDAO clientDAO;
    private RoleDAO roleDAO;

    @Override
    public CreateAccountRS execute(CreateAccountRQ request) {
        accountDAO = (AccountDAO) getBean("accountDAO");
        clientDAO = (ClientDAO) getBean("clientDAO");
        roleDAO = (RoleDAO) getBean("roleDAO");

        long clientId = request.getClientId();
        String login = request.getLogin();
        String password = request.getPassword();

        CreateAccountRS createAccountRS = new CreateAccountRS();

        Account checkAccount = accountDAO.getByLogin(login);
        if (checkAccount != null) {
            createAccountRS.setSuccess(false);
            createAccountRS.setException("Login is already exist");
            return createAccountRS;
        }

        Account account = new Account();

        Client client = clientDAO.getById(clientId);
        if (client == null) {
            createAccountRS.setSuccess(false);
            createAccountRS.setException("Connection problems");
            return createAccountRS;
        }

        account.setClient(client);
        account.setLogin(login);
        account.setPassword(password);

        Role role = roleDAO.getRoleByName("ROLE_USER");
        account.setRole(role);

        accountDAO.saveOrUpdate(account);

        createAccountRS.setSuccess(true);
        return createAccountRS;
    }
}
