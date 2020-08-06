package Application.repository;

import Application.Entity.DateTime;
import Application.Entity.NodeBase;
import org.springframework.data.repository.CrudRepository;

public interface ObjectCRUD extends CrudRepository<DateTime,Long> {

}
