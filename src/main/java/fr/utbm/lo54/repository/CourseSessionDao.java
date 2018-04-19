package fr.utbm.lo54.repository;

import fr.utbm.lo54.entity.Client;
import fr.utbm.lo54.entity.CourseSession;
import fr.utbm.lo54.tools.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by matbo on 14/04/2018.
 */
public class CourseSessionDao {
    CourseSession courseSession;
    public CourseSession getCourseSession(Integer id) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            courseSession = (CourseSession) session.get(CourseSession.class, id);
            session.getTransaction().commit();
        } catch (HibernateException he) {
            he.printStackTrace();
            if (session.getTransaction() != null) {
                try {
                    session.getTransaction().rollback();
                } catch (HibernateException he2) {
                    he2.printStackTrace();
                }
            }
        } finally {
            if (session != null) {
                try {
                    session.close();
                } catch (HibernateException he) {
                    he.printStackTrace();
                }
            }
        }
        return courseSession;
    }
}
