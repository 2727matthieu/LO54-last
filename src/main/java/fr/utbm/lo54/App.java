package fr.utbm.lo54;

import fr.utbm.lo54.entity.Location;
import fr.utbm.lo54.tools.HibernateUtil;
import org.hibernate.Query;
import org.hibernate.Session;

import java.util.List;

/**
 */
public class App {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction();
                
		Query q = session.createQuery("from Location");
		List<Location> Locations = q.list();
                for (Location location : Locations) {
                    System.err.println(location.getId() + " " + location.getCity());
                }
		session.getTransaction().commit();
		session.close();
                System.exit(0);
	}
}
