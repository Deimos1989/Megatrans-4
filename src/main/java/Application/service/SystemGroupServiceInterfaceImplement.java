package Application.service;

import Application.Entity.ResultSurley;
import Application.Entity.SystemGroup;
import Application.repository.SystemGroupInterfaceRepository;
import Application.service.SystemGroupInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@Transactional
public class SystemGroupServiceInterfaceImplement implements SystemGroupInterface {

    @Autowired
    SystemGroupInterfaceRepository numberInterfaceRepository;

    @Override
    public List<SystemGroup> findAll() {
        return this.numberInterfaceRepository.findAll();
    }

    @Override
    public List<SystemGroup> findByName(String description) {
        return this.numberInterfaceRepository.findByDescription(description);
    }



    @Override
    public void save(SystemGroup systemGroup) {
        this.numberInterfaceRepository.save(systemGroup);

    }

    @Override
    public void delete(SystemGroup systemGroup) {
        this.numberInterfaceRepository.delete(systemGroup);
    }

    @Override
    public void deleteAll(SystemGroup systemGroup) {
        this.numberInterfaceRepository.deleteAll();
    }




}
