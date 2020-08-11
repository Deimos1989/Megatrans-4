package Application.Entity;
import javax.persistence.*;

@Entity
@Table(name="Node_Url")
public class NodeUrl {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "number")
    private String number;

    @Column(name = "ip")
    private String ip;


    @Column(name = "url_Dsl_status")
    private String urlDslStatus;

    @Column(name = "url_Dsl_statistics")
    private String urlDslStatistics;



    public NodeUrl(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }


    public String getUrlDslStatus() {
        return urlDslStatus;
    }

    public void setUrlDslStatus(String urlDslStatus) {
        this.urlDslStatus = urlDslStatus;
    }

    public String getUrlDslStatistics() {
        return urlDslStatistics;
    }

    public void setUrlDslStatistics(String urlDslStatistics) {
        this.urlDslStatistics = urlDslStatistics;
    }
}
