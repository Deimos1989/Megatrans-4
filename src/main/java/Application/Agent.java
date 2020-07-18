package Application;

import DAO.Repository;
import Entity.DateTime;
import Service.ServiceDateTime;
import Survey.Url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.Timer;
import java.util.TimerTask;

@Controller
public class Agent {




    @GetMapping("/Agent/start")
    public String start(String name, Model model) {

        Repository repository = new Repository();
        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            @Override
            public void run() {

                DateTime dateTime = new DateTime();
                ServiceDateTime serviceDateTime = new ServiceDateTime();

                dateTime.setHash(serviceDateTime.getHashStatic());
                dateTime.setTimestamp(serviceDateTime.getTimestampStatic());

                dateTime.setLocalDate(serviceDateTime.getLocalDateStatic());
                dateTime.setLocalTime(serviceDateTime.getLocalTimeStatic());
                dateTime.setLocalDateTime(serviceDateTime.getLocalDateTimeStatic());

                Url url = new Url();
                Thread thread = new Thread(url);
                thread.start();
                repository.saveDateTime(dateTime);

                serviceDateTime.setHashStatic(serviceDateTime.getHashDinamic());
                serviceDateTime.setTimestampStatic(serviceDateTime.getTimestampDinamic());

                serviceDateTime.setLocalDateStatic(serviceDateTime.getLocalDateDinamic());
                serviceDateTime.setLocalTimeStatic(serviceDateTime.getLocalTimeDinamic());
                serviceDateTime.setLocalDateTimeStatic(serviceDateTime.getLocalDateTimeDinamic());

            }


        };


        timer.scheduleAtFixedRate(task, 1000, 20000);
        model.addAttribute("name", name = "Cбор статистики системы Megatrans-4");


        return "Survey";
    }


}
