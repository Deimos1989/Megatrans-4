package Application.Entity;

import javax.persistence.*;


@Entity
@Table(name = "number_System")
public class NumberSystem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

  /*  @ManyToOne(cascade =CascadeType.ALL )
    @JoinColumn (name="number_link")
    NodeUrl nodeUrl = new NodeUrl();
*/

    @Column(name = "number")
    private String number;

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
