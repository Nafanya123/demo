/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Dao;

import java.util.Date;
import java.util.List;
 
import com.example.demo.Model.City;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
 
@Repository
public interface CityDao extends CrudRepository<City, Long> {

    @Override
    public List<City> findAll();

    public List<City> findByCityNameLike(String name);
 
    public List<City> findByDateOfFoundationGreaterThan(Date date);
 
}