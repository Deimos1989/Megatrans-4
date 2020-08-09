package Application.Controller;

import Application.Entity.DateTime;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.DateTimeServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerDateTime {



    @Autowired
    DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;




/*
    @RequestMapping(value = "/ControllerNodeUrl/findByLocalDate", method = RequestMethod.GET )
    public String findByLocalDate(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model, DateTime dateTime) {


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate date = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);




        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<DateTime> dateTimeList= dateTimeServiceInterfaceImplement.findByLocalDate();
        for (int i = 0; i != dateTimeList.size(); i++) {
            Long id = dateTimeList.get(i).getId();
            Object node = dateTimeList.get(i);
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "addUrl";*/

}