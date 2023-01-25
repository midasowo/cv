package com.example.mycv.controller;

import com.example.mycv.model.About;
import com.example.mycv.service.AboutService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

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

    @PostMapping("/about")
    public RedirectView postAbout(About about) {
        service.addAbout(about);
        return new RedirectView("/about");
    }

    @GetMapping("/editAbout/{id}")
    public String getEditAbout(@PathVariable("id") Long id, Model model) {
        About about = service.getAboutById(id);
        model.addAttribute("about", about);
        return "about/editAbout";
    }

    @PostMapping("/about/{id}")
    public RedirectView removeAbout(@PathVariable("id") Long id) {
        service.removeAbout(id);
        return new RedirectView("/about");
    }

    @PostMapping("/editAbout/{id}")
    public RedirectView postEditAbout(@PathVariable("id") Long id, About editAbout) {
        service.saveEditAbout(editAbout);
        return new RedirectView("/about");
    }


}
