package Application;

import DAO.NodeBuildDAO;

import Entity.FinalNode;

import Service.ExchangeService;
import TableDisplay.TableDispleyUAVR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.*;


@Controller
public class View {



    @RequestMapping(value="/", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("exchangeService", new ExchangeService());
        return "main";
    }

    @RequestMapping(value="/View/analizNodeData", method=RequestMethod.POST)
    public String analizNodeData(@ModelAttribute ExchangeService exchangeService,Model model, NodeBuildDAO nodeBuildDAO) {
       nodeBuildDAO.setIp(exchangeService.getIpAddress());

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



    @GetMapping("/View/analizNodeDateTimeReport")
    public String analizNodeDateTimeReport(Model model) {
        LinkedHashMap<Integer, Object> maps1 = new LinkedHashMap<Integer, Object>();
        TableDispleyUAVR tableDispleyUAVR =new TableDispleyUAVR();

        Integer id = 1;
        Object node = tableDispleyUAVR;
        maps1.put(id, node);
        model.addAttribute("maps", maps1);

        return "reportSystem";
    }







    @GetMapping("/View/start2")
    public String start2(Model model) {

        LinkedHashMap<Integer, Object> maps1 = new LinkedHashMap<Integer, Object>();
        TableDispleyUAVR tableDispleyUAVR =new TableDispleyUAVR();

            Integer id = 1;
            Object node = tableDispleyUAVR;
            maps1.put(id, node);
            model.addAttribute("maps", maps1);

            return "reportSystem";
        }


}