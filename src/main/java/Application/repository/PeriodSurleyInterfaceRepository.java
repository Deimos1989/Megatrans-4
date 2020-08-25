package Application.repository;

import Application.Entity.PeriodSurley;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface PeriodSurleyInterfaceRepository extends JpaRepository<PeriodSurley, Long> {

    Optional<PeriodSurley> findById(Long id);
}
