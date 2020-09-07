package Application.exchange;

public class ExchangeGuide {
    private Long id;
    private String name;
    private String description;


    private String erroredBlocks="erroredBlocks";
    private String erroredSeconds="erroredSeconds";
    private String severelyErroredSeconds="severelyErroredSeconds";
    private String backgroundBlockErrors="backgroundBlockErrors";
    private String esr="esr";
    private String sesr="sesr";
    private String bber="bber";
    private String nmr="nmr";
    private String availableTime="availableTime";
    private String unavailableTime="unavailableTime";


    public Long getId() {
        return id;
    }

    public String getErroredBlocks() {
        return erroredBlocks;
    }

    public String getErroredSeconds() {
        return erroredSeconds;
    }

    public String getSeverelyErroredSeconds() {
        return severelyErroredSeconds;
    }

    public String getBackgroundBlockErrors() {
        return backgroundBlockErrors;
    }

    public String getEsr() {
        return esr;
    }

    public String getSesr() {
        return sesr;
    }

    public String getBber() {
        return bber;
    }

    public String getNmr() {
        return nmr;
    }

    public String getAvailableTime() {
        return availableTime;
    }

    public String getUnavailableTime() {
        return unavailableTime;
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

    public void setErroredBlocks(String erroredBlocks) {
        this.erroredBlocks = erroredBlocks;
    }

    public void setErroredSeconds(String erroredSeconds) {
        this.erroredSeconds = erroredSeconds;
    }

    public void setSeverelyErroredSeconds(String severelyErroredSeconds) {
        this.severelyErroredSeconds = severelyErroredSeconds;
    }

    public void setBackgroundBlockErrors(String backgroundBlockErrors) {
        this.backgroundBlockErrors = backgroundBlockErrors;
    }

    public void setEsr(String esr) {
        this.esr = esr;
    }

    public void setSesr(String sesr) {
        this.sesr = sesr;
    }

    public void setBber(String bber) {
        this.bber = bber;
    }

    public void setNmr(String nmr) {
        this.nmr = nmr;
    }

    public void setAvailableTime(String availableTime) {
        this.availableTime = availableTime;
    }

    public void setUnavailableTime(String unavailableTime) {
        this.unavailableTime = unavailableTime;
    }
}
