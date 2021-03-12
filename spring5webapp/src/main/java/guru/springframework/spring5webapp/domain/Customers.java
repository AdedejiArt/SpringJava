package guru.springframework.spring5webapp.domain;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
@Entity
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String ID;
    private String lastname;
    private String Firstname;
    @ManyToMany(mappedBy = "customers")
    private Set<Lands> lands=new HashSet<>();
    @ManyToMany(mappedBy = "customers")
    private Set<Houses>houses=new HashSet<>();




 ;





    public Customers (String ID,String lastname,String Firstname){
        this.ID=ID;
        this.lastname=lastname;
        this.Firstname=Firstname;


    }

    public String getFirstname() {
        return Firstname;
    }

    public Long getId() {
        return id;
    }

    public Set<Lands> getLands() {
        return lands;
    }

    public Set<Houses> getHouses() {
        return houses;
    }

    public String getID() {
        return ID;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setLands(Set<Lands> lands) {
        this.lands = lands;

    }

    public void setHouses(Set<Houses> houses) {
        this.houses = houses;
    }

    @Override
    public String toString() {
        return "Customers{" +
                "id=" + id +
                ", ID='" + ID + '\'' +
                ", lastname='" + lastname + '\'' +
                ", Firstname='" + Firstname + '\'' +
                ", lands=" + lands +
                ", houses" + houses +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customers customers = (Customers) o;

        return id != null ? id.equals(customers.id) : customers.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }
}
