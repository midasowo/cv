package com.example.mycv.controller;

import com.example.mycv.model.About;
import com.example.mycv.service.AboutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class AboutController {

    private final AboutService service;

    public AboutController(AboutService service) {
        this.service = service;
    }

    @GetMapping("/about")
    public String getAbout(Model model) {
        List<About> aboutList = service.getAboutList();
        model.addAttribute("about", aboutList);
        return "about/about";
    }


}
