package Application;

import DAO.NodeBuildDAO;
import Entity.FinalNode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Objects;


@Controller
public class View {






@GetMapping("/View")
public String start(Model model) {
    NodeBuildDAO nodeBuildDAO = new NodeBuildDAO();
    /*ArrayList<Object>  idCol = new ArrayList<>();
    ArrayList<Object>  dateCol = new ArrayList<>();
    ArrayList<Object>  ipNodeCol= new ArrayList<>();*/

    ArrayList<Object> nodes =new ArrayList<>();

    for (int i = 0; i != nodeBuildDAO.findByIpNode().size(); i++) {
        nodes.add(nodeBuildDAO.findByIpNode().get(i).getId());
        nodes.add(nodeBuildDAO.findByIpNode().get(i).getDate());
        nodes.add(nodeBuildDAO.findByIpNode().get(i).getIpNode());

        model.addAttribute("nodes", nodes);





    }
    return "main";
}

}