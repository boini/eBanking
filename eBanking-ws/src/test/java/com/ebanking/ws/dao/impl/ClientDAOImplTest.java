package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.CityDAO;
import com.ebanking.ws.dao.ClientDAO;
import com.ebanking.ws.model.account.Client;
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
public class ClientDAOImplTest {

    @Autowired
    private ClientDAO clientDAO;

    @Test
    public void test() throws Exception {
       /* Client client = (Client) CastorMockUtil.createMock(CastorMockUtil.MockEntity.CLIENT);
        client.setDateOfBirth(new Date());

        List<Client> clientListOrigin = clientDAO.list();
        Assert.assertNotNull(clientListOrigin);

        clientDAO.saveOrUpdate(client);
        List<Client> clientList = clientDAO.list();
        Assert.assertNotNull(clientList);
        Assert.assertTrue(clientList.size() - clientListOrigin.size() == 1);

        Client newClient = clientDAO.getById(client.getClientId());
        Assert.assertNotNull(newClient);
        Assert.assertEquals(client, newClient);

        clientDAO.delete(newClient);
        clientList = clientDAO.list();
        Assert.assertNotNull(clientList);
        Assert.assertEquals(clientList.size(), clientListOrigin.size());*/
    }
}
