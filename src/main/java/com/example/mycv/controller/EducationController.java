package com.example.mycv.controller;

import com.example.mycv.model.Education;
import com.example.mycv.service.EducationService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/editEducation/{id}")
    public String getEditEducation(@PathVariable("id") Long id, Model model) {
        Education education = service.getEducationById(id);
        model.addAttribute("education", education);
        return "education/editEducation";
    }/**/

    @PostMapping("/education/{id}")
    public RedirectView removeEducation(@PathVariable("id") Long id) {
        service.removeEducation(id);
        return new RedirectView("/education");
    }

    @PostMapping("/editEducation/{id}")
    public RedirectView postEditEducation(@PathVariable("id") Long id, Education editEducation) {
        service.saveEditEducation(editEducation);
        return new RedirectView("/education");
    }


}
