package ir.moke.spring.jpa.model.services;

import ir.moke.spring.jpa.model.entities.Person;
import ir.moke.spring.jpa.model.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public void save(Person person) {
        repository.save(person);
    }

    public void update(Person person) {
        repository.save(person);
    }

    public void remove(long id) {
        repository.deleteById(id);
    }

    public void remove(Person person) {
        repository.delete(person);
    }

    public Optional<Person> find(long id) {
        return repository.findById(id);
    }

    public List<Person> find() {
        return repository.findAll();
    }
}
