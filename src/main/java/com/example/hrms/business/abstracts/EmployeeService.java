package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employee;

import java.util.List;

public interface EmployeeService {
    Result register(Employee employee);
    List<Employee> getAll();
}
