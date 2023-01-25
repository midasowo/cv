package com.example.mycv.controller;

import com.example.mycv.model.Interest;
import com.example.mycv.service.InterestService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

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

    @PostMapping("/interests")
    public RedirectView postInterest(Interest interest) {
        service.addInterest(interest);
        return new RedirectView("/interests");
    }

    @GetMapping("/editInterest/{id}")
    public String getEditInterest(@PathVariable("id") Long id, Model model) {
        Interest interest = service.getInterestById(id);
        model.addAttribute("interest", interest);
        return "interests/editInterests";
    }

    @PostMapping("/interests/{id}")
    public RedirectView removeInterest(@PathVariable("id") Long id) {
        service.removeInterest(id);
        return new RedirectView("/interests");
    }

    @PostMapping("/editInterest/{id}")
    public RedirectView postEditInterest(@PathVariable("id") Long id, Interest editInterest) {
        service.saveEditInterest(editInterest);
        return new RedirectView("/interests");
    }
}
