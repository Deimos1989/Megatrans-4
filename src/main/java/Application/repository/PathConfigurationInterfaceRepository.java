package Application.repository;
import Application.Entity.PathConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PathConfigurationInterfaceRepository extends JpaRepository<PathConfiguration, Long> {
}
