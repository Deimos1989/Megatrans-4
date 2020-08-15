/*
package Application.DisableModul;


import Application.Entity.NodeBase;
import Application.Entity.SystemGroup;
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


    class ResultDto{
        String systemName;
        String dateCreate;
        String ip;
        String data;
    }

    public List<Double> getGraph(){
        List<Double> finalResult =  new ArrayList<>();
        finalResult.add(1.3);
        finalResult.add(15.5);
        finalResult.add(163.9);
        finalResult.add(4.0);
        String.join(",", finalResult);//'1.3,15.5,////'
        return finalResult;
    }


    public void get(long systemGroupId, String dateStart, String dateEnd){
        List<ResultDto> finalResult =  new ArrayList<>();
        SystemGroup sg = repositorySystemGroup.getByID(systemGroupId);

        List<Surlay> surlays = repositoryNodeBase.getBySystemGroupAndBettwenDateCrate(sg, dateStart, dateEnd);
        for (Surlay surlay:surlays) {
            List<NodeBase> result = repositoryNodeBase.getBySurlay(surlay);
            for(NodeBase nb :result){
                ResultDto rd = new ResultDto();
                rd.systemName = sg.getName();
                rd.dateCreate = surlay.dateCreate.toString();
                logn id = nb.getNodeUrlID();
                repositoryNodeUrld
                rd.ip = nb.getNodeUrl().getIp();
                rd.data = nb.getActiveSyncSourceName();
                finalResult.add(rd);
            }
        }
        return finalResult;

    }
}

*/
