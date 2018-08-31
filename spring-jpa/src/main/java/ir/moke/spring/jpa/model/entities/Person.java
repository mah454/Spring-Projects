package ir.moke.spring.jpa.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "PERSONS")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "PERSONS_SEQ")
    @SequenceGenerator(name = "PERSONS_SEQ",sequenceName = "DEFAULT_SEQ")
    private long id ;

    @Basic
    @Column(name = "name",columnDefinition = "NVARCHAR2(32)")
    private String name ;

    @Basic
    @Column(name = "family",columnDefinition = "NVARCHAR2(32)")
    private String family ;

    public Person(String name, String family) {
        this.name = name;
        this.family = family;
    }

    public Person() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", family='" + family + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id &&
                Objects.equals(name, person.name) &&
                Objects.equals(family, person.family);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, family);
    }
}
