package ir.moke.spring.api;

import ir.moke.spring.model.Person;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SimpleRestApi {

    @GetMapping("/hello")
    public ResponseEntity<?> sayHello() {
        return ResponseEntity.ok(" Hello dear !");
    }

    @GetMapping("/getPerson")
    public ResponseEntity<Person> getPerson() {
        Person person = new Person("Mahdi", "Sheikh Hosseini");
        return ResponseEntity.ok(person);
    }

    @GetMapping("/getAllPersons")
    public ResponseEntity<List<Person>> getAllPersons() {
        List<Person> list = new ArrayList<>();
        Person p1 = new Person("Sina", "Mohammadi");
        Person p2 = new Person("Mahdi", "Sheikh Hosseini");
        list.add(p1);
        list.add(p2);
        return ResponseEntity.ok(list);
    }
}
