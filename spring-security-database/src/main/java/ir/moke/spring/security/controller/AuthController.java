package ir.moke.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AuthController {

    @RequestMapping({"/login","","/"})
    public String getLogin() {
        return "index";
    }
}
