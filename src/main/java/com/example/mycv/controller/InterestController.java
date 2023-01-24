package com.example.mycv.controller;

import com.example.mycv.model.Experience;
import com.example.mycv.model.Interest;
import com.example.mycv.service.InterestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class InterestController {

    private final InterestService service;

    public InterestController(InterestService service) {
        this.service = service;
    }

    @GetMapping("/interests")
    public String getInterests(Model model) {
        List<Interest> interestsList = service.getInterestList();
        model.addAttribute("interests", interestsList);
        return "interests/interests";
    }
}
