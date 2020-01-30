package Entity;

import javax.persistence.*;
import java.sql.Timestamp;



@Entity
@Table(name = "finalnode")
public class FinalNode {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="hash1", referencedColumnName = "hash1")
    private DateTime dateTime =new DateTime();

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Column(name="hash")
    private  String hash;

    @Column(name = "date")
    private Timestamp date;

    @Column(name = "ipNode")
    private String ipNode;

    @Column(name = "modeName")
    private String modeName;
    @Column(name = "modeValue")
    private String modeValue;

    @Column(name = "syncName")
    private String syncName;
    @Column(name = "syncValue")
    private Integer syncValue;

    @Column(name = "segdName")
    private String segdName;
    @Column(name = "segdValue")
    private Integer segdValue;

    @Column(name = "powerBackOffName")
    private String powerBackOffName;
    @Column(name = "powerBackOffValue")
    private Double powerBackOffValue;
    @Column(name = "powerBackOffParametr")
    private String powerBackOffParametr;

    @Column(name = "farEndPowerBackOffName")
    private String farEndPowerBackOffName;
    @Column(name = "farEndPowerBackOffValue")
    private Double farEndPowerBackOffValue;
    @Column(name = "farEndPowerBackOffParametr")
    private String farEndPowerBackOffParametr;

    @Column(name = "loopAttenuationName")
    private String loopAttenuationName;
    @Column(name = "loopAttenuationValue")
    private Double loopAttenuationValue;
    @Column(name = "loopAttenuationParametr")
    private String loopAttenuationParametr="dB";

    @Column(name = "nmrName")
    private String nmrName;
    @Column(name = "nmrValue")
    private Double nmrValue;
    @Column(name = "nmrParametr")
    private String nmrParametr="dB";

    @Column(name = "bitrateName")
    private String bitrateName;
    @Column(name = "bitrateValue")
    private Integer bitrateValue;
    @Column(name = "bitrateParametr")
    private String bitrateParametr="kbit/s";

    @Column(name = "sruName")
    private String sruName;
    @Column(name = "sruValue")
    private Integer sruValue;

    @Column(name = "activeSyncSourceName")
    private String activeSyncSourceName;
    @Column(name = "activeSyncSourceValue")
    private String activeSyncSourceValue;

    @Column(name = "temperatureName")
    private String temperatureName;
    @Column(name = "temperatureValue")
    private Double temperatureValue;
    @Column(name = "temperatureParametr")
    private String temperatureParametr;

    @Column(name = "bertName")
    private String bertName;
    @Column(name = "bertValue")
    private String bertValue;

    @Column(name = "erroredBlocksName")
    private String erroredBlocksName;
    @Column(name = "erroredBlocksValue")
    private Long erroredBlocksValue;

    @Column(name = "erroredSecondsName")
    private String erroredSecondsName;
    @Column(name = "erroredSecondValue")
    private Long erroredSecondValue;

    @Column(name = "severelyErroredSecondsName")
    private String severelyErroredSecondsName;
    @Column(name = "severelyErroredSecondsValue")
    private Long severelyErroredSecondsValue;

    @Column(name = "backgroundBlockErrorsName")
    private String backgroundBlockErrorsName;
    @Column(name = "backgroundBlockErrorsValue")
    private Long backgroundBlockErrorsValue;

    @Column(name = "esrName")
    private String esrName;
    @Column(name = "esrValue")
    private Double esrValue;

    @Column(name = "sersName")
    private String sersName;
    @Column(name = "sersValue")
    private Double sersValue;

    @Column(name = "bberName")
    private String bberName;
    @Column(name = "bberValue")
    private Double bberValue;

    @Column(name = "availableTimeName")
    private String availableTimeName;
    @Column(name = "availableTimeValue")
    private Long availableTimeValue;

    @Column(name = "unavailableTimeName")
    private String unavailableTimeName;
    @Column(name = "unavailableTimeValue")
    private Long unavailableTimeValue;


    public FinalNode() {

    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


   /* public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }
*/
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

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public String getModeValue() {
        return modeValue;
    }

    public void setModeValue(String modeValue) {
        this.modeValue = modeValue;
    }

    public String getSyncName() {
        return syncName;
    }

    public void setSyncName(String syncName) {
        this.syncName = syncName;
    }

    public Integer getSyncValue() {
        return syncValue;
    }

    public void setSyncValue(Integer syncValue) {
        this.syncValue = syncValue;
    }

    public String getSegdName() {
        return segdName;
    }

    public void setSegdName(String segdName) {
        this.segdName = segdName;
    }

    public Integer getSegdValue() {
        return segdValue;
    }

    public void setSegdValue(Integer segdValue) {
        this.segdValue = segdValue;
    }

    public String getPowerBackOffName() {
        return powerBackOffName;
    }

    public void setPowerBackOffName(String powerBackOffName) {
        this.powerBackOffName = powerBackOffName;
    }

    public Double getPowerBackOffValue() {
        return powerBackOffValue;
    }

    public void setPowerBackOffValue(Double powerBackOffValue) {
        this.powerBackOffValue = powerBackOffValue;
    }

    public String getPowerBackOffParametr() {
        return powerBackOffParametr;
    }

    public void setPowerBackOffParametr(String powerBackOffParametr) {
        this.powerBackOffParametr = powerBackOffParametr;
    }

    public String getFarEndPowerBackOffName() {
        return farEndPowerBackOffName;
    }

    public void setFarEndPowerBackOffName(String farEndPowerBackOffName) {
        this.farEndPowerBackOffName = farEndPowerBackOffName;
    }

    public Double getFarEndPowerBackOffValue() {
        return farEndPowerBackOffValue;
    }

    public void setFarEndPowerBackOffValue(Double farEndPowerBackOffValue) {
        this.farEndPowerBackOffValue = farEndPowerBackOffValue;
    }

    public String getFarEndPowerBackOffParametr() {
        return farEndPowerBackOffParametr;
    }

    public void setFarEndPowerBackOffParametr(String farEndPowerBackOffParametr) {
        this.farEndPowerBackOffParametr = farEndPowerBackOffParametr;
    }

    public String getLoopAttenuationName() {
        return loopAttenuationName;
    }

    public void setLoopAttenuationName(String loopAttenuationName) {
        this.loopAttenuationName = loopAttenuationName;
    }

    public Double getLoopAttenuationValue() {
        return loopAttenuationValue;
    }

    public void setLoopAttenuationValue(Double loopAttenuationValue) {
        this.loopAttenuationValue = loopAttenuationValue;
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

    public Double getNmrValue() {
        return nmrValue;
    }

    public void setNmrValue(Double nmrValue) {
        this.nmrValue = nmrValue;
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

    public Integer getBitrateValue() {
        return bitrateValue;
    }

    public void setBitrateValue(Integer bitrateValue) {
        this.bitrateValue = bitrateValue;
    }

    public String getBitrateParametr() {
        return bitrateParametr;
    }

    public void setBitrateParametr(String bitrateParametr) {
        this.bitrateParametr = bitrateParametr;
    }

    public String getSruName() {
        return sruName;
    }

    public void setSruName(String sruName) {
        this.sruName = sruName;
    }

    public Integer getSruValue() {
        return sruValue;
    }

    public void setSruValue(Integer sruValue) {
        this.sruValue = sruValue;
    }

    public String getActiveSyncSourceName() {
        return activeSyncSourceName;
    }

    public void setActiveSyncSourceName(String activeSyncSourceName) {
        this.activeSyncSourceName = activeSyncSourceName;
    }

    public String getActiveSyncSourceValue() {
        return activeSyncSourceValue;
    }

    public void setActiveSyncSourceValue(String activeSyncSourceValue) {
        this.activeSyncSourceValue = activeSyncSourceValue;
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

    public String getBertName() {
        return bertName;
    }

    public void setBertName(String bertName) {
        this.bertName = bertName;
    }

    public String getBertValue() {
        return bertValue;
    }

    public void setBertValue(String bertValue) {
        this.bertValue = bertValue;
    }

    public String getErroredBlocksName() {
        return erroredBlocksName;
    }

    public void setErroredBlocksName(String erroredBlocksName) {
        this.erroredBlocksName = erroredBlocksName;
    }

    public Long getErroredBlocksValue() {
        return erroredBlocksValue;
    }

    public void setErroredBlocksValue(Long erroredBlocksValue) {
        this.erroredBlocksValue = erroredBlocksValue;
    }

    public String getErroredSecondsName() {
        return erroredSecondsName;
    }

    public void setErroredSecondsName(String erroredSecondsName) {
        this.erroredSecondsName = erroredSecondsName;
    }

    public Long getErroredSecondValue() {
        return erroredSecondValue;
    }

    public void setErroredSecondValue(Long erroredSecondValue) {
        this.erroredSecondValue = erroredSecondValue;
    }

    public String getSeverelyErroredSecondsName() {
        return severelyErroredSecondsName;
    }

    public void setSeverelyErroredSecondsName(String severelyErroredSecondsName) {
        this.severelyErroredSecondsName = severelyErroredSecondsName;
    }

    public Long getSeverelyErroredSecondsValue() {
        return severelyErroredSecondsValue;
    }

    public void setSeverelyErroredSecondsValue(Long severelyErroredSecondsValue) {
        this.severelyErroredSecondsValue = severelyErroredSecondsValue;
    }

    public String getBackgroundBlockErrorsName() {
        return backgroundBlockErrorsName;
    }

    public void setBackgroundBlockErrorsName(String backgroundBlockErrorsName) {
        this.backgroundBlockErrorsName = backgroundBlockErrorsName;
    }

    public Long getBackgroundBlockErrorsValue() {
        return backgroundBlockErrorsValue;
    }

    public void setBackgroundBlockErrorsValue(Long backgroundBlockErrorsValue) {
        this.backgroundBlockErrorsValue = backgroundBlockErrorsValue;
    }

    public String getEsrName() {
        return esrName;
    }

    public void setEsrName(String esrName) {
        this.esrName = esrName;
    }

    public Double getEsrValue() {
        return esrValue;
    }

    public void setEsrValue(Double esrValue) {
        this.esrValue = esrValue;
    }

    public String getSersName() {
        return sersName;
    }

    public void setSersName(String sersName) {
        this.sersName = sersName;
    }

    public Double getSersValue() {
        return sersValue;
    }

    public void setSersValue(Double sersValue) {
        this.sersValue = sersValue;
    }

    public String getBberName() {
        return bberName;
    }

    public void setBberName(String bberName) {
        this.bberName = bberName;
    }

    public Double getBberValue() {
        return bberValue;
    }

    public void setBberValue(Double bberValue) {
        this.bberValue = bberValue;
    }

    public String getAvailableTimeName() {
        return availableTimeName;
    }

    public void setAvailableTimeName(String availableTimeName) {
        this.availableTimeName = availableTimeName;
    }

    public Long getAvailableTimeValue() {
        return availableTimeValue;
    }

    public void setAvailableTimeValue(Long availableTimeValue) {
        this.availableTimeValue = availableTimeValue;
    }

    public String getUnavailableTimeName() {
        return unavailableTimeName;
    }

    public void setUnavailableTimeName(String unavailableTimeName) {
        this.unavailableTimeName = unavailableTimeName;
    }

    public Long getUnavailableTimeValue() {
        return unavailableTimeValue;
    }

    public void setUnavailableTimeValue(Long unavailableTimeValue) {
        this.unavailableTimeValue = unavailableTimeValue;
    }
}


