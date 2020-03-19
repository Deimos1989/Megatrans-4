package Application;

import DAO.NodeBuildDAO;

import Entity.NodeBase;
import Report.ReportSystem;
import Service.ExchangeServiceObject;
import Service.ExchangeServiceTable;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


@Controller
public class View {


    @GetMapping("/View/main")
    public String main() {
        return "main";
    }


    @RequestMapping(value="/", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("exchangeServiceObject", new ExchangeServiceObject());
        return "main";
    }

    @RequestMapping(value="/View/analizNodeData", method=RequestMethod.POST)
    public String analizNodeData(@ModelAttribute ExchangeServiceObject exchangeServiceObject, Model model, NodeBuildDAO nodeBuildDAO) {
       nodeBuildDAO.setIp(exchangeServiceObject.getIpAddress());

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase>nodeBaseList=nodeBuildDAO.findByIpNode();
        for (int i = 0; i != nodeBaseList.size(); i++) {

            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "main";
    }



    @RequestMapping(value = "/View/analizNodeDateTimeReport" , method=RequestMethod.POST)
    public String analizNodeDateTimeReport(@ModelAttribute ExchangeServiceObject exchangeServiceObject, ExchangeServiceTable exchangeServiceTable, NodeBuildDAO nodeBuildDAO, Model model) {
        nodeBuildDAO.setDateTime(exchangeServiceObject.getDateTime());

        LinkedHashMap<Long, Object> maps1 = new LinkedHashMap<Long, Object>();
        List<NodeBase> nodeBases = nodeBuildDAO.localDateTimeReport();


        for (int i = 0; i<nodeBases.size(); i++) {
            Long id = nodeBases.get(i).getId();
            Object node = nodeBases.get(i);
            maps1.put(id, node);
            model.addAttribute("maps", maps1);
        }
        return "reportSystem";
    }




    @RequestMapping(value = "/View/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObject exchangeServiceObject, NodeBuildDAO nodeBuildDAO, ReportSystem reportSystem) {

        nodeBuildDAO.setDateTime(exchangeServiceObject.getDateTime());
        List<NodeBase> nodeBases = nodeBuildDAO.localDateTimeReport();

        reportSystem.setNodeBaseList(nodeBases);
        reportSystem.setDataTime(exchangeServiceObject.getDateTime());
        reportSystem.reportSystem();
        
        String DIRECTORY = "C:/Users/Denis/IdeaProjects/Test";
        String DEFAULT_FILE_NAME = reportSystem.getDataTime().replace(':','-')+".xls";

        File file = new File(DIRECTORY + "/" +DEFAULT_FILE_NAME);
        InputStreamResource resource = null;
        try {
             resource = new InputStreamResource(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return  ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .body(resource);


    }

}