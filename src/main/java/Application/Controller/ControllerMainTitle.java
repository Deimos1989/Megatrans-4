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
        ExchangeNodeUrl exchangeNodeUrl =new ExchangeNodeUrl();
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        model.addAttribute("exchangeNodeUrl", exchangeNodeUrl );
        return "TITLE";
    }


    @GetMapping(value="/ControllerMainTitle/addUrls")
    public String addUrls(Model model) {
        ExchangeNodeUrl exchangeNodeUrl =new ExchangeNodeUrl();
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        model.addAttribute("exchangeNodeUrl", exchangeNodeUrl );
        return "addUrls";
    }

    @GetMapping(value="/menu")
    public String menu(Model model) {
        ExchangeAgent exchangeAgent = new ExchangeAgent();
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        model.addAttribute("exchangeAgent", exchangeAgent );
        return "menu";
    }

    @GetMapping(value="/reportSystem")
    public String reportSystem(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "reportSystem";
    }


    @GetMapping(value="/reportUrl")
    public String reportUrl(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "reportUrl";
    }
}
