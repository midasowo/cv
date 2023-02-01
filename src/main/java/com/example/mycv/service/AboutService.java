package com.example.mycv.service;

import com.example.mycv.model.About;
import com.example.mycv.repository.AboutRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AboutService {

    private final AboutRepository repo;

    public AboutService(AboutRepository repo) {
        this.repo = repo;
    }

    public void addAbout(About about) {
        repo.save(about);
    }

    public void saveEditAbout(About about) {
        repo.save(about);
    }

    public void removeAbout(Long id) {
        repo.deleteById(id);
    }

    public List<About> getAboutList() {
        return repo.findAll();
    }

    public About getAboutById(Long id) {
        Optional<About> about = repo.findById(id);
        if (about.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }

}
