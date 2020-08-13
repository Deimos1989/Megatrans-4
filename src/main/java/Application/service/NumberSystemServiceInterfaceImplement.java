package Application.service;

import Application.Entity.NumberSystem;
import Application.repository.SystemNumberInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
@Transactional
public class NumberSystemServiceInterfaceImplement implements NumberSystemInterface {

    @Autowired
    SystemNumberInterfaceRepository numberInterfaceRepository;

    @Override
    public List<NumberSystem> findAll() {
        return this.numberInterfaceRepository.findAll();
    }

    @Override
    public List<NumberSystem> findByNumber(String number) {
        return this.numberInterfaceRepository.findByNumber(number);
    }

    @Override
    public void save(NumberSystem numberSystem) {
        this.numberInterfaceRepository.save(numberSystem);

    }

    @Override
    public void delete(NumberSystem numberSystem) {
        this.numberInterfaceRepository.delete(numberSystem);
    }

    @Override
    public void deleteAll(NumberSystem numberSystem) {
        this.numberInterfaceRepository.deleteAll();
    }
}
