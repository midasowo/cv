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

    public Experience() {
    }

    public Experience(Long id, String jobTitle, String companyName, String start, String finish, String description, About about) {
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
        this.start = start;
        this.finish = finish;
        this.description = description;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getFinish() {
        return finish;
    }

    public void setFinish(String finish) {
        this.finish = finish;
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
