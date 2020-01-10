package com.company;

import DAO.NodeBuildDAO;
import Entity.FinalNode;
import Entity.IntermediateNode;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Url {


    private static Scanner scan1;
    private static Scanner scan2;


    public void St() {


        FinalNode finalNode = new FinalNode();
        IntermediateNode intermediateNode = new IntermediateNode();
        NodeBuildDAO nodeBuildDAO = new NodeBuildDAO();
        DslStatusNode dslStatusNode = new DslStatusNode();
        DslStatisticsNode dslStatisticsNode = new DslStatisticsNode();

        ArrayList<String> strCol1 = new ArrayList<>();
        ArrayList<String> strCol2 = new ArrayList<>();


        try {
            scan1 = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\Megatrans\\src\\main\\resources\\Url1.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Фаил не найден");
        }

        try {
            scan2 = new Scanner(new File("C:\\Users\\Denis\\IdeaProjects\\Megatrans\\src\\main\\resources\\Url2.txt"));
        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Фаил не найден");
        }


        while (scan1.hasNextLine() && scan2.hasNextLine()) {

            strCol1.add(scan1.nextLine());
            strCol2.add(scan2.nextLine());

        }
        scan1.close();
        scan2.close();


        for (int i = 0; i < strCol1.size(); i++) {
            {

                try {
                    Document tableBody1 = Jsoup.connect(strCol1.get(i)).get();
                    String str1 = tableBody1.body().getElementsByTag("td").text();
                    dslStatusNode.setTable(str1);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Cсылка1 не найдена");
                }

            }


            Date date = new Date();

            finalNode.setModeName(dslStatusNode.modeName(""));

            if (finalNode.getModeName() != "") {

                finalNode.setDate(date);

                //  finalNode.setIpNode(handlerNode.getDslStatusNode().nameNode("default"));

                finalNode.setModeValue(dslStatusNode.modeValue(""));

                finalNode.setSyncName(dslStatusNode.syncName(""));
                finalNode.setSyncValue(dslStatusNode.syncValueSide1(0));

                finalNode.setSegdName(dslStatusNode.segdName(""));
                finalNode.setSegdValue(dslStatusNode.segdValueSide1(0));

                finalNode.setPowerBackOffName(dslStatusNode.powerBackOffName(""));
                finalNode.setPowerBackOffValue(dslStatusNode.powerBackOffValue(0.0));
                finalNode.setPowerBackOffParametr(dslStatusNode.powerBackOffParametr(""));

                finalNode.setFarEndPowerBackOffName(dslStatusNode.farEndPowerBackOffName(""));
                finalNode.setFarEndPowerBackOffValue(dslStatusNode.farEndPowerBackOffValue(0.0));
                finalNode.setFarEndPowerBackOffParametr(dslStatusNode.farEndPowerBackOffParametr(""));

                finalNode.setLoopAttenuationName(dslStatusNode.loopAttenuationName(""));
                finalNode.setLoopAttenuationValue(dslStatusNode.loopAttenuationValueSide1(0.0));

                finalNode.setNmrName(dslStatusNode.nmrName(""));
                finalNode.setNmrValue(dslStatusNode.nmrValueSide1(0.0));

                finalNode.setBitrateName(dslStatusNode.bitrateName(""));
                finalNode.setBitrateValue(dslStatusNode.bitrateValueSide1(0));


                finalNode.setSruName(dslStatusNode.sruName(""));
                finalNode.setSruValue(dslStatusNode.sruValue(0));

                finalNode.setActiveSyncSourceName(dslStatusNode.activeSyncSourceName(""));
                finalNode.setActiveSyncSourceValue(dslStatusNode.activeSyncSourceValueSide1(""));

                finalNode.setTemperatureName(dslStatusNode.temperatureName(""));
                finalNode.setTemperatureValue(dslStatusNode.temperatureValue(0.0));
                finalNode.setTemperatureParametr(dslStatusNode.temperatureParametr(""));

                finalNode.setBertName(dslStatusNode.bertName(""));
                finalNode.setBertValue(dslStatusNode.bertValue(""));

              //  nodeBuildDAO.saveFinalNode(finalNode);

            } else {

                intermediateNode.setDate(date);

                //     intermediateNode.setIpNode(handlerNode.getDslStatusNode().nameNode(""));

                intermediateNode.setSyncName(dslStatusNode.syncName(""));
                intermediateNode.setSyncValueSide1(dslStatusNode.syncValueSide1(0));
                intermediateNode.setSyncValueSide2(dslStatusNode.syncValueSide2(0));

                intermediateNode.setSegdName(dslStatusNode.segdName(""));
                intermediateNode.setSegdValueSide1(dslStatusNode.segdValueSide1(0));
                intermediateNode.setSegdValueSide2(dslStatusNode.segdValueSide2(0));

                intermediateNode.setTxPowerName(dslStatusNode.txPowerName(""));
                intermediateNode.setTxPowerValueSide1(dslStatusNode.txPowerValueSide1(0.0));
                intermediateNode.setTxPowerValueSide2(dslStatusNode.txPowerValueSide2(0.0));
                intermediateNode.setTxPowerParametr(dslStatusNode.txPowerParametr(""));

                intermediateNode.setRxPowerName(dslStatusNode.rxPowerName(""));
                intermediateNode.setRxPowerValueSide1(dslStatusNode.rxPowerValueSide1(0.0));
                intermediateNode.setRxPowerValueSide2(dslStatusNode.rxPowerValueSide2(0.0));
                intermediateNode.setRxPowerParametr(dslStatusNode.rxPowerParametr(""));

                intermediateNode.setLoopAttenuationName(dslStatusNode.loopAttenuationName(""));
                intermediateNode.setLoopAttenuationValueSide1(dslStatusNode.loopAttenuationValueSide1(0.0));
                intermediateNode.setLoopAttenuationValueSide2(dslStatusNode.loopAttenuationValueSide2(0.0));


                intermediateNode.setNmrName(dslStatusNode.nmrName(""));
                intermediateNode.setNmrValueSide1(dslStatusNode.nmrValueSide1(0.0));
                intermediateNode.setNmrValueSide2(dslStatusNode.nmrValueSide2(0.0));


                intermediateNode.setBitrateName(dslStatusNode.bitrateName(""));
                intermediateNode.setBitrateValueSide1(dslStatusNode.bitrateValueSide1(0));
                intermediateNode.setBitrateValueSide2(dslStatusNode.bitrateValueSide2(0));

                intermediateNode.setActiveSyncSourceName(dslStatusNode.activeSyncSourceName(""));
                intermediateNode.setActiveSyncSourceValueSide1(dslStatusNode.activeSyncSourceValueSide1(""));
                intermediateNode.setActiveSyncSourceValueSide2(dslStatusNode.activeSyncSourceValueSide2(""));

                intermediateNode.setRpVoltageName(dslStatusNode.rpVoltageName(""));
                intermediateNode.setRpVoltageValueSide1(dslStatusNode.rpVoltageValueSide1(0));
                intermediateNode.setRpVoltageValueSide2(dslStatusNode.rpVoltageValueSide2(0));
                intermediateNode.setRpVoltageParametr(dslStatusNode.rpVoltageParametr(""));

                intermediateNode.setRpStatusName(dslStatusNode.rpStatusName(""));
                intermediateNode.setRpStatusValue(dslStatusNode.rpStatusValue(""));

                intermediateNode.setTemperatureName(dslStatusNode.temperatureName(""));
                intermediateNode.setTemperatureValue(dslStatusNode.temperatureValue(0.0));
                intermediateNode.setTemperatureParametr(dslStatusNode.temperatureParametr(""));

               // nodeBuildDAO.saveIntermediateNode(intermediateNode);

            }


        }


        for (int k = 0; k < strCol2.size(); k++) {

            {
                try {
                    Document tableBody2 = Jsoup.connect(strCol2.get(k)).get();
                    String str2 = tableBody2.body().getElementsByTag("td").text();
                    dslStatisticsNode.setTable(str2);
                    System.out.println("Object" + " " + "№" + " " + k + " " + str2);
                } catch (IOException e) {
                    JOptionPane.showMessageDialog(null, "Cсылка2 не найдена");
                }

            }

            finalNode.setModeName(dslStatusNode.modeName(""));

            if (finalNode.getModeName() != "") {

                finalNode.setErroredBlocksName(dslStatisticsNode.erroredBlocksName(""));
                finalNode.setErroredBlocksValue(dslStatisticsNode.erroredBlocksValueSide1(0L));

                finalNode.setErroredSecondsName(dslStatisticsNode.erroredSecondsName(""));
                finalNode.setErroredSecondValue(dslStatisticsNode.erroredSecondValueSide1(0L));

                finalNode.setSeverelyErroredSecondsName(dslStatisticsNode.severelyErroredSecondsName(""));
                finalNode.setSeverelyErroredSecondsValue(dslStatisticsNode.severelyErroredSecondsValueSide1(0L));

                finalNode.setBackgroundBlockErrorsName(dslStatisticsNode.backgroundBlockErrorsName(""));
                finalNode.setBackgroundBlockErrorsValue(dslStatisticsNode.backgroundBlockErrorsValueSide1(0L));

                finalNode.setEsrName(dslStatisticsNode.esrName(""));
                finalNode.setEsrValue(dslStatisticsNode.esrValueSide1(0.0));

                finalNode.setSersName(dslStatisticsNode.sersName(""));
                finalNode.setSersValue(dslStatisticsNode.sersValueSide1(0.0));

                finalNode.setBberName(dslStatisticsNode.bberName(""));
                finalNode.setBberValue(dslStatisticsNode.bberValueSide1(0.0));

                finalNode.setAvailableTimeName(dslStatisticsNode.availableTimeName(""));
                finalNode.setAvailableTimeValue(dslStatisticsNode.availableTimeValueSide1(0L));

                finalNode.setUnavailableTimeName(dslStatisticsNode.unavailableTimeName(""));
                finalNode.setUnavailableTimeValue(dslStatisticsNode.unavailableTimeValueSide1(0L));

                nodeBuildDAO.saveFinalNode(finalNode);

            }else {

                        intermediateNode.setErroredBlocksName(dslStatisticsNode.erroredBlocksName(""));
                        intermediateNode.setErroredBlocksValueSide1(dslStatisticsNode.erroredBlocksValueSide1(0L));
                        intermediateNode.setErroredBlocksValueSide2(dslStatisticsNode.erroredBlocksValueSide2(0L));

                        intermediateNode.setErroredSecondsName(dslStatisticsNode.erroredSecondsName(""));
                        intermediateNode.setErroredSecondValueSide1(dslStatisticsNode.erroredSecondValueSide1(0L));
                        intermediateNode.setErroredSecondValueSide2(dslStatisticsNode.erroredSecondValueSide2(0L));

                        intermediateNode.setSeverelyErroredSecondsName(dslStatisticsNode.severelyErroredSecondsName(""));
                        intermediateNode.setSeverelyErroredSecondsValueSide1(dslStatisticsNode.severelyErroredSecondsValueSide1(0L));
                        intermediateNode.setSeverelyErroredSecondsValueSide2(dslStatisticsNode.severelyErroredSecondsValueSide2(0L));

                        intermediateNode.setBackgroundBlockErrorsName(dslStatisticsNode.backgroundBlockErrorsName(""));
                        intermediateNode.setBackgroundBlockErrorsValueSide1(dslStatisticsNode.backgroundBlockErrorsValueSide1(0L));
                        intermediateNode.setBackgroundBlockErrorsValueSide2(dslStatisticsNode.backgroundBlockErrorsValueSide2(0L));

                        intermediateNode.setEsrName(dslStatisticsNode.esrName(""));
                        intermediateNode.setEsrValueSide1(dslStatisticsNode.esrValueSide1(0.0));
                        intermediateNode.setEsrValueSide2(dslStatisticsNode.esrValueSide2(0.0));

                        intermediateNode.setSersName(dslStatisticsNode.sersName(""));
                        intermediateNode.setSersValueSide1(dslStatisticsNode.sersValueSide1(0.0));
                        intermediateNode.setSersValueSide2(dslStatisticsNode.sersValueSide2(0.0));

                        intermediateNode.setBberName(dslStatisticsNode.bberName(""));
                        intermediateNode.setBberValueSide1(dslStatisticsNode.bberValueSide1(0.0));
                        intermediateNode.setBberValueSide2(dslStatisticsNode.bberValueSide2(0.0));

                        intermediateNode.setAvailableTimeName(dslStatisticsNode.availableTimeName(""));
                        intermediateNode.setAvailableTimeValueSide1(dslStatisticsNode.availableTimeValueSide1(0L));
                        intermediateNode.setAvailableTimeValueSide2(dslStatisticsNode.availableTimeValueSide2(0L));

                        intermediateNode.setUnavailableTimeName(dslStatisticsNode.unavailableTimeName(""));
                        intermediateNode.setUnavailableTimeValueSide1(dslStatisticsNode.unavailableTimeValueSide1(0L));
                        intermediateNode.setUnavailableTimeValueSide2(dslStatisticsNode.unavailableTimeValueSide2(0L));

                        nodeBuildDAO.saveIntermediateNode(intermediateNode);



            }

        }

    }
}