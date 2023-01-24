package com.example.mycv.service;

import com.example.mycv.model.Interest;
import com.example.mycv.model.Skill;
import com.example.mycv.repository.SkillReposiotry;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillService {

    private final SkillReposiotry repo;

    public SkillService(SkillReposiotry repo) {
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
