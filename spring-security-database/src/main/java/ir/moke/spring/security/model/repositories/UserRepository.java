package ir.moke.spring.security.model.repositories;

import ir.moke.spring.security.model.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
