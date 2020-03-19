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

        for (int i=0;i!=nodeBases.size();i++) {

            tableDispleyUAVR.setIpNode(nodeBases.get(i).getIpNode());

            tableDispleyUAVR.setErroredBlocksName(nodeBases.get(i).getErroredBlocksName());
            tableDispleyUAVR.setErroredBlocksValueSide1(nodeBases.get(i).getErroredBlocksValueSide1());
            tableDispleyUAVR.setErroredBlocksValueSide2(nodeBases.get(i).getErroredBlocksValueSide2());

            tableDispleyUAVR.setErroredSecondsName(nodeBases.get(i).getErroredSecondsName());
            tableDispleyUAVR.setErroredSecondValueSide1(nodeBases.get(i).getSeverelyErroredSecondsValueSide1());
            tableDispleyUAVR.setErroredSecondValueSide2(nodeBases.get(i).getSeverelyErroredSecondsValueSide2());


            tableDispleyUAVR.setSeverelyErroredSecondsName(nodeBases.get(i).getSeverelyErroredSecondsName());
            tableDispleyUAVR.setSeverelyErroredSecondsValueSide1(nodeBases.get(i).getSeverelyErroredSecondsValueSide1());
            tableDispleyUAVR.setSeverelyErroredSecondsValueSide2(nodeBases.get(i).getSeverelyErroredSecondsValueSide2());


            tableDispleyUAVR.setBackgroundBlockErrorsName(nodeBases.get(i).getBackgroundBlockErrorsName());
            tableDispleyUAVR.setBackgroundBlockErrorsValueSide1(nodeBases.get(i).getBackgroundBlockErrorsValueSide1());
            tableDispleyUAVR.setBackgroundBlockErrorsValueSide2(nodeBases.get(i).getBackgroundBlockErrorsValueSide2());


            tableDispleyUAVR.setEsrName(nodeBases.get(i).getEsrName());
            tableDispleyUAVR.setEsrValueSide1(nodeBases.get(i).getEsrValueSide1());
            tableDispleyUAVR.setEsrValueSide2(nodeBases.get(i).getEsrValueSide2());



            tableDispleyUAVR.setSersName(nodeBases.get(i).getSesrName());
            tableDispleyUAVR.setSersValueSide1(nodeBases.get(i).getSesrValueSide1());
            tableDispleyUAVR.setSersValueSide2(nodeBases.get(i).getSesrValueSide2());


            tableDispleyUAVR.setBberName(nodeBases.get(i).getBberName());
            tableDispleyUAVR.setBberValueSide1(nodeBases.get(i).getBberValueSide1());
            tableDispleyUAVR.setBberValueSide2(nodeBases.get(i).getBberValueSide2());


            tableDispleyUAVR.setAvailableTimeName(nodeBases.get(i).getAvailableTimeName());
            tableDispleyUAVR.setAvailableTimeValueSide1(nodeBases.get(i).getAvailableTimeValueSide1());
            tableDispleyUAVR.setAvailableTimeValueSide2(nodeBases.get(i).getAvailableTimeValueSide2());


            tableDispleyUAVR.setUnavailableTimeName(nodeBases.get(i).getUnavailableTimeName());
            tableDispleyUAVR.setUnavailableTimeValueSide1(nodeBases.get(i).getUnavailableTimeValueSide1());
            tableDispleyUAVR.setUnavailableTimeValueSide2(nodeBases.get(i).getUnavailableTimeValueSide2());


            tableDispleyUAVR.setNmrName(nodeBases.get(i).getNmrName());
            tableDispleyUAVR.setNmrValueSide1(nodeBases.get(i).getNmrValueSide1());
            tableDispleyUAVR.setNmrValueSide2(nodeBases.get(i).getNmrValueSide2());

        }
        return tableDispleyUAVR;
    }
}
