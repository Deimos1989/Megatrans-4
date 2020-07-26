package Application;

import DAO.Repository;

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
public class ControllerOne {


    @GetMapping("/ControllerOne/main")
    public String main() {
        return "main";
    }


   /* @RequestMapping(value="/", method=RequestMethod.GET)
    public String greetingForm(Model model) {
        model.addAttribute("exchangeServiceObject", new ExchangeServiceObject());
        return "main";
    }*/

    @RequestMapping(value="/ControllerOne/analizNodeData", method=RequestMethod.POST)
    public String analizNodeData(@ModelAttribute ExchangeServiceObject exchangeServiceObject, Model model, Repository repository) {
        repository.setIp(exchangeServiceObject.getIpAddress());

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase>nodeBaseList= repository.findByIpNode();
        for (int i = 0; i != nodeBaseList.size(); i++) {

            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "main";
    }

    @RequestMapping(value="/ControllerOne/setTimeZona", method=RequestMethod.POST)
    public void setTimeZona(Repository repository) {
        repository.setTimeZona();

    }



    @RequestMapping(value="/ControllerOne/analizNodeDataToDay", method=RequestMethod.POST)
    public String analizNodeDataToDay(@ModelAttribute ExchangeServiceObject exchangeServiceObject, Model model, Repository repository) {
        repository.setDate(exchangeServiceObject.getDate());

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase>nodeBaseList= repository.selectDate();
        for (int i = 0; i != nodeBaseList.size(); i++) {

            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "main";
    }



    @RequestMapping(value = "/ControllerOne/analizNodeDateTimeReport" , method=RequestMethod.POST)
    public String analizNodeDateTimeReport(@ModelAttribute ExchangeServiceObject exchangeServiceObject, ExchangeServiceTable exchangeServiceTable, Repository repository, Model model) {
        repository.setHash(exchangeServiceObject.getDateTime());

        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<NodeBase> nodeBases = repository.localDateTimeReport();


        for (int i = 0; i<nodeBases.size(); i++) {
            Long id = nodeBases.get(i).getId();
            Object node = nodeBases.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "reportSystem";
    }




    @RequestMapping(value = "/ControllerOne/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObject exchangeServiceObject, Repository repository, ReportSystem reportSystem) {

        repository.setDateTime(exchangeServiceObject.getDateTime());
        List<NodeBase> nodeBases = repository.localDateTimeReport();

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