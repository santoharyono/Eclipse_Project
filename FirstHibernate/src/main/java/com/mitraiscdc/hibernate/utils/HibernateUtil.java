/**
 * 
 */
package com.mitraiscdc.hibernate.utils;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @author Santo_HW432
 *
 */
public class HibernateUtil {

	private static final SessionFactory FACTORY = buildSessionFactory();
	
	public HibernateUtil() {
	}
	
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();
		} catch (Throwable ex) {
			System.err.println("SessionFactory creation failed" + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return FACTORY;
	}
	
	public static void shutdown() {
		getSessionFactory().close();
	}

}
