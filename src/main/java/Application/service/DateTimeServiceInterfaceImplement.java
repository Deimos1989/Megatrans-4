package Application.service;

import Application.Entity.DateTime;
import Application.repository.DateTimeInterfaceRepository;
import org.apache.tomcat.jni.Local;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;


@Service
@Transactional
public class DateTimeServiceInterfaceImplement implements DateTimeInterface {

    @Autowired
    private DateTimeInterfaceRepository dateTimeInterfaceRepository;

    @Override
    public List<DateTime> findAll() {
        return dateTimeInterfaceRepository.findAll();
    }

    @Override
    public List<DateTime> findByLocalDate(LocalDate localDate) {

        return this.dateTimeInterfaceRepository.findByLocalDate(localDate);
    }


    @Override
    public void save(DateTime dateTime) {
        this.dateTimeInterfaceRepository.save(dateTime);
    }

    @Override
    public void update(DateTime dateTime) {

    }

    @Override
    public void delete(DateTime dateTime) {

    }

    @Override
    public void deleteAll(DateTime dateTime) {

    }
}
