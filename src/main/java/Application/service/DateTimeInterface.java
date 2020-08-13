package Application.service;

import Application.Entity.DateTime;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public interface DateTimeInterface {

    List<DateTime> findAll();
    List<DateTime>findByLocalDate(LocalDate localDate);

    void save(DateTime dateTime);
    void update(DateTime dateTime);
    void delete(DateTime dateTime);
    void deleteAll(DateTime dateTime);


}
