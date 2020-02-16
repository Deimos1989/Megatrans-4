package Application;

import DAO.NodeBuildDAO;

import Entity.FinalNode;

import Entity.NodeBase;
import Service.ExchangeServiceObject;
import Service.ExchangeServiceTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;


@Controller
public class View {



    @RequestMapping(value="/", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("exchangeServiceObject", new ExchangeServiceObject());
        return "main";
    }

    @RequestMapping(value="/View/analizNodeData", method=RequestMethod.POST)
    public String analizNodeData(@ModelAttribute ExchangeServiceObject exchangeServiceObject, Model model, NodeBuildDAO nodeBuildDAO) {
       nodeBuildDAO.setIp(exchangeServiceObject.getIpAddress());

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<FinalNode>finalNodeList=nodeBuildDAO.findByIpNode();
        for (int i = 0; i != finalNodeList.size(); i++) {

            Long id = finalNodeList.get(i).getId();
            Object node= finalNodeList.get(i);
            maps.put(id,node);

            model.addAttribute("maps", maps);
        }

        return "main";


    }



    @GetMapping("/View/main")
    public String main() {
        return "main";
    }




    @RequestMapping(value = "/View/analizNodeDateTimeReport" , method=RequestMethod.POST)
    public String analizNodeDateTimeReport(@ModelAttribute ExchangeServiceObject exchangeServiceObject, ExchangeServiceTable exchangeServiceTable, NodeBuildDAO nodeBuildDAO, Model model) {
        nodeBuildDAO.setDateTime(exchangeServiceObject.getDateTime());
        List<NodeBase> nodeBases = nodeBuildDAO.localDateTimeReport();
        exchangeServiceTable.setNodeBases(nodeBases);

        LinkedHashMap<Integer, Object> maps1 = new LinkedHashMap<Integer, Object>();
       Integer id = 1;
       Object node = exchangeServiceTable.setTable();
       maps1.put(id, node);
       model.addAttribute("maps", maps1);

        return "reportSystem";
    }








}