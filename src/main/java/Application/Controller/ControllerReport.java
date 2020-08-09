package Application.Controller;

import Application.DisableModul.Repository;

import Application.Entity.NodeBase;
import Application.Report.ReportSystem;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.NodeBaseServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


@Controller
public class ControllerReport {

    @Autowired
    NodeBaseServiceInterfaceImplement nodeBaseServiceInterfaceImplement;

    @RequestMapping(value = "/ControllerReport/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObjectView exchangeServiceObjectView, Repository repository, ReportSystem reportSystem) {



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(exchangeServiceObjectView.getLocalDateTime(), formatter);

        List<NodeBase> nodeBases = nodeBaseServiceInterfaceImplement.findByLocalDateTime(localDateTime);

        reportSystem.setNodeBaseList(nodeBases);
        reportSystem.setDataTime(exchangeServiceObjectView.getLocalDateTime());
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