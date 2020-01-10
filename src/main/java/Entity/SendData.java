package Entity;

import DAO.NodeBuildDAO;
import com.company.HandlerNode;
import java.util.Date;


public class SendData{

    HandlerNode handlerNode =new HandlerNode();
    NodeBuildDAO nodeBuildDAO=new NodeBuildDAO();



    public void rn() {
        Date date = new Date();

        FinalNode finalNode =new FinalNode();

            finalNode.setModeName(handlerNode.getDslStatusNode().modeName(""));

            if (finalNode.getModeName() != "") {

                finalNode.setDate(date);

              //  finalNode.setIpNode(handlerNode.getDslStatusNode().nameNode("default"));

                finalNode.setModeValue(handlerNode.getDslStatusNode().modeValue(""));

                finalNode.setSyncName(handlerNode.getDslStatusNode().syncName(""));
                finalNode.setSyncValue(handlerNode.getDslStatusNode().syncValueSide1(0));

                finalNode.setSegdName(handlerNode.getDslStatusNode().segdName(""));
                finalNode.setSegdValue(handlerNode.getDslStatusNode().segdValueSide1(0));

                finalNode.setPowerBackOffName(handlerNode.getDslStatusNode().powerBackOffName(""));
                finalNode.setPowerBackOffValue(handlerNode.getDslStatusNode().powerBackOffValue(0.0));
                finalNode.setPowerBackOffParametr(handlerNode.getDslStatusNode().powerBackOffParametr(""));

                finalNode.setFarEndPowerBackOffName(handlerNode.getDslStatusNode().farEndPowerBackOffName(""));
                finalNode.setFarEndPowerBackOffValue(handlerNode.getDslStatusNode().farEndPowerBackOffValue(0.0));
                finalNode.setFarEndPowerBackOffParametr(handlerNode.getDslStatusNode().farEndPowerBackOffParametr(""));

                finalNode.setLoopAttenuationName(handlerNode.getDslStatusNode().loopAttenuationName(""));
                finalNode.setLoopAttenuationValue(handlerNode.getDslStatusNode().loopAttenuationValueSide1(0.0));

                finalNode.setNmrName(handlerNode.getDslStatusNode().nmrName(""));
                finalNode.setNmrValue(handlerNode.getDslStatusNode().nmrValueSide1(0.0));

                finalNode.setBitrateName(handlerNode.getDslStatusNode().bitrateName(""));
                finalNode.setBitrateValue(handlerNode.getDslStatusNode().bitrateValueSide1(0));


                finalNode.setSruName(handlerNode.getDslStatusNode().sruName(""));
                finalNode.setSruValue(handlerNode.getDslStatusNode().sruValue(0));

                finalNode.setActiveSyncSourceName(handlerNode.getDslStatusNode().activeSyncSourceName(""));
                finalNode.setActiveSyncSourceValue(handlerNode.getDslStatusNode().activeSyncSourceValueSide1(""));

                finalNode.setTemperatureName(handlerNode.getDslStatusNode().temperatureName(""));
                finalNode.setTemperatureValue(handlerNode.getDslStatusNode().temperatureValue(0.0));
                finalNode.setTemperatureParametr(handlerNode.getDslStatusNode().temperatureParametr(""));

                finalNode.setBertName(handlerNode.getDslStatusNode().bertName(""));
                finalNode.setBertValue(handlerNode.getDslStatusNode().bertValue(""));

                finalNode.setErroredBlocksName(handlerNode.getDslStatisticsNode().erroredBlocksName(""));
                finalNode.setErroredBlocksValue(handlerNode.getDslStatisticsNode().erroredBlocksValueSide1(0L));

                finalNode.setErroredSecondsName(handlerNode.getDslStatisticsNode().erroredSecondsName(""));
                finalNode.setErroredSecondValue(handlerNode.getDslStatisticsNode().erroredSecondValueSide1(0L));

                finalNode.setSeverelyErroredSecondsName(handlerNode.getDslStatisticsNode().severelyErroredSecondsName(""));
                finalNode.setSeverelyErroredSecondsValue(handlerNode.getDslStatisticsNode().severelyErroredSecondsValueSide1(0L));

                finalNode.setBackgroundBlockErrorsName(handlerNode.getDslStatisticsNode().backgroundBlockErrorsName(""));
                finalNode.setBackgroundBlockErrorsValue(handlerNode.getDslStatisticsNode().backgroundBlockErrorsValueSide1(0L));

                finalNode.setEsrName(handlerNode.getDslStatisticsNode().esrName(""));
                finalNode.setEsrValue(handlerNode.getDslStatisticsNode().esrValueSide1(0.0));

                finalNode.setSersName(handlerNode.getDslStatisticsNode().sersName(""));
                finalNode.setSersValue(handlerNode.getDslStatisticsNode().sersValueSide1(0.0));

                finalNode.setBberName(handlerNode.getDslStatisticsNode().bberName(""));
                finalNode.setBberValue(handlerNode.getDslStatisticsNode().bberValueSide1(0.0));

                finalNode.setAvailableTimeName(handlerNode.getDslStatisticsNode().availableTimeName(""));
                finalNode.setAvailableTimeValue(handlerNode.getDslStatisticsNode().availableTimeValueSide1(0L));

                finalNode.setUnavailableTimeName(handlerNode.getDslStatisticsNode().unavailableTimeName(""));
                finalNode.setUnavailableTimeValue(handlerNode.getDslStatisticsNode().unavailableTimeValueSide1(0L));

                nodeBuildDAO.saveFinalNode(finalNode);

            } else {

                IntermediateNode intermediateNode= new IntermediateNode();

                intermediateNode.setDate(date);

           //     intermediateNode.setIpNode(handlerNode.getDslStatusNode().nameNode(""));

                intermediateNode.setSyncName(handlerNode.getDslStatusNode().syncName(""));
                intermediateNode.setSyncValueSide1(handlerNode.getDslStatusNode().syncValueSide1(0));
                intermediateNode.setSyncValueSide2(handlerNode.getDslStatusNode().syncValueSide2(0));

                intermediateNode.setSegdName(handlerNode.getDslStatusNode().segdName(""));
                intermediateNode.setSegdValueSide1(handlerNode.getDslStatusNode().segdValueSide1(0));
                intermediateNode.setSegdValueSide2(handlerNode.getDslStatusNode().segdValueSide2(0));

                intermediateNode.setTxPowerName(handlerNode.getDslStatusNode().txPowerName(""));
                intermediateNode.setTxPowerValueSide1(handlerNode.getDslStatusNode().txPowerValueSide1(0.0));
                intermediateNode.setTxPowerValueSide2(handlerNode.getDslStatusNode().txPowerValueSide2(0.0));
                intermediateNode.setTxPowerParametr(handlerNode.getDslStatusNode().txPowerParametr(""));

                intermediateNode.setRxPowerName(handlerNode.getDslStatusNode().rxPowerName(""));
                intermediateNode.setRxPowerValueSide1(handlerNode.getDslStatusNode().rxPowerValueSide1(0.0));
                intermediateNode.setRxPowerValueSide2(handlerNode.getDslStatusNode().rxPowerValueSide2(0.0));
                intermediateNode.setRxPowerParametr(handlerNode.getDslStatusNode().rxPowerParametr(""));

                intermediateNode.setLoopAttenuationName(handlerNode.getDslStatusNode().loopAttenuationName(""));
                intermediateNode.setLoopAttenuationValueSide1(handlerNode.getDslStatusNode().loopAttenuationValueSide1(0.0));
                intermediateNode.setLoopAttenuationValueSide2(handlerNode.getDslStatusNode().loopAttenuationValueSide2(0.0));


                intermediateNode.setNmrName(handlerNode.getDslStatusNode().nmrName(""));
                intermediateNode.setNmrValueSide1(handlerNode.getDslStatusNode().nmrValueSide1(0.0));
                intermediateNode.setNmrValueSide2(handlerNode.getDslStatusNode().nmrValueSide2(0.0));


                intermediateNode.setBitrateName(handlerNode.getDslStatusNode().bitrateName(""));
                intermediateNode.setBitrateValueSide1(handlerNode.getDslStatusNode().bitrateValueSide1(0));
                intermediateNode.setBitrateValueSide2(handlerNode.getDslStatusNode().bitrateValueSide2(0));

                intermediateNode.setActiveSyncSourceName(handlerNode.getDslStatusNode().activeSyncSourceName(""));
                intermediateNode.setActiveSyncSourceValueSide1(handlerNode.getDslStatusNode().activeSyncSourceValueSide1(""));
                intermediateNode.setActiveSyncSourceValueSide2(handlerNode.getDslStatusNode().activeSyncSourceValueSide2(""));

                intermediateNode.setRpVoltageName(handlerNode.getDslStatusNode().rpVoltageName(""));
                intermediateNode.setRpVoltageValueSide1(handlerNode.getDslStatusNode().rpVoltageValueSide1(0));
                intermediateNode.setRpVoltageValueSide2(handlerNode.getDslStatusNode().rpVoltageValueSide2(0));
                intermediateNode.setRpVoltageParametr(handlerNode.getDslStatusNode().rpVoltageParametr(""));

                intermediateNode.setRpStatusName(handlerNode.getDslStatusNode().rpStatusName(""));
                intermediateNode.setRpStatusValue(handlerNode.getDslStatusNode().rpStatusValue(""));

                intermediateNode.setTemperatureName(handlerNode.getDslStatusNode().temperatureName(""));
                intermediateNode.setTemperatureValue(handlerNode.getDslStatusNode().temperatureValue(0.0));
                intermediateNode.setTemperatureParametr(handlerNode.getDslStatusNode().temperatureParametr(""));

                intermediateNode.setErroredBlocksName(handlerNode.getDslStatisticsNode().erroredBlocksName(""));
                intermediateNode.setErroredBlocksValueSide1(handlerNode.getDslStatisticsNode().erroredBlocksValueSide1(0L));
                intermediateNode.setErroredBlocksValueSide2(handlerNode.getDslStatisticsNode().erroredBlocksValueSide2(0L));

                intermediateNode.setErroredSecondsName(handlerNode.getDslStatisticsNode().erroredSecondsName(""));
                intermediateNode.setErroredSecondValueSide1(handlerNode.getDslStatisticsNode().erroredSecondValueSide1(0L));
                intermediateNode.setErroredSecondValueSide2(handlerNode.getDslStatisticsNode().erroredSecondValueSide2(0L));

                intermediateNode.setSeverelyErroredSecondsName(handlerNode.getDslStatisticsNode().severelyErroredSecondsName(""));
                intermediateNode.setSeverelyErroredSecondsValueSide1(handlerNode.getDslStatisticsNode().severelyErroredSecondsValueSide1(0L));
                intermediateNode.setSeverelyErroredSecondsValueSide2(handlerNode.getDslStatisticsNode().severelyErroredSecondsValueSide2(0L));

                intermediateNode.setBackgroundBlockErrorsName(handlerNode.getDslStatisticsNode().backgroundBlockErrorsName(""));
                intermediateNode.setBackgroundBlockErrorsValueSide1(handlerNode.getDslStatisticsNode().backgroundBlockErrorsValueSide1(0L));
                intermediateNode.setBackgroundBlockErrorsValueSide2(handlerNode.getDslStatisticsNode().backgroundBlockErrorsValueSide2(0L));

                intermediateNode.setEsrName(handlerNode.getDslStatisticsNode().esrName(""));
                intermediateNode.setEsrValueSide1(handlerNode.getDslStatisticsNode().esrValueSide1(0.0));
                intermediateNode.setEsrValueSide2(handlerNode.getDslStatisticsNode().esrValueSide2(0.0));

                intermediateNode.setSersName(handlerNode.getDslStatisticsNode().sersName(""));
                intermediateNode.setSersValueSide1(handlerNode.getDslStatisticsNode().sersValueSide1(0.0));
                intermediateNode.setSersValueSide2(handlerNode.getDslStatisticsNode().sersValueSide2(0.0));

                intermediateNode.setBberName(handlerNode.getDslStatisticsNode().bberName(""));
                intermediateNode.setBberValueSide1(handlerNode.getDslStatisticsNode().bberValueSide1(0.0));
                intermediateNode.setBberValueSide2(handlerNode.getDslStatisticsNode().bberValueSide2(0.0));

                intermediateNode.setAvailableTimeName(handlerNode.getDslStatisticsNode().availableTimeName(""));
                intermediateNode.setAvailableTimeValueSide1(handlerNode.getDslStatisticsNode().availableTimeValueSide1(0L));
                intermediateNode.setAvailableTimeValueSide2(handlerNode.getDslStatisticsNode().availableTimeValueSide2(0L));

                intermediateNode.setUnavailableTimeName(handlerNode.getDslStatisticsNode().unavailableTimeName(""));
                intermediateNode.setUnavailableTimeValueSide1(handlerNode.getDslStatisticsNode().unavailableTimeValueSide1(0L));
                intermediateNode.setUnavailableTimeValueSide2(handlerNode.getDslStatisticsNode().unavailableTimeValueSide2(0L));

                nodeBuildDAO.saveIntermediateNode(intermediateNode);

            }

        }

    }
