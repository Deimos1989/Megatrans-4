package Application.repository;

import Application.Entity.ResultSurley;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

public interface ResultSurleyInterfaceRepository extends JpaRepository<ResultSurley, Long> {

    List<ResultSurley> findByHash(String hash);

    void deleteByHash(String hash);

    List<ResultSurley> findByLocalDate(LocalDate localDate);

    List<ResultSurley> findByLocalDateTime(LocalDateTime localDateTime);

    List<ResultSurley> findByLocalDateAndIpAndHash(LocalDate localDate, String ip,String hash);

    List<ResultSurley> findByLocalDateAndNumberAndHash(LocalDate localDate, String number,String hash);

    List<ResultSurley> findTop50ByOrderByIdDesc();

    List<ResultSurley> findByLocalDateAndIp(LocalDate localDate, String ip);



    @Query("select rs FROM  ResultSurley rs where rs.ip = ?1 and rs.localDate BETWEEN ?2 and ?3")
    List<ResultSurley> getAllOfCurrentMonth(String ip, LocalDate localDate1,LocalDate localDate2);
}

