package ma.ac.uir.tp7_project.dao;

import ma.ac.uir.tp7_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findBySkillsContaining(String skill);
    Employee findByEmailAndPassword(String email, String password);
}