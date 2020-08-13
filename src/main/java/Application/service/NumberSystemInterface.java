package Application.service;

import Application.Entity.NumberSystem;

import java.util.List;

public interface NumberSystemInterface {


    List<NumberSystem> findAll();
    List<NumberSystem> findByNumber(String number);
    void save(NumberSystem numberSystem);
    void delete(NumberSystem numberSystem);
    void deleteAll(NumberSystem numberSystem);
}
