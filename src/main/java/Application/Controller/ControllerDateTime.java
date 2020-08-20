package Application.Controller;

import Application.Entity.DateTime;
import Application.Entity.ResultSurley;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.DateTimeServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerDateTime {

    @Autowired
    DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;



    @RequestMapping(value = "/ControllerDateTime/findByDate", method = RequestMethod.POST)
    public String findByDate(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate = LocalDate.parse(exchangeServiceObjectView.getLocalDate(), formatter);
        List<DateTime> dateTimeList = dateTimeServiceInterfaceImplement.findByLocalDate(localDate);
        for (int i = 0; i != dateTimeList.size(); i++) {
            Long id = dateTimeList.get(i).getId();
            Object node = dateTimeList.get(i);
            maps.put(id, node);
            model.addAttribute("maps0", maps);
        }
        return "reportSystem";
    }
}
