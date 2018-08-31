package ir.moke.spring.web.services;

import ir.moke.spring.web.model.Person;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {

    private final static List<Person> persons = new ArrayList<>();


    @PostConstruct
    public void init() {
        Person p1 = new Person();
        p1.setName("Mahdi");
        p1.setFamily("Sheikh Hosseini");
        Person p2 = new Person();
        p2.setName("Hossein");
        p2.setFamily("Jafari");
        persons.add(p1);
        persons.add(p2);
    }

    @Override
    public void insert(Person person) {
        persons.add(person);
    }

    @Override
    public void update(int index, Person person) {
        persons.set(index, person);
    }

    @Override
    public void delete(int id) {
        persons.remove(id);
    }

    @Override
    public Person select(int id) {
        return persons.get(id);
    }

    @Override
    public List<Person> select() {
        return persons;
    }
}
