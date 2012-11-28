package com.ebanking.ws.service;

import org.springframework.remoting.jaxrpc.ServletEndpointSupport;
import org.springframework.web.context.WebApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: antonkholodok
 * Date: 11/28/12
 * Time: 8:05 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class SpringSupportService extends ServletEndpointSupport {

    public Object getBean(String name) {
        return getWebApplicationContext().getBean(name);
    }
}
