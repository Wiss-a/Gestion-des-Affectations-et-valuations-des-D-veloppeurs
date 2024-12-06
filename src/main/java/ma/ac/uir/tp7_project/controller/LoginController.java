package ma.ac.uir.tp7_project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

    @GetMapping("/")
    public String home(Model model) {
        return "loginPage"; // This will resolve to src/main/resources/templates/home.html
    }
}