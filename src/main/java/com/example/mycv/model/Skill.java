package com.example.mycv.model;

import javax.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String techSkill;

    @ManyToOne
    @JoinColumn(name = "about_id")
    private About about;

    public Skill() {
    }

    public Skill(Long id, String techSkill, About about) {
        this.id = id;
        this.techSkill = techSkill;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }
}


