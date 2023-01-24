package com.example.mycv.model;

import javax.persistence.*;

@Entity
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String homeCity;
    private String phone;
    private String email;
    private String icon;

    @ManyToOne
    @JoinColumn(name = "about_id")
    private About about;

    public Contact() {
    }

    public Contact(Long id, String homeCity, String phone, String email, String icon, About about) {
        this.id = id;
        this.homeCity = homeCity;
        this.phone = phone;
        this.email = email;
        this.icon = icon;
        this.about = about;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHomeCity() {
        return homeCity;
    }

    public void setHomeCity(String home) {
        this.homeCity = home;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }
}
