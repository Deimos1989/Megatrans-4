package Application.service;

import Application.Entity.PathConfiguration;

import java.util.List;

public interface PathConfigurationInterface {

    public void save(PathConfiguration pathConfiguration);
    public void delete(PathConfiguration pathConfiguration);
    public void deleteAll(PathConfiguration pathConfiguration);

    public List<PathConfiguration> findAll(PathConfiguration pathConfiguration);

}
