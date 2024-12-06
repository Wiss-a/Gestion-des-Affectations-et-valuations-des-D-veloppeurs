package ma.ac.uir.tp7_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Form {
    @RequestMapping("/loadForm")
    public String loadForm() {
        return "formulaire";
    }
    @RequestMapping("/actionForm")
    public String actionForm() {
        return "resultForm";
    }
}
