package com.ebanking.ws.service.impl.password;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.log.RQRSLogger;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.ChangePasswordRQ;
import com.ebanking.ws.service.response.ChangePasswordRS;

public class ChangePasswordService extends SpringSupportService implements Service<ChangePasswordRQ, ChangePasswordRS> {
    private AccountDAO accountDAO;

    @Override
    public ChangePasswordRS execute(ChangePasswordRQ request) {
        logger = (RQRSLogger) getBean("RQRSLogger");
        accountDAO = (AccountDAO) getBean("accountDAO");

        logger.logRQRS(request, ChangePasswordService.class);

        String login = request.getLogin();
        String currentPassword = request.getCurrentPassword();
        String newPassword = request.getNewPassword();

        ChangePasswordRS changePasswordRS = new ChangePasswordRS();

        Account account = accountDAO.getByLogin(login);
        if (account == null || !account.getPassword().equals(currentPassword)) {
            changePasswordRS.setSuccess(false);
            changePasswordRS.setException("Incorrect password entered");
            return changePasswordRS;
        }

        account.setPassword(newPassword);
        accountDAO.saveOrUpdate(account);
        changePasswordRS.setSuccess(true);

        logger.logRQRS(changePasswordRS, ChangePasswordService.class);

        return changePasswordRS;
    }
}
