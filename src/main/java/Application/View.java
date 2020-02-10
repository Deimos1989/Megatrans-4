package Application;

import DAO.NodeBuildDAO;

import Entity.FinalNode;

import TableDisplay.TableDispleyUAVR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.*;


@Controller
public class View {

String args;


    public String getArgs() {
        return args;
    }

    public void setArgs(String args) {
        this.args = args;
    }

    @GetMapping("/")
public String main(Model model) {
    return "main";
}

   /* @RequestMapping(value="/View", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("view", new View());
        return "main";

    }

    @RequestMapping(value="/View", method=RequestMethod.POST)
    public String greetingSubmit(@ModelAttribute View view, Model model) {
        model.addAttribute("view", view );
        return "result";

    }*/


    @GetMapping("/View/analizNodeData")
    public String analizNodeData(Model model) {
        NodeBuildDAO nodeBuildDAO = new NodeBuildDAO();
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