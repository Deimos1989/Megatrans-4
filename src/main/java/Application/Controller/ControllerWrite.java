package Application.Controller;

import Application.DAO.Repository;
import Application.Entity.NodeUrl;
import Application.exchangeObject.ExchangeServiceObjectView;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ControllerWrite {

    @RequestMapping(value="/ControllerWrite/save", method=RequestMethod.POST)
    public String save(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository, NodeUrl nodeUrl) {
        if (exchangeServiceObjectView.getNumber()!=""& exchangeServiceObjectView.getIpAddress()!=""& exchangeServiceObjectView.getUrl()!="" ){
            nodeUrl.setNumber(exchangeServiceObjectView.getNumber());
            nodeUrl.setIpUrl(exchangeServiceObjectView.getIpAddress());
            nodeUrl.setUrl(exchangeServiceObjectView.getUrl());

        } else {
            return "messageError";

        }


        return "addUrl";
    }

}
