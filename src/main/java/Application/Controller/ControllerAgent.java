package Application.Controller;

import Application.Entity.DateTime;
import Application.action.SetNodeBaseObject;
import Application.exchange.ExchangeDateTime;
import Application.exchange.ExchangeServiceObjectView;
import Application.service.DateTimeServiceInterfaceImplement;

import Application.service.NodeBaseServiceInterfaceImplement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Timer;
import java.util.TimerTask;

@Controller
public class ControllerAgent {

    @Autowired
    DateTimeServiceInterfaceImplement dateTimeServiceInterfaceImplement;
    @Autowired
   NodeBaseServiceInterfaceImplement nodeBaseServiceInterfaceImplement;



    @GetMapping(value="/Agent/start")
    public String start(Model model, ExchangeServiceObjectView exchangeServiceObjectView) {

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                DateTime dateTime = new DateTime();
                ExchangeDateTime exchangeDateTime = new ExchangeDateTime();

                dateTime.setHash(exchangeDateTime.getHashStatic());
                dateTime.setTimestamp(exchangeDateTime.getTimestampStatic());

                dateTime.setLocalDate(exchangeDateTime.getLocalDateStatic());
                dateTime.setLocalTime(exchangeDateTime.getLocalTimeStatic());
                dateTime.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());



                SetNodeBaseObject setNodeBaseObject = new SetNodeBaseObject(nodeBaseServiceInterfaceImplement);
                Thread thread = new Thread(setNodeBaseObject);
                thread.start();

                dateTimeServiceInterfaceImplement.save(dateTime);



                exchangeDateTime.setHashStatic(exchangeDateTime.getHashDinamic());
                exchangeDateTime.setTimestampStatic(exchangeDateTime.getTimestampDinamic());

                exchangeDateTime.setLocalDateStatic(exchangeDateTime.getLocalDateDinamic());
                exchangeDateTime.setLocalTimeStatic(exchangeDateTime.getLocalTimeDinamic());
                exchangeDateTime.setLocalDateTimeStatic(exchangeDateTime.getLocalDateTimeDinamic());

            }

        };

        timer.scheduleAtFixedRate(task, 1000, 20000);
        model.addAttribute("name",  "Cбор статистики системы Megatrans-4");
        return "surleyNode";
    }


}
