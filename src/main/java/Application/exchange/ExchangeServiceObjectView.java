package Application.exchange;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;

import java.time.LocalDate;
public class ExchangeServiceObjectView {
    private Long id;
    private String url;
    private String ip;
    private String localDate;
    private String localDateTime;
    private String hash;
    private String number;
    private SpringDataWebProperties.Sort sort;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    public String getLocalDate() {
        return localDate;
    }

    public void setLocalDate(String localDate) {
        this.localDate = localDate;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(String localDateTime) {
        this.localDateTime = localDateTime;
    }

    public SpringDataWebProperties.Sort getSort() {
        return sort;
    }

    public void setSort(SpringDataWebProperties.Sort sort) {
        this.sort = sort;
    }
}
