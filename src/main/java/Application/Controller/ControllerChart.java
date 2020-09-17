package Application.Controller;

import Application.Entity.ResultSurley;
import Application.exchange.ExchangeChart;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.ResultSurleyServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerChart {


    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @RequestMapping(value="/ControllerChart/findByIp", method=RequestMethod.GET)
    public String findByIpNodeBase(@ModelAttribute ExchangeServiceObjectView exchangeServiceObjectView, Model model) {


    //   List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findTop50ByOrderByIdDesc();

       // System.out.println(Arrays.asList(resultSurleyList));
        /*LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();

        for (int i = 0; i != resultSurleyList.size(); i++) {
            Long id = resultSurleyList.get(i).getId();
            Object st = resultSurleyList.get(i).getSesrValueSide1();
            maps.put(id, st);

        }*/

        String[] str = {"0.120","0.5","0.9","0.9"};


          //  System.out.println(Arrays.asList(resultSurleyList));
            model.addAttribute("maps", str);

            return "chart";
        }

    }
