package ir.moke.spring.jpa.model.repositories;

import ir.moke.spring.jpa.model.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
