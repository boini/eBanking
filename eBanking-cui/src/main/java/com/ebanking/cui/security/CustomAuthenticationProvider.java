package com.ebanking.cui.security;

import com.ebanking.cui.exception.EBankingException;
import com.ebanking.cui.model.account.Account;
import com.ebanking.cui.service.client.ServiceClient;
import com.ebanking.cui.service.request.LoginClientRQ;
import com.ebanking.cui.service.response.LoginClientRS;
import com.ebanking.cui.session.HttpSessionUtil;
import com.ebanking.cui.session.UserHttpSession;
import com.opensymphony.xwork2.ActionContext;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.encoding.PasswordEncoder;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomAuthenticationProvider implements AuthenticationProvider {

    private ServiceClient<LoginClientRQ, LoginClientRS> loginClientService;

    @Autowired
    public void setPasswordEncoder(PasswordEncoder passwordEncoder) {
        this.passwordEncoder = passwordEncoder;
    }

    private PasswordEncoder passwordEncoder;

    @Autowired
    public void setLoginClientService(ServiceClient<LoginClientRQ, LoginClientRS> loginClientService) {
        this.loginClientService = loginClientService;
    }

    private static final Logger LOGGER = Logger.getLogger(CustomAuthenticationProvider.class);

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        UsernamePasswordAuthenticationToken auth = (UsernamePasswordAuthenticationToken) authentication;

        String login = String.valueOf(auth.getPrincipal());
        String password = passwordEncoder.encodePassword(String.valueOf(auth.getCredentials()), "12345");

        final LoginClientRQ loginClientRQ = new LoginClientRQ();
        loginClientRQ.setLogin(login);
        loginClientRQ.setPassword(password);

        LoginClientRS loginClientRS = null;
        try {
            loginClientRS = loginClientService.execute(loginClientRQ);
        } catch (EBankingException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }

        Account account = loginClientRS.getAccount();

        if (account == null) {
            LOGGER.error("Bad credentials");
            throw new BadCredentialsException("Bad credentials");
        }

        HttpSessionUtil.setClientAccount(account);
        List<GrantedAuthority> grantedAuthorityList = new ArrayList<GrantedAuthority>();
        grantedAuthorityList.add(new SimpleGrantedAuthority(account.getRole().getRoleName()));

        return new UsernamePasswordAuthenticationToken(account, null, grantedAuthorityList);
    }

    @Override
    public boolean supports(Class<?> aClass) {
        return true;
    }
}
