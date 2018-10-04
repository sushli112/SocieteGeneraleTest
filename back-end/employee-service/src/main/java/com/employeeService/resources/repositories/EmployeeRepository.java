package com.employeeService.resources.repositories;

import com.employeeService.resources.model.Employee;
import org.bson.types.ObjectId;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, ObjectId> {
}
