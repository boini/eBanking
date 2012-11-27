package com.ebanking.ws.dao.impl;

import com.ebanking.ws.dao.CountryDAO;
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
public class CountryDAOImplTest {

    @Autowired
    private CountryDAO countryDAO;

    @Test
    public void test() throws Exception {
        /*Country country = (Country) CastorMockUtil.createMock(CastorMockUtil.MockEntity.COUNTRY);

        List<Country> countryListOrigin = countryDAO.list();
        Assert.assertNotNull(countryListOrigin);

        countryDAO.saveOrUpdate(country);
        List<Country> countryList = countryDAO.list();
        Assert.assertNotNull(countryList);
        Assert.assertTrue(countryList.size() - countryListOrigin.size() == 1);

        Country newCountry = countryDAO.getById(country.getCountryId());
        Assert.assertNotNull(newCountry);
        Assert.assertEquals(country, newCountry);

        countryDAO.delete(newCountry);
        countryList = countryDAO.list();
        Assert.assertNotNull(countryList);
        Assert.assertEquals(countryList.size(), countryListOrigin.size());*/
    }
}
