package com.example.mycv.controller;

import com.example.mycv.model.Experience;
import com.example.mycv.service.ExperienceService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
