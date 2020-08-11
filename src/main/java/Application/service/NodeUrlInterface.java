package Application.service;

import Application.Entity.NodeUrl;

import java.util.List;

public interface NodeUrlInterface {

    List<NodeUrl> findAll();
    List<NodeUrl> findByIp(String ip);
    List<NodeUrl> findByNumber(String number);

    void save(NodeUrl nodeUrl);

    void delete(NodeUrl nodeUrl);
    void deleteAll(NodeUrl nodeUrl);


}
