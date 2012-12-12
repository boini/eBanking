package com.ebanking.ws.log.mailer;

import com.ebanking.ws.log.mailer.model.Mail;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:testContext.xml")
public class MailServiceTest {

    @Autowired
    private MailService ms;

    @Test
    public void test() throws Exception {
        ms.prepareMail("vadim.asadchiy@gmail.com", new Mail("4", 5.0, "6"));
    }
}
