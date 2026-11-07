package com.beva.LoginRegister.service.impm;

import com.beva.LoginRegister.DTO.EmployeeDTO;
import com.beva.LoginRegister.Entity.Employee;
import com.beva.LoginRegister.Repo.EmployeeRepo;
import com.beva.LoginRegister.service.EmployeeService;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class EmployeeIMPL implements EmployeeService {

    private final EmployeeRepo employeeRepo;
    private final PasswordEncoder passwordEncoder;

    public EmployeeIMPL(
            EmployeeRepo employeeRepo,
            PasswordEncoder passwordEncoder) {

        this.employeeRepo = employeeRepo;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public String addEmployee(EmployeeDTO employeeDTO) {

        Employee employee = new Employee(
                employeeDTO.getId(),
                employeeDTO.getName(),
                employeeDTO.getEmail(),
                passwordEncoder.encode(employeeDTO.getPassword())
        );

        employeeRepo.save(employee);

        return employee.getName();
    }
}