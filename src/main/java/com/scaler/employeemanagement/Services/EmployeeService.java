package com.scaler.employeemanagement.Services;

import com.scaler.employeemanagement.Models.Employee;

import java.util.List;

public interface EmployeeService {
    String createEmployee(Employee emp);
    List<Employee> readEmployees();
    Employee getEmployeeById(Long id);

    String updateEmployee(Long id, Employee emp);
    boolean deleteEmployee(Long id);
}
