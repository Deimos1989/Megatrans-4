package Application.repository;

import Application.Entity.ResultSurley;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ResultSurleyInterfaceRepository extends JpaRepository<ResultSurley, Long> {
    List<ResultSurley> findByIp(String ip);

    List<ResultSurley> findByHash(String hash);

    void deleteByHash(String hash);

    List<ResultSurley> findByLocalDate(LocalDate localDate);

    List<ResultSurley> findByLocalDateTime(LocalDateTime localDateTime);
}

