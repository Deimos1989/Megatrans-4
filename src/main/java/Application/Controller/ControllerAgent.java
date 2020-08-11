package Application.Controller;

import Application.Entity.DateTime;
import Application.action.SetDateTime;
import Application.action.SetNodeBase;
import Application.exchange.ExchangeAgent;
import Application.exchange.ExchangeDateTime;
import Application.processing.DslStatisticsNode;
import Application.processing.DslStatusNode;
import Application.service.DateTimeServiceInterfaceImplement;

import Application.service.NodeBaseServiceInterfaceImplement;
import Application.service.NodeUrlServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Timer;
import java.util.TimerTask;

@Controller
public class ControllerAgent {

    @Autowired
    DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;

    @Autowired
    NodeBaseServiceInterfaceImplement nodeBaseServiceInterfaceImplement;

    @Autowired
    NodeUrlServiceInterfaceImplement nodeUrlServiceInterfaceImplement;

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

                    SetDateTime setDateTime = new SetDateTime(dateTimeServiceInterfaceImplement);
                    Thread thread1 = new Thread(setDateTime);
                    thread1.start();

                    SetNodeBase setNodeBase = new SetNodeBase(nodeBaseServiceInterfaceImplement, nodeUrlServiceInterfaceImplement, dslStatusNode, dslStatisticsNode);
                    Thread thread2 = new Thread(setNodeBase);
                    thread2.start();

                }else {
                    timer.cancel();
                    timer.purge();
                }

            }

        };
        timer.scheduleAtFixedRate(task,1000,20000);
        return"surleyNode";
        }


    @RequestMapping(value="/ControllerAgent/taskStop", method=RequestMethod.POST)
    public String taskStop() {
       setBool(false);
        return "surleyNode";
    }





   /* @RequestMapping(value="/ControllerAgent/readUrl", method=RequestMethod.POST)
    public String readUrl(@ModelAttribute ExchangeAgent exchangeAgent, Model model) {

        controllerNodeUrl.setNodeUrlList(nodeUrlServiceInterfaceImplement.findAll());

        return "surleyNode";
    }*/

}
