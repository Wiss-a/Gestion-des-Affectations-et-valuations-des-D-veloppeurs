package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.entity.Employee;
import ma.ac.uir.tp7_project.dao.EmployeeRepository;
import ma.ac.uir.tp7_project.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    public Employee getEmployeeById(Long id) {
        Optional<Employee> employee = employeeRepository.findById(id);
        return employee.orElse(null);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee updateEmployee(Long id, Employee employee) {
        if (employeeRepository.existsById(id)) {
            employee.setId(id);
            return employeeRepository.save(employee);
        }
        return null;
    }

    @Override
    public void deleteEmployee(Long id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public List<Employee> findEmployeesBySkill(String skill) {
        return employeeRepository.findBySkillsContaining(skill);
    }

    @Override
    public Employee authenticateEmployee(String email, String password) {
        return employeeRepository.findByEmailAndPassword(email, password);
    }

    @Override
    public Employee updateEmployeeSkills(Long id, List<String> skills) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            Employee emp = employee.get();
            emp.setSkills(skills);
            return employeeRepository.save(emp);
        }
        return null;
    }

    @Override
    public Employee evaluateEmployee(Long id, float performanceRating, String feedback) {
        Optional<Employee> employee = employeeRepository.findById(id);
        if (employee.isPresent()) {
            Employee emp = employee.get();
            emp.setPerformanceRating(performanceRating);
            emp.setFeedback(feedback);
            return employeeRepository.save(emp);
        }
        return null;
    }
}