package com.example.mycv.service;

import com.example.mycv.model.Skill;
import com.example.mycv.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillRepository repo;

    public SkillService(SkillRepository repo) {
        this.repo = repo;
    }

    public void addSkill(Skill skill) {
        repo.save(skill);
    }

    public void editSkill(Skill skill) {
        repo.save(skill);
    }

    public void removeSkill(Long id) {
        repo.deleteById(id);
    }

    public List<Skill> getSkillList() {
        return repo.findAll();
    }
}
