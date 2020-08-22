package Application.Controller;



import Application.Entity.ResultSurley;
import Application.Report.ReportSystem;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.ResultSurleyServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
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
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    private List<ResultSurley> resultSurleys;

    public List<ResultSurley> getResultSurleys() {
        return resultSurleys;
    }

    public void setResultSurleys(List<ResultSurley> resultSurleys) {
        this.resultSurleys = resultSurleys;
    }

    @RequestMapping(value = "/ControllerReport/reportSystem" , method=RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ExchangeServiceObjectView exchangeServiceObjectView,ReportSystem reportSystem) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(String.valueOf(resultSurleys.get(0).getLocalDateTime()).substring(0,19).replace('T',' '), formatter);
        String localDateTimeStringFormat1=String.valueOf(localDateTime);



        reportSystem.setResultSurleyList(getResultSurleys());
        reportSystem.setDataTime(localDateTimeStringFormat1);
        reportSystem.reportSystem();
        
        String DIRECTORY = "C:/Users/Deimos/IdeaProjects/Test";
        String DEFAULT_FILE_NAME = localDateTimeStringFormat1+".xls";

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