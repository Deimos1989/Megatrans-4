package Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;

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
    private Timestamp timestamp;



    @Column(name = "hash1")
    private String hash1 = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss.SSS").format(new java.util.Date());

    @OneToMany(mappedBy = "dateTime", fetch = FetchType.EAGER)
    private Collection<FinalNode> finalNodes;

    @OneToMany(mappedBy = "dateTime", fetch = FetchType.LAZY)
    private Collection<IntermediateNode> intermediateNodes;

    @OneToMany(mappedBy = "dateTime", fetch = FetchType.LAZY)
    private Collection<Node> node;



    public String getHash() {
        return hash1;
    }

    public void setHash(String hash) {
        this.hash1 = hash;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Timestamp getDate() {
        return timestamp;
    }

    public void setDate(Timestamp date) {
        this.timestamp = date;
    }


}