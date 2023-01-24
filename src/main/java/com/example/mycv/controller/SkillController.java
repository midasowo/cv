package com.example.mycv.controller;

import com.example.mycv.model.Skill;
import com.example.mycv.service.SkillService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

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
}
