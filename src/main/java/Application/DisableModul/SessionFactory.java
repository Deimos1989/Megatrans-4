package Application.DisableModul;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;


public class SessionFactory {

    private static org.hibernate.SessionFactory sessionFactory;

    public static Session getSessionFactory() {
        Configuration configuration = new Configuration().configure();
        sessionFactory = configuration.buildSessionFactory();
        return sessionFactory.openSession();
    }
}
