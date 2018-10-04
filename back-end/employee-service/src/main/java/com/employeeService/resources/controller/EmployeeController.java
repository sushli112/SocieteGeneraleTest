package com.employeeService.resources.controller;

import com.employeeService.resources.model.Employee;
import com.employeeService.resources.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RequestMapping("rest/employee")

public class EmployeeController {

    private EmployeeService employeeService;

    @Autowired
    public void setEmployeeService(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        List<Employee> employeeList = employeeService.getAllEmployees();
        System.out.println("getAllEmployees:"+employeeList);
        return employeeList;
    }
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody Employee employee){
       System.out.println(employee.getFirstName());
        System.out.println("inside register method");
        employeeService.saveEmployee(employee);
        return new ResponseEntity<>(null,HttpStatus.OK);

    }
}
