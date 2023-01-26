package com.example.mycv.service;

import com.example.mycv.model.Skill;
import com.example.mycv.repository.SkillRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SkillService {

    private final SkillRepository repo;

    public SkillService(SkillRepository repo) {
        this.repo = repo;
    }

    public void addSkill(Skill skill) {
        repo.save(skill);
    }

    public void saveEditSkill(Skill skill) {
        repo.save(skill);
    }

    public void removeSkill(Long id) {
        repo.deleteById(id);
    }

    public List<Skill> getSkillList() {
        return repo.findAll();
    }

    public Skill getSkillById(Long id) {
        Optional<Skill> skill = repo.findById(id);
        if (skill.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }
}
