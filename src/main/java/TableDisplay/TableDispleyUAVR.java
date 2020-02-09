package TableDisplay;

import DAO.NodeBuildDAO;
import Entity.NodeBase;

import java.util.List;

public class TableDispleyUAVR {
    NodeBuildDAO nodeBuildDAO=new NodeBuildDAO();
List<NodeBase> nodeBases=nodeBuildDAO.localDateTimeReport();


    private String name ="IP_Address";

    private String ipNode0 =nodeBases.get(0).getIpNode();
    private String ipNode1 =nodeBases.get(1).getIpNode();
    private String ipNode2 =nodeBases.get(2).getIpNode();
    private String ipNode3 =nodeBases.get(3).getIpNode();


    private String erroredBlocksName0_0=nodeBases.get(0).getErroredBlocksName();

    private Long erroredBlocksValueSide1_0=nodeBases.get(0).getErroredBlocksValueSide1();
    private Long erroredBlocksValueSide1_1=nodeBases.get(1).getErroredBlocksValueSide1();
    private Long erroredBlocksValueSide1_2=nodeBases.get(2).getErroredBlocksValueSide1();
    private Long erroredBlocksValueSide1_3=nodeBases.get(3).getErroredBlocksValueSide1();

    private Long erroredBlocksValueSide2_0=nodeBases.get(0).getErroredBlocksValueSide2();
    private Long erroredBlocksValueSide2_1=nodeBases.get(1).getErroredBlocksValueSide2();
    private Long erroredBlocksValueSide2_2=nodeBases.get(2).getErroredBlocksValueSide2();
    private Long erroredBlocksValueSide2_3=nodeBases.get(3).getErroredBlocksValueSide2();


    private String erroredSecondsName0_0=nodeBases.get(0).getErroredSecondsName();

    private Long erroredSecondValueSide1_0=nodeBases.get(0).getSeverelyErroredSecondsValueSide1();
    private Long erroredSecondValueSide1_1=nodeBases.get(1).getSeverelyErroredSecondsValueSide1();;
    private Long erroredSecondValueSide1_2=nodeBases.get(2).getSeverelyErroredSecondsValueSide1();;
    private Long erroredSecondValueSide1_3=nodeBases.get(3).getSeverelyErroredSecondsValueSide1();;

    private Long erroredSecondValueSide2_0=nodeBases.get(0).getSeverelyErroredSecondsValueSide2();
    private Long erroredSecondValueSide2_1=nodeBases.get(1).getSeverelyErroredSecondsValueSide2();;
    private Long erroredSecondValueSide2_2=nodeBases.get(2).getSeverelyErroredSecondsValueSide2();;
    private Long erroredSecondValueSide2_3=nodeBases.get(3).getSeverelyErroredSecondsValueSide2();;


    private String severelyErroredSecondsName0_0=nodeBases.get(0).getSeverelyErroredSecondsName();

    private Long severelyErroredSecondsValueSide1_0=nodeBases.get(0).getSeverelyErroredSecondsValueSide1();
    private Long severelyErroredSecondsValueSide1_1=nodeBases.get(1).getSeverelyErroredSecondsValueSide1();
    private Long severelyErroredSecondsValueSide1_2=nodeBases.get(2).getSeverelyErroredSecondsValueSide1();
    private Long severelyErroredSecondsValueSide1_3=nodeBases.get(3).getSeverelyErroredSecondsValueSide1();

    private Long severelyErroredSecondsValueSide2_0=nodeBases.get(0).getSeverelyErroredSecondsValueSide2();
    private Long severelyErroredSecondsValueSide2_1=nodeBases.get(1).getSeverelyErroredSecondsValueSide2();
    private Long severelyErroredSecondsValueSide2_2=nodeBases.get(2).getSeverelyErroredSecondsValueSide2();
    private Long severelyErroredSecondsValueSide2_3=nodeBases.get(3).getSeverelyErroredSecondsValueSide2();


    private String backgroundBlockErrorsName0_0=nodeBases.get(0).getBackgroundBlockErrorsName();

    private Long backgroundBlockErrorsValueSide1_0=nodeBases.get(0).getBackgroundBlockErrorsValueSide1();
    private Long backgroundBlockErrorsValueSide1_1=nodeBases.get(1).getBackgroundBlockErrorsValueSide1();
    private Long backgroundBlockErrorsValueSide1_2=nodeBases.get(2).getBackgroundBlockErrorsValueSide1();
    private Long backgroundBlockErrorsValueSide1_3=nodeBases.get(3).getBackgroundBlockErrorsValueSide1();

