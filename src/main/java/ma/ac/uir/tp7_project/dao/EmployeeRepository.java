package ma.ac.uir.tp7_project.dao;

import ma.ac.uir.tp7_project.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
