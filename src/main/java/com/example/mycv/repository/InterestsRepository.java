package com.example.mycv.repository;

import com.example.mycv.model.Interests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterestsRepository extends JpaRepository<Interests, Long> {
}
