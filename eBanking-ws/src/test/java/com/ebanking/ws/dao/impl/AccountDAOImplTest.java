package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.AccountDAO;
import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.model.account.Account;
import com.ebanking.ws.model.account.Client;
import com.ebanking.ws.model.account.Role;
import com.ebanking.ws.model.address.Address;
import com.ebanking.ws.model.address.City;
import com.ebanking.ws.model.address.Country;
import com.ebanking.ws.util.CastorMockUtil;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testContext.xml")
public class AccountDAOImplTest {

    @Autowired
    private AccountDAO accountDAO;

    @Test
    public void test() throws Exception {
        Account account = (Account) CastorMockUtil.createMock(CastorMockUtil.MockEntity.ACCOUNT);
        account.getClient().setDateOfBirth(new Date());

        List<Account> accountListOrigin = accountDAO.list();
        Assert.assertNotNull(accountListOrigin);

        accountDAO.saveOrUpdate(account);
        List<Account> accountList = accountDAO.list();
        Assert.assertNotNull(accountList);
        Assert.assertTrue(accountList.size() - accountListOrigin.size() == 1);

        Account newAccount = accountDAO.getById(account.getAccountId());
        Assert.assertNotNull(newAccount);
        Assert.assertEquals(account, newAccount);

        accountDAO.delete(newAccount);
        accountList = accountDAO.list();
        Assert.assertNotNull(accountList);
        Assert.assertEquals(accountList.size(), accountListOrigin.size());
    }
}
