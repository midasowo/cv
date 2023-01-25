package com.example.mycv.controller;

import com.example.mycv.model.Contact;
import com.example.mycv.service.ContactService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.view.RedirectView;

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

    @PostMapping("/contact")
    public RedirectView postContact(Contact contact) {
        service.addContact(contact);
        return new RedirectView("/contact");
    }

    @GetMapping("/editContact/{id}")
    public String getEditContact(@PathVariable("id") Long id, Model model) {
        Contact contact = service.getContactById(id);
        model.addAttribute("contact", contact);
        return "contact/editContact";
    }

    @PostMapping("/contact/{id}")
    public RedirectView removeContact(@PathVariable("id") Long id) {
        service.removeContact(id);
        return new RedirectView("/contact");
    }

    @PostMapping("/editContact/{id}")
    public RedirectView postEditContact(@PathVariable("id") Long id, Contact editContact) {
        service.saveEditContact(editContact);
        return new RedirectView("/contact");
    }
}
