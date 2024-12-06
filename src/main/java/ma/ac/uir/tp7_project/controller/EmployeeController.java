package ma.ac.uir.tp7_project.controller;

import ma.ac.uir.tp7_project.entity.Employee;
import ma.ac.uir.tp7_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class EmployeeController {
    private EmployeeService empServ;
    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.empServ = employeeService;
    }

    @RequestMapping("/loadForm")
    public String loadForm(Model leModel) {
        Employee theEmployee = new Employee();
        leModel.addAttribute("employee",theEmployee);
        return "formulaire";
    }
    @RequestMapping("/actionForm")
    public String actionForm(Model leModel) {
        List<Employee> employees = empServ.findAll();
        leModel.addAttribute("employees",employees);
        return "resultForm";
    }
}
