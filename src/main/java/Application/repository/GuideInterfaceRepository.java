package Application.repository;

import Application.Entity.Guide;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideInterfaceRepository extends JpaRepository<Guide,Long> {

}
