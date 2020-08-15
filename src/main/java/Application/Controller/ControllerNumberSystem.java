package Application.Controller;

import Application.Entity.SystemGroup;
import Application.exchange.ExchangeNodeUrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;



@Controller
public class ControllerNumberSystem {

    /*@Autowired
    NumberSystemServiceInterfaceImplement numberSystemServiceInterfaceImplement;
*/
/*
    @RequestMapping(value = "/ControllerNumberSystem/findAll", method = RequestMethod.GET)
    public String findAll (@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model
            model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<SystemGroup> systemGroups = numberSystemServiceInterfaceImplement.findAll();
        for (int i = 0; i != systemGroups.size(); i++) {
            Long id = systemGroups.get(i).getId();
            Object node = systemGroups.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrls";
    }*/

  /*  @RequestMapping(value="/ControllerNumberSystem/save", method=RequestMethod.POST)
    public String save(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl , Model model,SystemGroup systemGroup) {
        //systemGroup.setNumber(exchangeNodeUrl.getNumber());
        numberSystemServiceInterfaceImplement.save(systemGroup);
        return "addUrls";
    }

    @RequestMapping(value="/ControllerNumberSystem/delete", method=RequestMethod.POST)
    public String delete(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl , Model model,SystemGroup systemGroup) {
        systemGroup.setId(exchangeNodeUrl.getId());
        numberSystemServiceInterfaceImplement.delete(systemGroup);
        return "addUrls";
    }*/


}
