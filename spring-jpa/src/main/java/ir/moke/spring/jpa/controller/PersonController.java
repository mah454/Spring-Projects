package ir.moke.spring.jpa.controller;

import ir.moke.spring.jpa.model.entities.Person;
import ir.moke.spring.jpa.model.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.persistence.EntityNotFoundException;
import javax.websocket.server.PathParam;
import java.util.Optional;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping({"/", ""})
    public String getIndex(Model model) {
        model.addAttribute("persons", personService.find());
        return "index";
    }

    @GetMapping("/getRegister")
    public String getRegister() {
        return "register";
    }

    @GetMapping("/getDelete")
    public String getDelete(@PathParam("id") long id) {
        personService.remove(id);
        return "redirect:/";
    }

    @PostMapping("/postRegister")
    public String postRegister(@ModelAttribute Person person) {
        personService.save(person);
        return "redirect:/";
    }

    @GetMapping("/getPerson")
    public String getPerson(@PathParam("id") long id, Model model) {
        Person person = personService.find(id);
        model.addAttribute("person", person);
        return "update";
    }

    @PostMapping("/postUpdate")
    public String postUpdate(@ModelAttribute Person person) {
        personService.update(person);
        return "redirect:/";
    }
}
