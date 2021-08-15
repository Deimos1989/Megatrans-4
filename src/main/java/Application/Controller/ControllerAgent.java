package Application.Controller;

import Application.Entity.NodeUrl;
import Application.Entity.PathConfiguration;
import Application.Entity.PeriodSurley;
import Application.Entity.SystemGroup;
import Application.action.SetResultSurley;
import Application.exchange.ExchangeAgent;
import Application.processing.DslStatisticsNode;
import Application.processing.DslStatusNode;
import Application.service.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.*;

@Controller
public class ControllerAgent {

    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @Autowired
    NodeUrlServiceInterfaceImplement nodeUrlServiceInterfaceImplement;

    @Autowired
    SystemGroupServiceInterfaceImplement systemGroupServiceInterfaceImplement;

    @Autowired
    PathConfigurationServiceInterfaceImplement pathConfigurationServiceInterfaceImplement;

    @Autowired
    PeriodSurleyServiceInterfaceImplement periodSurleyServiceInterfaceImplement;

    @Autowired
    DslStatusNode dslStatusNode;

    @Autowired
    DslStatisticsNode dslStatisticsNode;

    @Autowired
    ControllerNodeUrl controllerNodeUrl;

    private volatile Boolean bool;

    private volatile static long time = 10000;

    @GetMapping(value = "/ControllerAgent/taskStart")
    public String taskStart(@ModelAttribute ExchangeAgent exchangeAgent) {
        exchangeAgent.setTimeSurley(getTime());
        setBool(true);


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                if (bool == true) {
                    List<NodeUrl> nodeUrls = nodeUrlServiceInterfaceImplement.findAll();
                    List<SystemGroup> systemGroups = systemGroupServiceInterfaceImplement.findAll();
                    SetResultSurley setResultSurley = new SetResultSurley(resultSurleyServiceInterfaceImplement, dslStatusNode, dslStatisticsNode, nodeUrls, systemGroups);
                    Thread thread = new Thread(setResultSurley);
                    thread.start();
                } else
                {
                    timer.cancel();
                    timer.purge();
                }
            }

        };
        timer.scheduleAtFixedRate(task, 1000, getTime());
        return "TITLE";
    }


    @GetMapping(value = "/ControllerAgent/taskStop")
    public String taskStop(@ModelAttribute ExchangeAgent exchangeAgent) {
        setBool(false);
        return "TITLE";
    }


    @GetMapping(value = "/ControllerAgent/setTime")
    public String setTime(@ModelAttribute ExchangeAgent exchangeAgent, PeriodSurley periodSurley) {
        setTime(exchangeAgent.getTimeSurley()*60000);
        return "TITLE";
    }

    @GetMapping(value = "/ControllerAgent/setTimeView")
    public String setTimeView(@ModelAttribute ExchangeAgent exchangeAgent) {
       exchangeAgent.setTimeSurley(getTime()/60000);
        return "TITLE";
    }


    @RequestMapping(value = "/ControllerAgent/savePathConfiguration", method = RequestMethod.GET)
    public String savePathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent) {
        PathConfiguration pathConfiguration = new PathConfiguration();
        if (exchangeAgent.getClientDirectory() != "" & exchangeAgent.getServerDirectory() != "") {
            pathConfiguration.setPathClientDirectory(exchangeAgent.getClientDirectory());
            pathConfiguration.setPathServerDirectory(exchangeAgent.getServerDirectory());
            pathConfigurationServiceInterfaceImplement.save(pathConfiguration);
        } else {
            exchangeAgent.setClientDirectory("Не указан путь");
            exchangeAgent.setServerDirectory("Не указан путь");
            exchangeAgent.setTimeSurley(0L);
        }
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/findAllPathConfiguration", method = RequestMethod.GET)
    public String findAllPathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent, Model model, PathConfiguration pathConfiguration) {
        List<PathConfiguration> pathConfigurationlist = pathConfigurationServiceInterfaceImplement.findAll(pathConfiguration);
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        for (int i = 0; i != pathConfigurationlist.size(); i++) {
            Long id = pathConfigurationlist.get(i).getId();
            Object node = pathConfigurationlist.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }

        return "TITLE";
    }






    @RequestMapping(value = "/ControllerAgent/deletePathConfiguration", method = RequestMethod.POST)
    public String deletePathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent, PathConfiguration pathConfiguration) {
        pathConfiguration.setId(exchangeAgent.getId());
        pathConfigurationServiceInterfaceImplement.delete(pathConfiguration);
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/deleteAllPathConfiguration", method = RequestMethod.POST)
    public String deleteAllPathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent, PathConfiguration pathConfiguration) {
        pathConfigurationServiceInterfaceImplement.deleteAll(pathConfiguration);
        return "TITLE";
    }


    @GetMapping(value = "/ControllerAgent/saveTimePeriod")
    public String saveTimePeriod(@ModelAttribute ExchangeAgent exchangeAgent, PeriodSurley periodSurley) {
        if(exchangeAgent.getTimeSurley()!=null&exchangeAgent.getDescription()!=null){
            periodSurley.setPeriod(exchangeAgent.getTimeSurley());
            periodSurley.setDescription(exchangeAgent.getDescription());
            periodSurleyServiceInterfaceImplement.save(periodSurley);
        }else {
            exchangeAgent.setTimeSurley(0L);
            exchangeAgent.setDescription("Введите текст");
        }
        return "TITLE";
    }


    @RequestMapping(value = "/ControllerAgent/findAllPeriod", method = RequestMethod.GET)
    public String findAllPeriodSurley(@ModelAttribute ExchangeAgent exchangeAgent, Model model, PeriodSurley periodSurley) {
        List<PeriodSurley> periodList = periodSurleyServiceInterfaceImplement.findAll();
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        for (int i = 0; i != periodList.size(); i++) {
            Long id = periodList.get(i).getId();
            Object node = periodList.get(i);
            maps.put(id, node);
            model.addAttribute("maps0", maps);
        }

        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/findPeriod", method = RequestMethod.GET)
    public String findPeriod(@ModelAttribute ExchangeAgent exchangeAgent) {
        if (exchangeAgent.getId()!=null) {
        Optional<PeriodSurley> periodList = periodSurleyServiceInterfaceImplement.findById(exchangeAgent.getId());
        if (periodList.isPresent()) {
            if (periodList.get().getPeriod()!=null & periodList.get().getDescription()!=null){
                setTime(periodList.get().getPeriod()*60000);
            }else {
                exchangeAgent.setId(0L);
            }
        }else {
            exchangeAgent.setId(0L);
        }
        }else {
            exchangeAgent.setId(0L);
        }
        return "TITLE";
    }


    @RequestMapping(value = "/ControllerAgent/deletePeriod", method = RequestMethod.POST)
    public String deletePeriod(@ModelAttribute ExchangeAgent exchangeAgent,PeriodSurley periodSurley) {
        periodSurley.setId(exchangeAgent.getId());
        periodSurleyServiceInterfaceImplement.delete(periodSurley);
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/deleteAllPeriod", method = RequestMethod.POST)
    public String deleteAllPeriod(@ModelAttribute ExchangeAgent exchangeAgent) {
        periodSurleyServiceInterfaceImplement.deleteAll();
        return "TITLE";
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public static long getTime() {
        return time;
    }

    public static void setTime(long time) {
        ControllerAgent.time = time;
    }

}
