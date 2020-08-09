package Application.repository;

import Application.Entity.NodeBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface NodeBaseInterfaceRepository extends JpaRepository<NodeBase, Long> {
    List<NodeBase> findByIp(String ip);

    List<NodeBase> findByHash(String hash);

    void deleteByHash(String hash);

    List<NodeBase> findByLocalDate(LocalDate localDate);

    List<NodeBase> findByLocalDateTime(LocalDateTime localDateTime);
}

