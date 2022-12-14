package com.example.hrms.api.controllers;

import com.example.hrms.business.abstracts.CandidateService;
import com.example.hrms.entities.concretes.Candidate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/candidates")
public class CandidatesController {

    private CandidateService candidateService;

    public CandidatesController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @GetMapping("/getall")
    public List<Candidate> getall() {
        return this.candidateService.getAll();
    }
}
