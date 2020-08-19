package Application.Controller;

import Application.Entity.SystemGroup;
import Application.exchange.ExchangeNodeUrl;

import Application.service.SystemGroupServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;



@Controller
public class ControllerSystemGroup {

    @Autowired
    SystemGroupServiceInterfaceImplement systemGroupServiceInterfaceImplement;
    @RequestMapping(value = "/ControllerSystemGroup/findAll", method = RequestMethod.GET)
    public String findAll (@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model
            model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<SystemGroup> systemGroups = systemGroupServiceInterfaceImplement.findAll();
        for (int i = 0; i != systemGroups.size(); i++) {
            Long id = systemGroups.get(i).getId();
            Object node = systemGroups.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrls";
    }

    @RequestMapping(value="/ControllerSystemGroup/save", method=RequestMethod.POST)
    public String save(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl,SystemGroup systemGroup) {
        systemGroup.setNumber(exchangeNodeUrl.getNumber());
        systemGroupServiceInterfaceImplement.save(systemGroup);
        return "addUrls";
    }

    @RequestMapping(value="/ControllerSystemGroup/delete", method=RequestMethod.GET)
    public String delete(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl,SystemGroup systemGroup) {
        systemGroup.setId(exchangeNodeUrl.getId());
        systemGroupServiceInterfaceImplement.delete(systemGroup);
        return "addUrls";
    }

    @RequestMapping(value="/ControllerSystemGroup/deleteAll", method=RequestMethod.GET)
    public String deleteAll(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, SystemGroup systemGroup) {
        systemGroupServiceInterfaceImplement.deleteAll(systemGroup);
        return "addUrls";
    }


}
