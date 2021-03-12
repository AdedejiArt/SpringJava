package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity

public class Houses {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ID;
    private String Location;
    private String Name;
    @ManyToMany
    @JoinTable(name="Customers_Houses")  @JoinColumn(name ="Houses_id" )
    @JoinColumn(name="customers_id")
    private Set<Customers>customers=new HashSet<>();



    public Houses(String ID,String Location,String Name){
        this.ID=ID;
        this.Location=Location;
        this.Name=Name;
    }

    public String getLocation() {
        return Location;
    }

    public String getName() {
        return Name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Houses{" +
                "id=" + id +
                ", ID='" + ID + '\'' +
                ", Location='" + Location + '\'' +
                ", Name='" + Name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Houses houses = (Houses) o;

        return id != null ? id.equals(houses.id) : houses.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
