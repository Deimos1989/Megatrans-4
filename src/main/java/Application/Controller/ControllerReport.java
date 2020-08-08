package Application.Controller;

import Application.DAO.Repository;

import Application.Entity.NodeBase;
import Application.Report.ReportSystem;
import Application.exchange.ExchangeServiceObjectView;

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
public class ControllerReport {




    @RequestMapping(value="/ControllerReport/analizNodeData", method=RequestMethod.POST)
    public String analizNodeData(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository) {
        repository.setIp(exchangeServiceObjectView.getIpAddress());

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase> nodeBaseList= repository.findByIpNode();
        for (int i = 0; i != nodeBaseList.size(); i++) {
            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value="/ControllerReport/analizNodeDataToDay", method=RequestMethod.POST)
    public String analizNodeDataToDay(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository) {
        repository.setDate(exchangeServiceObjectView.getDate());

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<NodeBase>nodeBaseList= repository.selectDate();
        for (int i = 0; i != nodeBaseList.size(); i++) {
            Long id = nodeBaseList.get(i).getId();
            Object node= nodeBaseList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "menu";
    }

    @RequestMapping(value = "/ControllerReport/analizNodeDateTimeReport" , method=RequestMethod.POST)
    public String analizNodeDateTimeReport(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView,  Repository repository, Model model) {
        repository.setHash(exchangeServiceObjectView.getDateTime());

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

    @RequestMapping(value = "/ControllerReport/analizNodeHashReport" , method=RequestMethod.POST)
    public String analizNodeHashReport(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView,  Repository repository, Model model) {
        repository.setHash(exchangeServiceObjectView.getHash());

        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<NodeBase> nodeBases = repository.hashReport();
        for (int i = 0; i<nodeBases.size(); i++) {
            Long id = nodeBases.get(i).getId();
            Object node = nodeBases.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "reportSystem";
    }


    @RequestMapping(value = "/ControllerReport/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObjectView exchangeServiceObjectView, Repository repository, ReportSystem reportSystem) {

        repository.setDateTime(exchangeServiceObjectView.getDateTime());
        List<NodeBase> nodeBases = repository.localDateTimeReport();

        reportSystem.setNodeBaseList(nodeBases);
        reportSystem.setDataTime(exchangeServiceObjectView.getDateTime());
        reportSystem.reportSystem();
        
        String DIRECTORY = "C:/Users/Deimos/IdeaProjects/Test";
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