package Application.service;

import Application.Entity.PeriodSurley;
import Application.repository.PeriodSurleyInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
@Transactional
public class PeriodSurleyServiceInterfaceImplement implements PeriodSurleyInterface {

    @Autowired
    PeriodSurleyInterfaceRepository periodSurleyInterfaceRepository;


    @Override
    public void save(PeriodSurley periodSurley) {
        this.periodSurleyInterfaceRepository.save(periodSurley);

    }

    @Override
    public void delete(PeriodSurley periodSurley) {
        this.periodSurleyInterfaceRepository.delete(periodSurley);
    }

    @Override
    public void deleteAll() {
        this.periodSurleyInterfaceRepository.deleteAll();

    }

    @Override
    public List<PeriodSurley> findAll() {
        return this.periodSurleyInterfaceRepository.findAll();
    }

    public Optional<PeriodSurley> findById(Long id) {
        return this.periodSurleyInterfaceRepository.findById(id);
    }

}

