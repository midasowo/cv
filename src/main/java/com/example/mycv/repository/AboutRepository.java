package com.example.mycv.repository;

import com.example.mycv.model.About;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AboutRepository extends JpaRepository<About, Long> {
}
