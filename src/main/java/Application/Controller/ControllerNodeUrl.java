package Application.Controller;

import Application.Entity.NodeUrl;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.NodeUrlInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerNodeUrl {

    @Autowired
    NodeUrlInterfaceImplement nodeUrlInterfaceImplement;



   /* @RequestMapping(value="/ControllerNodeUrl/findAllDateTime", method=RequestMethod.GET)
    public String findAllDateTime(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<DateTime> dateTimeList = dateTimeServiceInterfaceImplement.findAll();
        for (int i = 0; i != dateTimeList.size(); i++) {
            Long id = dateTimeList.get(i).getId();
            Object node = dateTimeList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "test";
    }
*/

    @RequestMapping(value="/ControllerNodeUrl/findAllNodeUrl", method=RequestMethod.GET)
    public String findAllNodeUrl(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeUrl> nodeUrlList = nodeUrlInterfaceImplement.findAll();
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrl";
    }






    @RequestMapping(value="/ControllerNodeUrl/save", method=RequestMethod.POST)
    public String save(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, NodeUrl nodeUrl) {
        if (exchangeServiceObjectView.getNumber()!=""& exchangeServiceObjectView.getIp()!=""& exchangeServiceObjectView.getUrl()!="" ){
            nodeUrl.setNumber(exchangeServiceObjectView.getNumber());
            nodeUrl.setIp(exchangeServiceObjectView.getIp());
            nodeUrl.setUrl(exchangeServiceObjectView.getUrl());
            nodeUrlInterfaceImplement.save(nodeUrl);

        } else {
            return "messageError";

        }


        return "addUrl";
    }



    @RequestMapping(value="/ControllerNodeUrl/nodeUrlIp", method=RequestMethod.GET)
    public String nodeUrlIp(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model,NodeUrl nodeUrl) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeUrl> nodeUrlList= nodeUrlInterfaceImplement.findByIp(exchangeServiceObjectView.getIp());
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrl";
    }

    @RequestMapping(value="/ControllerNodeUrl/nodeUrlNumber", method=RequestMethod.GET)
    public String nodeUrlNumber(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model,NodeUrl nodeUrl) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeUrl> nodeUrlList= nodeUrlInterfaceImplement.findByNumber(exchangeServiceObjectView.getNumber());
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrl";
    }





    @RequestMapping(value="/ControllerNodeUrl/deleteNodeUrlId", method=RequestMethod.POST)
    public String deleteNodeUrlId(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model,NodeUrl nodeUrl ) {
        if (exchangeServiceObjectView.getId()!=null){
            nodeUrl.setId(exchangeServiceObjectView.getId());
            nodeUrlInterfaceImplement.delete(nodeUrl);
        } else {
            return "messageError";
        }
        return "addUrl";
    }



    @RequestMapping(value="/ControllerNodeUrl/deleteNodeUrlAll", method=RequestMethod.POST)
    public String deleteNodeUrlAll(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model,NodeUrl nodeUrl ) {
            nodeUrlInterfaceImplement.deleteAll(nodeUrl);
        return "addUrl";
    }

}
