package ls.soccertabs.League;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class League {
    @Id
    private String id;
    private String name;
    private String country;

    public League(){

    }

    public League(String id, String name, String country){
        super();
        this.id = id;
        this.name = name;
        this.country = country;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
