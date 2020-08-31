package Application.exchange;

public class ExchangeNodeUrl {

    private Long id;
    private String ip;
    private String number;
    private String date;
    private String dslStatus;
    private String dslStatistics;
    private String dslAlarm;
    private String description;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getDslStatus() {
        return dslStatus;
    }

    public void setDslStatus(String dslStatus) {
        this.dslStatus = dslStatus;
    }

    public String getDslStatistics() {
        return dslStatistics;
    }

    public void setDslStatistics(String dslStatistics) {
        this.dslStatistics = dslStatistics;
    }

    public String getDslAlarm() {
        return dslAlarm;
    }

    public void setDslAlarm(String dslAlarm) {
        this.dslAlarm = dslAlarm;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
