package ma.ac.uir.tp7_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(Model model) {
        return "test"; // This will resolve to src/main/resources/templates/loginPage.html
    }

    @GetMapping("/register")
    public String register(Model model) {
        return "registerPage"; // This will resolve to src/main/resources/templates/loginPage.html
    }
}