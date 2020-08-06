package Application.Controller;

import Application.DAO.Repository;
import Application.Entity.DateTime;
import Application.Entity.NodeUrl;
import Application.exchangeObject.ExchangeServiceObjectView;
import Application.repository.ObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerRead {

    @Autowired
    private ObjectRepository objectRepository;


    @RequestMapping(value="/ControllerRead/readNumberObject", method=RequestMethod.GET)
    public String readNumberObject(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        repository.setObT(exchangeServiceObjectView.getNumber());
        List<NodeUrl>nodeUrlList= repository.findByNodeUrl();
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrl";
    }


    @RequestMapping(value="/ControllerRead/readIpObject", method=RequestMethod.GET)
    public String readIpObject(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        repository.setObV(exchangeServiceObjectView.getIpAddress());
        List<NodeUrl>nodeUrlList= repository.findByIpNodeUrl();
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrl";
    }


    @RequestMapping(value="/ControllerRead/findAllDateTime", method=RequestMethod.GET)
    public String findAllDateTime(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        //repository.setObV(exchangeServiceObjectView.getIpAddress());
        List<DateTime> nodeUrlList = objectRepository.findAll();
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "test";
    }


}
