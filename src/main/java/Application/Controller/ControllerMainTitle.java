package Application.Controller;

import Application.exchange.ExchangeAgent;
import Application.exchange.ExchangeNodeUrl;
import Application.exchange.ExchangeServiceObjectView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ControllerMainTitle {

    @GetMapping(value="/")
    public String main(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "TITLE";
    }


    @GetMapping(value="/menu")
    public String menu(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "menu";
    }

    @GetMapping(value="/reportSystem")
    public String reportSystem(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "reportSystem";
    }



    @GetMapping(value="/addUrl")
    public String addUrl(Model model) {
        ExchangeNodeUrl exchangeNodeUrl =new ExchangeNodeUrl();
        model.addAttribute("exchangeNodeUrl", exchangeNodeUrl );
        return "addUrl";
    }

    @GetMapping(value="/surleyNode")
    public String surleyNode(Model model) {
        ExchangeAgent exchangeAgent = new ExchangeAgent();
        model.addAttribute("exchangeAgent", exchangeAgent );
        return "surleyNode";
    }

    @GetMapping(value="/reportUrl")
    public String reportUrl(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "reportUrl";
    }
}
