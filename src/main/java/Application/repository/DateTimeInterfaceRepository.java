package Application.repository;


        import Application.Entity.DateTime;
        import org.springframework.data.jpa.repository.JpaRepository;
        import org.springframework.stereotype.Repository;
        import java.time.LocalDate;
        import java.util.List;

@Repository
public interface DateTimeInterfaceRepository extends JpaRepository<DateTime,Long> {

        List<DateTime> findByLocalDate(LocalDate localDate);
}
