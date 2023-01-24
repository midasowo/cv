package com.example.mycv.repository;

import com.example.mycv.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsReposiotry extends JpaRepository<Skills, Long> {
}
