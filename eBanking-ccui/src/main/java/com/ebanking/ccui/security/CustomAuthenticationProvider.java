package com.ebanking.ccui.security;

import com.ebanking.ccui.exception.EBankingException;
import com.ebanking.ccui.model.account.Account;
import com.ebanking.ccui.model.account.Role;
import com.ebanking.ccui.service.client.ServiceClient;
import com.ebanking.ccui.service.request.LoginClientRQ;
import com.ebanking.ccui.service.response.LoginClientRS;
import com.ebanking.ccui.session.HttpSessionUtil;
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

        if (loginClientRS == null) {
            throw new BadCredentialsException("Access denied or connection problem");
        }

        Account account = loginClientRS.getAccount();

        if (account == null) {
            LOGGER.error("Bad credentials");
            throw new BadCredentialsException("Bad credentials");
        }

        Role role = account.getRole();
        if (!role.getRoleName().equals("ROLE_ADMIN")) {
            LOGGER.error("Access denied");
            throw new BadCredentialsException("Access denied");
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
