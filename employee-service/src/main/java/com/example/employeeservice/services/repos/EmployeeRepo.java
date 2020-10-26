package com.example.employeeservice.services.repos;

import com.example.employeeservice.services.models.Employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee, String> {
}
