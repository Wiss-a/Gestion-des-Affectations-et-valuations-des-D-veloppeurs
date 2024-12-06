package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.entity.Employee;
import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    Employee update(Employee theEmployee);
    void deleteById(int theId);

}
