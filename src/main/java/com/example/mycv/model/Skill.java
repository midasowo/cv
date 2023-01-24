package com.example.mycv.model;

import javax.persistence.*;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String icon;
    private String techSkill;
    private String softSkill;

    @ManyToOne
    @JoinColumn(name = "about_id")
    private About about;

    public Skill() {
    }

    public Skill(Long id, String icon, String techSkill, String softSkill, About about) {
        this.id = id;
        this.icon = icon;
        this.techSkill = techSkill;
        this.softSkill = softSkill;
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

    public String getTechSkill() {
        return techSkill;
    }

    public void setTechSkill(String techSkill) {
        this.techSkill = techSkill;
    }

    public String getSoftSkill() {
        return softSkill;
    }

    public void setSoftSkill(String softSkill) {
        this.softSkill = softSkill;
    }

    public About getAbout() {
        return about;
    }

    public void setAbout(About about) {
        this.about = about;
    }
}


