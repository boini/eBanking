package com.ebanking.ccui.session;

import java.util.Map;

public class UserHttpSession {
    private Map session;

    public Map getSession() {
        return session;
    }

    public void setSession(Map session) {
        this.session = session;
    }

    public void setAttribute(String name, Object value) {
        session.put(name, value);
    }

    public Object getAttribute(String name) {
        return session.get(name);
    }

    public void remove(String name) {
        session.remove(name);
    }
}