    private Long backgroundBlockErrorsValueSide2_0=nodeBases.get(0).getBackgroundBlockErrorsValueSide2();
    private Long backgroundBlockErrorsValueSide2_1=nodeBases.get(1).getBackgroundBlockErrorsValueSide2();
    private Long backgroundBlockErrorsValueSide2_2=nodeBases.get(2).getBackgroundBlockErrorsValueSide2();
    private Long backgroundBlockErrorsValueSide2_3=nodeBases.get(3).getBackgroundBlockErrorsValueSide2();


    private String esrName0_0=nodeBases.get(0).getEsrName();

    private Double esrValueSide1_0=nodeBases.get(0).getEsrValueSide1();
    private Double esrValueSide1_1=nodeBases.get(1).getEsrValueSide1();
    private Double esrValueSide1_2=nodeBases.get(2).getEsrValueSide1();
    private Double esrValueSide1_3=nodeBases.get(3).getEsrValueSide1();

    private Double esrValueSide2_0=nodeBases.get(0).getEsrValueSide2();
    private Double esrValueSide2_1=nodeBases.get(1).getEsrValueSide2();
    private Double esrValueSide2_2=nodeBases.get(2).getEsrValueSide2();
    private Double esrValueSide2_3=nodeBases.get(3).getEsrValueSide2();


    private String sersName0_0=nodeBases.get(0).getSersName();

    private Double sersValueSide1_0=nodeBases.get(0).getSersValueSide1();
    private Double sersValueSide1_1=nodeBases.get(1).getSersValueSide1();
    private Double sersValueSide1_2=nodeBases.get(2).getSersValueSide1();
    private Double sersValueSide1_3=nodeBases.get(3).getSersValueSide1();

    private Double sersValueSide2_0=nodeBases.get(0).getSersValueSide2();
    private Double sersValueSide2_1=nodeBases.get(1).getSersValueSide2();
    private Double sersValueSide2_2=nodeBases.get(2).getSersValueSide2();
    private Double sersValueSide2_3=nodeBases.get(3).getSersValueSide2();


    private String bberName0_0=nodeBases.get(0).getBberName();

    private Double bberValueSide1_0=nodeBases.get(0).getBberValueSide1();
    private Double bberValueSide1_1=nodeBases.get(1).getBberValueSide1();
    private Double bberValueSide1_2=nodeBases.get(2).getBberValueSide1();
    private Double bberValueSide1_3=nodeBases.get(3).getBberValueSide1();


    private Double bberValueSide2_0=nodeBases.get(0).getBberValueSide2();
    private Double bberValueSide2_1=nodeBases.get(1).getBberValueSide2();
    private Double bberValueSide2_2=nodeBases.get(2).getBberValueSide2();
    private Double bberValueSide2_3=nodeBases.get(3).getBberValueSide2();


    private String availableTimeName0_0=nodeBases.get(0).getAvailableTimeName();

    private Long availableTimeValueSide1_0=nodeBases.get(0).getAvailableTimeValueSide1();
    private Long availableTimeValueSide1_1=nodeBases.get(1).getAvailableTimeValueSide1();
    private Long availableTimeValueSide1_2=nodeBases.get(2).getAvailableTimeValueSide1();
    private Long availableTimeValueSide1_3=nodeBases.get(3).getAvailableTimeValueSide1();

    private Long availableTimeValueSide2_0=nodeBases.get(0).getAvailableTimeValueSide2();
    private Long availableTimeValueSide2_1=nodeBases.get(1).getAvailableTimeValueSide2();
    private Long availableTimeValueSide2_2=nodeBases.get(2).getAvailableTimeValueSide2();
    private Long availableTimeValueSide2_3=nodeBases.get(3).getAvailableTimeValueSide2();


    private String unavailableTimeName0_0=nodeBases.get(0).getUnavailableTimeName();

    private Long unavailableTimeValueSide1_0=nodeBases.get(0).getUnavailableTimeValueSide1();
    private Long unavailableTimeValueSide1_1=nodeBases.get(1).getUnavailableTimeValueSide1();
    private Long unavailableTimeValueSide1_2=nodeBases.get(2).getUnavailableTimeValueSide1();
    private Long unavailableTimeValueSide1_3=nodeBases.get(3).getUnavailableTimeValueSide1();

