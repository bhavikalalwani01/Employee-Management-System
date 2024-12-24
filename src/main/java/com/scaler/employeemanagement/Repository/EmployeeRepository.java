package com.scaler.employeemanagement.Repository;

import com.scaler.employeemanagement.Entity.EmployeeEntity;
import com.scaler.employeemanagement.Models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}

