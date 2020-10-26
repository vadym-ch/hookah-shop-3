package com.example.employeeservice.services;

import com.example.employeeservice.services.models.Employee;

public interface EmployeeService {

    Employee engageEmployee(String name, String surname);

    Employee getEmployeeById(String id);

    void deleteEmployeeById(String id);

    String employeeReview();

}
