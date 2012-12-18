package com.ebanking.ws.service.impl.corporation;

import com.ebanking.ws.dao.CorporationDAO;
import com.ebanking.ws.model.account.BankAccount;
import com.ebanking.ws.model.account.Corporation;
import com.ebanking.ws.service.Service;
import com.ebanking.ws.service.SpringSupportService;
import com.ebanking.ws.service.request.CorporationRQ;
import com.ebanking.ws.service.response.CorporationRS;

import java.util.ArrayList;
import java.util.List;

public class CorporationService extends SpringSupportService implements Service<CorporationRQ, CorporationRS> {
    private CorporationDAO corporationDAO;

    @Override
    public CorporationRS execute(CorporationRQ request) {
        corporationDAO = (CorporationDAO) getBean("corporationDAO");

        long corporationId = request.getCorporationId();

        CorporationRS corporationRS = new CorporationRS();

        if (corporationId == 0) {
            List<Corporation> corporations = corporationDAO.list();
            for (Corporation corporation : corporations) {
                corporation.setBankAccountList(null);
            }
            Corporation[] corporationArr = corporations.toArray(new Corporation[corporations.size()]);
            corporationRS.setCorporations(corporationArr);
            corporationRS.setSuccess(true);
        } else {
            Corporation corporation = corporationDAO.getById(corporationId);
            BankAccount[] bankAccountArr = corporation.getBankAccountList().toArray(
                    new BankAccount[corporation.getBankAccountList().size()]);
            corporationRS.setBankAccounts(bankAccountArr);
            Corporation[] corporations = new Corporation[1];
            corporations[0] = corporation;
            corporationRS.setCorporations(corporations);
            corporationRS.setSuccess(true);
        }

        return corporationRS;
    }
}
