package com.example.mycv.model;

import javax.persistence.*;

@Entity
public class Skills {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String description;

    @ManyToOne
    @JoinColumn(name = "about_id")
    private About about;
}
