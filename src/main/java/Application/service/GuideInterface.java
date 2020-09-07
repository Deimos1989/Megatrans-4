package Application.service;

import Application.Entity.Guide;

import java.util.List;

public interface GuideInterface {

    public List<Guide> findAll();

    List<Guide> findByName(String name);


}
