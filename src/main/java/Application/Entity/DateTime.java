package Application.Entity;
import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
@Table(name = "Date_Time")
public class DateTime {


    public DateTime(){


    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;



    @Column(name = "Date")
    private LocalDate localDate;

    @Column(name = "Time")
    private LocalTime localTime;

    @Column(name = "local_Date_Time")
    private LocalDateTime localDateTime;


    @Column(name = "timestamp")
    private Timestamp timestamp;

    @ManyToOne(cascade =CascadeType.ALL )
    @JoinColumn (name="hash")
    NodeBase nodeBase =new NodeBase();


/*@Column(name = "hash")
    private String hash;*/

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

   /* public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }*/
}