    private Long unavailableTimeValueSide2_0=nodeBases.get(0).getUnavailableTimeValueSide2();
    private Long unavailableTimeValueSide2_1=nodeBases.get(1).getUnavailableTimeValueSide2();
    private Long unavailableTimeValueSide2_2=nodeBases.get(2).getUnavailableTimeValueSide2();
    private Long unavailableTimeValueSide2_3=nodeBases.get(3).getUnavailableTimeValueSide2();


    private String nmrName0_0=nodeBases.get(0).getNmrName();

    private Double nmrValueSide1_0=nodeBases.get(0).getNmrValueSide1();
    private Double nmrValueSide1_1=nodeBases.get(1).getNmrValueSide1();
    private Double nmrValueSide1_2=nodeBases.get(2).getNmrValueSide1();
    private Double nmrValueSide1_3=nodeBases.get(3).getNmrValueSide1();

    private Double nmrValueSide2_0=nodeBases.get(0).getNmrValueSide2();
    private Double nmrValueSide2_1=nodeBases.get(1).getNmrValueSide2();
    private Double nmrValueSide2_2=nodeBases.get(2).getNmrValueSide2();
    private Double nmrValueSide2_3=nodeBases.get(3).getNmrValueSide2();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIpNode1() {
        return ipNode1;
    }

    public void setIpNode1(String ipNode1) {
        this.ipNode1 = ipNode1;
    }

    public String getIpNode2() {
        return ipNode2;
    }

    public void setIpNode2(String ipNode2) {
        this.ipNode2 = ipNode2;
    }

    public String getIpNode3() {
        return ipNode3;
    }

    public void setIpNode3(String ipNode3) {
        this.ipNode3 = ipNode3;
    }



    public String getIpNode0() {
        return ipNode0;
    }

    public void setIpNode0(String ipNode0) {
        this.ipNode0 = ipNode0;
    }


    public String getErroredBlocksName0_0() {
        return erroredBlocksName0_0;
    }

    public void setErroredBlocksName0_0(String erroredBlocksName0_0) {
        this.erroredBlocksName0_0 = erroredBlocksName0_0;
    }

    public Long getErroredBlocksValueSide1_0() {
        return erroredBlocksValueSide1_0;
    }

    public void setErroredBlocksValueSide1_0(Long erroredBlocksValueSide1_0) {
        this.erroredBlocksValueSide1_0 = erroredBlocksValueSide1_0;
    }

    public Long getErroredBlocksValueSide1_1() {
        return erroredBlocksValueSide1_1;
    }

    public void setErroredBlocksValueSide1_1(Long erroredBlocksValueSide1_1) {
        this.erroredBlocksValueSide1_1 = erroredBlocksValueSide1_1;
    }

    public Long getErroredBlocksValueSide1_2() {
        return erroredBlocksValueSide1_2;
    }

    public void setErroredBlocksValueSide1_2(Long erroredBlocksValueSide1_2) {
        this.erroredBlocksValueSide1_2 = erroredBlocksValueSide1_2;
    }

    public Long getErroredBlocksValueSide1_3() {
        return erroredBlocksValueSide1_3;
    }

    public void setErroredBlocksValueSide1_3(Long erroredBlocksValueSide1_3) {
        this.erroredBlocksValueSide1_3 = erroredBlocksValueSide1_3;
    }



    public Long getErroredBlocksValueSide2_0() {
        return erroredBlocksValueSide2_0;
    }

    public void setErroredBlocksValueSide2_0(Long erroredBlocksValueSide2_0) {
        this.erroredBlocksValueSide2_0 = erroredBlocksValueSide2_0;
    }

    public Long getErroredBlocksValueSide2_1() {
        return erroredBlocksValueSide2_1;
    }

    public void setErroredBlocksValueSide2_1(Long erroredBlocksValueSide2_1) {
        this.erroredBlocksValueSide2_1 = erroredBlocksValueSide2_1;
    }

    public Long getErroredBlocksValueSide2_2() {
        return erroredBlocksValueSide2_2;
    }

    public void setErroredBlocksValueSide2_2(Long erroredBlocksValueSide2_2) {
        this.erroredBlocksValueSide2_2 = erroredBlocksValueSide2_2;
    }

    public Long getErroredBlocksValueSide2_3() {
        return erroredBlocksValueSide2_3;
    }

    public void setErroredBlocksValueSide2_3(Long erroredBlocksValueSide2_3) {
        this.erroredBlocksValueSide2_3 = erroredBlocksValueSide2_3;
    }

