package com.example.registration.controller;
import com.example.registration.model.Employee;
import com.example.registration.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.http.HttpStatus;
import org.hibernate.sql.Delete;

@Controller
@RequestMapping(value = { "/employee1" })
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;
 
    @RequestMapping(value = { "all" })
    public String index(Model model) {
        System.out.println(employeeRepository.findAll());
        model.addAttribute("employees", employeeRepository.findAll());
        return "employee/index";
    }

    @RequestMapping(value = "create")
    public String create() {
        return "employee/create";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public String save(Employee employee) {
  
        employeeRepository.save(employee);
        if (employee.getId() == 0) {
            this.employeeRepository.save(employee);
        } else {
        }

        return "redirect:all";
    }
    //  @RequestMapping(value = "save", method = RequestMethod.POST)
    // public String save(Employee employee) {
    //     employeeRepository.save(employee);
    //     if (employee.getId() == 0) {
    //         this.employeeRepository.save(employee);
    //     } else {
    //     }

    //     return "redirect:all";
    // }
 
    
}
   
  


