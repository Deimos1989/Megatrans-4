package Application.service;

import Application.Entity.NodeUrl;
import Application.repository.NodeUrlInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NodeUrlInterfaceImplement implements NodeUrlInterface {

    @Autowired
    NodeUrlInterfaceRepository nodeUrlInterfaceRepository;


    @Override
    public List<NodeUrl> findAll() {
        return nodeUrlInterfaceRepository.findAll();
    }

    @Override
    public List<NodeUrl> findByIp(String ip) {
        return this.nodeUrlInterfaceRepository.findByIp(ip);
    }

    @Override
    public List<NodeUrl> findByNumber(String number) {
        return nodeUrlInterfaceRepository.findByNumber(number);
    }

    @Override
    public void save(NodeUrl nodeUrl) {
this.nodeUrlInterfaceRepository.save(nodeUrl);
    }

    @Override
    public void delete(NodeUrl nodeUrl) {
this.nodeUrlInterfaceRepository.delete(nodeUrl);
    }
    
    @Override
    public void deleteAll(NodeUrl nodeUrle) {
this.nodeUrlInterfaceRepository.deleteAll();
    }
}
