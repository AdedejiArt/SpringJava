package guru.springframework.spring5webapp.domain;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Lands {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String ID;
    private String Location;
    private String Name;
    @ManyToMany
    @JoinTable(name="Customers_lands")  @JoinColumn(name ="Lands_id" )
    @JoinColumn(name="customers_id")

    private Set<Customers>customers=new HashSet<>();
    @ManyToMany
    @JoinTable(name="agents_lands") @JoinColumn(name="lands_id")
    @JoinColumn(name="agents-id")
    private Set<Agents>agents=new HashSet<>();








    public Lands(String ID,String Location,String Name){
        this.ID=ID;
        this.Location=Location;
        this.Name=Name;


    }

    public void setName(String name) {
        Name = name;
    }

    public void setLocation(String location) {
        Location = location;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Long getId() {
        return Id;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public String getLocation() {
        return Location;
    }

    @Override
    public String toString() {
        return "Lands{" +
                "Id=" + Id +
                ", ID='" + ID + '\'' +
                ", Location='" + Location + '\'' +
                ", Name='" + Name + '\'' +
                ", customers=" + customers +
                ", agents=" + agents +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Lands lands = (Lands) o;

        return Id != null ? Id.equals(lands.Id) : lands.Id == null;
    }

    @Override
    public int hashCode() {
        return Id != null ? Id.hashCode() : 0;
    }
}
