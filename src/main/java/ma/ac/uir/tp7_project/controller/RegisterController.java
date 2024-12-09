package ma.ac.uir.tp7_project.controller;

import ma.ac.uir.tp7_project.entity.Employee;
import ma.ac.uir.tp7_project.dao.EmployeeRepository;
import ma.ac.uir.tp7_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private EmployeeService employeeService;
    private EmployeeRepository employeeRepository;

    @GetMapping("/login")
    public String login(Model model) {
        return "loginPage2"; // This will resolve to src/main/resources/templates/loginPage2.html
    }

    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "registerPage"; // This will resolve to src/main/resources/templates/registerPage.html
    }

    @PostMapping("/employeeDashboard")
    public String registerUser(@ModelAttribute Employee employee, Model model) {
        employeeService.saveEmployee(employee);
        return "employeeDashboard";
    }
}