    public String getErroredSecondsName0_0() {
        return erroredSecondsName0_0;
    }

    public void setErroredSecondsName0_0(String erroredSecondsName0_0) {
        this.erroredSecondsName0_0 = erroredSecondsName0_0;
    }

    public Long getErroredSecondValueSide1_0() {
        return erroredSecondValueSide1_0;
    }

    public void setErroredSecondValueSide1_0(Long erroredSecondValueSide1_0) {
        this.erroredSecondValueSide1_0 = erroredSecondValueSide1_0;
    }

    public Long getErroredSecondValueSide1_1() {
        return erroredSecondValueSide1_1;
    }

    public void setErroredSecondValueSide1_1(Long erroredSecondValueSide1_1) {
        this.erroredSecondValueSide1_1 = erroredSecondValueSide1_1;
    }

    public Long getErroredSecondValueSide1_2() {
        return erroredSecondValueSide1_2;
    }

    public void setErroredSecondValueSide1_2(Long erroredSecondValueSide1_2) {
        this.erroredSecondValueSide1_2 = erroredSecondValueSide1_2;
    }

    public Long getErroredSecondValueSide1_3() {
        return erroredSecondValueSide1_3;
    }

    public void setErroredSecondValueSide1_3(Long erroredSecondValueSide1_3) {
        this.erroredSecondValueSide1_3 = erroredSecondValueSide1_3;
    }

    public Long getErroredSecondValueSide2_0() {
        return erroredSecondValueSide2_0;
    }

    public void setErroredSecondValueSide2_0(Long erroredSecondValueSide2_0) {
        this.erroredSecondValueSide2_0 = erroredSecondValueSide2_0;
    }

    public Long getErroredSecondValueSide2_1() {
        return erroredSecondValueSide2_1;
    }

    public void setErroredSecondValueSide2_1(Long erroredSecondValueSide2_1) {
        this.erroredSecondValueSide2_1 = erroredSecondValueSide2_1;
    }

    public Long getErroredSecondValueSide2_2() {
        return erroredSecondValueSide2_2;
    }

    public void setErroredSecondValueSide2_2(Long erroredSecondValueSide2_2) {
        this.erroredSecondValueSide2_2 = erroredSecondValueSide2_2;
    }

    public Long getErroredSecondValueSide2_3() {
        return erroredSecondValueSide2_3;
    }

    public void setErroredSecondValueSide2_3(Long erroredSecondValueSide2_3) {
        this.erroredSecondValueSide2_3 = erroredSecondValueSide2_3;
    }

    public String getSeverelyErroredSecondsName0_0() {
        return severelyErroredSecondsName0_0;
    }

    public void setSeverelyErroredSecondsName0_0(String severelyErroredSecondsName0_0) {
        this.severelyErroredSecondsName0_0 = severelyErroredSecondsName0_0;
    }

    public Long getSeverelyErroredSecondsValueSide1_0() {
        return severelyErroredSecondsValueSide1_0;
    }

    public void setSeverelyErroredSecondsValueSide1_0(Long severelyErroredSecondsValueSide1_0) {
        this.severelyErroredSecondsValueSide1_0 = severelyErroredSecondsValueSide1_0;
    }

    public Long getSeverelyErroredSecondsValueSide1_1() {
        return severelyErroredSecondsValueSide1_1;
    }

    public void setSeverelyErroredSecondsValueSide1_1(Long severelyErroredSecondsValueSide1_1) {
        this.severelyErroredSecondsValueSide1_1 = severelyErroredSecondsValueSide1_1;
    }

    public Long getSeverelyErroredSecondsValueSide1_2() {
        return severelyErroredSecondsValueSide1_2;
    }

    public void setSeverelyErroredSecondsValueSide1_2(Long severelyErroredSecondsValueSide1_2) {
        this.severelyErroredSecondsValueSide1_2 = severelyErroredSecondsValueSide1_2;
    }

    public Long getSeverelyErroredSecondsValueSide1_3() {
        return severelyErroredSecondsValueSide1_3;
    }

    public void setSeverelyErroredSecondsValueSide1_3(Long severelyErroredSecondsValueSide1_3) {
        this.severelyErroredSecondsValueSide1_3 = severelyErroredSecondsValueSide1_3;
    }

    public Long getSeverelyErroredSecondsValueSide2_0() {
        return severelyErroredSecondsValueSide2_0;
    }

