package Application.repository;
import Application.Entity.SurleyConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SurleyConfigurationInterfaceRepository extends JpaRepository<SurleyConfiguration, Long> {
}
