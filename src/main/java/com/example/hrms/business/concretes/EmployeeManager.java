package com.example.hrms.business.concretes;

import com.example.hrms.business.abstracts.EmployeeService;
import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.dataAccess.abstracts.EmployeeDao;
import com.example.hrms.entities.concretes.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeManager implements EmployeeService {
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeManager(EmployeeDao employeeDao){
        this.employeeDao=employeeDao;
    }


    @Override
    public Result register(Employee employee) {
        return null;
    }

    @Override
    public List<Employee> getAll() {
        return this.employeeDao.findAll();
    }
}
