import org.hibernate.Session;

import com.mitraiscdc.hibernate.entity.Book;
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
		// TODO Auto-generated method stub
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		Book newBook = new Book();
		
		newBook.setId(1);
		newBook.setTitle("Learn Hibernate");
		newBook.setAuthor("Unknown");
		newBook.setPrice(100000);
		
		session.save(newBook);
		session.getTransaction().commit();
	}

}
