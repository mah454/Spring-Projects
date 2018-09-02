package ir.moke.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PanelController {

    @RequestMapping(value = "/panel/dashboard")
    public String geDashboard() {
        return "panel/dashboard";
    }
}
