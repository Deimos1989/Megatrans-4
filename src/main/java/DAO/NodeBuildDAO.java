package DAO;


import Entity.DateTime;
import Entity.FinalNode;
import Entity.IntermediateNode;
import Entity.NodeBase;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.sql.Timestamp;
import java.util.*;


public class NodeBuildDAO {

   private String ipNode ="127.0.0.2";

   private String dateTime ="2020/02/07 02:26:54";




    public List<FinalNode> findByIpNode() {

        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();


        Query query1 = session.createQuery("FROM FinalNode where ipNode=:paramName");
        query1.setParameter("paramName", ipNode);
        List<FinalNode>finalNodeList=query1.list();

        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return finalNodeList;
    }


        public List<NodeBase> setDataTime() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();

        Query query1 = session.createQuery("FROM NodeBase where date=:paramName");
        query1.setParameter("paramName", dateTime);
        List<NodeBase>nodeList=query1.list();

        System.out.println(nodeList.size());
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return nodeList;
    }



   /* public List<IntermediateNode> findByNodeIpIntermediate() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\test2\\src\\main\\resources\\Ip.txt"), "UTF-8");
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Фаил не найден");
        }

        ArrayList<String> urls = new ArrayList<>();


        while (scanner.hasNextLine()) {
            urls.add(scanner.nextLine());
        }

        scanner.close();

        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();

        for (int k = 0; k != urls.size(); k++) {
            String[] ip = urls.get(k).split(";");
            System.out.println(Arrays.asList(ip).toString());
            Query query1 = session.createQuery("SELECT *FROM IntermediateNode where ipNode = :paramName ORDER BY id LIMIT 3");
            query1.setParameter("paramName", ip[1]);
            List<IntermediateNode> findByIp2 = query1.list();
            System.out.println(findByIp2.toString());
            session.getTransaction().commit();
            session.clear();
            session.close();
            session.getSessionFactory().close();
            return findByIp2;
        }
        return null;
    }*/


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


    public String getIpNode() {
        return ipNode;
    }

    public void setIpNode(String ipNode) {
        this.ipNode = ipNode;
    }

    public String getDateTime() {
        return dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }
}

