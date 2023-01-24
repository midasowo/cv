package com.example.mycv.service;

import com.example.mycv.model.Contact;
import com.example.mycv.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public void addContact(Contact contact) {
        repo.save(contact);
    }

    public void editContact(Contact contact) {
        repo.save(contact);
    }

    public void removeContact(Long id) {
        repo.deleteById(id);
    }

    public List<Contact> getContactList() {
        return repo.findAll();
    }

}
