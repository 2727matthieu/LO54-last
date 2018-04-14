package fr.utbm.lo54.repository;

import fr.utbm.lo54.tools.HibernateUtil;
import org.hibernate.Session;

/**
 * Created by matbo on 14/04/2018.
 */
public class HibernateDao {

    public void save(){
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.persist(new Object());
        session.getTransaction().commit();
    }
}
