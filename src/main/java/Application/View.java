package Application;

import DAO.NodeBuildDAO;

import Entity.DateTime;
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

        for (int i = 0; i != nodeBuildDAO.findByIpNode().size(); i++) {
            Integer id = nodeBuildDAO.findByIpNode().get(i).getId();
            Object node= nodeBuildDAO.findByIpNode().get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);

        }
        return "main";
    }

    @GetMapping("/View/start2")
    public String start2(Model model) {
        NodeBuildDAO nodeBuildDAO = new NodeBuildDAO();
        LinkedHashMap< Integer , Object> maps1 =new LinkedHashMap<Integer, Object>();



            Integer id =1;

        System.out.println(nodeBuildDAO.findByDataTime().get(1));


        //System.out.println( nodeBuildDAO.findByDataTime().list().get(0).toString());


     //   maps1.put(id, list);
      //   model.addAttribute("maps", maps1);


        return "otchet";
    }



}