package DAO;


import Entity.DateTime;
import Entity.FinalNode;
import Entity.IntermediateNode;
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

    public List<FinalNode> findByIpNode() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        Query query1 = session.createQuery("FROM FinalNode where ipNode=:paramName");
        query1.setParameter("paramName",ip);
        List<FinalNode>finalNodeList=query1.list();
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return finalNodeList;
    }



    public List<NodeBase> localDateTimeReport() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime dateTime = LocalDateTime.parse(getDateTime(), formatter);
        Query query1 = session.createQuery("FROM  NodeBase nb where nb.localDateTime =:paramName");
        query1.setParameter("paramName", dateTime);
        List<NodeBase>nodeList=query1.list();
        System.out.println(dateTime.toString());
        System.out.println(nodeList.size());
        System.out.println(nodeList.toString());
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return nodeList;
    }




    public void saveFinalNode(FinalNode finalNode) {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        session.save(finalNode);
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();


    }

    public void saveIntermediateNode(IntermediateNode intermediateNode) {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        session.save(intermediateNode);
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();

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

