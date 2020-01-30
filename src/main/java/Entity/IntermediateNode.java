package Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;


@Entity
@Table(name = "intermediateNode")
public class IntermediateNode {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="hash1", referencedColumnName = "hash1")
    private DateTime dateTime =new DateTime();


        @Column(name = "date")
        private Timestamp date;

        @Column(name="ipNode")
        private String ipNode;

        @Column (name = "syncName")
        private String syncName;
        @Column (name = "syncValueSide1")
        private Integer syncValueSide1;
        @Column (name = "syncValueSide2")
        private Integer syncValueSide2;

        @Column (name = "segdName")
        private String segdName;
        @Column (name = "segdValueSide1")
        private Integer segdValueSide1;
        @Column (name = "segdValueSide2")
        private Integer segdValueSide2;

        @Column (name = "txPowerName")
        private String txPowerName;
        @Column (name = "txPowerValueSide1")
        private Double txPowerValueSide1;
        @Column (name = "txPowerValueSide2")
        private Double txPowerValueSide2;
        @Column (name = "txPowerParametr")
        private String txPowerParametr;

        @Column (name = "rxPowerName")
        private String rxPowerName;
        @Column (name = "rxPowerValueSide1")
        private Double rxPowerValueSide1;
        @Column (name = "rxPowerValueSide2")
        private Double rxPowerValueSide2;
        @Column (name = "rxPowerParametr")
        private String rxPowerParametr;

        @Column (name = "loopAttenuationName")
        private String loopAttenuationName;
        @Column (name = "loopAttenuationValueSide1")
        private Double loopAttenuationValueSide1;
        @Column (name = "loopAttenuationValueSide2")
        private Double loopAttenuationValueSide2;
        @Column (name = "loopAttenuationParametr")
        private String loopAttenuationParametr="dB";

        @Column (name = "nmrName")
        private String nmrName;
        @Column (name = "nmrValueSide1")
        private Double nmrValueSide1;
        @Column (name = "nmrValueSide2")
        private Double nmrValueSide2;
        @Column (name = "nmrParametr")
        private String nmrParametr="dB";

        @Column (name = "bitrateName")
        private String bitrateName;
        @Column (name = "bitrateValueSide1")
        private Integer bitrateValueSide1;
        @Column (name = "bitrateValueSide2")
        private Integer bitrateValueSide2;
        @Column (name = "bitrateParametr")
        private String bitrateParametr="kbit/s";


        @Column (name = "activeSyncSourceName")
        private String activeSyncSourceName;
        @Column (name = "activeSyncSourceValueSide1")
        private String activeSyncSourceValueSide1;
        @Column (name = "activeSyncSourceValueSide2")
        private String activeSyncSourceValueSide2;

        @Column (name = "rpVoltageName")
        private  String rpVoltageName;
        @Column(name = "rpVoltageValueSide1")
        private Integer rpVoltageValueSide1;
        @Column(name = "rpVoltageValueSide2")
        private Integer rpVoltageValueSide2;
        @Column(name = "rpVoltageParametr")
        private String rpVoltageParametr;

        @Column(name = "rpStatusName")
        private String rpStatusName;
        @Column(name = "rpStatusValue")
        private String rpStatusValue;

        @Column (name = "temperatureName")
        private String temperatureName;
        @Column (name = "temperatureValue")
        private Double temperatureValue;
        @Column (name = "temperatureParametr")
        private String temperatureParametr;

    @Column(name = "erroredBlocksName")
    private String erroredBlocksName;
    @Column(name = "erroredBlocksValueSide1")
    private Long erroredBlocksValueSide1;
    @Column(name = "erroredBlocksValueSide2")
    private Long erroredBlocksValueSide2;

    @Column(name = "erroredSecondsName")
    private String erroredSecondsName;
    @Column(name = "erroredSecondValueSide1")
    private Long erroredSecondValueSide1;
    @Column(name = "erroredSecondValueSide2")
    private Long erroredSecondValueSide2;

    @Column(name = "severelyErroredSecondsName")
    private String severelyErroredSecondsName;
    @Column(name = "severelyErroredSecondsValueSide1")
    private Long severelyErroredSecondsValueSide1;
    @Column(name = "severelyErroredSecondsValueSide2")
    private Long severelyErroredSecondsValueSide2;

    @Column(name = "backgroundBlockErrorsName")
    private String backgroundBlockErrorsName;
    @Column(name = "backgroundBlockErrorsValueSide1")
    private Long backgroundBlockErrorsValueSide1;
    @Column(name = "backgroundBlockErrorsValueSide2")
    private Long backgroundBlockErrorsValueSide2;

    @Column(name = "esrName")
    private String esrName;
    @Column(name = "esrValueSide1")
    private Double esrValueSide1;
    @Column(name = "esrValueSide2")
    private Double esrValueSide2;

    @Column(name = "sersName")
    private String sersName;
    @Column(name = "sersValueSide1")
    private Double sersValueSide1;
    @Column(name = "sersValueSide2")
    private Double sersValueSide2;

    @Column(name = "bberName")
    private String bberName;
    @Column(name = "bberValueSide1")
    private Double bberValueSide1;
    @Column(name = "bberValueSide2")
    private Double bberValueSide2;

    @Column(name = "availableTimeName")
    private String availableTimeName;
    @Column(name = "availableTimeValueSide1")
    private Long availableTimeValueSide1;
    @Column(name = "availableTimeValueSide2")
    private Long availableTimeValueSide2;

    @Column(name = "unavailableTimeName")
    private String unavailableTimeName;
    @Column(name = "unavailableTimeValueSide1")
    private Long unavailableTimeValueSide1;
    @Column(name = "unavailableTimeValueSide2")
    private Long unavailableTimeValueSide2;



