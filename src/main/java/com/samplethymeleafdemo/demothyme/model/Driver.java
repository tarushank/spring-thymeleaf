package com.samplethymeleafdemo.demothyme.model;

import javax.persistence.*;

@Entity
@Table(name = "DRIVER_INFO")
public class Driver {

    @Id
    @Column(name = "DRIVER_ID")
    private int id;
    @Column(name = "DRIVER_NAME")
    private String name;

    public Driver() {
    }

    public Driver(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
