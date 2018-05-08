package com.mitraiscdc.BatchFetching;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mitraiscdc.entity.Student;
import com.mitraiscdc.utils.HibernateUtil;

/**
 * Batch fetching example
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.getTransaction();
        
        try {
			Query query = session.createQuery("select student from Student student");
//			Get result
			@SuppressWarnings("unchecked")
			List<Student> students = query.getResultList();
			
			students.forEach(student -> System.out.println(student.getName() + ":" + student.getEnrollmentId()));
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
    }
}
