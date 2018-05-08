import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mitraiscdc.hibernate.entity.Address;
import com.mitraiscdc.hibernate.entity.Person;
import com.mitraiscdc.hibernate.utils.HibernateUtil;

/**
 * 
 */

/**
 * @author Santo_HW432
 *
 */
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = session.getTransaction();
		try {
			transaction.begin();
			Address address = new Address("Bandung", "Pasteur", "12345");
			Person person = new Person(1L, "Santo", address);
			
			session.save(person);
			transaction.commit();
		} catch (Exception e) {
			// TODO: handle exception
			if (transaction != null)
				transaction.rollback();
			e.printStackTrace();
		} finally {
			if (session != null)
				session.close();
		}
		
//		session.beginTransaction();
//		Book newBook = new Book();
//		
//		newBook.setId(1);
//		newBook.setTitle("Learn Hibernate");
//		newBook.setAuthor("Unknown");
//		newBook.setPrice(100000);
//		
//		session.save(newBook);
//		session.getTransaction().commit();
	}

}
