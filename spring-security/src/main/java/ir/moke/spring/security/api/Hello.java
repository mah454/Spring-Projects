package ir.moke.spring.security.api;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.RolesAllowed;

@RestController
@RequestMapping("/api")
public class Hello {

    @GetMapping("/user")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String getUser() {
        return "User Access : Hello World !";
    }


    @GetMapping("/admin")
    @RolesAllowed("ROLE_ADMIN")
    public String getAdmin() {
        return "Admin Access : Hello World !";
    }


}
