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

    public Education() {
    }

    public Education(Long id, String name, String schoolName, String title, String description, About about) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
        this.title = title;
        this.description = description;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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