    public void setSeverelyErroredSecondsValueSide2_0(Long severelyErroredSecondsValueSide2_0) {
        this.severelyErroredSecondsValueSide2_0 = severelyErroredSecondsValueSide2_0;
    }

    public Long getSeverelyErroredSecondsValueSide2_1() {
        return severelyErroredSecondsValueSide2_1;
    }

    public void setSeverelyErroredSecondsValueSide2_1(Long severelyErroredSecondsValueSide2_1) {
        this.severelyErroredSecondsValueSide2_1 = severelyErroredSecondsValueSide2_1;
    }

    public Long getSeverelyErroredSecondsValueSide2_2() {
        return severelyErroredSecondsValueSide2_2;
    }

    public void setSeverelyErroredSecondsValueSide2_2(Long severelyErroredSecondsValueSide2_2) {
        this.severelyErroredSecondsValueSide2_2 = severelyErroredSecondsValueSide2_2;
    }

    public Long getSeverelyErroredSecondsValueSide2_3() {
        return severelyErroredSecondsValueSide2_3;
    }

    public void setSeverelyErroredSecondsValueSide2_3(Long severelyErroredSecondsValueSide2_3) {
        this.severelyErroredSecondsValueSide2_3 = severelyErroredSecondsValueSide2_3;
    }

    public String getBackgroundBlockErrorsName0_0() {
        return backgroundBlockErrorsName0_0;
    }

    public void setBackgroundBlockErrorsName0_0(String backgroundBlockErrorsName0_0) {
        this.backgroundBlockErrorsName0_0 = backgroundBlockErrorsName0_0;
    }

    public Long getBackgroundBlockErrorsValueSide1_0() {
        return backgroundBlockErrorsValueSide1_0;
    }

    public void setBackgroundBlockErrorsValueSide1_0(Long backgroundBlockErrorsValueSide1_0) {
        this.backgroundBlockErrorsValueSide1_0 = backgroundBlockErrorsValueSide1_0;
    }

    public Long getBackgroundBlockErrorsValueSide1_1() {
        return backgroundBlockErrorsValueSide1_1;
    }

    public void setBackgroundBlockErrorsValueSide1_1(Long backgroundBlockErrorsValueSide1_1) {
        this.backgroundBlockErrorsValueSide1_1 = backgroundBlockErrorsValueSide1_1;
    }

    public Long getBackgroundBlockErrorsValueSide1_2() {
        return backgroundBlockErrorsValueSide1_2;
    }

    public void setBackgroundBlockErrorsValueSide1_2(Long backgroundBlockErrorsValueSide1_2) {
        this.backgroundBlockErrorsValueSide1_2 = backgroundBlockErrorsValueSide1_2;
    }

    public Long getBackgroundBlockErrorsValueSide1_3() {
        return backgroundBlockErrorsValueSide1_3;
    }

    public void setBackgroundBlockErrorsValueSide1_3(Long backgroundBlockErrorsValueSide1_3) {
        this.backgroundBlockErrorsValueSide1_3 = backgroundBlockErrorsValueSide1_3;
    }

    public Long getBackgroundBlockErrorsValueSide2_0() {
        return backgroundBlockErrorsValueSide2_0;
    }

    public void setBackgroundBlockErrorsValueSide2_0(Long backgroundBlockErrorsValueSide2_0) {
        this.backgroundBlockErrorsValueSide2_0 = backgroundBlockErrorsValueSide2_0;
    }

    public Long getBackgroundBlockErrorsValueSide2_1() {
        return backgroundBlockErrorsValueSide2_1;
    }

    public void setBackgroundBlockErrorsValueSide2_1(Long backgroundBlockErrorsValueSide2_1) {
        this.backgroundBlockErrorsValueSide2_1 = backgroundBlockErrorsValueSide2_1;
    }

    public Long getBackgroundBlockErrorsValueSide2_2() {
        return backgroundBlockErrorsValueSide2_2;
    }

    public void setBackgroundBlockErrorsValueSide2_2(Long backgroundBlockErrorsValueSide2_2) {
        this.backgroundBlockErrorsValueSide2_2 = backgroundBlockErrorsValueSide2_2;
    }

    public Long getBackgroundBlockErrorsValueSide2_3() {
        return backgroundBlockErrorsValueSide2_3;
    }

    public void setBackgroundBlockErrorsValueSide2_3(Long backgroundBlockErrorsValueSide2_3) {
        this.backgroundBlockErrorsValueSide2_3 = backgroundBlockErrorsValueSide2_3;
    }

