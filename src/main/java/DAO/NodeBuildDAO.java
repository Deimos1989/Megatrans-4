package DAO;


import Entity.FinalNode;
import Entity.IntermediateNode;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import java.util.List;


public class NodeBuildDAO {



    public List<FinalNode> findByIpNode() {

        Session session = SessionFactory.getSessionFactory();
        Criteria criteria;
        criteria = session.getSessionFactory().openSession().createCriteria(FinalNode.class).add(Restrictions.eq("ipNode","127.0.0.2"));
        List<FinalNode> finalNodeList=criteria.list();

        return finalNodeList;
    }


    /*ublic void findByDate() {
        Session session = SessionFactory.getSessionFactory();
        Criteria criteria;
        criteria = session.getSessionFactory().openSession().createCriteria(FinalNode.class).add(Restrictions.eq("ipNode","127.0.0.1"));
        List<FinalNode> finalNodeList=criteria.list();

        for (int i=0;i!=finalNodeList.size();i++){
            System.out.println(finalNodeList.get(i).getDate());
        }

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
        ;

    }

}

