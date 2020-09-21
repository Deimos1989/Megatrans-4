package Application.Controller;

import Application.Entity.ResultSurley;
import Application.exchange.ExchangeChart;
import Application.service.ResultSurleyServiceInterfaceImplement;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ControllerChart {


    @Autowired
    ResultSurleyServiceInterfaceImplement resultSurleyServiceInterfaceImplement;

    @RequestMapping(value = "/ControllerChart/findByLocalDateAndIp", method = RequestMethod.GET)
    public String findByLocalDateAndIp(@ModelAttribute ExchangeChart exchangeChart, Model model) {


        if (exchangeChart.getLocalDate1() != "" & exchangeChart.getIp() != "") {

            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            LocalDate localDate = LocalDate.parse(exchangeChart.getLocalDate1(), formatter);

            List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.findByLocalDateAndIp(localDate, exchangeChart.getIp());

            ArrayList<Double> nmrValueSide1List = new ArrayList<>();
            ArrayList<Double> nmrValueSide2List = new ArrayList<>();

            for (int i = 0; i != resultSurleyList.size(); i++) {
                Double st1 = resultSurleyList.get(i).getNmrValueSide1();
                Double st2 = resultSurleyList.get(i).getNmrValueSide2();
                nmrValueSide1List.add(st1);
                nmrValueSide2List.add(st2);
            }

            Gson gson = new Gson();
            String gs1 = gson.toJson(nmrValueSide1List);
            String gs2 = gson.toJson(nmrValueSide2List);

            model.addAttribute("nmrValueSide1List", gs1);
            model.addAttribute("nmrValueSide2List", gs2);
        } else {
            System.out.println("Error");
        }
        return "chart";
    }


    @RequestMapping(value = "/ControllerChart/findByDateAndIp", method = RequestMethod.GET)
    public String findByDateAndIp(@ModelAttribute ExchangeChart exchangeChart, Model model) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate1 = LocalDate.parse(exchangeChart.getLocalDate1(), formatter);
        LocalDate localDate2 = LocalDate.parse(exchangeChart.getLocalDate2(), formatter);


        List<ResultSurley> resultSurleyList = resultSurleyServiceInterfaceImplement.getAllOfCurrentMonth(exchangeChart.getIp(),localDate1,localDate2);
        ArrayList<Double> nmrValueSide1List = new ArrayList<>();
        ArrayList<Double> nmrValueSide2List = new ArrayList<>();

        for (int k = 0; k != resultSurleyList.size(); k++) {
            Double st1 = resultSurleyList.get(k).getNmrValueSide1();
            Double st2 = resultSurleyList.get(k).getNmrValueSide2();
            nmrValueSide1List.add(st1);
            nmrValueSide2List.add(st2);
        }

        Gson gson = new Gson();
        String gs1 = gson.toJson(nmrValueSide1List);
        String gs2 = gson.toJson(nmrValueSide2List);

        model.addAttribute("nmrValueSide1List", gs1);
        model.addAttribute("nmrValueSide2List", gs2);


        return "chart";
    }
}