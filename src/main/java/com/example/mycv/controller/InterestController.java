package com.example.mycv.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InterestController {

    @GetMapping("/interests")
    public String getInterests() {
        return "interests/interests";
    }
}
