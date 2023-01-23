package com.example.mycv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EducationController {

    @GetMapping("/education")
    public String getContact() {
        return "education/education";
    }
}
