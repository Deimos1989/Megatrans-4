package Service;

import Entity.NodeBase;
import TableDisplay.TableDispleyUAVR;

import java.util.List;

public class ExchangeServiceTable {

    public List<NodeBase> getNodeBases() {
        return nodeBases;
    }

    public void setNodeBases(List<NodeBase> nodeBases) {
        this.nodeBases = nodeBases;
    }

    List<NodeBase>nodeBases;



    public TableDispleyUAVR setTable() {

    TableDispleyUAVR tableDispleyUAVR = new TableDispleyUAVR();

        tableDispleyUAVR.getName();

        tableDispleyUAVR.setIpNode0(nodeBases.get(0).getIpNode());
        tableDispleyUAVR.setIpNode1(nodeBases.get(1).getIpNode());
        tableDispleyUAVR.setIpNode2(nodeBases.get(2).getIpNode());
        tableDispleyUAVR.setIpNode3(nodeBases.get(3).getIpNode());


        tableDispleyUAVR.setErroredBlocksName0_0(nodeBases.get(0).getErroredBlocksName());

        tableDispleyUAVR.setErroredBlocksValueSide1_0(nodeBases.get(0).getErroredBlocksValueSide1());
        tableDispleyUAVR.setErroredBlocksValueSide1_1(nodeBases.get(1).getErroredBlocksValueSide1());
        tableDispleyUAVR.setErroredBlocksValueSide1_2(nodeBases.get(2).getErroredBlocksValueSide1());
        tableDispleyUAVR.setErroredBlocksValueSide1_3(nodeBases.get(3).getErroredBlocksValueSide1());

        tableDispleyUAVR.setErroredBlocksValueSide2_0(nodeBases.get(0).getErroredBlocksValueSide2());
        tableDispleyUAVR.setErroredBlocksValueSide2_1(nodeBases.get(1).getErroredBlocksValueSide2());
        tableDispleyUAVR.setErroredBlocksValueSide2_2(nodeBases.get(2).getErroredBlocksValueSide2());
        tableDispleyUAVR.setErroredBlocksValueSide2_3(nodeBases.get(3).getErroredBlocksValueSide2());




        tableDispleyUAVR.setErroredSecondsName0_0(nodeBases.get(0).getErroredSecondsName());

        tableDispleyUAVR.setErroredSecondValueSide1_0(nodeBases.get(0).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setErroredSecondValueSide1_1(nodeBases.get(1).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setErroredSecondValueSide1_2(nodeBases.get(2).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setErroredSecondValueSide1_3(nodeBases.get(3).getSeverelyErroredSecondsValueSide1());

        tableDispleyUAVR.setErroredSecondValueSide2_0(nodeBases.get(0).getSeverelyErroredSecondsValueSide2());
        tableDispleyUAVR.setErroredSecondValueSide2_1(nodeBases.get(1).getSeverelyErroredSecondsValueSide2());
        tableDispleyUAVR.setErroredSecondValueSide2_2(nodeBases.get(2).getSeverelyErroredSecondsValueSide2());
        tableDispleyUAVR.setErroredSecondValueSide2_3(nodeBases.get(3).getSeverelyErroredSecondsValueSide2());


        tableDispleyUAVR.setSeverelyErroredSecondsName0_0(nodeBases.get(0).getSeverelyErroredSecondsName());

        tableDispleyUAVR.setSeverelyErroredSecondsValueSide1_0(nodeBases.get(0).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setSeverelyErroredSecondsValueSide1_1(nodeBases.get(1).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setSeverelyErroredSecondsValueSide1_2(nodeBases.get(2).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setSeverelyErroredSecondsValueSide1_3(nodeBases.get(3).getSeverelyErroredSecondsValueSide1());

        tableDispleyUAVR.setSeverelyErroredSecondsValueSide2_0(nodeBases.get(0).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setSeverelyErroredSecondsValueSide2_1(nodeBases.get(1).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setSeverelyErroredSecondsValueSide2_2(nodeBases.get(2).getSeverelyErroredSecondsValueSide1());
        tableDispleyUAVR.setSeverelyErroredSecondsValueSide2_3(nodeBases.get(3).getSeverelyErroredSecondsValueSide1());

        tableDispleyUAVR.setBackgroundBlockErrorsName0_0(nodeBases.get(0).getBackgroundBlockErrorsName());

        tableDispleyUAVR.setBackgroundBlockErrorsValueSide1_0(nodeBases.get(0).getBackgroundBlockErrorsValueSide1());
        tableDispleyUAVR.setBackgroundBlockErrorsValueSide1_1(nodeBases.get(1).getBackgroundBlockErrorsValueSide1());
        tableDispleyUAVR.setBackgroundBlockErrorsValueSide1_2(nodeBases.get(2).getBackgroundBlockErrorsValueSide1());
        tableDispleyUAVR.setBackgroundBlockErrorsValueSide1_3(nodeBases.get(3).getBackgroundBlockErrorsValueSide1());

        tableDispleyUAVR.setBackgroundBlockErrorsValueSide2_0(nodeBases.get(0).getBackgroundBlockErrorsValueSide2());
        tableDispleyUAVR.setBackgroundBlockErrorsValueSide2_1(nodeBases.get(1).getBackgroundBlockErrorsValueSide2());
        tableDispleyUAVR.setBackgroundBlockErrorsValueSide2_2(nodeBases.get(2).getBackgroundBlockErrorsValueSide2());
        tableDispleyUAVR.setBackgroundBlockErrorsValueSide2_3(nodeBases.get(3).getBackgroundBlockErrorsValueSide2());

        tableDispleyUAVR.setEsrName0_0(nodeBases.get(0).getEsrName());

        tableDispleyUAVR.setEsrValueSide1_0(nodeBases.get(0).getEsrValueSide1());
        tableDispleyUAVR.setEsrValueSide1_1(nodeBases.get(1).getEsrValueSide1());
        tableDispleyUAVR.setEsrValueSide1_2(nodeBases.get(2).getEsrValueSide1());
        tableDispleyUAVR.setEsrValueSide1_3(nodeBases.get(3).getEsrValueSide1());

        tableDispleyUAVR.setEsrValueSide2_0(nodeBases.get(0).getEsrValueSide2());
        tableDispleyUAVR.setEsrValueSide2_1(nodeBases.get(1).getEsrValueSide2());
        tableDispleyUAVR.setEsrValueSide2_2(nodeBases.get(2).getEsrValueSide2());
        tableDispleyUAVR.setEsrValueSide2_3(nodeBases.get(3).getEsrValueSide2());


        tableDispleyUAVR.setSersName0_0(nodeBases.get(0).getSersName());

        tableDispleyUAVR.setSersValueSide1_0(nodeBases.get(0).getSesrValueSide1());
        tableDispleyUAVR.setSersValueSide1_1(nodeBases.get(1).getSesrValueSide1());
        tableDispleyUAVR.setSersValueSide1_2(nodeBases.get(2).getSesrValueSide1());
        tableDispleyUAVR.setSersValueSide1_3(nodeBases.get(3).getSesrValueSide1());

        tableDispleyUAVR.setSersValueSide2_0(nodeBases.get(0).getSesrValueSide2());
        tableDispleyUAVR.setSersValueSide2_1(nodeBases.get(1).getSesrValueSide2());
        tableDispleyUAVR.setSersValueSide2_2(nodeBases.get(2).getSesrValueSide2());
        tableDispleyUAVR.setSersValueSide2_3(nodeBases.get(3).getSesrValueSide2());

        tableDispleyUAVR.setBberName0_0(nodeBases.get(0).getBberName());

        tableDispleyUAVR.setBberValueSide1_0(nodeBases.get(0).getBberValueSide1());
        tableDispleyUAVR.setBberValueSide1_1(nodeBases.get(1).getBberValueSide1());
        tableDispleyUAVR.setBberValueSide1_2(nodeBases.get(2).getBberValueSide1());
        tableDispleyUAVR.setBberValueSide1_3(nodeBases.get(3).getBberValueSide1());

        tableDispleyUAVR.setBberValueSide2_0(nodeBases.get(0).getBberValueSide2());
        tableDispleyUAVR.setBberValueSide2_1(nodeBases.get(1).getBberValueSide2());
        tableDispleyUAVR.setBberValueSide2_2(nodeBases.get(2).getBberValueSide2());
        tableDispleyUAVR.setBberValueSide2_3(nodeBases.get(3).getBberValueSide2());

        tableDispleyUAVR.setAvailableTimeName0_0(nodeBases.get(0).getAvailableTimeName());

        tableDispleyUAVR.setAvailableTimeValueSide1_0(nodeBases.get(0).getAvailableTimeValueSide1());
        tableDispleyUAVR.setAvailableTimeValueSide1_1(nodeBases.get(1).getAvailableTimeValueSide1());
        tableDispleyUAVR.setAvailableTimeValueSide1_2(nodeBases.get(2).getAvailableTimeValueSide1());
        tableDispleyUAVR.setAvailableTimeValueSide1_3(nodeBases.get(3).getAvailableTimeValueSide1());

        tableDispleyUAVR.setAvailableTimeValueSide2_0(nodeBases.get(0).getAvailableTimeValueSide2());
        tableDispleyUAVR.setAvailableTimeValueSide2_1(nodeBases.get(1).getAvailableTimeValueSide2());
        tableDispleyUAVR.setAvailableTimeValueSide2_2(nodeBases.get(2).getAvailableTimeValueSide2());
        tableDispleyUAVR.setAvailableTimeValueSide2_3(nodeBases.get(3).getAvailableTimeValueSide2());

        tableDispleyUAVR.setUnavailableTimeName0_0(nodeBases.get(0).getUnavailableTimeName());

        tableDispleyUAVR.setUnavailableTimeValueSide1_0(nodeBases.get(0).getUnavailableTimeValueSide1());
        tableDispleyUAVR.setUnavailableTimeValueSide1_1(nodeBases.get(1).getUnavailableTimeValueSide1());
        tableDispleyUAVR.setUnavailableTimeValueSide1_2(nodeBases.get(2).getUnavailableTimeValueSide1());
        tableDispleyUAVR.setUnavailableTimeValueSide1_3(nodeBases.get(3).getUnavailableTimeValueSide1());

        tableDispleyUAVR.setUnavailableTimeValueSide2_0(nodeBases.get(0).getUnavailableTimeValueSide2());
        tableDispleyUAVR.setUnavailableTimeValueSide2_1(nodeBases.get(1).getUnavailableTimeValueSide2());
        tableDispleyUAVR.setUnavailableTimeValueSide2_2(nodeBases.get(2).getUnavailableTimeValueSide2());
        tableDispleyUAVR.setUnavailableTimeValueSide2_3(nodeBases.get(3).getUnavailableTimeValueSide2());

        tableDispleyUAVR.setNmrName0_0(nodeBases.get(0).getNmrName());

        tableDispleyUAVR.setNmrValueSide1_0(nodeBases.get(0).getNmrValueSide1());
        tableDispleyUAVR.setNmrValueSide1_1(nodeBases.get(1).getNmrValueSide1());
        tableDispleyUAVR.setNmrValueSide1_2(nodeBases.get(2).getNmrValueSide1());
        tableDispleyUAVR.setNmrValueSide1_3(nodeBases.get(3).getNmrValueSide1());

        tableDispleyUAVR.setNmrValueSide2_0(nodeBases.get(0).getNmrValueSide2());
        tableDispleyUAVR.setNmrValueSide2_1(nodeBases.get(1).getNmrValueSide2());
        tableDispleyUAVR.setNmrValueSide2_2(nodeBases.get(2).getNmrValueSide2());
        tableDispleyUAVR.setNmrValueSide2_3(nodeBases.get(3).getNmrValueSide2());

        return tableDispleyUAVR;
    }
}
