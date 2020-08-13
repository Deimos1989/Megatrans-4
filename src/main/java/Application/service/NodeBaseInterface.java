package Application.service;

import Application.Entity.NodeBase;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface NodeBaseInterface {

    List<NodeBase> findAll(NodeBase nodeBase);
    List<NodeBase> findByIp(String ip);
    List<NodeBase> findByHash(String hash);
    List<NodeBase> findByLocalDate(LocalDate localDate);
    List<NodeBase> findByLocalDateTime(LocalDateTime localDateTime);

    void save(NodeBase nodeBase);
    void update(NodeBase nodeBase);
    void deleteHash(String hash);
    void delete(NodeBase nodeBase);
    void deleteAll(NodeBase nodeBase);
}
