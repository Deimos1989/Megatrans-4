package Application.Controller;

import Application.Entity.NodeBase;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.NodeBaseServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerNodeBase {

    @Autowired
    NodeBaseServiceInterfaceImplement nodeBaseServiceInterfaceImplement;

    @RequestMapping(value="/ControllerNodeBase/findByIpNodeBase", method=RequestMethod.POST)
    public String findByIpNodeBase(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, NodeBase nodeBase) {

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase> nodeBaseList= nodeBaseServiceInterfaceImplement.findByIp(exchangeServiceObjectView.getIp());
        for (int i = 0; i != nodeBaseList.size(); i++) {
            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value="/ControllerNodeBase/findByHashNodeBase", method=RequestMethod.POST)
    public String findByHashNodeBase(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, NodeBase nodeBase) {

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase> nodeBaseList= nodeBaseServiceInterfaceImplement.findByHash(exchangeServiceObjectView.getHash());
        for (int i = 0; i != nodeBaseList.size(); i++) {
            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value="/ControllerNodeBase/deleteByHash", method=RequestMethod.POST)
    public String deleteByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, NodeBase nodeBase) {
        nodeBaseServiceInterfaceImplement.deleteHash(exchangeServiceObjectView.getHash());
        return "reportSystem";
    }

}
