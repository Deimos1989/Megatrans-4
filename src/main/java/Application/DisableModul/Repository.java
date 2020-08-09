package Application.DisableModul;


import Application.Entity.NodeBase;
import org.hibernate.Query;
import org.hibernate.Session;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;



public class Repository {




    public List<NodeBase> localDateTimeReport() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse("Test", formatter);
        Query query1 = session.createQuery("FROM  NodeBase nb where nb.localDateTime =:paramName");
        query1.setParameter("paramName", dateTime);
        List<NodeBase>nodeList=query1.list();
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return nodeList;
    }


}

