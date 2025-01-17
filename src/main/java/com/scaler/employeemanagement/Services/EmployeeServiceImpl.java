package com.scaler.employeemanagement.Services;

import com.scaler.employeemanagement.Models.Employee;
import com.scaler.employeemanagement.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String createEmployee(Employee emp) {
        try {
            employeeRepository.save(emp);
            return "Employee created successfully";
        } catch (Exception e) {
            return "Failed to create employee: " + e.getMessage();
        }
    }

    @Override
    public List<Employee> readEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee getEmployeeById(Long id) {
        return employeeRepository.findById(id).orElse(null);    // return null if employee not found
    }

    @Override
    public String updateEmployee(Long id, Employee emp) {
        if(!employeeRepository.existsById(id)){
            return "Employee not found";
        }
        // set the id and save
        emp.setId(id);
        employeeRepository.save(emp);
        return "Employee Updated Successfully";
    }

    @Override
    public boolean deleteEmployee(Long id) {
        try {
            employeeRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
