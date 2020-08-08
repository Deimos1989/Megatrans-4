package Application.Controller;

import Application.DAO.Repository;
import Application.exchange.ExchangeServiceObjectView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerDelete {

    @RequestMapping(value="/ControllerDelete/deleteHash", method=RequestMethod.POST)
    public String deleteHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository ) {
        repository.setObV(exchangeServiceObjectView.getHash());
        repository.deleteHash();
        return "reportSystem";
    }

    @RequestMapping(value="/ControllerDelete/deleteId", method=RequestMethod.POST)
    public String deleteId(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository ) {
        repository.setObV(exchangeServiceObjectView.getId());
        repository.deleteId();
        return "addUrl";
    }

}
