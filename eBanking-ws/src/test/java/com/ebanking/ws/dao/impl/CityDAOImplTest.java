package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.CityDAO;
import com.ebanking.ws.dao.CountryDAO;
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
public class CityDAOImplTest {

    @Autowired
    private CityDAO cityDAO;

    @Test
    public void test() throws Exception {
        /*City city = (City) CastorMockUtil.createMock(CastorMockUtil.MockEntity.CITY);

        List<City> cityListOrigin = cityDAO.list();
        Assert.assertNotNull(cityListOrigin);

        cityDAO.saveOrUpdate(city);
        List<City> cityList = cityDAO.list();
        Assert.assertNotNull(cityList);
        Assert.assertTrue(cityList.size() - cityListOrigin.size() == 1);

        City newCity = cityDAO.getById(city.getCityId());
        Assert.assertNotNull(newCity);
        Assert.assertEquals(city, newCity);

        cityDAO.delete(newCity);
        cityList = cityDAO.list();
        Assert.assertNotNull(cityList);
        Assert.assertEquals(cityList.size(), cityListOrigin.size());*/
    }
}