public IntermediateNode(){

    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public String getIpNode() {
        return ipNode;
    }

    public void setIpNode(String ipNode) {
        this.ipNode = ipNode;
    }

    public String getSyncName() {
        return syncName;
    }

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    public Integer getSyncValueSide1() {
        return syncValueSide1;
    }

    public void setSyncValueSide1(Integer syncValueSide1) {
        this.syncValueSide1 = syncValueSide1;
    }

    public Integer getSyncValueSide2() {
        return syncValueSide2;
    }

    public void setSyncValueSide2(Integer syncValueSide2) {
        this.syncValueSide2 = syncValueSide2;
    }

    public String getSegdName() {
        return segdName;
    }

    public void setSegdName(String segdName) {
        this.segdName = segdName;
    }

    public Integer getSegdValueSide1() {
        return segdValueSide1;
    }

    public void setSegdValueSide1(Integer segdValueSide1) {
        this.segdValueSide1 = segdValueSide1;
    }

    public Integer getSegdValueSide2() {
        return segdValueSide2;
    }

    public void setSegdValueSide2(Integer segdValueSide2) {
        this.segdValueSide2 = segdValueSide2;
    }

    public String getTxPowerName() {
        return txPowerName;
    }

    public void setTxPowerName(String txPowerName) {
        this.txPowerName = txPowerName;
    }

    public Double getTxPowerValueSide1() {
        return txPowerValueSide1;
    }

    public void setTxPowerValueSide1(Double txPowerValueSide1) {
        this.txPowerValueSide1 = txPowerValueSide1;
    }

    public Double getTxPowerValueSide2() {
        return txPowerValueSide2;
    }

    public void setTxPowerValueSide2(Double txPowerValueSide2) {
        this.txPowerValueSide2 = txPowerValueSide2;
    }

    public String getTxPowerParametr() {
        return txPowerParametr;
    }

    public void setTxPowerParametr(String txPowerParametr) {
        this.txPowerParametr = txPowerParametr;
    }

    public String getRxPowerName() {
        return rxPowerName;
    }

    public void setRxPowerName(String rxPowerName) {
        this.rxPowerName = rxPowerName;
    }

    public Double getRxPowerValueSide1() {
        return rxPowerValueSide1;
    }

    public void setRxPowerValueSide1(Double rxPowerValueSide1) {
        this.rxPowerValueSide1 = rxPowerValueSide1;
    }

    public Double getRxPowerValueSide2() {
        return rxPowerValueSide2;
    }

    public void setRxPowerValueSide2(Double rxPowerValueSide2) {
        this.rxPowerValueSide2 = rxPowerValueSide2;
    }

    public String getRxPowerParametr() {
        return rxPowerParametr;
    }

    public void setRxPowerParametr(String rxPowerParametr) {
        this.rxPowerParametr = rxPowerParametr;
    }

    public String getLoopAttenuationName() {
        return loopAttenuationName;
    }

    public void setLoopAttenuationName(String loopAttenuationName) {
        this.loopAttenuationName = loopAttenuationName;
    }

    public Double getLoopAttenuationValueSide1() {
        return loopAttenuationValueSide1;
    }

    public void setLoopAttenuationValueSide1(Double loopAttenuationValueSide1) {
        this.loopAttenuationValueSide1 = loopAttenuationValueSide1;
    }

    public Double getLoopAttenuationValueSide2() {
        return loopAttenuationValueSide2;
    }

    public void setLoopAttenuationValueSide2(Double loopAttenuationValueSide2) {
        this.loopAttenuationValueSide2 = loopAttenuationValueSide2;
    }

    public String getLoopAttenuationParametr() {
        return loopAttenuationParametr;
    }

    public void setLoopAttenuationParametr(String loopAttenuationParametr) {
        this.loopAttenuationParametr = loopAttenuationParametr;
    }

    public String getNmrName() {
        return nmrName;
    }

    public void setNmrName(String nmrName) {
        this.nmrName = nmrName;
    }

    public Double getNmrValueSide1() {
        return nmrValueSide1;
    }

    public void setNmrValueSide1(Double nmrValueSide1) {
        this.nmrValueSide1 = nmrValueSide1;
    }

    public Double getNmrValueSide2() {
        return nmrValueSide2;
    }

    public void setNmrValueSide2(Double nmrValueSide2) {
        this.nmrValueSide2 = nmrValueSide2;
    }

    public String getNmrParametr() {
        return nmrParametr;
    }

    public void setNmrParametr(String nmrParametr) {
        this.nmrParametr = nmrParametr;
    }

    public String getBitrateName() {
        return bitrateName;
    }

    public void setBitrateName(String bitrateName) {
        this.bitrateName = bitrateName;
    }

    public Integer getBitrateValueSide1() {
        return bitrateValueSide1;
    }

    public void setBitrateValueSide1(Integer bitrateValueSide1) {
        this.bitrateValueSide1 = bitrateValueSide1;
    }

    public Integer getBitrateValueSide2() {
        return bitrateValueSide2;
    }

    public void setBitrateValueSide2(Integer bitrateValueSide2) {
        this.bitrateValueSide2 = bitrateValueSide2;
    }

    public String getBitrateParametr() {
        return bitrateParametr;
    }

    public void setBitrateParametr(String bitrateParametr) {
        this.bitrateParametr = bitrateParametr;
    }

    public String getActiveSyncSourceName() {
        return activeSyncSourceName;
    }

    public void setActiveSyncSourceName(String activeSyncSourceName) {
        this.activeSyncSourceName = activeSyncSourceName;
    }

    public String getActiveSyncSourceValueSide1() {
        return activeSyncSourceValueSide1;
    }

    public void setActiveSyncSourceValueSide1(String activeSyncSourceValueSide1) {
        this.activeSyncSourceValueSide1 = activeSyncSourceValueSide1;
    }

    public String getActiveSyncSourceValueSide2() {
        return activeSyncSourceValueSide2;
    }

    public void setActiveSyncSourceValueSide2(String activeSyncSourceValueSide2) {
        this.activeSyncSourceValueSide2 = activeSyncSourceValueSide2;
    }

    public String getRpVoltageName() {
        return rpVoltageName;
    }

    public void setRpVoltageName(String rpVoltageName) {
        this.rpVoltageName = rpVoltageName;
    }

    public Integer getRpVoltageValueSide1() {
        return rpVoltageValueSide1;
    }

    public void setRpVoltageValueSide1(Integer rpVoltageValueSide1) {
        this.rpVoltageValueSide1 = rpVoltageValueSide1;
    }

    public Integer getRpVoltageValueSide2() {
        return rpVoltageValueSide2;
    }

    public void setRpVoltageValueSide2(Integer rpVoltageValueSide2) {
        this.rpVoltageValueSide2 = rpVoltageValueSide2;
    }

    public String getRpVoltageParametr() {
        return rpVoltageParametr;
    }

    public void setRpVoltageParametr(String rpVoltageParametr) {
        this.rpVoltageParametr = rpVoltageParametr;
    }

    public String getRpStatusName() {
        return rpStatusName;
    }

    public void setRpStatusName(String rpStatusName) {
        this.rpStatusName = rpStatusName;
    }

    public String getRpStatusValue() {
        return rpStatusValue;
    }

    public void setRpStatusValue(String rpStatusValue) {
        this.rpStatusValue = rpStatusValue;
    }

    public String getTemperatureName() {
        return temperatureName;
    }

    public void setTemperatureName(String temperatureName) {
        this.temperatureName = temperatureName;
    }

    public Double getTemperatureValue() {
        return temperatureValue;
    }

    public void setTemperatureValue(Double temperatureValue) {
        this.temperatureValue = temperatureValue;
    }

    public String getTemperatureParametr() {
        return temperatureParametr;
    }

    public void setTemperatureParametr(String temperatureParametr) {
        this.temperatureParametr = temperatureParametr;
    }

    public String getErroredBlocksName() {
        return erroredBlocksName;
    }

    public void setErroredBlocksName(String erroredBlocksName) {
        this.erroredBlocksName = erroredBlocksName;
    }

    public Long getErroredBlocksValueSide1() {
        return erroredBlocksValueSide1;
    }

    public void setErroredBlocksValueSide1(Long erroredBlocksValueSide1) {
        this.erroredBlocksValueSide1 = erroredBlocksValueSide1;
    }

    public Long getErroredBlocksValueSide2() {
        return erroredBlocksValueSide2;
    }

    public void setErroredBlocksValueSide2(Long erroredBlocksValueSide2) {
        this.erroredBlocksValueSide2 = erroredBlocksValueSide2;
    }

    public String getErroredSecondsName() {
        return erroredSecondsName;
    }

    public void setErroredSecondsName(String erroredSecondsName) {
        this.erroredSecondsName = erroredSecondsName;
    }

    public Long getErroredSecondValueSide1() {
        return erroredSecondValueSide1;
    }

    public void setErroredSecondValueSide1(Long erroredSecondValueSide1) {
        this.erroredSecondValueSide1 = erroredSecondValueSide1;
    }

    public Long getErroredSecondValueSide2() {
        return erroredSecondValueSide2;
    }

    public void setErroredSecondValueSide2(Long erroredSecondValueSide2) {
        this.erroredSecondValueSide2 = erroredSecondValueSide2;
    }

    public String getSeverelyErroredSecondsName() {
        return severelyErroredSecondsName;
    }

    public void setSeverelyErroredSecondsName(String severelyErroredSecondsName) {
        this.severelyErroredSecondsName = severelyErroredSecondsName;
    }

    public Long getSeverelyErroredSecondsValueSide1() {
        return severelyErroredSecondsValueSide1;
    }

    public void setSeverelyErroredSecondsValueSide1(Long severelyErroredSecondsValueSide1) {
        this.severelyErroredSecondsValueSide1 = severelyErroredSecondsValueSide1;
    }

    public Long getSeverelyErroredSecondsValueSide2() {
        return severelyErroredSecondsValueSide2;
    }

    public void setSeverelyErroredSecondsValueSide2(Long severelyErroredSecondsValueSide2) {
        this.severelyErroredSecondsValueSide2 = severelyErroredSecondsValueSide2;
    }

    public String getBackgroundBlockErrorsName() {
        return backgroundBlockErrorsName;
    }

    public void setBackgroundBlockErrorsName(String backgroundBlockErrorsName) {
        this.backgroundBlockErrorsName = backgroundBlockErrorsName;
    }

    public Long getBackgroundBlockErrorsValueSide1() {
        return backgroundBlockErrorsValueSide1;
    }

    public void setBackgroundBlockErrorsValueSide1(Long backgroundBlockErrorsValueSide1) {
        this.backgroundBlockErrorsValueSide1 = backgroundBlockErrorsValueSide1;
    }

    public Long getBackgroundBlockErrorsValueSide2() {
        return backgroundBlockErrorsValueSide2;
    }

    public void setBackgroundBlockErrorsValueSide2(Long backgroundBlockErrorsValueSide2) {
        this.backgroundBlockErrorsValueSide2 = backgroundBlockErrorsValueSide2;
    }

    public String getEsrName() {
        return esrName;
    }

    public void setEsrName(String esrName) {
        this.esrName = esrName;
    }

    public Double getEsrValueSide1() {
        return esrValueSide1;
    }

    public void setEsrValueSide1(Double esrValueSide1) {
        this.esrValueSide1 = esrValueSide1;
    }

    public Double getEsrValueSide2() {
        return esrValueSide2;
    }

    public void setEsrValueSide2(Double esrValueSide2) {
        this.esrValueSide2 = esrValueSide2;
    }

    public String getSersName() {
        return sersName;
    }

    public void setSersName(String sersName) {
        this.sersName = sersName;
    }

    public Double getSersValueSide1() {
        return sersValueSide1;
    }

    public void setSersValueSide1(Double sersValueSide1) {
        this.sersValueSide1 = sersValueSide1;
    }

    public Double getSersValueSide2() {
        return sersValueSide2;
    }

    public void setSersValueSide2(Double sersValueSide2) {
        this.sersValueSide2 = sersValueSide2;
    }

    public String getBberName() {
        return bberName;
    }

    public void setBberName(String bberName) {
        this.bberName = bberName;
    }

    public Double getBberValueSide1() {
        return bberValueSide1;
    }

    public void setBberValueSide1(Double bberValueSide1) {
        this.bberValueSide1 = bberValueSide1;
    }

    public Double getBberValueSide2() {
        return bberValueSide2;
    }

    public void setBberValueSide2(Double bberValueSide2) {
        this.bberValueSide2 = bberValueSide2;
    }

    public String getAvailableTimeName() {
        return availableTimeName;
    }

    public void setAvailableTimeName(String availableTimeName) {
        this.availableTimeName = availableTimeName;
    }

    public Long getAvailableTimeValueSide1() {
        return availableTimeValueSide1;
    }

    public void setAvailableTimeValueSide1(Long availableTimeValueSide1) {
        this.availableTimeValueSide1 = availableTimeValueSide1;
    }

    public Long getAvailableTimeValueSide2() {
        return availableTimeValueSide2;
    }

    public void setAvailableTimeValueSide2(Long availableTimeValueSide2) {
        this.availableTimeValueSide2 = availableTimeValueSide2;
    }

    public String getUnavailableTimeName() {
        return unavailableTimeName;
    }

    public void setUnavailableTimeName(String unavailableTimeName) {
        this.unavailableTimeName = unavailableTimeName;
    }

    public Long getUnavailableTimeValueSide1() {
        return unavailableTimeValueSide1;
    }

    public void setUnavailableTimeValueSide1(Long unavailableTimeValueSide1) {
        this.unavailableTimeValueSide1 = unavailableTimeValueSide1;
    }

    public Long getUnavailableTimeValueSide2() {
        return unavailableTimeValueSide2;
    }

    public void setUnavailableTimeValueSide2(Long unavailableTimeValueSide2) {
        this.unavailableTimeValueSide2 = unavailableTimeValueSide2;
    }
}
