package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.CardAccountDAO;
import com.ebanking.ws.model.card.CardAccount;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/29/12
 * Time: 6:30 AM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testContext.xml")
public class CardAccountImplTest {

    @Autowired
    private CardAccountDAO cardAccountDAO;

    @Test
    public void test() throws Exception {
        List cardAccounts = cardAccountDAO.listByClientId(1L);
        Assert.assertNotNull(cardAccounts);
    }
}
