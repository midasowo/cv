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


}
