package com.example.registration;
import com.example.registration.model.Employee;
import java.util.List;

public interface EmployeeService {
    public Employee save(Employee employee);
    public List<Employee> getList();

}

