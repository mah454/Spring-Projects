package ir.moke.spring.security.model.services;

import ir.moke.spring.security.model.entities.User;
import ir.moke.spring.security.model.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class UserService implements UserDetailsService {

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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repo.findByUsername(username);
    }
}
