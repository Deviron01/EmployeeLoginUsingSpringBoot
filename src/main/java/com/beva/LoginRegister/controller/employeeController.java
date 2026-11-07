package com.beva.LoginRegister.controller;


import com.beva.LoginRegister.DTO.EmployeeDTO;
import com.beva.LoginRegister.Entity.Employee;
import com.beva.LoginRegister.Repo.EmployeeRepo;
import com.beva.LoginRegister.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("employee")
public class employeeController {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    EmployeeRepo employeeRepo;

    @PostMapping("save")
    public String saveEmployee(@RequestBody EmployeeDTO employeeDTO){
        String Id = employeeService.addEmployee(employeeDTO);
        return Id;
    }
    // GET: Retrieve all employees
    @GetMapping("getAllEmployees")
    public List<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }
}
