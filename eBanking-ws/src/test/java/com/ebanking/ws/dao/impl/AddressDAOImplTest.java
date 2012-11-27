package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.AddressDAO;
import com.ebanking.ws.dao.CityDAO;
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

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testContext.xml")
public class AddressDAOImplTest {

    @Autowired
    private AddressDAO addressDAO;

    @Test
    public void test() throws Exception {
        /*Address address = (Address) CastorMockUtil.createMock(CastorMockUtil.MockEntity.ADDRESS);

        List<Address> addressListOrigin = addressDAO.list();
        Assert.assertNotNull(addressListOrigin);

        addressDAO.saveOrUpdate(address);
        List<Address> addressList = addressDAO.list();
        Assert.assertNotNull(addressList);
        Assert.assertTrue(addressList.size() - addressListOrigin.size() == 1);

        Address newAddress = addressDAO.getById(address.getAddressId());
        Assert.assertNotNull(newAddress);
        Assert.assertEquals(address, newAddress);

        addressDAO.delete(newAddress);
        addressList = addressDAO.list();
        Assert.assertNotNull(addressList);
        Assert.assertEquals(addressList.size(), addressListOrigin.size());*/
    }
}
