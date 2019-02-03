/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 *
 * @author Sergey
 */

@Entity
@Table(name = "City")
public class City {

    @Id
    @GeneratedValue
    @Column(name = "city_Id", nullable = false)
    private Long cityId;

    @Column(name = "City_Name", length = 64, nullable = false)
    private String cityName;

    @Temporal(TemporalType.DATE)
    @Column(name = "Date_Of_Foundation", nullable = false)
    private Date dateOfFoundation;

    public Long getCityId() {
        return cityId;
    }

    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Date getDateOfFoundation() {
        return dateOfFoundation;
    }

    public void setDateOfFoundation(Date dateOfFoundation) {
        this.dateOfFoundation = dateOfFoundation;
    }

}

