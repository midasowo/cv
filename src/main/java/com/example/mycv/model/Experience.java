package com.example.mycv.model;

import javax.persistence.*;

@Entity
public class Experience {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String jobTitle;
    private String companyName;
    private String start;
    private String finish;
    private String description;

    @ManyToOne
    @JoinColumn(name = "about_id")
    private About about;
}
