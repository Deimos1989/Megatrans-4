package Application.service;

import Application.Entity.NodeBase;
import Application.repository.NodeBaseInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


@Service
@Transactional
public class NodeBaseServiceInterfaceImplement implements NodeBaseInterface {

    @Autowired
    private NodeBaseInterfaceRepository nodeBaseInterfaceRepository;


    @Override
    public List<NodeBase> findAll(NodeBase nodeBase) {
        return null;
    }

    @Override
    public List<NodeBase> findByIp(String ip) {
        return this.nodeBaseInterfaceRepository.findByIp(ip);
    }

    @Override
    public List<NodeBase> findByHash(String hash) {
        return this.nodeBaseInterfaceRepository.findByHash(hash);
    }

    @Override
    public List<NodeBase> findByLocalDate(LocalDate localDate) {

        return this.nodeBaseInterfaceRepository.findByLocalDate(localDate);
    }

    @Override
    public List<NodeBase> findByLocalDateTime(LocalDateTime localDateTime) {
        return this.nodeBaseInterfaceRepository.findByLocalDateTime(localDateTime);
    }


    @Override
    public void save(NodeBase nodeBase) {
        this.nodeBaseInterfaceRepository.save(nodeBase);

    }

    @Override
    public void update(NodeBase nodeBase) {

    }

    @Override
    public void deleteHash(String hash) {
        this.nodeBaseInterfaceRepository.deleteByHash(hash);

    }

    @Override
    public void delete(NodeBase nodeBase) {

    }

    @Override
    public void deleteAll(NodeBase nodeBase) {

    }
}
