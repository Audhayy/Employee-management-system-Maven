package com.Connection;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateManager {
    private static SessionFactory factory = null; 

    static {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable e) { 
            System.err.println("Failed to create sessionFactory object." + e);
            throw new ExceptionInInitializerError(e); 
        }
    }

    public static SessionFactory getFactory() { 
       return factory;
    }  
}