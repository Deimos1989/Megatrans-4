package Application;

import DAO.NodeBuildDAO;
import Entity.FinalNode;
import com.company.DslStatusNode;
import com.company.Url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Agent {

    @GetMapping("/Agent")
    public String start(@RequestParam(name="name", required=false, defaultValue="World")String name, Model model) {
        DslStatusNode dslStatusNode =new DslStatusNode();
        NodeBuildDAO nodeBuildDAO =new NodeBuildDAO();




        Url url =new Url();
        url.start();

        model.addAttribute("name", name);
        return "main";
    }


}
