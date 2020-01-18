package Application;

import DAO.NodeBuildDAO;
import Entity.FinalNode;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.w3c.dom.Document;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class View {






@GetMapping("/View")
public String start(@RequestParam(name="name", required=false, defaultValue="World") String ipNode, Model model) {
    NodeBuildDAO nodeBuildDAO =new NodeBuildDAO();

   for (int i=0;i!=nodeBuildDAO.findByIpNode().size();i++) {


       model.addAttribute("name", ipNode=nodeBuildDAO.findByIpNode().get(i).getIpNode());

       return "main";
   }
    return "main";
}


}
