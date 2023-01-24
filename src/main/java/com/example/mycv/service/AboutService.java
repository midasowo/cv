package com.example.mycv.service;

import com.example.mycv.model.About;
import com.example.mycv.repository.AboutRepository;
import org.springframework.stereotype.Service;

@Service
public class AboutService {

    private final AboutRepository repo;

    public AboutService(AboutRepository repo) {
        this.repo = repo;
    }

    public void addAbout(About about) {
        repo.save(about);
    }

    public void editAbout(About about) {
        repo.save(about);
    }

    public void removeAbout(Long id) {
        repo.deleteById(id);
    }

}
