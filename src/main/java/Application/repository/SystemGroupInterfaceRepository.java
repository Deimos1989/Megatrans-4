package Application.repository;

import Application.Entity.SystemGroup;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemGroupInterfaceRepository extends JpaRepository<SystemGroup, Long> {
    List<SystemGroup> findByDescription(String description);
}
