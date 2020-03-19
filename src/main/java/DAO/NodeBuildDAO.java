package DAO;


import Entity.DateTime;
import Entity.NodeBase;
import org.hibernate.Query;
import org.hibernate.Session;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class NodeBuildDAO {

String ip;

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

    String dateTime;



    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public List<NodeBase> findByIpNode() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        Query query1 = session.createQuery("FROM NodeBase where ipNode=:paramName");
        query1.setParameter("paramName",ip);
        List<NodeBase>nodeBaseList=query1.list();
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return nodeBaseList;
    }



    public List<NodeBase> localDateTimeReport() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(getDateTime(), formatter);
        Query query1 = session.createQuery("FROM  NodeBase nb where nb.localDateTime =:paramName");
        query1.setParameter("paramName", dateTime);
        List<NodeBase>nodeList=query1.list();
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return nodeList;
    }




    public void saveNode(NodeBase nodeBase) {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        session.save(nodeBase);
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();

    }

    public void saveDateTime(DateTime dateTime) {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        session.save(dateTime);
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();

    }


}

