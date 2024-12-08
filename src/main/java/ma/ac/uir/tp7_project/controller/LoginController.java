package ma.ac.uir.tp7_project.controller;

import ma.ac.uir.tp7_project.entity.Employee;
import ma.ac.uir.tp7_project.dao.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/login")
    public String login(Model model) {
        return "loginPage2"; // This will resolve to src/main/resources/templates/loginPage2.html
    }

    @GetMapping("/register")
    public String register(Model model) {
        model.addAttribute("employee", new Employee());
        return "registerPage"; // This will resolve to src/main/resources/templates/registerPage.html
    }

    @GetMapping("/edashboard")
    public String edashboard(Model model) {
        return "employeeDashboard"; // This will resolve to src/main/resources/templates/employeeDashboard.html
    }

    @PostMapping("/register")
    public String registerUser(
            @RequestParam("email") String email,
            @RequestParam("password") String password,
            @RequestParam("role") String role,
            Model model) {

        Employee employee = new Employee();
        employee.setEmail(email);
        employee.setPassword(password);
        employee.setRole(role);
        employeeRepository.save(employee);

        return "employeeDashboard"; // This will resolve to src/main/resources/templates/employeeDashboard.html
    }
}