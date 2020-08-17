package Application.service;

import Application.Entity.ResultSurley;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ResultSurleyInterface {

    List<ResultSurley> findAll(ResultSurley resultSurley);
    List<ResultSurley> findByIp(String ip);
    List<ResultSurley> findByHash(String hash);
    List<ResultSurley> findByLocalDate(LocalDate localDate);
    List<ResultSurley> findByLocalDateTime(LocalDateTime localDateTime);

    void save(ResultSurley resultSurley);
    void update(ResultSurley resultSurley);
    void deleteHash(String hash);
    void delete(ResultSurley resultSurley);
    void deleteAll(ResultSurley resultSurley);
}
