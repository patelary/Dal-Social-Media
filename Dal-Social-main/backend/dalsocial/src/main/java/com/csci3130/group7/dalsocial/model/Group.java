package com.csci3130.group7.dalsocial.model;

import jakarta.persistence.*;

@Entity
@Table(name = "user_groups")  // ✅ renamed to avoid SQL reserved keyword issue
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    private String description;

    private Integer ownerId;

    // --- Constructors ---
    public Group() {
    }

    public Group(Integer id, String name, String description, Integer ownerId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.ownerId = ownerId;
    }

    // --- Getters & Setters ---
    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getOwner() {
        return ownerId;
    }

    public void setOwner(Integer ownerId) {
        this.ownerId = ownerId;
    }
}
