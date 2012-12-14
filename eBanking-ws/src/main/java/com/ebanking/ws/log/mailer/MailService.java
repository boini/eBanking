package com.ebanking.ws.log.mailer;

import com.ebanking.ws.log.mailer.model.Mail;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Mailing service.
 *
 * @author: AS
 */
public class MailService {

    private static final String EMAIL = "mail";
    private static final String PASSWORD = "password";
    private static final String SMTP_SERVER = "smtp_server";
    private static final String PORT = "port";

    private String email;
    private String password;
    private String smtp_server;
    private String port;
    private Session session;

    MailService() {
        try {
            //Load smtp-server configuration from properties
            Properties properties = new Properties();
            properties.load(this.getClass().getResourceAsStream("/email-settings.properties"));
            email = properties.getProperty(EMAIL);
            password = properties.getProperty(PASSWORD);
            smtp_server = properties.getProperty(SMTP_SERVER);
            port = properties.getProperty(PORT);

            //Configure and authentication on smtp-server
            Properties prop = new Properties();
            prop.put("mail.smtp.host", smtp_server);
            prop.put("mail.port.socketFactory.port", port);
            prop.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
            prop.put("mail.smtp.auth", "true");
            prop.put("mail.smtp.port", port);

            session = Session.getDefaultInstance(prop, new javax.mail.Authenticator() {
                @Override
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(email, password);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sends e-mail to receivers.
     */
    public void prepareMail(String email, Mail mail) {
        byte[] report = JasperReporter.generateJasperReport(Arrays.asList(mail));
        sendMessage(report, email);
    }

    /**
     * Sends message with PDF report attached.
     *
     * @param attach
     * @param address
     */
    public void sendMessage(byte[] attach, String address) {
        try {
            //Creates message
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(email));
            message.setSubject("payment information");
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(address));
            message.setContent(attach, "application/pdf");
            Transport.send(message);
        } catch (MessagingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}