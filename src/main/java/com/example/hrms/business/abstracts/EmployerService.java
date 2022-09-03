package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Employer;

import java.util.List;

public interface EmployerService {
    Result register(Employer employer);
    List<Employer> getAll();
}
