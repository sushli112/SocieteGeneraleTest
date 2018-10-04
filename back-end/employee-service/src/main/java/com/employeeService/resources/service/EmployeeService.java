package com.employeeService.resources.service;

import com.employeeService.resources.model.Employee;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployees();
    public void saveEmployee(Employee employee);
}
