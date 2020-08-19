package Application.Controller;

import Application.Entity.NodeUrl;
import Application.Entity.SystemGroup;
import Application.action.SetDateTime;
import Application.action.SetNodeBase;
import Application.exchange.ExchangeAgent;
import Application.processing.DslStatisticsNode;
import Application.processing.DslStatusNode;
import Application.service.DateTimeServiceInterfaceImplement;

import Application.service.ResultSurleyServiceInterfaceImplement;
import Application.service.NodeUrlServiceInterfaceImplement;

import Application.service.SystemGroupServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.*;

@Controller
public class ControllerAgent {

    @Autowired
    DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;

    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @Autowired
    NodeUrlServiceInterfaceImplement nodeUrlServiceInterfaceImplement;

    @Autowired
    SystemGroupServiceInterfaceImplement systemGroupServiceInterfaceImplement;

    @Autowired
    DslStatusNode dslStatusNode;

    @Autowired
    DslStatisticsNode dslStatisticsNode;

    @Autowired
    ControllerNodeUrl controllerNodeUrl;

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    private  Boolean bool;


    @GetMapping(value="/ControllerAgent/taskStart")
    public String taskStart(@ModelAttribute ExchangeAgent exchangeAgent, Model model) {

        setBool(true);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                if (bool == true) {


                    List<NodeUrl> nodeUrls = nodeUrlServiceInterfaceImplement.findAll();
                    List<SystemGroup> systemGroups = systemGroupServiceInterfaceImplement.findAll();


                    ArrayList<String> urls = new ArrayList<>();
                    for (int k = 0; k != systemGroups.size(); k++) {
                        for (int i = 0; i != nodeUrls.size(); i++) {
                            if (systemGroups.get(k).getNumber().equals(nodeUrls.get(i).getNumber())) {
                                urls.add(nodeUrls.get(i).getUrlDslStatus() + ";" + nodeUrls.get(i).getUrlDslStatistics());
                            }
                        }
                    }
                    System.out.println(Arrays.asList(urls));

                    SetDateTime setDateTime = new SetDateTime(dateTimeServiceInterfaceImplement);
                    Thread thread1 = new Thread(setDateTime);
                    thread1.start();

                    SetNodeBase setNodeBase = new SetNodeBase(resultSurleyServiceInterfaceImplement, dslStatusNode, dslStatisticsNode, urls);
                    Thread thread2 = new Thread(setNodeBase);
                    thread2.start();




            }else

            {
                timer.cancel();
                timer.purge();
            }
        }

        };
        timer.scheduleAtFixedRate(task,1000,20000);
        return"TITLE";
        }


    @GetMapping(value="/ControllerAgent/taskStop")
    public String taskStop() {
       setBool(false);
        return "TITLE";
    }





   /* @RequestMapping(value="/ControllerAgent/readUrl", method=RequestMethod.POST)
    public String readUrl(@ModelAttribute ExchangeAgent exchangeAgent, Model model) {

        controllerNodeUrl.setNodeUrlList(nodeUrlServiceInterfaceImplement.findAll());

        return "surleyNode";
    }*/

}
