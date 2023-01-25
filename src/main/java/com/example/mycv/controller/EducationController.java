package com.example.mycv.controller;

import com.example.mycv.model.Education;
import com.example.mycv.service.EducationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class EducationController {

    private final EducationService service;

    public EducationController(EducationService service) {
        this.service = service;
    }

    @GetMapping("/education")
    public String getEducation(Model model) {
        List<Education> educationList = service.getEducationList();
        model.addAttribute("education", educationList);
        return "education/education";
    }

    @PostMapping("/education")
    public RedirectView postEducation(Education education) {
        service.addEducation(education);
        return new RedirectView("/education");
    }


}
