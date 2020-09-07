package Application.service;

import Application.Entity.Guide;
import Application.repository.GuideInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GuideServiceInterfaceImplement implements GuideInterface {

    @Autowired
    GuideInterfaceRepository guideInterfaceRepository;


    @Override
    public List<Guide> findAll() {
        return guideInterfaceRepository.findAll();
    }

    @Override
    public List<Guide> findByName(String name) {
        return guideInterfaceRepository.findByName(name);
    }

    public void save(Guide guide){
        this.guideInterfaceRepository.save(guide);
    }

}
