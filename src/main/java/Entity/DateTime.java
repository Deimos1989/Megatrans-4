package Entity;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "dateTime")
public class DateTime {

    public DateTime(){

    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "date")
    private String date;


    @Column(name = "hash1")
    private String hash;


    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }
}