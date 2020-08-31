package Application.service;

import Application.Entity.SystemGroup;

import java.util.List;

public interface SystemGroupInterface {


    List<SystemGroup> findAll();
    List<SystemGroup> findByName(String description);
    void save(SystemGroup systemGroup);
    void delete(SystemGroup systemGroup);
    void deleteAll(SystemGroup systemGroup);
}
