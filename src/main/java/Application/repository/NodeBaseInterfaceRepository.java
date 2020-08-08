package Application.repository;

import Application.Entity.NodeBase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NodeBaseInterfaceRepository extends JpaRepository<NodeBase, Long> {
}
