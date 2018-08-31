package ir.moke.spring.security.model.services;

import ir.moke.spring.security.model.entities.User;
import ir.moke.spring.security.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public void save(User user) {
        repo.save(user);
    }

    public void update(User user) {
        repo.save(user);
    }

    public void delete(User user) {
        repo.delete(user);
    }

    public User find(long id) {
        return repo.findById(id).orElseThrow(EntityNotFoundException::new);
    }

    public List<User> findAll() {
        return repo.findAll();
    }
}
