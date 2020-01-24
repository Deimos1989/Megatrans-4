package Application;

import DAO.NodeBuildDAO;
import Entity.FinalNode;

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
/*
        LinkedHashMap< Integer , Object> maps =new LinkedHashMap<Integer, Object>();

        for (int i = 0; i != nodeBuildDAO.findByIpNode().size(); i++) {
            Integer id = nodeBuildDAO.findByIpNode().get(i).getId();
            Object node= nodeBuildDAO.findByIpNode().get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);

        }*/
        return "otchet";
    }



}