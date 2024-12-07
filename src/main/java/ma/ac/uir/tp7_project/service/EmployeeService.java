package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.entity.Employee;
import java.util.List;

public interface EmployeeService {

    Employee createEmployee(Employee employee);

    Employee getEmployeeById(Long id);

    List<Employee> getAllEmployees();

    Employee updateEmployee(Long id, Employee employee);

    void deleteEmployee(Long id);

    List<Employee> findEmployeesBySkill(String skill);

    Employee authenticateEmployee(String email, String password);

    Employee updateEmployeeSkills(Long id, List<String> skills);

    Employee evaluateEmployee(Long id, float performanceRating, String feedback);
}