package Application.Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;


@Entity
@Table(name = "result_surley")
public class ResultSurley {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;



    @Column
    private LocalDate localDate;

    @Column
    private LocalTime localTime;

    @Column
    private LocalDateTime localDateTime;

    @ManyToOne(cascade =CascadeType.ALL )
    @JoinColumn (name="surley_id")
    Surley surley;

    @ManyToOne(cascade =CascadeType.ALL )
    @JoinColumn (name="node_id")
    NodeUrl nodeUrl;



    @Column(name = "number_system")
    private String number;


    @Column(name = "hash")
    private String hash;

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    @Column(name = "timestamp")
    private Timestamp timestamp;



        @Column(name="ip_node")
        private String ip;


    @Column(name = "mode_name")
    private String modeName;
    @Column(name = "mode_value")
    private String modeValue;


        @Column (name = "sync_name")
        private String syncName;
        @Column (name = "sync_Value_side1")
        private Integer syncValueSide1;
        @Column (name = "sync_Value_side2")
        private Integer syncValueSide2;

        @Column (name = "segd_name")
        private String segdName;
        @Column (name = "segd_value_side1")
        private Integer segdValueSide1;
        @Column (name = "segd_value_side2")
        private Integer segdValueSide2;

    @Column(name = "power_back_off_name")
    private String powerBackOffName;
    @Column(name = "power_back_off_value")
    private Double powerBackOffValue;
    @Column(name = "power_back_off_parametr")
    private String powerBackOffParametr;

    @Column(name = "far_end_power_back_off_name")
    private String farEndPowerBackOffName;
    @Column(name = "far_end_power_back_off_value")
    private Double farEndPowerBackOffValue;
    @Column(name = "far_end_power_back_off_parametr")
    private String farEndPowerBackOffParametr;

        @Column (name = "tx_power_name")
        private String txPowerName;
        @Column (name = "tx_Power_value_side1")
        private Double txPowerValueSide1;
        @Column (name = "tx_Power_value_side2")
        private Double txPowerValueSide2;
        @Column (name = "tx_power_parametr")
        private String txPowerParametr;

        @Column (name = "rx_power_name")
        private String rxPowerName;
        @Column (name = "rx_power_value_side1")
        private Double rxPowerValueSide1;
        @Column (name = "rx_power_value_side2")
        private Double rxPowerValueSide2;
        @Column (name = "rx_power_parametr")
        private String rxPowerParametr;

        @Column (name = "loop_attenuation_name")
        private String loopAttenuationName;
        @Column (name = "loop_attenuation_value_side1")
        private Double loopAttenuationValueSide1;
        @Column (name = "loop_attenuation_value_side2")
        private Double loopAttenuationValueSide2;
        @Column (name = "loop_attenuation_parametr")
        private String loopAttenuationParametr="dB";

        @Column (name = "nmr_name")
        private String nmrName;
        @Column (name = "nmr_value_side1")
        private Double nmrValueSide1;
        @Column (name = "nmr_value_side2")
        private Double nmrValueSide2;
        @Column (name = "nmr_parametr")
        private String nmrParametr="dB";

        @Column (name = "bitrate_name")
        private String bitrateName;
        @Column (name = "bitrate_value_side1")
        private Integer bitrateValueSide1;
        @Column (name = "bitrate_value_side2")
        private Integer bitrateValueSide2;
        @Column (name = "bitrate_parametr")
        private String bitrateParametr="kbit/s";

    @Column(name = "sru_name")
    private String sruName;
    @Column(name = "sru_value")
    private Integer sruValue;


        @Column (name = "active_sync_source_name")
        private String activeSyncSourceName;
        @Column (name = "active_sync_source_value_side1")
        private String activeSyncSourceValueSide1;
        @Column (name = "active_sync_source_value_side2")
        private String activeSyncSourceValueSide2;

