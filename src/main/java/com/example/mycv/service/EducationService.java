package com.example.mycv.service;

import com.example.mycv.model.Education;
import com.example.mycv.repository.EducationRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EducationService {

    private final EducationRepository repo;

    public EducationService(EducationRepository repo) {
        this.repo = repo;
    }

    public void addEducation(Education education) {
        repo.save(education);
    }

    public void saveEditEducation(Education education) {
        repo.save(education);
    }

    public void removeEducation(Long id) {
        repo.deleteById(id);
    }

    public List<Education> getEducationList() {
        return repo.findAll();
    }

    public Education getEducationById(Long id) {
        Optional<Education> education = repo.findById(id);
        if (education.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }
}
