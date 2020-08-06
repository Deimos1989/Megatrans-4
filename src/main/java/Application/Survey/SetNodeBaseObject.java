package Application.Survey;

import Application.DAO.Repository;
import Application.Entity.NodeBase;
import Application.exchangeObject.ExchangeDateTime;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import Application.processing.DslStatisticsNode;
import Application.processing.DslStatusNode;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SetNodeBaseObject implements Runnable {



    private static Scanner scanner;

   public void run() {

       Repository repository = new Repository();
       DslStatusNode dslStatusNode = new DslStatusNode();
       DslStatisticsNode dslStatisticsNode = new DslStatisticsNode();



        /*
        входной файл содержит URLки через точку с запятой как в CSV файле
        пример:
        url статуса;url статистики
        url статуса;url статистики
         */
       try {
           scanner = new Scanner(new File("C:\\Users\\Deimos\\IdeaProjects\\test\\src\\main\\resources\\Url.txt"), "UTF-8");
       } catch (FileNotFoundException e) {
           JOptionPane.showMessageDialog(null, "Фаил не найден");
       }

       ArrayList<String> urls = new ArrayList<>();


       while (scanner.hasNextLine()) {
           urls.add(scanner.nextLine());
       }

       scanner.close();


       for (int k = 0; k != urls.size(); k++) {
           String[] url = urls.get(k).split(";");


           {
               System.out.println(Arrays.asList(urls.get(k)));

               for (int i = 0; i != url.length; i++) {

                   try {

                       Document resultStatus = Jsoup.connect(url[i]).get();
                       String status = resultStatus.body().getElementsByTag("td").text();
                       if (i == 0) {
                           dslStatusNode.setTable(status);
                       } else {
                           dslStatisticsNode.setTable(status);
                       }
                   } catch (IOException e) {
                       JOptionPane.showMessageDialog(null, "Ответ от узла не получен");
                   }
               }
           }



           ExchangeDateTime exchangeDateTime =new ExchangeDateTime();


           if (dslStatusNode.modeName("") != "") {


               NodeBase nodeBase = new NodeBase();

               nodeBase.setLocalDate(exchangeDateTime.getLocalDateStatic());
               nodeBase.setLocalTime(exchangeDateTime.getLocalTimeStatic());
               nodeBase.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());


               nodeBase.setTimestamp(exchangeDateTime.getTimestampStatic());
               nodeBase.setHash(exchangeDateTime.getHashStatic());


               nodeBase.setModeName(dslStatusNode.modeName(""));

               nodeBase.setIpNode(dslStatusNode.nameNode(url[0]));


               nodeBase.setModeValue(dslStatusNode.modeValue(""));

               nodeBase.setSyncName(dslStatusNode.syncName(""));
               nodeBase.setSyncValueSide1(dslStatusNode.syncValueSide1(0));

               nodeBase.setSegdName(dslStatusNode.segdName(""));
               nodeBase.setSegdValueSide1(dslStatusNode.segdValueSide1(0));

               nodeBase.setPowerBackOffName(dslStatusNode.powerBackOffName(""));
               nodeBase.setPowerBackOffValue(dslStatusNode.powerBackOffValue(0.0));
               nodeBase.setPowerBackOffParametr(dslStatusNode.powerBackOffParametr(""));

               nodeBase.setFarEndPowerBackOffName(dslStatusNode.farEndPowerBackOffName(""));
               nodeBase.setFarEndPowerBackOffValue(dslStatusNode.farEndPowerBackOffValue(0.0));
               nodeBase.setFarEndPowerBackOffParametr(dslStatusNode.farEndPowerBackOffParametr(""));

               nodeBase.setLoopAttenuationName(dslStatusNode.loopAttenuationName(""));
               nodeBase.setLoopAttenuationValueSide1(dslStatusNode.loopAttenuationValueSide1(0.0));

               nodeBase.setNmrName(dslStatusNode.nmrName(""));
               nodeBase.setNmrValueSide1(dslStatusNode.nmrValueSide1(0.0));

               nodeBase.setBitrateName(dslStatusNode.bitrateName(""));
               nodeBase.setBitrateValueSide1(dslStatusNode.bitrateValueSide1(0));


               nodeBase.setSruName(dslStatusNode.sruName(""));
               nodeBase.setSruValue(dslStatusNode.sruValue(0));

               nodeBase.setActiveSyncSourceName(dslStatusNode.activeSyncSourceName(""));
               nodeBase.setActiveSyncSourceValueSide1(dslStatusNode.activeSyncSourceValueSide1(""));

               nodeBase.setTemperatureName(dslStatusNode.temperatureName(""));
               nodeBase.setTemperatureValue(dslStatusNode.temperatureValue(0.0));
               nodeBase.setTemperatureParametr(dslStatusNode.temperatureParametr(""));

               nodeBase.setBertName(dslStatusNode.bertName(""));
               nodeBase.setBertValue(dslStatusNode.bertValue(""));

               nodeBase.setErroredBlocksName(dslStatisticsNode.erroredBlocksName(""));
               nodeBase.setErroredBlocksValueSide1(dslStatisticsNode.erroredBlocksValueSide1(0L));

               nodeBase.setErroredSecondsName(dslStatisticsNode.erroredSecondsName(""));
               nodeBase.setErroredSecondValueSide1(dslStatisticsNode.erroredSecondValueSide1(0L));

               nodeBase.setSeverelyErroredSecondsName(dslStatisticsNode.severelyErroredSecondsName(""));
               nodeBase.setSeverelyErroredSecondsValueSide1(dslStatisticsNode.severelyErroredSecondsValueSide1(0L));

               nodeBase.setBackgroundBlockErrorsName(dslStatisticsNode.backgroundBlockErrorsName(""));
               nodeBase.setBackgroundBlockErrorsValueSide1(dslStatisticsNode.backgroundBlockErrorsValueSide1(0L));

               nodeBase.setEsrName(dslStatisticsNode.esrName(""));
               nodeBase.setEsrValueSide1(dslStatisticsNode.esrValueSide1(0.0));

               nodeBase.setSesrName(dslStatisticsNode.sersName(""));
               nodeBase.setSesrValueSide1(dslStatisticsNode.sersValueSide1(0.0));

               nodeBase.setBberName(dslStatisticsNode.bberName(""));
               nodeBase.setBberValueSide1(dslStatisticsNode.bberValueSide1(0.0));

               nodeBase.setAvailableTimeName(dslStatisticsNode.availableTimeName(""));
               nodeBase.setAvailableTimeValueSide1(dslStatisticsNode.availableTimeValueSide1(0L));

               nodeBase.setUnavailableTimeName(dslStatisticsNode.unavailableTimeName(""));
               nodeBase.setUnavailableTimeValueSide1(dslStatisticsNode.unavailableTimeValueSide1(0L));


               repository.setObT(nodeBase);
               repository.save();


           } else {


               NodeBase nodeBase = new NodeBase();

               nodeBase.setLocalDate(exchangeDateTime.getLocalDateStatic());
               nodeBase.setLocalTime(exchangeDateTime.getLocalTimeStatic());
               nodeBase.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());


               nodeBase.setTimestamp(exchangeDateTime.getTimestampStatic());
               nodeBase.setHash(exchangeDateTime.getHashStatic());

               nodeBase.setIpNode(dslStatusNode.nameNode(url[0]));

               nodeBase.setSyncName(dslStatusNode.syncName(""));
               nodeBase.setSyncValueSide1(dslStatusNode.syncValueSide1(0));
               nodeBase.setSyncValueSide2(dslStatusNode.syncValueSide2(0));

               nodeBase.setSegdName(dslStatusNode.segdName(""));
               nodeBase.setSegdValueSide1(dslStatusNode.segdValueSide1(0));
               nodeBase.setSegdValueSide2(dslStatusNode.segdValueSide2(0));

               nodeBase.setTxPowerName(dslStatusNode.txPowerName(""));
               nodeBase.setTxPowerValueSide1(dslStatusNode.txPowerValueSide1(0.0));
               nodeBase.setTxPowerValueSide2(dslStatusNode.txPowerValueSide2(0.0));
               nodeBase.setTxPowerParametr(dslStatusNode.txPowerParametr(""));

               nodeBase.setRxPowerName(dslStatusNode.rxPowerName(""));
               nodeBase.setRxPowerValueSide1(dslStatusNode.rxPowerValueSide1(0.0));
               nodeBase.setRxPowerValueSide2(dslStatusNode.rxPowerValueSide2(0.0));
               nodeBase.setRxPowerParametr(dslStatusNode.rxPowerParametr(""));

               nodeBase.setLoopAttenuationName(dslStatusNode.loopAttenuationName(""));
               nodeBase.setLoopAttenuationValueSide1(dslStatusNode.loopAttenuationValueSide1(0.0));
               nodeBase.setLoopAttenuationValueSide2(dslStatusNode.loopAttenuationValueSide2(0.0));

               nodeBase.setNmrName(dslStatusNode.nmrName(""));
               nodeBase.setNmrValueSide1(dslStatusNode.nmrValueSide1(0.0));
               nodeBase.setNmrValueSide2(dslStatusNode.nmrValueSide2(0.0));

               nodeBase.setBitrateName(dslStatusNode.bitrateName(""));
               nodeBase.setBitrateValueSide1(dslStatusNode.bitrateValueSide1(0));
               nodeBase.setBitrateValueSide2(dslStatusNode.bitrateValueSide2(0));

               nodeBase.setActiveSyncSourceName(dslStatusNode.activeSyncSourceName(""));
               nodeBase.setActiveSyncSourceValueSide1(dslStatusNode.activeSyncSourceValueSide1(""));
               nodeBase.setActiveSyncSourceValueSide2(dslStatusNode.activeSyncSourceValueSide2(""));

               nodeBase.setRpVoltageName(dslStatusNode.rpVoltageName(""));
               nodeBase.setRpVoltageValueSide1(dslStatusNode.rpVoltageValueSide1(0));
               nodeBase.setRpVoltageValueSide2(dslStatusNode.rpVoltageValueSide2(0));
               nodeBase.setRpVoltageParametr(dslStatusNode.rpVoltageParametr(""));

               nodeBase.setRpStatusName(dslStatusNode.rpStatusName(""));
               nodeBase.setRpStatusValue(dslStatusNode.rpStatusValue(""));

               nodeBase.setTemperatureName(dslStatusNode.temperatureName(""));
               nodeBase.setTemperatureValue(dslStatusNode.temperatureValue(0.0));
               nodeBase.setTemperatureParametr(dslStatusNode.temperatureParametr(""));


               nodeBase.setErroredBlocksName(dslStatisticsNode.erroredBlocksName(""));
               nodeBase.setErroredBlocksValueSide1(dslStatisticsNode.erroredBlocksValueSide1(0L));
               nodeBase.setErroredBlocksValueSide2(dslStatisticsNode.erroredBlocksValueSide2(0L));

               nodeBase.setErroredSecondsName(dslStatisticsNode.erroredSecondsName(""));
               nodeBase.setErroredSecondValueSide1(dslStatisticsNode.erroredSecondValueSide1(0L));
               nodeBase.setErroredSecondValueSide2(dslStatisticsNode.erroredSecondValueSide2(0L));

               nodeBase.setSeverelyErroredSecondsName(dslStatisticsNode.severelyErroredSecondsName(""));
               nodeBase.setSeverelyErroredSecondsValueSide1(dslStatisticsNode.severelyErroredSecondsValueSide1(0L));
               nodeBase.setSeverelyErroredSecondsValueSide2(dslStatisticsNode.severelyErroredSecondsValueSide2(0L));

               nodeBase.setBackgroundBlockErrorsName(dslStatisticsNode.backgroundBlockErrorsName(""));
               nodeBase.setBackgroundBlockErrorsValueSide1(dslStatisticsNode.backgroundBlockErrorsValueSide1(0L));
               nodeBase.setBackgroundBlockErrorsValueSide2(dslStatisticsNode.backgroundBlockErrorsValueSide2(0L));

               nodeBase.setEsrName(dslStatisticsNode.esrName(""));
               nodeBase.setEsrValueSide1(dslStatisticsNode.esrValueSide1(0.0));
               nodeBase.setEsrValueSide2(dslStatisticsNode.esrValueSide2(0.0));

               nodeBase.setSesrName(dslStatisticsNode.sersName(""));
               nodeBase.setSesrValueSide1(dslStatisticsNode.sersValueSide1(0.0));
               nodeBase.setSesrValueSide2(dslStatisticsNode.sersValueSide2(0.0));

               nodeBase.setBberName(dslStatisticsNode.bberName(""));
               nodeBase.setBberValueSide1(dslStatisticsNode.bberValueSide1(0.0));
               nodeBase.setBberValueSide2(dslStatisticsNode.bberValueSide2(0.0));

               nodeBase.setAvailableTimeName(dslStatisticsNode.availableTimeName(""));
               nodeBase.setAvailableTimeValueSide1(dslStatisticsNode.availableTimeValueSide1(0L));
               nodeBase.setAvailableTimeValueSide2(dslStatisticsNode.availableTimeValueSide2(0L));

               nodeBase.setUnavailableTimeName(dslStatisticsNode.unavailableTimeName(""));
               nodeBase.setUnavailableTimeValueSide1(dslStatisticsNode.unavailableTimeValueSide1(0L));
               nodeBase.setUnavailableTimeValueSide2(dslStatisticsNode.unavailableTimeValueSide2(0L));

               repository.setObT(nodeBase);
               repository.save();

           }




       }

   }


        }



