package DAO;


import Entity.FinalNode;
import Entity.IntermediateNode;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;


public class NodeBuildDAO {


    public List<FinalNode> findByIpNode() {

        Session session = SessionFactory.getSessionFactory();
        session.beginTransaction();

        Criteria criteria;
        criteria = session.getSessionFactory().openSession().createCriteria(FinalNode.class).add(Restrictions.eq("ipNode", "127.0.0.2"));
        List<FinalNode> finalNodeList = criteria.list();

        session.getTransaction().commit();
        session.clear();
        session.close();
        session.getSessionFactory().close();
        return finalNodeList;
    }


    public List<FinalNode> findByIp1() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\test\\src\\main\\resources\\Ip.txt"), "UTF-8");
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
                Query query1 = session.createQuery("FROM FinalNode where ipNode = :paramName");
                query1.setParameter("paramName", ip[1]);
                List<FinalNode> findByIp1 = query1.list();

            session.getTransaction().commit();
            session.clear();
            session.close();
            session.getSessionFactory().close();
            return findByIp1;


        }
        return null;
    }

 /*   public List<FinalNode> findByIp1() {
        Scanner scanner = null;

        try {
            scanner = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\test\\src\\main\\resources\\Ip.txt"), "UTF-8");
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
            Query query1 = session.createQuery("FROM FinalNode where ipNode = :paramName");
            query1.setParameter("paramName", ip[1]);
            List<FinalNode> findByIp1 = query1.list();

            session.getTransaction().commit();
            session.clear();
            session.close();
            session.getSessionFactory().close();
            return findByIp1;


        }
        return null;
    }
*/



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
        ;

    }

}

