package Application.service;

import Application.Entity.ResultSurley;
import Application.repository.ResultSurleyInterfaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;


@Service
@Transactional
public class ResultSurleyServiceInterfaceImplement implements ResultSurleyInterface {

    @Autowired
    private ResultSurleyInterfaceRepository resultSurleyInterfaceRepository;


    @Override
    public List<ResultSurley> findAll(ResultSurley resultSurley) {
        return null;
    }

    @Override
    public List<ResultSurley> findByIp(String ip) {
        return this.resultSurleyInterfaceRepository.findByIp(ip);
    }

    public List<ResultSurley> findByLocalDateAndIpAndHash(LocalDate localDate,String ip,String hash) {
        return resultSurleyInterfaceRepository.findByLocalDateAndIpAndHash(localDate,ip,hash);
    }



    public List<ResultSurley> findByLocalDateAndNumberAndHash(LocalDate localDate,String number,String hash) {
        return resultSurleyInterfaceRepository.findByLocalDateAndNumberAndHash(localDate,number,hash);
    }



    @Override
    public List<ResultSurley> findByHash(String hash) {
        return this.resultSurleyInterfaceRepository.findByHash(hash);
    }

    @Override
    public List<ResultSurley> findByLocalDate(LocalDate localDate) {

        return this.resultSurleyInterfaceRepository.findByLocalDate(localDate);
    }

    @Override
    public List<ResultSurley> findByLocalDateTime(LocalDateTime localDateTime) {
        return this.resultSurleyInterfaceRepository.findByLocalDateTime(localDateTime);
    }


    @Override
    public void save(ResultSurley resultSurley) {
        this.resultSurleyInterfaceRepository.save(resultSurley);

    }

    @Override
    public void update(ResultSurley resultSurley) {

    }

    @Override
    public void deleteHash(String hash) {
        this.resultSurleyInterfaceRepository.deleteByHash(hash);

    }

    @Override
    public void delete(ResultSurley resultSurley) {

    }

    @Override
    public void deleteAll(ResultSurley resultSurley) {

    }
}
