package com.example.mycv.service;

import com.example.mycv.model.Interest;
import com.example.mycv.repository.InterestRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InterestService {

    private final InterestRepository repo;

    public InterestService(InterestRepository repo) {
        this.repo = repo;
    }

    public void addInterest(Interest interest) {
        repo.save(interest);
    }

    public void editInterest(Interest interest) {
        repo.save(interest);
    }

    public void removeInterest(Long id) {
        repo.deleteById(id);
    }

    public List<Interest> getInterestList() {
        return repo.findAll();
    }
}
