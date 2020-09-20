package Application.Controller;

import Application.exchange.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMainTitle {

    @GetMapping(value="/")
    public String main(Model model) {
        ExchangeChart exchangeChart =new ExchangeChart();
        ExchangeAgent exchangeAgent = new ExchangeAgent();
        model.addAttribute("exchangeAgent", exchangeAgent );
        model.addAttribute("exchangeChart", exchangeChart );
        return "TITLE";
    }

    @GetMapping(value="/ControllerMainTitle/backTitle")
    public String backTitle(Model model) {
        ExchangeChart exchangeChart =new ExchangeChart();
        ExchangeAgent exchangeAgent = new ExchangeAgent();
        model.addAttribute("exchangeAgent", exchangeAgent );
        model.addAttribute("exchangeChart", exchangeChart );
        return "TITLE";
    }


    @GetMapping(value="/ControllerMainTitle/reportSystem")
    public String reportSystem(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "reportSystem";
    }


    @GetMapping(value="/ControllerMainTitle/addUrls")
    public String addUrls(Model model) {
        ExchangeNodeUrl exchangeNodeUrl =new ExchangeNodeUrl();
        model.addAttribute("exchangeNodeUrl", exchangeNodeUrl );
        return "addUrls";
    }

    @GetMapping(value="/ControllerMainTitle/guide")
    public String guide(Model model) {
        ExchangeGuide exchangeGuide =new ExchangeGuide();
        model.addAttribute("exchangeGuide", exchangeGuide );
        return "guide";
    }


    @GetMapping(value="/ControllerMainTitle/chart")
    public String chart(Model model) {
        ExchangeChart exchangeChart = new ExchangeChart();
        model.addAttribute("exchangeChart", exchangeChart);
        return "chart";
    }

}
