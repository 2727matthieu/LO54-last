package fr.utbm.lo54.repository;

import fr.utbm.lo54.entity.Client;
import fr.utbm.lo54.tools.HibernateUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 * Created by matbo on 14/04/2018.
 */
public class ClientDao {

    public void saveNewClient(Client client) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        try {
            session.beginTransaction();
            session.persist(client);

            //Recuperer qqn par son id
            //Client client1 = (Client) session.get(Client.class, 12);

            //Mettre à jour une entité persistante
            //client1.setFirstname("John");

            //Rechercher puis supprimer un enregistrement
            //Client client2 = (Client) session.get(Client.class, 13);
            //session.delete(client2);
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
    }
}
