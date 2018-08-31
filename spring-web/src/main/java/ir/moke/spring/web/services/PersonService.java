package ir.moke.spring.web.services;

import ir.moke.spring.web.model.Person;

import java.util.List;

public interface PersonService {
    void insert(Person person);

    void update(int index, Person person);

    void delete(int id);

    Person select(int id);

    List<Person> select();
}
