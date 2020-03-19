package DAO;


import Entity.NodeBase;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class SessionFactory {

    private static org.hibernate.SessionFactory sessionFactory;

    public static Session getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        configuration.addAnnotatedClass(NodeBase.class);
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory.openSession();
    }
}
