/*
package Application;

import DAO.NodeBuildDAO;
import Service.ExchangeService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController {
    NodeBuildDAO nodeBuildDAO =new NodeBuildDAO();



    @RequestMapping(value="/", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("exchangeService", new ExchangeService());
        return "main";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute ExchangeService exchangeService, Model model) {

        return "main";
    }

}

*/
