package ir.moke.spring.web.controller;

import ir.moke.spring.web.model.Person;
import ir.moke.spring.web.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@Controller
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping({"/", ""})
    public String getIndex(Model model) {
        model.addAttribute("persons", personService.select());
        return "index";
    }

    @GetMapping("/getRegister")
    public String getRegisterPerson() {
        return "save";
    }

    @PostMapping("/postRegister")
    public String postRegisterPerson(@ModelAttribute Person person) {
        personService.insert(person);
        return "redirect:/";
    }


    @GetMapping("/getPerson")
    public String getPerson(@PathParam("id") int id, Model model) {
        Person person = personService.select(id);
        model.addAttribute("person", person);
        model.addAttribute("id", id);
        return "update";
    }

    @PostMapping("/postUpdate")
    public String postUpdate(@PathParam("id") int id, @ModelAttribute Person person) {
        personService.update(id, person);
        return "redirect:/";
    }

    @GetMapping("/getDelete")
    public String getDelete(@PathParam("id") int id) {
        personService.delete(id);
        return "redirect:/";
    }
}
