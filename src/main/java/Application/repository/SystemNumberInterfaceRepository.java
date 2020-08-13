package Application.repository;

import Application.Entity.NumberSystem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SystemNumberInterfaceRepository extends JpaRepository<NumberSystem, Long> {
    List<NumberSystem> findByNumber(String number);
}
