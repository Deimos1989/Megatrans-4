package Application.Controller;

import Application.Entity.ResultSurley;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.ResultSurleyServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerResultSurley {

    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @Autowired
    ControllerReport controllerReport;

    @RequestMapping(value = "/ControllerResultSurley/findByIp", method = RequestMethod.POST)
    public String findByIpResultSurley(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {

        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByIp(exchangeServiceObjectView.getIp());
        controllerReport.setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResultSurley/findByHash", method = RequestMethod.POST)
    public String findByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByHash(exchangeServiceObjectView.getHash());
        controllerReport.setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }


    @RequestMapping(value = "/ControllerResultSurley/findByDate", method = RequestMethod.POST)
    public String findByDate(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDate(localDate);
        controllerReport.setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps0", maps);
        }
        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResultSurley/findTop50ById", method = RequestMethod.POST)
    public String findTopBy50Id(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findTop50ByOrderByIdDesc();
        controllerReport.setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResultSurley/findByDateAndIpAndHash", method = RequestMethod.POST)
    public String findByDateAndIpAndHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, String ip,String hash) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        if (exchangeServiceObjectView.getLocalDate() != "" & exchangeServiceObjectView.getIp() != ""&exchangeServiceObjectView.getHash()!="") {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateAndIpAndHash(localDate, ip,hash);
            controllerReport.setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }
        }else {
            System.out.println("Error");
        }
        return "reportSystem";
    }

    @RequestMapping(value = "/ControllerResultSurley/findByDateAndNumberAndHash", method = RequestMethod.POST)
    public String findByDateAndNumberAndHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, String number,String hash) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        if (exchangeServiceObjectView.getLocalDate() != "" & exchangeServiceObjectView.getNumber() != "" &exchangeServiceObjectView.getHash()!="") {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateAndNumberAndHash(localDate, number,hash);
            controllerReport.setResultSurleys(resultSurleyList);
            for (int i = 0; i != resultSurleyList.size(); i++) {
                Long id = resultSurleyList.get(i).getId();
                Object node = resultSurleyList.get(i);
                maps.put(id, node);
                model.addAttribute("maps", maps);
            }
        }else {
            System.out.println("Error");
        }
        return "reportSystem";
    }


    @RequestMapping(value = "/ControllerResultSurley/findByLocalDateTime", method = RequestMethod.POST)
    public String findByLocalDateTime(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(exchangeServiceObjectView.getLocalDateTime().replace('T',' '), formatter);
        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateTime(localDateTime);
        controllerReport.setResultSurleys(resultSurleyList);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node = resultSurleyList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "reportSystem";
    }


    @RequestMapping(value = "/ControllerResultSurley/deleteByHash", method = RequestMethod.POST)
    public String deleteByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        resultSurleyServiceInterfaceImplement.deleteHash(exchangeServiceObjectView.getHash());
        return "reportSystem";
    }

}