    public String getEsrName0_0() {
        return esrName0_0;
    }

    public void setEsrName0_0(String esrName0_0) {
        this.esrName0_0 = esrName0_0;
    }

    public Double getEsrValueSide1_0() {
        return esrValueSide1_0;
    }

    public void setEsrValueSide1_0(Double esrValueSide1_0) {
        this.esrValueSide1_0 = esrValueSide1_0;
    }

    public Double getEsrValueSide1_1() {
        return esrValueSide1_1;
    }

    public void setEsrValueSide1_1(Double esrValueSide1_1) {
        this.esrValueSide1_1 = esrValueSide1_1;
    }

    public Double getEsrValueSide1_2() {
        return esrValueSide1_2;
    }

    public void setEsrValueSide1_2(Double esrValueSide1_2) {
        this.esrValueSide1_2 = esrValueSide1_2;
    }

    public Double getEsrValueSide1_3() {
        return esrValueSide1_3;
    }

    public void setEsrValueSide1_3(Double esrValueSide1_3) {
        this.esrValueSide1_3 = esrValueSide1_3;
    }

    public Double getEsrValueSide2_0() {
        return esrValueSide2_0;
    }

    public void setEsrValueSide2_0(Double esrValueSide2_0) {
        this.esrValueSide2_0 = esrValueSide2_0;
    }

    public Double getEsrValueSide2_1() {
        return esrValueSide2_1;
    }

    public void setEsrValueSide2_1(Double esrValueSide2_1) {
        this.esrValueSide2_1 = esrValueSide2_1;
    }

    public Double getEsrValueSide2_2() {
        return esrValueSide2_2;
    }

    public void setEsrValueSide2_2(Double esrValueSide2_2) {
        this.esrValueSide2_2 = esrValueSide2_2;
    }

    public Double getEsrValueSide2_3() {
        return esrValueSide2_3;
    }

    public void setEsrValueSide2_3(Double esrValueSide2_3) {
        this.esrValueSide2_3 = esrValueSide2_3;
    }

    public String getSersName0_0() {
        return sersName0_0;
    }

    public void setSersName0_0(String sersName0_0) {
        this.sersName0_0 = sersName0_0;
    }

    public Double getSersValueSide1_0() {
        return sersValueSide1_0;
    }

    public void setSersValueSide1_0(Double sersValueSide1_0) {
        this.sersValueSide1_0 = sersValueSide1_0;
    }

    public Double getSersValueSide1_1() {
        return sersValueSide1_1;
    }

    public void setSersValueSide1_1(Double sersValueSide1_1) {
        this.sersValueSide1_1 = sersValueSide1_1;
    }

    public Double getSersValueSide1_2() {
        return sersValueSide1_2;
    }

    public void setSersValueSide1_2(Double sersValueSide1_2) {
        this.sersValueSide1_2 = sersValueSide1_2;
    }

    public Double getSersValueSide1_3() {
        return sersValueSide1_3;
    }

    public void setSersValueSide1_3(Double sersValueSide1_3) {
        this.sersValueSide1_3 = sersValueSide1_3;
    }

    public Double getSersValueSide2_0() {
        return sersValueSide2_0;
    }

    public void setSersValueSide2_0(Double sersValueSide2_0) {
        this.sersValueSide2_0 = sersValueSide2_0;
    }

    public Double getSersValueSide2_1() {
        return sersValueSide2_1;
    }

    public void setSersValueSide2_1(Double sersValueSide2_1) {
        this.sersValueSide2_1 = sersValueSide2_1;
    }

    public Double getSersValueSide2_2() {
        return sersValueSide2_2;
    }

    public void setSersValueSide2_2(Double sersValueSide2_2) {
        this.sersValueSide2_2 = sersValueSide2_2;
    }

    public Double getSersValueSide2_3() {
        return sersValueSide2_3;
    }

    public void setSersValueSide2_3(Double sersValueSide2_3) {
        this.sersValueSide2_3 = sersValueSide2_3;
    }

    public String getBberName0_0() {
        return bberName0_0;
    }

    public void setBberName0_0(String bberName0_0) {
        this.bberName0_0 = bberName0_0;
    }

    public Double getBberValueSide1_0() {
        return bberValueSide1_0;
    }

    public void setBberValueSide1_0(Double bberValueSide1_0) {
        this.bberValueSide1_0 = bberValueSide1_0;
    }

