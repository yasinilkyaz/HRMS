package com.example.hrms.business.abstracts;

import com.example.hrms.core.utilities.results.Result;
import com.example.hrms.entities.concretes.Candidate;

import java.util.List;

public interface CandidateService {
    Result register(Candidate candidate);
    List<Candidate> getAll();

}
