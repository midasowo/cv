package com.example.mycv.service;

import com.example.mycv.model.About;
import com.example.mycv.model.Interest;
import com.example.mycv.repository.InterestRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InterestService {

    private final InterestRepository repo;

    public InterestService(InterestRepository repo) {
        this.repo = repo;
    }

    public void addInterest(Interest interest) {
        repo.save(interest);
    }

    public void saveEditInterest(Interest interest) {
        repo.save(interest);
    }

    public void removeInterest(Long id) {
        repo.deleteById(id);
    }

    public List<Interest> getInterestList() {
        return repo.findAll();
    }

    public Interest getInterestById(Long id) {
        Optional<Interest> interest = repo.findById(id);
        if (interest.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }
}
