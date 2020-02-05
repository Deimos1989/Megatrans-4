package Application;

import DAO.NodeBuildDAO;
import Entity.DateTime;
import Service.ServiceDateTime;
import com.company.Url;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.SimpleDateFormat;
import java.util.Timer;
import java.util.TimerTask;

@Controller
public class Agent {


    @GetMapping("/Agent")
    public String start(@RequestParam(name="name", required=false, defaultValue="World")String name, Model model) {

        NodeBuildDAO nodeBuildDAO = new NodeBuildDAO();


        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                DateTime dateTime =new DateTime();
                ServiceDateTime serviceDateTime =new ServiceDateTime();

                dateTime.setHash(serviceDateTime.getHashStatic());
                dateTime.setTimestamp(serviceDateTime.getTimestampStatic());
                dateTime.setDate(serviceDateTime.getDateTimeStatic());
                nodeBuildDAO.saveDateTime(dateTime);

                Url url = new Url();
                Thread thread = new Thread(url);
                thread.start();

                serviceDateTime.setHashStatic(serviceDateTime.getHashDinamic());
                serviceDateTime.setTimestampStatic(serviceDateTime.getTimestampDinamic());
                serviceDateTime.setDateTimeStatic(serviceDateTime.getDateTimeDinamic());

            }



        };



        timer.scheduleAtFixedRate(task, 1000, 20000);
        model.addAttribute("name", name = "Запуск сбора статистики системы Megatrans-4");
        return "main";



    }
}
