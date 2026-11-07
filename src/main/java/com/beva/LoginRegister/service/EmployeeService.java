package com.beva.LoginRegister.service;

import com.beva.LoginRegister.DTO.EmployeeDTO;
import org.springframework.stereotype.Service;


public interface EmployeeService {


    String addEmployee(EmployeeDTO employeeDTO);
}
