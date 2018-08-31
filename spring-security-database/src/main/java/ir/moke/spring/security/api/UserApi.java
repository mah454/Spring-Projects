package ir.moke.spring.security.api;

import ir.moke.spring.security.model.entities.User;
import ir.moke.spring.security.model.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.annotation.security.RolesAllowed;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/user")
public class UserApi {

    @Autowired
    private UserService userService;

    @GetMapping("/test")
    @RolesAllowed("admin")
    public String testApi(@AuthenticationPrincipal UserDetails userDetails) {
        List<String> roles = userDetails.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList());
        return "Account Roles : " + roles;
    }

    @PostMapping("/add")
    @RolesAllowed("admin")
    public ResponseEntity<?> postSaveUser(@RequestBody User user) {
        userService.save(user);
        return ResponseEntity.ok("Success");
    }

    @GetMapping("/{id}")
    @RolesAllowed({"admin", "user"})
    public ResponseEntity<User> getUser(@PathVariable("id") long id) {
        return ResponseEntity.ok(userService.find(id));
    }

    @GetMapping("/all")
    @RolesAllowed("admin")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.findAll());
    }
}