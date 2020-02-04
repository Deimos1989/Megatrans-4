package DAO;


import Entity.DateTime;
import Entity.FinalNode;
import Entity.IntermediateNode;
import Entity.Node;
import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.persistence.criteria.Root;
import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Timestamp;
import java.util.*;


public class NodeBuildDAO {


    public List<FinalNode> findByIpNode() {

        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();

        Criteria criteria;
        String ars ="127.0.0.2";
        criteria = session.getSessionFactory().openSession().createCriteria(FinalNode.class).add(Restrictions.eq("ipNode", ars));
        List<FinalNode> finalNodeList = criteria.list();

        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return finalNodeList;
    }


    public List findByDataTime() {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();


        //Query query1 = session.createQuery("FROM DateTime where hash1 = :paramName");
        //query1.setParameter("paramName", "2020.02.01.19.50.30.030");



        //Query query2=session.createSQLQuery("SELECT date FROM DateTime where TIMESTAMP('2020-02-01 19:50:30')");
        List<FinalNode> persons=session.createSQLQuery("SELECT finalnode.id as id, datetime.hash1 as hash1 FROM finalnode INNER JOIN datetime ON finalnode.hash1 =datetime.hash1 where datetime.hash1='2020.02.04.00.40.42.314'").list();


       System.out.println(persons.get(0).getDate());
        System.out.println();
        System.out.println(Arrays.asList(persons).toString());
        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return persons;
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

    public void saveNode(Node node) {
        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();
        session.save(node);
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

