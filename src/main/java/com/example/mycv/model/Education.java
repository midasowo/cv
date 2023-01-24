package com.example.mycv.model;

import javax.persistence.*;

@Entity
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String schoolName;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "about_id")
    private About about;
}
