package com.example.mycv.service;

import com.example.mycv.repository.EducationRepository;
import org.springframework.stereotype.Service;

@Service
public class EducationService {

    private final EducationRepository repo;

    public EducationService(EducationRepository repo) {
        this.repo = repo;
    }
}
