package Entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;


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




    /*@OneToMany
private Set<FinalNode> finalNodes=new HashSet<FinalNode>();


    public Set<FinalNode> getFinalNodes() {
        return finalNodes;
    }

    public void setFinalNodes(Set<FinalNode> finalNodes) {
        this.finalNodes = finalNodes;
    }*/

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