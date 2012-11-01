package com.ebanking.ws.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Common DAO for all the DAO implementations
 * Contains session factory to use
 */
public abstract class CommonDAOImpl {
    /**
     * Hibernate session factory
     */
    private SessionFactory sessionFactory;

    @Autowired
    public void ClientDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    /**
     * Returns current hibernate session to use
     * @return Hibernate session
     */
    protected Session currentSession() {
        return sessionFactory.getCurrentSession();
    }
}
