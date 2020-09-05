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

}
