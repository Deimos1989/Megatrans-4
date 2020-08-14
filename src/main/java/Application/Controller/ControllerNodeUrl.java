package Application.Controller;

import Application.Entity.NodeUrl;
import Application.exchange.ExchangeNodeUrl;
import Application.service.NodeUrlServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.LinkedHashMap;
import java.util.List;

@Controller
public class ControllerNodeUrl {

    @Autowired
    NodeUrlServiceInterfaceImplement nodeUrlServiceInterfaceImplement;


    private List<NodeUrl> nodeUrlList;

    public List<NodeUrl> getNodeUrlList() {
        return nodeUrlList;
    }

    public void setNodeUrlList(List<NodeUrl> nodeUrlList) {
        this.nodeUrlList = nodeUrlList;
    }

    @RequestMapping(value = "/ControllerNodeUrl/findAll", method = RequestMethod.GET)
    public String findAllNodeUrl(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model model) {
        LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
        List<NodeUrl> nodeUrlList = nodeUrlServiceInterfaceImplement.findAll();
        for (int i = 0; i != nodeUrlList.size(); i++) {
            Long id = nodeUrlList.get(i).getId();
            Object node = nodeUrlList.get(i);
            maps.put(id, node);
            model.addAttribute("maps0", maps);
        }
        return "addUrls";
    }


    @RequestMapping(value = "/ControllerNodeUrl/save", method = RequestMethod.POST)
    public String save(@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model model, NodeUrl nodeUrl) {
        if (exchangeNodeUrl.getNumber() != "" & exchangeNodeUrl.getIp() != "" & exchangeNodeUrl.getDslStatus() != "" & exchangeNodeUrl.getDslStatistics()!="") {

                nodeUrlList = nodeUrlServiceInterfaceImplement.findAll();

            if (nodeUrlList.isEmpty()) {
                nodeUrl.setNumber(exchangeNodeUrl.getNumber());
                nodeUrl.setIp(exchangeNodeUrl.getIp());
                nodeUrl.setUrlDslStatus(exchangeNodeUrl.getDslStatus());
                nodeUrl.setUrlDslStatistics(exchangeNodeUrl.getDslStatistics());
                nodeUrlServiceInterfaceImplement.save(nodeUrl);

                } else {


                for (int i = 0; i != nodeUrlList.size(); i++) {
                    if (nodeUrlList.get(i).getId() == exchangeNodeUrl.getId()) {
                        nodeUrl.setId(exchangeNodeUrl.getId());
                        nodeUrl.setNumber(exchangeNodeUrl.getNumber());
                        nodeUrl.setIp(exchangeNodeUrl.getIp());
                        nodeUrl.setUrlDslStatus(exchangeNodeUrl.getDslStatus());
                        nodeUrl.setUrlDslStatistics(exchangeNodeUrl.getDslStatistics());
                        nodeUrlServiceInterfaceImplement.save(nodeUrl);

                    } else {

                        nodeUrl.setNumber(exchangeNodeUrl.getNumber());
                        nodeUrl.setIp(exchangeNodeUrl.getIp());
                        nodeUrl.setUrlDslStatus(exchangeNodeUrl.getDslStatus());
                        nodeUrl.setUrlDslStatistics(exchangeNodeUrl.getDslStatistics());
                        nodeUrlServiceInterfaceImplement.save(nodeUrl);
                    }
                }
            }


        }


        return "addUrls";
    }

        @RequestMapping(value = "/ControllerNodeUrl/findByIp", method = RequestMethod.GET)
        public String findByIp (@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model
        model){
            LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
            List<NodeUrl> nodeUrlList = nodeUrlServiceInterfaceImplement.findByIp(exchangeNodeUrl.getIp());
            for (int i = 0; i != nodeUrlList.size(); i++) {
                Long id = nodeUrlList.get(i).getId();
                Object node = nodeUrlList.get(i);
                maps.put(id, node);
                model.addAttribute("maps0", maps);
            }
            return "addUrls";
        }


        @RequestMapping(value = "/ControllerNodeUrl/findByNumber", method = RequestMethod.GET)
        public String findByNumber (@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model
        model){
            LinkedHashMap<Long, Object> maps = new LinkedHashMap<Long, Object>();
            List<NodeUrl> nodeUrlList = nodeUrlServiceInterfaceImplement.findByNumber(exchangeNodeUrl.getNumber());
            for (int i = 0; i != nodeUrlList.size(); i++) {
                Long id = nodeUrlList.get(i).getId();
                Object node = nodeUrlList.get(i);
                maps.put(id, node);
                model.addAttribute("maps0", maps);
            }
            return "addUrls";
        }


        @RequestMapping(value = "/ControllerNodeUrl/deleteId", method = RequestMethod.POST)
        public String deleteId (@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model
        model, NodeUrl nodeUrl ){
            if (exchangeNodeUrl.getId() != null) {
                nodeUrl.setId(exchangeNodeUrl.getId());
                nodeUrlServiceInterfaceImplement.delete(nodeUrl);
            } else {
                return "messageError";
            }
            return "addUrls";
        }


        @RequestMapping(value = "/ControllerNodeUrl/deleteAll", method = RequestMethod.POST)
        public String deleteAll (@ModelAttribute ExchangeNodeUrl exchangeNodeUrl, Model
        model, NodeUrl nodeUrl ){
            nodeUrlServiceInterfaceImplement.deleteAll(nodeUrl);
            return "addUrls";
        }

    }
