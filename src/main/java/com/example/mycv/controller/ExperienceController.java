package com.example.mycv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExperienceController {

    @GetMapping("/experience")
    public String getContact() {
        return "experience/experience";
    }
}
