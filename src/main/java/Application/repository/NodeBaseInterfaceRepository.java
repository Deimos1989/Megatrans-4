package Application.repository;

import Application.Entity.NodeBase;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NodeBaseInterfaceRepository extends JpaRepository<NodeBase, Long> {
    List<NodeBase> findByIp(String ip);

    List<NodeBase> findByHash(String hash);

    List<NodeBase> findByLocalDateTime(String localDateTime);
    
    void deleteByHash(String hash);
}

