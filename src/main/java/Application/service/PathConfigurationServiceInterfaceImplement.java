package Application.service;

import Application.Entity.PathConfiguration;
import Application.repository.PathConfigurationInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PathConfigurationServiceInterfaceImplement implements PathConfigurationInterface {

    @Autowired
    PathConfigurationInterfaceRepository pathConfigurationInterfaceRepository;



    public Optional<PathConfiguration> findById(Long id) {
        return this.pathConfigurationInterfaceRepository.findById(id);
    }

    @Override
    public void save(PathConfiguration pathConfiguration) {
        this.pathConfigurationInterfaceRepository.save(pathConfiguration);
    }

    @Override
    public void delete(PathConfiguration pathConfiguration) {
this.pathConfigurationInterfaceRepository.delete(pathConfiguration);
    }

    @Override
    public void deleteAll(PathConfiguration pathConfiguration) {
        this.pathConfigurationInterfaceRepository.deleteAll();

    }

    @Override
    public List<PathConfiguration> findAll(PathConfiguration pathConfiguration) {
        return  this.pathConfigurationInterfaceRepository.findAll();
    }
}
