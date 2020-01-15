package DAO;


import Entity.FinalNode;
import Entity.IntermediateNode;
import org.hibernate.Session;


public class NodeBuildDAO {



    public FinalNode findById(int id) {
        Session session = SessionFactory.getSessionFactory();
        session.getSessionFactory().openSession().get(FinalNode.class, id);

        return (FinalNode) session.getSessionFactory().openSession().get(FinalNode.class, id);

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
        ;

    }

}

