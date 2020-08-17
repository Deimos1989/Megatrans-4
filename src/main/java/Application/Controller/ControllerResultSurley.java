package Application.Controller;

import Application.Entity.ResultSurley;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.ResultSurleyServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
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
    ResultSurleyServiceInterfaceImplement nodeBaseServiceInterfaceImplement;

    @RequestMapping(value="/ControllerResultSurley/findByIp", method=RequestMethod.POST)
    public String findByIpNodeBase(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {

        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = nodeBaseServiceInterfaceImplement.findByIp(exchangeServiceObjectView.getIp());
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node= resultSurleyList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }

    @RequestMapping(value="/ControllerResultSurley/findByHash", method=RequestMethod.POST)
    public String findByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        LinkedHashMap< Long , Object> maps =new LinkedHashMap<Long, Object>();
        List<ResultSurley> resultSurleyList = nodeBaseServiceInterfaceImplement.findByHash(exchangeServiceObjectView.getHash());
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node= resultSurleyList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }

        return "reportSystem";
    }


    @RequestMapping(value = "/ControllerResultSurley/findByDate", method = RequestMethod.POST )
    public String findByDate(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
        List<ResultSurley> resultSurleyList = nodeBaseServiceInterfaceImplement.findByLocalDate(localDate);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node= resultSurleyList.get(i);
            maps.put(id,node);
            model.addAttribute("maps0", maps);
        }
        return "reportSystem";//menu
    }

    @RequestMapping(value = "/ControllerResultSurley/findByLocalDateTime", method = RequestMethod.POST )
    public String findByLocalDateTime(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(exchangeServiceObjectView.getLocalDateTime(), formatter);
        List<ResultSurley> resultSurleyList = nodeBaseServiceInterfaceImplement.findByLocalDateTime(localDateTime);
        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object node= resultSurleyList.get(i);
            maps.put(id,node);
            model.addAttribute("maps", maps);
        }
        return "reportSystem";
    }




    @RequestMapping(value="/ControllerResultSurley/deleteByHash", method=RequestMethod.POST)
    public String deleteByHash(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, ResultSurley resultSurley) {
        nodeBaseServiceInterfaceImplement.deleteHash(exchangeServiceObjectView.getHash());
        return "reportSystem";
    }

}
