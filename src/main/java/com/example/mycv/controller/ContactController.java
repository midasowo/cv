package com.example.mycv.controller;

import com.example.mycv.model.Contact;
import com.example.mycv.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    @GetMapping("/contact")
    public String getContact(Model model) {
        List<Contact> contactList = service.getContactList();
        model.addAttribute("contact", contactList);
        return "contact/contact";
    }
}
