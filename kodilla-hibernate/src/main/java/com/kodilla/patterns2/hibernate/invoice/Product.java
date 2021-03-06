package com.kodilla.patterns2.hibernate.invoice;


import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="PRODUCT")
public class Product {

    private int id;
    private String name;

    public Product() {}

    public Product(String name) {
        this.name = name;
    }

    @Id
    @NotNull
    @GeneratedValue
    @Column(name="ID", unique = true)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @NotNull
    @Column(name="NAME", unique = true)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
