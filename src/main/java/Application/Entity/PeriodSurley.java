package Application.Entity;

import javax.persistence.*;

@Entity
@Table(name="period_surley")
public class PeriodSurley {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "period")
    private Long periodSurley;

    @Column(name="description")
    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public Long getPeriodSurley() {
        return periodSurley;
    }

    public void setPeriodSurley(Long periodSurley) {
        this.periodSurley = periodSurley;
    }
}