    public Double getBberValueSide1_1() {
        return bberValueSide1_1;
    }

    public void setBberValueSide1_1(Double bberValueSide1_1) {
        this.bberValueSide1_1 = bberValueSide1_1;
    }

    public Double getBberValueSide1_2() {
        return bberValueSide1_2;
    }

    public void setBberValueSide1_2(Double bberValueSide1_2) {
        this.bberValueSide1_2 = bberValueSide1_2;
    }

    public Double getBberValueSide1_3() {
        return bberValueSide1_3;
    }

    public void setBberValueSide1_3(Double bberValueSide1_3) {
        this.bberValueSide1_3 = bberValueSide1_3;
    }

    public Double getBberValueSide2_0() {
        return bberValueSide2_0;
    }

    public void setBberValueSide2_0(Double bberValueSide2_0) {
        this.bberValueSide2_0 = bberValueSide2_0;
    }

    public Double getBberValueSide2_1() {
        return bberValueSide2_1;
    }

    public void setBberValueSide2_1(Double bberValueSide2_1) {
        this.bberValueSide2_1 = bberValueSide2_1;
    }

    public Double getBberValueSide2_2() {
        return bberValueSide2_2;
    }

    public void setBberValueSide2_2(Double bberValueSide2_2) {
        this.bberValueSide2_2 = bberValueSide2_2;
    }

    public Double getBberValueSide2_3() {
        return bberValueSide2_3;
    }

    public void setBberValueSide2_3(Double bberValueSide2_3) {
        this.bberValueSide2_3 = bberValueSide2_3;
    }

    public String getAvailableTimeName0_0() {
        return availableTimeName0_0;
    }

    public void setAvailableTimeName0_0(String availableTimeName0_0) {
        this.availableTimeName0_0 = availableTimeName0_0;
    }

    public Long getAvailableTimeValueSide1_0() {
        return availableTimeValueSide1_0;
    }

    public void setAvailableTimeValueSide1_0(Long availableTimeValueSide1_0) {
        this.availableTimeValueSide1_0 = availableTimeValueSide1_0;
    }

    public Long getAvailableTimeValueSide1_1() {
        return availableTimeValueSide1_1;
    }

    public void setAvailableTimeValueSide1_1(Long availableTimeValueSide1_1) {
        this.availableTimeValueSide1_1 = availableTimeValueSide1_1;
    }

    public Long getAvailableTimeValueSide1_2() {
        return availableTimeValueSide1_2;
    }

    public void setAvailableTimeValueSide1_2(Long availableTimeValueSide1_2) {
        this.availableTimeValueSide1_2 = availableTimeValueSide1_2;
    }

    public Long getAvailableTimeValueSide1_3() {
        return availableTimeValueSide1_3;
    }

    public void setAvailableTimeValueSide1_3(Long availableTimeValueSide1_3) {
        this.availableTimeValueSide1_3 = availableTimeValueSide1_3;
    }

    public Long getAvailableTimeValueSide2_0() {
        return availableTimeValueSide2_0;
    }

    public void setAvailableTimeValueSide2_0(Long availableTimeValueSide2_0) {
        this.availableTimeValueSide2_0 = availableTimeValueSide2_0;
    }

    public Long getAvailableTimeValueSide2_1() {
        return availableTimeValueSide2_1;
    }

    public void setAvailableTimeValueSide2_1(Long availableTimeValueSide2_1) {
        this.availableTimeValueSide2_1 = availableTimeValueSide2_1;
    }

    public Long getAvailableTimeValueSide2_2() {
        return availableTimeValueSide2_2;
    }

    public void setAvailableTimeValueSide2_2(Long availableTimeValueSide2_2) {
        this.availableTimeValueSide2_2 = availableTimeValueSide2_2;
    }

    public Long getAvailableTimeValueSide2_3() {
        return availableTimeValueSide2_3;
    }

    public void setAvailableTimeValueSide2_3(Long availableTimeValueSide2_3) {
        this.availableTimeValueSide2_3 = availableTimeValueSide2_3;
    }

    public String getUnavailableTimeName0_0() {
        return unavailableTimeName0_0;
    }

    public void setUnavailableTimeName0_0(String unavailableTimeName0_0) {
        this.unavailableTimeName0_0 = unavailableTimeName0_0;
    }

    public Long getUnavailableTimeValueSide1_0() {
        return unavailableTimeValueSide1_0;
    }

