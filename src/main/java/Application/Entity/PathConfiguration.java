package Application.Entity;

import javax.persistence.*;


@Entity
@Table(name="surley_configuration")
public class PathConfiguration {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "path_server_directory")
    private String pathServerDirectory;

    @Column(name = "path_client_directory")
    private String pathClientDirectory;




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPathServerDirectory() {
        return pathServerDirectory;
    }

    public void setPathServerDirectory(String pathServerDirectory) {
        this.pathServerDirectory = pathServerDirectory;
    }

    public String getPathClientDirectory() {
        return pathClientDirectory;
    }

    public void setPathClientDirectory(String pathClientDirectory) {
        this.pathClientDirectory = pathClientDirectory;
    }


}
