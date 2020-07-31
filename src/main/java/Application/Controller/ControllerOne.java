package Application.Controller;

import Application.DAO.Repository;

import Application.Entity.NodeBase;
import Application.Entity.NodeUrl;
import Application.Report.ReportSystem;
import Application.exchangeObject.ExchangeServiceObjectView;
import Application.exchangeObject.ExchangeSetNodeBaseObjectView;
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


    @GetMapping(value="/")
    public String main(Model model) {
        ExchangeServiceObjectView exchangeServiceObjectView = new ExchangeServiceObjectView();
        model.addAttribute("exchangeServiceObjectView", exchangeServiceObjectView );
        return "main";
    }

    @RequestMapping(value="/ControllerOne/analizNodeData", method=RequestMethod.POST)
    public String analizNodeData(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository) {
        repository.setIp(exchangeServiceObjectView.getIpAddress());

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

    @RequestMapping(value="/ControllerOne/save", method=RequestMethod.POST)
    public String save(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, Repository repository, NodeUrl nodeUrl) {
        nodeUrl.setNumber(exchangeServiceObjectView.getNumber());
        nodeUrl.setIp(exchangeServiceObjectView.getIpAddress());
        repository.setObT(nodeUrl);
        repository.save();
        return "main";
    }



    @RequestMapping(value="/ControllerOne/analizNodeDataToDay", method=RequestMethod.POST)
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

        return "main";
    }



    @RequestMapping(value = "/ControllerOne/analizNodeDateTimeReport" , method=RequestMethod.POST)
    public String analizNodeDateTimeReport(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, ExchangeSetNodeBaseObjectView ExchangeSetNodeBaseObjectView, Repository repository, Model model) {
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




    @RequestMapping(value = "/ControllerOne/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObjectView exchangeServiceObjectView, Repository repository, ReportSystem reportSystem) {

        repository.setDateTime(exchangeServiceObjectView.getDateTime());
        List<NodeBase> nodeBases = repository.localDateTimeReport();

        reportSystem.setNodeBaseList(nodeBases);
        reportSystem.setDataTime(exchangeServiceObjectView.getDateTime());
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