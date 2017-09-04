package com.example.registration;
import com.example.registration.model.Employee;
import com.example.registration.repository.EmployeeRepository;
import java.util.List;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Service
@Validated
public class EmployeeServiceImpl implements EmployeeService {

     private static  Logger LOGGER = LoggerFactory.getLogger(EmployeeServiceImpl.class);
    @Autowired
    private EmployeeRepository employeerepository;

    

    @Transactional
    public Employee save(@NotNull @Valid  Employee employee) {
        LOGGER.debug("Creating {}", employee);
        return employeerepository.save(employee);
    } 

    @Transactional(readOnly = true)
    public List<Employee> getList() {
        LOGGER.debug("Retrieving the list of all users");
        return employeerepository.findAll();
    }

}