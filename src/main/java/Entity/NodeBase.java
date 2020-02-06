package Entity;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "nodeBase")
public class NodeBase {

    public NodeBase() {

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

  /*  @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="nodeBase_hash2", referencedColumnName = "hash2")
    private DateTime dateTime=new DateTime();
*/




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

    @Column(name = "date")
    private String date;

    @Column(name = "ipNode")
    private String ipNode;


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

    @Column(name = "nmrName")
    private String nmrName;
    @Column(name = "nmrValueSide1")
    private Double nmrValueSide1;
    @Column(name = "nmrValueSide2")
    private Double nmrValueSide2;
    @Column(name = "nmrParametr")
    private String nmrParametr = "dB";

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getIpNode() {
        return ipNode;
    }

    public void setIpNode(String ipNode) {
        this.ipNode = ipNode;
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

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}
