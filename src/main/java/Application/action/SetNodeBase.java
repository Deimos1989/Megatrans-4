package Application.action;

import Application.Entity.NodeBase;
import Application.exchange.ExchangeDateTime;
import Application.service.NodeBaseServiceInterfaceImplement;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import Application.processing.DslStatisticsNode;
import Application.processing.DslStatusNode;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;


public class SetNodeBase implements Runnable {


    NodeBaseServiceInterfaceImplement nodeBaseServiceInterfaceImplement;
    DslStatusNode dslStatusNode;
    DslStatisticsNode dslStatisticsNode;
    ArrayList<String> url;

    public SetNodeBase(NodeBaseServiceInterfaceImplement nodeBaseServiceInterfaceImplement, DslStatusNode dslStatusNode, DslStatisticsNode dslStatisticsNode, ArrayList<String> urls) {
        this.nodeBaseServiceInterfaceImplement = nodeBaseServiceInterfaceImplement;
        this.dslStatusNode = dslStatusNode;
        this.dslStatisticsNode = dslStatisticsNode;
        this.url = urls;
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


                NodeBase nodeBase = new NodeBase();

                nodeBase.setLocalDate(exchangeDateTime.getLocalDateStatic());
                nodeBase.setLocalTime(exchangeDateTime.getLocalTimeStatic());
                nodeBase.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());


                nodeBase.setTimestamp(exchangeDateTime.getTimestampStatic());
                nodeBase.setHash(exchangeDateTime.getHashStatic());


                nodeBase.setModeName(dslStatusNode.modeName(""));

                nodeBase.setIp(dslStatusNode.nameNode(urlSum[0]));


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

                nodeBaseServiceInterfaceImplement.save(nodeBase);

            } else {


                NodeBase nodeBase = new NodeBase();

                nodeBase.setLocalDate(exchangeDateTime.getLocalDateStatic());
                nodeBase.setLocalTime(exchangeDateTime.getLocalTimeStatic());
                nodeBase.setLocalDateTime(exchangeDateTime.getLocalDateTimeStatic());


                nodeBase.setTimestamp(exchangeDateTime.getTimestampStatic());
                nodeBase.setHash(exchangeDateTime.getHashStatic());

                nodeBase.setIp(dslStatusNode.nameNode(urlSum[0]));

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

                nodeBaseServiceInterfaceImplement.save(nodeBase);

            }


        }


    }
}