        @Column (name = "rp_voltage_name")
        private  String rpVoltageName;
        @Column(name = "rp_voltage_value_side1")
        private Integer rpVoltageValueSide1;
        @Column(name = "rp_voltage_value_side2")
        private Integer rpVoltageValueSide2;
        @Column(name = "rp_voltage_parametr")
        private String rpVoltageParametr;

        @Column(name = "rp_status_name")
        private String rpStatusName;
        @Column(name = "rp_status_value")
        private String rpStatusValue;

        @Column (name = "temperature_name")
        private String temperatureName;
        @Column (name = "temperature_value")
        private Double temperatureValue;
        @Column (name = "temperature_parametr")
        private String temperatureParametr;



    @Column(name = "bert_name")
    private String bertName;
    @Column(name = "bert_value")
    private String bertValue;

    @Column(name = "errored_blocks_name")
    private String erroredBlocksName;
    @Column(name = "errored_blocks_value_side1")
    private Long erroredBlocksValueSide1;
    @Column(name = "errored_blocks_value_side2")
    private Long erroredBlocksValueSide2;

    @Column(name = "errored_seconds_name")
    private String erroredSecondsName;
    @Column(name = "errored_second_value_side1")
    private Long erroredSecondValueSide1;
    @Column(name = "errored_second_value_side2")
    private Long erroredSecondValueSide2;

    @Column(name = "severely_errored_seconds_name")
    private String severelyErroredSecondsName;
    @Column(name = "severely_errored_seconds_value_side1")
    private Long severelyErroredSecondsValueSide1;
    @Column(name = "severely_errored_seconds_value_side2")
    private Long severelyErroredSecondsValueSide2;

    @Column(name = "background_block_errors_name")
    private String backgroundBlockErrorsName;
    @Column(name = "background_block_errors_value_side1")
    private Long backgroundBlockErrorsValueSide1;
    @Column(name = "background_block_errors_value_side2")
    private Long backgroundBlockErrorsValueSide2;

    @Column(name = "esr_name")
    private String esrName;
    @Column(name = "esr_value_side1")
    private Double esrValueSide1;
    @Column(name = "esr_value_side2")
    private Double esrValueSide2;

    @Column(name = "sesr_name")
    private String sesrName;
    @Column(name = "sesr_value_side1")
    private Double sesrValueSide1;
    @Column(name = "sesr_value_side2")
    private Double sesrValueSide2;

    @Column(name = "bber_name")
    private String bberName;
    @Column(name = "bber_value_side1")
    private Double bberValueSide1;
    @Column(name = "bber_value_side2")
    private Double bberValueSide2;

    @Column(name = "available_time_name")
    private String availableTimeName;
    @Column(name = "available_time_value_side1")
    private Long availableTimeValueSide1;
    @Column(name = "available_time_value_side2")
    private Long availableTimeValueSide2;

    @Column(name = "unavailable_time_name")
    private String unavailableTimeName;
    @Column(name = "unavailable_time_value_side1")
    private Long unavailableTimeValueSide1;
    @Column(name = "unavailable_time_value_side2")
    private Long unavailableTimeValueSide2;



public ResultSurley(){

    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public LocalTime getLocalTime() {
        return localTime;
    }

    public void setLocalTime(LocalTime localTime) {
        this.localTime = localTime;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ipNode) {
        this.ip = ipNode;
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

    public String getSesrName() {
        return sesrName;
    }

    public void setSesrName(String sesrName) {
        this.sesrName = sesrName;
    }

    public Double getSesrValueSide1() {
        return sesrValueSide1;
    }

    public void setSesrValueSide1(Double sesrValueSide1) {
        this.sesrValueSide1 = sesrValueSide1;
    }

    public Double getSesrValueSide2() {
        return sesrValueSide2;
    }

    public void setSesrValueSide2(Double sesrValueSide2) {
        this.sesrValueSide2 = sesrValueSide2;
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

