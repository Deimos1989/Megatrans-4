package Application.Entity;


import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="surley")
public class Surley {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn (name="system_group_id")
    private SystemGroup systemGroup;

    @Column(name = "date_create")
    LocalDateTime dateCreate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SystemGroup getSystemGroup() {
        return systemGroup;
    }

    public void setSystemGroup(SystemGroup systemGroup) {
        this.systemGroup = systemGroup;
    }

    public LocalDateTime getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(LocalDateTime dateCreate) {
        this.dateCreate = dateCreate;
    }
}
