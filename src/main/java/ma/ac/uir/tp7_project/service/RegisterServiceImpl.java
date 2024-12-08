package ma.ac.uir.tp7_project.service;

import ma.ac.uir.tp7_project.dao.EmployeeRepository;
import ma.ac.uir.tp7_project.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Service
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private EmployeeRepository userRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void SaveUser(Employee employee) {
        employee.setPassword(bCryptPasswordEncoder.encode(employee.getPassword()));
        userRepository.save(employee);
    }

}
