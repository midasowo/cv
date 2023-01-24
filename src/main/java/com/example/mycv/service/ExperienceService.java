package com.example.mycv.service;

import com.example.mycv.model.Experience;
import com.example.mycv.repository.ExperienceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExperienceService {

    private final ExperienceRepository repo;

    public ExperienceService(ExperienceRepository repo) {
        this.repo = repo;
    }

    public void addExperience(Experience experience) {
        repo.save(experience);
    }

    public void editExperience(Experience experience) {
        repo.save(experience);
    }

    public void removeExperience(Long id) {
        repo.deleteById(id);
    }

    public List<Experience> getExperienceList() {
        return repo.findAll();
    }
}
