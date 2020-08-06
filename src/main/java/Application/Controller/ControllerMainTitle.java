package Application.Controller;

import Application.exchangeObject.ExchangeServiceObjectView;
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
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "addUrl";
    }

    @GetMapping(value="/surleyNode")
    public String surleyNode(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "surleyNode";
    }

    @GetMapping(value="/reportUrl")
    public String reportUrl(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "reportUrl";
    }
}
