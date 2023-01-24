package com.example.mycv.service;

import com.example.mycv.model.About;
import com.example.mycv.model.Education;
import com.example.mycv.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EducationService {

    private final EducationRepository repo;

    public EducationService(EducationRepository repo) {
        this.repo = repo;
    }

    public void addEducation(Education education) {
        repo.save(education);
    }

    public void editEducation(Education education) {
        repo.save(education);
    }

    public void removeEducation(Long id) {
        repo.deleteById(id);
    }

    public List<Education> getEducationList() {
        return repo.findAll();
    }
}
