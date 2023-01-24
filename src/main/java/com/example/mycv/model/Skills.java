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

    public Skills() {
    }

    public Skills(Long id, String icon, String description, About about) {
        this.id = id;
        this.icon = icon;
        this.description = description;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }
}
