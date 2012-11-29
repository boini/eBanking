package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.CardDAO;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Anton
 * Date: 11/29/12
 * Time: 11:35 PM
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testContext.xml")
public class CardDAOImplTest {

    @Autowired
    private CardDAO cardDAO;

    @Test
    public void test() throws Exception {
        List cards = cardDAO.getCardsByClientId(1L);
        Assert.assertEquals(1, cards.size());
    }
}
