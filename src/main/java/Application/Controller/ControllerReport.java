package Application.Controller;



import Application.Entity.ResultSurley;
import Application.Report.ReportSystem;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.ResultSurleyServiceInterfaceImplement;
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
    ResultSurleyServiceInterfaceImplement nodeBaseServiceInterfaceImplement;

    @RequestMapping(value = "/ControllerReport/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObjectView exchangeServiceObjectView,ReportSystem reportSystem) {



        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(exchangeServiceObjectView.getLocalDateTime(), formatter);

        List<ResultSurley> resultSurleys = nodeBaseServiceInterfaceImplement.findByLocalDateTime(localDateTime);

        reportSystem.setResultSurleyList(resultSurleys);
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