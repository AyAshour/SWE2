package com.swe.project.entity;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
@EnableAutoConfiguration
public class Store {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    public String name;
    public String type;
    public String location;
    public boolean accepted;

    @ManyToMany
    @JoinColumn(name = "ownerId")
    private Set<User> owners;

    @OneToMany(fetch = FetchType.EAGER, mappedBy = "id", cascade = CascadeType.ALL)
    private List<Product> products;


    public Store(String name, String type, String location, User owner) {
        this.name = name;
        this.type = type;
        this.location = location;
        this.accepted = false;
    }
    public Store(int id){
        this.id = id;
        this.name = "";
        this.type = "";
        this.location = "";
        this.accepted = false;
        this.products = new ArrayList<Product>();
    }
    public Store() {
        id = 0;
        this.name = "";
        this.type = "";
        this.location = "";

        this.accepted = false;
        this.products = new ArrayList<Product>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Set<User> getOwners() {
        return owners;
    }

    public void setOwner(Set<User> owners) {
        this.owners = owners;
    }

    public boolean isAccepted() {
        return accepted;
    }

    public void setAccepted(boolean accepted) {
        this.accepted = accepted;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    public void addOwners(List <User> owners) {
        this.owners.addAll(owners);
    }
}
