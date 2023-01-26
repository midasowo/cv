package com.example.mycv.controller;

import com.example.mycv.model.Skill;
import com.example.mycv.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class SkillController {

    private final SkillService service;

    public SkillController(SkillService service) {
        this.service = service;
    }

    @GetMapping("/skills")
    public String getSkills(Model model) {
        List<Skill> skillsList = service.getSkillList();
        model.addAttribute("skills", skillsList);
        return "skills/skills";
    }


    @PostMapping("/skills")
    public RedirectView postSkill(Skill skill) {
        service.addSkill(skill);
        return new RedirectView("/skills");
    }

    @GetMapping("/editSkills/{id}")
    public String getEditSkill(@PathVariable("id") Long id, Model model) {
        Skill skill = service.getSkillById(id);
        model.addAttribute("skills", skill);
        return "skills/editSkills";
    }

    @PostMapping("/skills/{id}")
    public RedirectView removeSkill(@PathVariable("id") Long id) {
        service.removeSkill(id);
        return new RedirectView("/skills");
    }

    @PostMapping("/editSkills/{id}")
    public RedirectView postEditSkill(@PathVariable("id") Long id, Skill editSkill) {
        service.saveEditSkill(editSkill);
        return new RedirectView("/skills");
    }
}
