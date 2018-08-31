package ir.moke.spring.security.model.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "ROLES")
@SequenceGenerator(name = "DEFAULT_SEQ", sequenceName = "ROLES_SEQ", allocationSize = 1)
public class Role extends BaseEntity {
    @Basic
    @Column(name = "name", columnDefinition = "VARCHAR2(32)")
    private String name;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Role{" +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Role role = (Role) o;
        return Objects.equals(name, role.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
