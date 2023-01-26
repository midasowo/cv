package com.example.mycv.controller;

import com.example.mycv.model.Experience;
import com.example.mycv.service.ExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ExperienceController {

    private final ExperienceService service;

    public ExperienceController(ExperienceService service) {
        this.service = service;
    }

    @GetMapping("/experience")
    public String getContact(Model model) {
        List<Experience> experienceList = service.getExperienceList();
        model.addAttribute("experience", experienceList);
        return "experience/experience";
    }

    @PostMapping("/experience")
    public RedirectView postExperience(Experience experience) {
        service.addExperience(experience);
        return new RedirectView("/experience");
    }

    @GetMapping("/editExperience/{id}")
    public String getEditExperience(@PathVariable("id") Long id, Model model) {
        Experience experience = service.getExperienceById(id);
        model.addAttribute("experience", experience);
        return "experience/editExperience";
    }

    @PostMapping("/experience/{id}")
    public RedirectView removeExperience(@PathVariable("id") Long id) {
        service.removeExperience(id);
        return new RedirectView("/experience");
    }

    @PostMapping("/editExperience/{id}")
    public RedirectView postEditExperience(@PathVariable("id") Long id, Experience editExperience) {
        service.saveEditExperience(editExperience);
        return new RedirectView("/experience");
    }
}
