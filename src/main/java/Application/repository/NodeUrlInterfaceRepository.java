package Application.repository;

import Application.Entity.NodeUrl;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NodeUrlInterfaceRepository extends JpaRepository<NodeUrl, Long> {


    List<NodeUrl> findByIp(String ip);

    List<NodeUrl> findByNumber(String number);


}