    public void setUnavailableTimeValueSide1_0(Long unavailableTimeValueSide1_0) {
        this.unavailableTimeValueSide1_0 = unavailableTimeValueSide1_0;
    }

    public Long getUnavailableTimeValueSide1_1() {
        return unavailableTimeValueSide1_1;
    }

    public void setUnavailableTimeValueSide1_1(Long unavailableTimeValueSide1_1) {
        this.unavailableTimeValueSide1_1 = unavailableTimeValueSide1_1;
    }

    public Long getUnavailableTimeValueSide1_2() {
        return unavailableTimeValueSide1_2;
    }

    public void setUnavailableTimeValueSide1_2(Long unavailableTimeValueSide1_2) {
        this.unavailableTimeValueSide1_2 = unavailableTimeValueSide1_2;
    }

    public Long getUnavailableTimeValueSide1_3() {
        return unavailableTimeValueSide1_3;
    }

    public void setUnavailableTimeValueSide1_3(Long unavailableTimeValueSide1_3) {
        this.unavailableTimeValueSide1_3 = unavailableTimeValueSide1_3;
    }

    public Long getUnavailableTimeValueSide2_0() {
        return unavailableTimeValueSide2_0;
    }

    public void setUnavailableTimeValueSide2_0(Long unavailableTimeValueSide2_0) {
        this.unavailableTimeValueSide2_0 = unavailableTimeValueSide2_0;
    }

    public Long getUnavailableTimeValueSide2_1() {
        return unavailableTimeValueSide2_1;
    }

    public void setUnavailableTimeValueSide2_1(Long unavailableTimeValueSide2_1) {
        this.unavailableTimeValueSide2_1 = unavailableTimeValueSide2_1;
    }

    public Long getUnavailableTimeValueSide2_2() {
        return unavailableTimeValueSide2_2;
    }

    public void setUnavailableTimeValueSide2_2(Long unavailableTimeValueSide2_2) {
        this.unavailableTimeValueSide2_2 = unavailableTimeValueSide2_2;
    }

    public Long getUnavailableTimeValueSide2_3() {
        return unavailableTimeValueSide2_3;
    }

    public void setUnavailableTimeValueSide2_3(Long unavailableTimeValueSide2_3) {
        this.unavailableTimeValueSide2_3 = unavailableTimeValueSide2_3;
    }

    public String getNmrName0_0() {
        return nmrName0_0;
    }

    public void setNmrName0_0(String nmrName0_0) {
        this.nmrName0_0 = nmrName0_0;
    }

    public Double getNmrValueSide1_0() {
        return nmrValueSide1_0;
    }

    public void setNmrValueSide1_0(Double nmrValueSide1_0) {
        this.nmrValueSide1_0 = nmrValueSide1_0;
    }

    public Double getNmrValueSide1_1() {
        return nmrValueSide1_1;
    }

    public void setNmrValueSide1_1(Double nmrValueSide1_1) {
        this.nmrValueSide1_1 = nmrValueSide1_1;
    }

    public Double getNmrValueSide1_2() {
        return nmrValueSide1_2;
    }

    public void setNmrValueSide1_2(Double nmrValueSide1_2) {
        this.nmrValueSide1_2 = nmrValueSide1_2;
    }

    public Double getNmrValueSide1_3() {
        return nmrValueSide1_3;
    }

    public void setNmrValueSide1_3(Double nmrValueSide1_3) {
        this.nmrValueSide1_3 = nmrValueSide1_3;
    }

    public Double getNmrValueSide2_0() {
        return nmrValueSide2_0;
    }

    public void setNmrValueSide2_0(Double nmrValueSide2_0) {
        this.nmrValueSide2_0 = nmrValueSide2_0;
    }

    public Double getNmrValueSide2_1() {
        return nmrValueSide2_1;
    }

    public void setNmrValueSide2_1(Double nmrValueSide2_1) {
        this.nmrValueSide2_1 = nmrValueSide2_1;
    }

    public Double getNmrValueSide2_2() {
        return nmrValueSide2_2;
    }

    public void setNmrValueSide2_2(Double nmrValueSide2_2) {
        this.nmrValueSide2_2 = nmrValueSide2_2;
    }

    public Double getNmrValueSide2_3() {
        return nmrValueSide2_3;
    }

    public void setNmrValueSide2_3(Double nmrValueSide2_3) {
        this.nmrValueSide2_3 = nmrValueSide2_3;
    }
}
