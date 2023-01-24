package com.example.mycv.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class About {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private String description;
    private String icon;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "about")
    private Set<Contact> contacts = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "about")
    private Set<Education> educations = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "about")
    private Set<Experience> experiences = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "about")
    private Set<Interests> interests = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "about")
    private Set<Skills> skills = new HashSet<>();

    public About() {
    }

    public About(Long id, String firstName, String lastName, String description, String icon, Set<Contact> contacts, Set<Education> educations, Set<Experience> experiences, Set<Interests> interests, Set<Skills> skills) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.description = description;
        this.icon = icon;
        this.contacts = contacts;
        this.educations = educations;
        this.experiences = experiences;
        this.interests = interests;
        this.skills = skills;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Set<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Contact> contacts) {
        this.contacts = contacts;
    }

    public Set<Education> getEducations() {
        return educations;
    }

    public void setEducations(Set<Education> educations) {
        this.educations = educations;
    }

    public Set<Experience> getExperiences() {
        return experiences;
    }

    public void setExperiences(Set<Experience> experiences) {
        this.experiences = experiences;
    }

    public Set<Interests> getInterests() {
        return interests;
    }

    public void setInterests(Set<Interests> interests) {
        this.interests = interests;
    }

    public Set<Skills> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skills> skills) {
        this.skills = skills;
    }
}
