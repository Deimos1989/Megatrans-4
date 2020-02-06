package Application;

import DAO.NodeBuildDAO;

import Entity.DateTime;
import Entity.FinalNode;
import TableDisplay.TableDispleyUAVR;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;


@Controller
public class View {






@GetMapping("/")
public String main(Model model) {
    return "main";
}

    @GetMapping("/View/start")
    public String start(Model model) {
        NodeBuildDAO nodeBuildDAO = new NodeBuildDAO();

        LinkedHashMap< Integer , Object> maps =new LinkedHashMap<Integer, Object>();
        List<FinalNode>finalNodeList=nodeBuildDAO.findByIpNode();

        for (int i = 0; i != finalNodeList.size(); i++) {
            Integer id = finalNodeList.get(i).getId();
            Object node= finalNodeList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);

        }
        return "main";
    }

    @GetMapping("/View/start2")
    public String start2(Model model) {

        LinkedHashMap<Integer, Object> maps1 = new LinkedHashMap<Integer, Object>();
        TableDispleyUAVR tableDispleyUAVR =new TableDispleyUAVR();

            Integer id = 1;
            Object node = tableDispleyUAVR;
            maps1.put(id, node);
            model.addAttribute("maps", maps1);

            return "otchet";
        }


}