package com.example.mycv.service;

import com.example.mycv.model.Contact;
import com.example.mycv.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {

    private final ContactRepository repo;

    public ContactService(ContactRepository repo) {
        this.repo = repo;
    }

    public void addContact(Contact contact) {
        repo.save(contact);
    }

    public void saveEditContact(Contact contact) {
        repo.save(contact);
    }

    public void removeContact(Long id) {
        repo.deleteById(id);
    }

    public List<Contact> getContactList() {
        return repo.findAll();
    }

    public Contact getContactById(Long id) {
        Optional<Contact> contact = repo.findById(id);
        if (contact.isPresent()) {
            return repo.findById(id).orElse(null);
        } else {
            return null;
        }
    }

}
