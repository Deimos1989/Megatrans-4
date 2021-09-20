package Application.Controller;

import Application.Entity.PathConfiguration;
import Application.Entity.ResultSurley;
import Application.Report.ReportSystem;
import Application.exchange.ExchangeAgent;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.PathConfigurationServiceInterfaceImplement;
import Application.service.ResultSurleyServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Optional;

@Controller
public class ControllerResult {

    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @Autowired
    PathConfigurationServiceInterfaceImplement pathConfigurationServiceInterfaceImplement;

    private List<ResultSurley> resultSurleys;
    private String clientDirectory = "C:/Windows/Temp/";
    private String serverDirectory = "C:/Windows/Temp/";

    @RequestMapping(value = "/ControllerResult/findByDateAndIp", method = RequestMethod.POST)
    public String findBylocalDateAndIp(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        if (exchangeServiceObjectView.getLocalDate() != "" & exchangeServiceObjectView.getIp() != "") {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateAndIp(localDate, exchangeServiceObjectView.getIp());
            setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }
        } else {
            System.out.println("Error");
        }
        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResult/findByHash", method = RequestMethod.POST)
    public String findByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByHash(exchangeServiceObjectView.getHash());
        setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResult/findByDate", method = RequestMethod.POST)
    public String findByDate(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        if (exchangeServiceObjectView.getLocalDate() != null) {
            LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDate(localDate);
            setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }

        } else {
            exchangeServiceObjectView.setLocalDate("Error");
        }
        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResult/findTop50ById", method = RequestMethod.POST)
    public String findTopBy50Id(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findTop50ByOrderByIdDesc();
        setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResult/findByDateAndIpAndHash", method = RequestMethod.POST)
    public String findByDateAndIpAndHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, String ip, String hash) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        if (exchangeServiceObjectView.getLocalDate() != "" & exchangeServiceObjectView.getIp() != "" & exchangeServiceObjectView.getHash() != "") {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateAndIpAndHash(localDate, ip, hash);
            setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }
        } else {
            System.out.println("Error");
        }
        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResult/findByDateAndNumberAndHash", method = RequestMethod.POST)
    public String findByDateAndNumberAndHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, String number, String hash) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        if (exchangeServiceObjectView.getLocalDate() != "" & exchangeServiceObjectView.getNumber() != "" & exchangeServiceObjectView.getHash() != "") {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateAndNumberAndHash(localDate, number, hash);
            setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }
        } else {
            System.out.println("Error");
        }
        return "reportSystem";
    }


    @RequestMapping(value = "/ControllerResult/findByLocalDateTime", method = RequestMethod.POST)
    public String findByLocalDateTime(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        if (exchangeServiceObjectView.getLocalDateTime() != "") {
            LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime localDateTime = LocalDateTime.parse(exchangeServiceObjectView.getLocalDateTime().replace('T', ' '), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateTime(localDateTime);
            setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }
        } else {
            exchangeServiceObjectView.setLocalDateTime("Error");
        }
        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResult/deleteByHash", method = RequestMethod.POST)
    public String deleteByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        resultSurleyServiceInterfaceImplement.deleteHash(exchangeServiceObjectView.getHash());
        return "reportSystem";
    }



    @RequestMapping(value = "/ControllerResult/reportSystem", method = RequestMethod.POST)
    public ResponseEntity<Object> reportSystem(ReportSystem reportSystem) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(String.valueOf(getResultSurleys().get(0).getTimestamp()).substring(0, 19).replace('T', ' '), formatter);
        String dateTime = String.valueOf(localDateTime);

        reportSystem.setDateTime(dateTime);
        reportSystem.setResultSurleyList(getResultSurleys());
        reportSystem.setPathServerDirectory(getServerDirectory());


        return ResponseEntity.ok()
                .contentType(MediaType.parseMediaType("application/vnd.ms-excel"))
                .body(reportSystem.reportSystem());


    }

    @RequestMapping(value = "/ControllerResult/findPathConfiguration", method = RequestMethod.POST)
    public String findPathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent) {

        if (exchangeAgent.getId() != null) {
            Optional<PathConfiguration> pathConfigurationList = pathConfigurationServiceInterfaceImplement.findById(exchangeAgent.getId());
            if (pathConfigurationList.isPresent()) {
                if (pathConfigurationList.get().getPathClientDirectory() != null & pathConfigurationList.get().getPathServerDirectory() != null) {
                    setClientDirectory(pathConfigurationList.get().getPathClientDirectory());
                    setServerDirectory(pathConfigurationList.get().getPathServerDirectory());
                } else {
                    exchangeAgent.setId(0L);
                }
            } else {
                exchangeAgent.setId(0L);
            }

        } else {
            exchangeAgent.setId(0L);
        }
        return "TITLE";
    }

    @RequestMapping(value = "/ControllerResult/viewPathConfiguration", method = RequestMethod.GET)
    public String viewPathConfiguration(@ModelAttribute ExchangeAgent exchangeAgent) {
        exchangeAgent.setClientDirectory(getClientDirectory());
        exchangeAgent.setServerDirectory(getServerDirectory());
        return "TITLE";
    }

    public List<ResultSurley> getResultSurleys() {
        return resultSurleys;
    }

    public String getClientDirectory() {
        return clientDirectory;
    }

    public void setClientDirectory(String clientDirectory) {
        this.clientDirectory = clientDirectory;
    }

    public String getServerDirectory() {
        return serverDirectory;
    }

    public void setServerDirectory(String serverDirectory) {
        this.serverDirectory = serverDirectory;
    }

    public void setResultSurleys(List<ResultSurley> resultSurleys) {
        this.resultSurleys = resultSurleys;
    }

}
