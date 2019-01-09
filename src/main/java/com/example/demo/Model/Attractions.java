package com.example.demo.Model;

import javax.persistence.*;

@Entity
@Table(name = "Attractions")
public class Attractions {

    @Id
    @GeneratedValue
    @Column(name = "Id", nullable = false)
    private Long id;

    @Column(name = "Attractions_Name", length = 64, nullable = false)
    private String attractionsName;

    @Column(name = "Attractions_Properties", nullable = false)
    private String attractionsProperties;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAttractionsName() {
        return attractionsName;
    }

    public void setAttractionsName(String attractionsName) {
        this.attractionsName = attractionsName;
    }

    public String getAttractionsProperties() {
        return attractionsProperties;
    }

    public void setAttractionsProperties(String attractionsProperties) {
        this.attractionsProperties = attractionsProperties;
    }
}