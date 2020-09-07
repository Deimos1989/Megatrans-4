package Application.repository;

import Application.Entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GuideInterfaceRepository extends JpaRepository<Guide,Long> {

    List<Guide> findByName(String name);
}
