package com.swe.project.entity;

import javax.persistence.*;

@Entity
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "ownerId")
    private User storeOwner;

    private String name;
    private String type;
    private String location;
    private boolean accepted;

    public Store(String name, String type, String location, User owner) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.storeOwner = owner;
        this.accepted = false;
    }

    public Store() {
        this.name = "";
        this.type = "";
        this.location = "";
        this.storeOwner = null;
        this.accepted = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public User getStoreOwner() {
        return storeOwner;
    }

    public void setStoreOwner(User owner) {
        this.storeOwner = owner;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }
}
