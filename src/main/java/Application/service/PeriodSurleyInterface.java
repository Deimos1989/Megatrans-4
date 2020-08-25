package Application.service;

import Application.Entity.PeriodSurley;

import java.util.List;

public interface PeriodSurleyInterface {

    public void save(PeriodSurley periodSurley);
    public void delete(PeriodSurley periodSurley);
    public void deleteAll();

    public List<PeriodSurley> findAll();
   // public List<PeriodSurley> findById();
}
