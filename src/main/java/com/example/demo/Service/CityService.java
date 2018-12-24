/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Service;

import com.example.demo.Model.City;
import java.util.List;

/**
 *
 * @author Sergey
 */
public interface CityService {
    City addCity(City city);
    void delete(long id);
    City getByCityName(String name);
    City editCity(City city);
    Iterable<City> getAll();
    long getCount();
}
