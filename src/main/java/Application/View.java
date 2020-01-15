/*
package Application;

import Entity.FinalNode;
import com.company.DslStatusNode;
import com.company.Url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class View {






@GetMapping("/View")
public String start(@RequestParam(name="name", required=false, defaultValue="World")String name, Model model) {



    Url url =new Url();
    DslStatusNode dslStatusNode =new DslStatusNode();
    url.start();
    model.addAttribute("name", name);
    return "main";
}


}*/
