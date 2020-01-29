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

    @Column(name = "date")
    private Timestamp date;






    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }


}