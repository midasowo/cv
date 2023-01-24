package com.example.mycv.repository;

import com.example.mycv.model.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillReposiotry extends JpaRepository<Skill, Long> {
}
