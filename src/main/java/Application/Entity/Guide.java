package Application.Entity;

import javax.persistence.*;

@Entity
@Table(name = "guide")
public class Guide {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    /*@Column(name = "erroredBlocks")
    private String erroredBlocks;

    @Column(name = "erroredSeconds")
    private String erroredSeconds;

    @Column(name = "severelyErroredSeconds")
    private String severelyErroredSeconds;

    @Column(name = "backgroundBlockErrors")
    private String backgroundBlockErrors;

    @Column(name = "esr")
    private String esr;

    @Column(name = "sers")
    private String sers;

    @Column(name = "bber")
    private String bber;

    @Column(name = "nmr")
    private String nmr;

    @Column(name = "availableTime")
    private String availableTime;

    @Column(name = "unavailableTime")
    private String unavailableTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getErroredBlocks() {
        return erroredBlocks;
    }

    public void setErroredBlocks(String erroredBlocks) {
        this.erroredBlocks = erroredBlocks;
    }

    public String getErroredSeconds() {
        return erroredSeconds;
    }

    public void setErroredSeconds(String erroredSeconds) {
        this.erroredSeconds = erroredSeconds;
    }

    public String getSeverelyErroredSeconds() {
        return severelyErroredSeconds;
    }

    public void setSeverelyErroredSeconds(String severelyErroredSeconds) {
        this.severelyErroredSeconds = severelyErroredSeconds;
    }

    public String getBackgroundBlockErrors() {
        return backgroundBlockErrors;
    }

    public void setBackgroundBlockErrors(String backgroundBlockErrors) {
        this.backgroundBlockErrors = backgroundBlockErrors;
    }

    public String getEsr() {
        return esr;
    }

    public void setEsr(String esr) {
        this.esr = esr;
    }

    public String getSers() {
        return sers;
    }

    public void setSers(String sers) {
        this.sers = sers;
    }

    public String getBber() {
        return bber;
    }

    public void setBber(String bber) {
        this.bber = bber;
    }

    public String getNmr() {
        return nmr;
    }

    public void setNmr(String nmr) {
        this.nmr = nmr;
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public String getUnavailableTime() {
        return unavailableTime;
    }

    public void setUnavailableTime(String unavailableTime) {
        this.unavailableTime = unavailableTime;
    }*/
}
