package Application.Controller;

import Application.Entity.NodeUrl;
import Application.Entity.PathConfiguration;
import Application.Entity.PeriodSurley;
import Application.Entity.SystemGroup;
import Application.action.SetDateTime;
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
    DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;

    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @Autowired
    NodeUrlServiceInterfaceImplement nodeUrlServiceInterfaceImplement;

    @Autowired
    SystemGroupServiceInterfaceImplement systemGroupServiceInterfaceImplement;

    @Autowired
    PathConfigurationServiceInterfaceImplement surleyConfigurationServiceInterfaceImplement;

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
        exchangeAgent.setTimeS(getTime());
        setBool(true);


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                if (bool == true) {


                    List<NodeUrl> nodeUrls = nodeUrlServiceInterfaceImplement.findAll();
                    List<SystemGroup> systemGroups = systemGroupServiceInterfaceImplement.findAll();


                    ArrayList<String> urls = new ArrayList<>();
                    ArrayList<String> numberSystem = new ArrayList<>();

                    for (int k = 0; k != systemGroups.size(); k++) {
                        for (int i = 0; i != nodeUrls.size(); i++) {
                            if (systemGroups.get(k).getNumber().equals(nodeUrls.get(i).getNumber())) {
                                urls.add(nodeUrls.get(i).getUrlDslStatus() + ";" + nodeUrls.get(i).getUrlDslStatistics());
                                numberSystem.add(systemGroups.get(k).getNumber());
                            }
                        }
                    }


                    System.out.println(Arrays.asList(numberSystem));

                    SetDateTime setDateTime = new SetDateTime(dateTimeServiceInterfaceImplement);
                    Thread thread1 = new Thread(setDateTime);
                    thread1.start();

                    SetResultSurley setResultSurley = new SetResultSurley(resultSurleyServiceInterfaceImplement, dslStatusNode, dslStatisticsNode, urls, numberSystem);
                    Thread thread2 = new Thread(setResultSurley);
                    thread2.start();


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
        setTime(exchangeAgent.getTimeS());
        periodSurley.setPeriod(exchangeAgent.getTimeS());
        periodSurleyServiceInterfaceImplement.save(periodSurley);
        return "TITLE";
    }


    @RequestMapping(value = "/ControllerAgent/savePathConfiguration", method = RequestMethod.GET)
    public String savePathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent) {
        PathConfiguration pathConfiguration = new PathConfiguration();
        if (exchangeAgent.getClientDirectory() != "" & exchangeAgent.getServerDirectory() != "") {
            pathConfiguration.setPathClientDirectory(exchangeAgent.getClientDirectory());
            pathConfiguration.setPathServerDirectory(exchangeAgent.getServerDirectory());
            surleyConfigurationServiceInterfaceImplement.save(pathConfiguration);
        } else {
            exchangeAgent.setClientDirectory("Не указан путь");
            exchangeAgent.setServerDirectory("Не указан путь");
            exchangeAgent.setTimeS(0L);
        }
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/findAllPathConfiguration", method = RequestMethod.GET)
    public String findAllPathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent, Model model, PathConfiguration pathConfiguration) {
        List<PathConfiguration> pathConfigurationlist = surleyConfigurationServiceInterfaceImplement.findAll(pathConfiguration);
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
        surleyConfigurationServiceInterfaceImplement.delete(pathConfiguration);
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/deleteAllPathConfiguration", method = RequestMethod.POST)
    public String deleteAllPathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent, PathConfiguration pathConfiguration) {
        surleyConfigurationServiceInterfaceImplement.deleteAll(pathConfiguration);
        return "TITLE";
    }


    @GetMapping(value = "/ControllerAgent/saveTimePeriod")
    public String saveTimePeriod(@ModelAttribute ExchangeAgent exchangeAgent, PeriodSurley periodSurley) {
        periodSurley.setPeriod(exchangeAgent.getTimeS());
        periodSurley.setDescription(exchangeAgent.getDescription());
        periodSurleyServiceInterfaceImplement.save(periodSurley);
        return "TITLE";
    }


    @RequestMapping(value = "/ControllerAgent/findAllPeriodS", method = RequestMethod.GET)
    public String findAllPeriodSurley(@ModelAttribute ExchangeAgent exchangeAgent, Model model, PeriodSurley periodSurley) {
        List<PeriodSurley> periodSurleyList = periodSurleyServiceInterfaceImplement.findAll();
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        for (int i = 0; i != periodSurleyList.size(); i++) {
            Long id = periodSurleyList.get(i).getId();
            Object node = periodSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps0", maps);
        }

        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/findPeriodS", method = RequestMethod.POST)
    public String findPeriodSurley(@ModelAttribute ExchangeAgent exchangeAgent, Model model, PeriodSurley periodSurley) {
        Optional<PeriodSurley> periodSurleyList = periodSurleyServiceInterfaceImplement.findById(exchangeAgent.getId());
        setTime(periodSurleyList.get().getPeriod());
        return "TITLE";
    }


    @RequestMapping(value = "/ControllerAgent/deletePeriodS", method = RequestMethod.POST)
    public String deletePeriodSurley(@ModelAttribute ExchangeAgent exchangeAgent, PathConfiguration pathConfiguration) {
        pathConfiguration.setId(exchangeAgent.getId());
        surleyConfigurationServiceInterfaceImplement.delete(pathConfiguration);
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerAgent/deleteAllPeriodS", method = RequestMethod.POST)
    public String deleteAllPeriodSurley(@ModelAttribute ExchangeAgent exchangeAgent, PathConfiguration pathConfiguration) {
        surleyConfigurationServiceInterfaceImplement.deleteAll(pathConfiguration);
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
