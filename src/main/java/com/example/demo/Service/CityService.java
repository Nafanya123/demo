/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Service;

import com.example.demo.Model.Attractions;
import com.example.demo.Model.City;
import java.util.List;

/**
 *
 * @author Sergey
 */
public interface CityService {
    City addCity(City city);
    void delete(long id);
    Iterable<City> findByCityName(String name);
    City editCity(City city);
    Iterable<City> getAll();
    long getCount();
}
