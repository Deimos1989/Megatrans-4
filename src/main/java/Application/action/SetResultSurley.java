package Application.action;

import Application.Entity.ResultSurley;
import Application.exchange.ExchangeDateTime;
import Application.service.ResultSurleyServiceInterfaceImplement;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import Application.processing.DslStatisticsNode;
import Application.processing.DslStatusNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class SetResultSurley implements Runnable {


    ResultSurleyServiceInterfaceImplement nodeBaseServiceInterfaceImplement;
    DslStatusNode dslStatusNode;
    DslStatisticsNode dslStatisticsNode;
    ArrayList<String> url;
    ArrayList<String> numberSystem;

    public SetResultSurley(ResultSurleyServiceInterfaceImplement nodeBaseServiceInterfaceImplement, DslStatusNode dslStatusNode, DslStatisticsNode dslStatisticsNode, ArrayList<String> urls, ArrayList<String> numberSystem) {
        this.nodeBaseServiceInterfaceImplement = nodeBaseServiceInterfaceImplement;
        this.dslStatusNode = dslStatusNode;
        this.dslStatisticsNode = dslStatisticsNode;
        this.url = urls;
        this.numberSystem=numberSystem;
    }


    public void run() {



        for (int c = 0; c != url.size(); c++) {

            String[] urlSum = url.get(c).split(";");


            {

                System.out.println(Arrays.asList(url.get(c)));


                for (int d = 0; d != urlSum.length; d++) {

                    {

                        try {

                            Document resultStatus = Jsoup.connect(urlSum[d]).get();
                            String status = resultStatus.body().getElementsByTag("td").text();
                            if (d == 0) {
                                dslStatusNode.setTable(status);
                            } else {
                                dslStatisticsNode.setTable(status);
                            }
                        } catch (IOException e) {

                            System.out.println("Ответ от узла не получен");
                        }
                    }
                }
            }

            ExchangeDateTime exchangeDateTime = new ExchangeDateTime();

            if (dslStatusNode.modeName("") != "") {


                ResultSurley resultSurley = new ResultSurley();

                resultSurley.setLocalDate(exchangeDateTime.getLocalDateStatic());
                resultSurley.setLocalTime(exchangeDateTime.getLocalTimeStatic());
                resultSurley.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());


                resultSurley.setTimestamp(exchangeDateTime.getTimestampStatic());
                resultSurley.setHash(exchangeDateTime.getHashStatic());


                resultSurley.setModeName(dslStatusNode.modeName(""));

                resultSurley.setIp(dslStatusNode.nameNode(urlSum[0]));

                resultSurley.setNumber(numberSystem.get(c));

                resultSurley.setModeValue(dslStatusNode.modeValue(""));

                resultSurley.setSyncName(dslStatusNode.syncName(""));
                resultSurley.setSyncValueSide1(dslStatusNode.syncValueSide1(0));

                resultSurley.setSegdName(dslStatusNode.segdName(""));
                resultSurley.setSegdValueSide1(dslStatusNode.segdValueSide1(0));

                resultSurley.setPowerBackOffName(dslStatusNode.powerBackOffName(""));
                resultSurley.setPowerBackOffValue(dslStatusNode.powerBackOffValue(0.0));
                resultSurley.setPowerBackOffParametr(dslStatusNode.powerBackOffParametr(""));

                resultSurley.setFarEndPowerBackOffName(dslStatusNode.farEndPowerBackOffName(""));
                resultSurley.setFarEndPowerBackOffValue(dslStatusNode.farEndPowerBackOffValue(0.0));
                resultSurley.setFarEndPowerBackOffParametr(dslStatusNode.farEndPowerBackOffParametr(""));

                resultSurley.setLoopAttenuationName(dslStatusNode.loopAttenuationName(""));
                resultSurley.setLoopAttenuationValueSide1(dslStatusNode.loopAttenuationValueSide1(0.0));

                resultSurley.setNmrName(dslStatusNode.nmrName(""));
                resultSurley.setNmrValueSide1(dslStatusNode.nmrValueSide1(0.0));

                resultSurley.setBitrateName(dslStatusNode.bitrateName(""));
                resultSurley.setBitrateValueSide1(dslStatusNode.bitrateValueSide1(0));


                resultSurley.setSruName(dslStatusNode.sruName(""));
                resultSurley.setSruValue(dslStatusNode.sruValue(0));

                resultSurley.setActiveSyncSourceName(dslStatusNode.activeSyncSourceName(""));
                resultSurley.setActiveSyncSourceValueSide1(dslStatusNode.activeSyncSourceValueSide1(""));

                resultSurley.setTemperatureName(dslStatusNode.temperatureName(""));
                resultSurley.setTemperatureValue(dslStatusNode.temperatureValue(0.0));
                resultSurley.setTemperatureParametr(dslStatusNode.temperatureParametr(""));

                resultSurley.setBertName(dslStatusNode.bertName(""));
                resultSurley.setBertValue(dslStatusNode.bertValue(""));

                resultSurley.setErroredBlocksName(dslStatisticsNode.erroredBlocksName(""));
                resultSurley.setErroredBlocksValueSide1(dslStatisticsNode.erroredBlocksValueSide1(0L));

                resultSurley.setErroredSecondsName(dslStatisticsNode.erroredSecondsName(""));
                resultSurley.setErroredSecondValueSide1(dslStatisticsNode.erroredSecondValueSide1(0L));

                resultSurley.setSeverelyErroredSecondsName(dslStatisticsNode.severelyErroredSecondsName(""));
                resultSurley.setSeverelyErroredSecondsValueSide1(dslStatisticsNode.severelyErroredSecondsValueSide1(0L));

                resultSurley.setBackgroundBlockErrorsName(dslStatisticsNode.backgroundBlockErrorsName(""));
                resultSurley.setBackgroundBlockErrorsValueSide1(dslStatisticsNode.backgroundBlockErrorsValueSide1(0L));

                resultSurley.setEsrName(dslStatisticsNode.esrName(""));
                resultSurley.setEsrValueSide1(dslStatisticsNode.esrValueSide1(0.0));

                resultSurley.setSesrName(dslStatisticsNode.sersName(""));
                resultSurley.setSesrValueSide1(dslStatisticsNode.sersValueSide1(0.0));

                resultSurley.setBberName(dslStatisticsNode.bberName(""));
                resultSurley.setBberValueSide1(dslStatisticsNode.bberValueSide1(0.0));

                resultSurley.setAvailableTimeName(dslStatisticsNode.availableTimeName(""));
                resultSurley.setAvailableTimeValueSide1(dslStatisticsNode.availableTimeValueSide1(0L));

                resultSurley.setUnavailableTimeName(dslStatisticsNode.unavailableTimeName(""));
                resultSurley.setUnavailableTimeValueSide1(dslStatisticsNode.unavailableTimeValueSide1(0L));

                nodeBaseServiceInterfaceImplement.save(resultSurley);

            } else {


                ResultSurley resultSurley = new ResultSurley();

                resultSurley.setLocalDate(exchangeDateTime.getLocalDateStatic());
                resultSurley.setLocalTime(exchangeDateTime.getLocalTimeStatic());
                resultSurley.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());


                resultSurley.setTimestamp(exchangeDateTime.getTimestampStatic());
                resultSurley.setHash(exchangeDateTime.getHashStatic());

                resultSurley.setIp(dslStatusNode.nameNode(urlSum[0]));

                resultSurley.setNumber(numberSystem.get(c));

                resultSurley.setSyncName(dslStatusNode.syncName(""));
                resultSurley.setSyncValueSide1(dslStatusNode.syncValueSide1(0));
                resultSurley.setSyncValueSide2(dslStatusNode.syncValueSide2(0));

                resultSurley.setSegdName(dslStatusNode.segdName(""));
                resultSurley.setSegdValueSide1(dslStatusNode.segdValueSide1(0));
                resultSurley.setSegdValueSide2(dslStatusNode.segdValueSide2(0));

                resultSurley.setTxPowerName(dslStatusNode.txPowerName(""));
                resultSurley.setTxPowerValueSide1(dslStatusNode.txPowerValueSide1(0.0));
                resultSurley.setTxPowerValueSide2(dslStatusNode.txPowerValueSide2(0.0));
                resultSurley.setTxPowerParametr(dslStatusNode.txPowerParametr(""));

                resultSurley.setRxPowerName(dslStatusNode.rxPowerName(""));
                resultSurley.setRxPowerValueSide1(dslStatusNode.rxPowerValueSide1(0.0));
                resultSurley.setRxPowerValueSide2(dslStatusNode.rxPowerValueSide2(0.0));
                resultSurley.setRxPowerParametr(dslStatusNode.rxPowerParametr(""));

                resultSurley.setLoopAttenuationName(dslStatusNode.loopAttenuationName(""));
                resultSurley.setLoopAttenuationValueSide1(dslStatusNode.loopAttenuationValueSide1(0.0));
                resultSurley.setLoopAttenuationValueSide2(dslStatusNode.loopAttenuationValueSide2(0.0));

                resultSurley.setNmrName(dslStatusNode.nmrName(""));
                resultSurley.setNmrValueSide1(dslStatusNode.nmrValueSide1(0.0));
                resultSurley.setNmrValueSide2(dslStatusNode.nmrValueSide2(0.0));

                resultSurley.setBitrateName(dslStatusNode.bitrateName(""));
                resultSurley.setBitrateValueSide1(dslStatusNode.bitrateValueSide1(0));
                resultSurley.setBitrateValueSide2(dslStatusNode.bitrateValueSide2(0));

                resultSurley.setActiveSyncSourceName(dslStatusNode.activeSyncSourceName(""));
                resultSurley.setActiveSyncSourceValueSide1(dslStatusNode.activeSyncSourceValueSide1(""));
                resultSurley.setActiveSyncSourceValueSide2(dslStatusNode.activeSyncSourceValueSide2(""));

                resultSurley.setRpVoltageName(dslStatusNode.rpVoltageName(""));
                resultSurley.setRpVoltageValueSide1(dslStatusNode.rpVoltageValueSide1(0));
                resultSurley.setRpVoltageValueSide2(dslStatusNode.rpVoltageValueSide2(0));
                resultSurley.setRpVoltageParametr(dslStatusNode.rpVoltageParametr(""));

                resultSurley.setRpStatusName(dslStatusNode.rpStatusName(""));
                resultSurley.setRpStatusValue(dslStatusNode.rpStatusValue(""));

                resultSurley.setTemperatureName(dslStatusNode.temperatureName(""));
                resultSurley.setTemperatureValue(dslStatusNode.temperatureValue(0.0));
                resultSurley.setTemperatureParametr(dslStatusNode.temperatureParametr(""));


                resultSurley.setErroredBlocksName(dslStatisticsNode.erroredBlocksName(""));
                resultSurley.setErroredBlocksValueSide1(dslStatisticsNode.erroredBlocksValueSide1(0L));
                resultSurley.setErroredBlocksValueSide2(dslStatisticsNode.erroredBlocksValueSide2(0L));

                resultSurley.setErroredSecondsName(dslStatisticsNode.erroredSecondsName(""));
                resultSurley.setErroredSecondValueSide1(dslStatisticsNode.erroredSecondValueSide1(0L));
                resultSurley.setErroredSecondValueSide2(dslStatisticsNode.erroredSecondValueSide2(0L));

                resultSurley.setSeverelyErroredSecondsName(dslStatisticsNode.severelyErroredSecondsName(""));
                resultSurley.setSeverelyErroredSecondsValueSide1(dslStatisticsNode.severelyErroredSecondsValueSide1(0L));
                resultSurley.setSeverelyErroredSecondsValueSide2(dslStatisticsNode.severelyErroredSecondsValueSide2(0L));

                resultSurley.setBackgroundBlockErrorsName(dslStatisticsNode.backgroundBlockErrorsName(""));
                resultSurley.setBackgroundBlockErrorsValueSide1(dslStatisticsNode.backgroundBlockErrorsValueSide1(0L));
                resultSurley.setBackgroundBlockErrorsValueSide2(dslStatisticsNode.backgroundBlockErrorsValueSide2(0L));

                resultSurley.setEsrName(dslStatisticsNode.esrName(""));
                resultSurley.setEsrValueSide1(dslStatisticsNode.esrValueSide1(0.0));
                resultSurley.setEsrValueSide2(dslStatisticsNode.esrValueSide2(0.0));

                resultSurley.setSesrName(dslStatisticsNode.sersName(""));
                resultSurley.setSesrValueSide1(dslStatisticsNode.sersValueSide1(0.0));
                resultSurley.setSesrValueSide2(dslStatisticsNode.sersValueSide2(0.0));

                resultSurley.setBberName(dslStatisticsNode.bberName(""));
                resultSurley.setBberValueSide1(dslStatisticsNode.bberValueSide1(0.0));
                resultSurley.setBberValueSide2(dslStatisticsNode.bberValueSide2(0.0));

                resultSurley.setAvailableTimeName(dslStatisticsNode.availableTimeName(""));
                resultSurley.setAvailableTimeValueSide1(dslStatisticsNode.availableTimeValueSide1(0L));
                resultSurley.setAvailableTimeValueSide2(dslStatisticsNode.availableTimeValueSide2(0L));

                resultSurley.setUnavailableTimeName(dslStatisticsNode.unavailableTimeName(""));
                resultSurley.setUnavailableTimeValueSide1(dslStatisticsNode.unavailableTimeValueSide1(0L));
                resultSurley.setUnavailableTimeValueSide2(dslStatisticsNode.unavailableTimeValueSide2(0L));


                nodeBaseServiceInterfaceImplement.save(resultSurley);

            }


        }


    }
}