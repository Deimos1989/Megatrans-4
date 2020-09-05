package Application.Controller;

import Application.Entity.Guide;
import Application.exchange.ExchangeGuide;
import Application.service.GuideServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerGuide {

    @Autowired
    GuideServiceInterfaceImplement guideServiceInterfaceImplement;

    @RequestMapping(value = "/ControllerGuide/ErroredBlocks", method = RequestMethod.GET)
    public String findAllErroredBlocks(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getErroredBlocks();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/ErroredSeconds", method = RequestMethod.GET)
    public String findAllErroredSeconds(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getErroredSeconds();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/SeverelyErroredSeconds", method = RequestMethod.GET)
    public String findAllSeverelyErroredSeconds(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getSeverelyErroredSeconds();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }


    @RequestMapping(value = "/ControllerGuide/BackgroundBlockErrors", method = RequestMethod.GET)
    public String findAllBackgroundBlockErrors(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getBackgroundBlockErrors();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/Esr", method = RequestMethod.GET)
    public String findAllEsr(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getEsr();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/Sers", method = RequestMethod.GET)
    public String findAllSers(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getSers();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/Bber", method = RequestMethod.GET)
    public String findAllBber(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getBber();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/AvailableTime", method = RequestMethod.GET)
    public String findAllAvailableTime(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getAvailableTime();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/UnavailableTime", method = RequestMethod.GET)
    public String findAllUnavailableTime(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getUnavailableTime();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }

    @RequestMapping(value = "/ControllerGuide/Nmr", method = RequestMethod.GET)
    public String findAllNmr(@ModelAttribute ExchangeGuide exchangeGuide, Model model){
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<Guide> guideList = guideServiceInterfaceImplement.findAll();
        for (int i = 0; i != guideList.size(); i++) {
            Long id = guideList.get(i).getId();
            Object node = guideList.get(i).getNmr();
            maps.put(id, node);
            model.addAttribute("maps", maps);
        }
        return "guide";
    }


    @RequestMapping(value="/ControllerSystemGroup/save", method=RequestMethod.POST)
    public String save(@ModelAttribute ExchangeGuide exchangeGuide, Guide guide) {
        guide.setId(exchangeGuide.getId());

        return "guide";
    }

}
