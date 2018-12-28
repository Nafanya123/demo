/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.ServiceImpl;

import com.example.demo.Dao.CityDao;
import com.example.demo.Service.CityService;
import com.example.demo.Model.City;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Sergey
 */
@Service
public class CityServiceImpl implements CityService{
    @Autowired
    private CityDao cityDao;
    
    @Override
    public City addCity(City city) {
        City savedCity = cityDao.save(city);
        return savedCity;
    }

    @Override
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public City getByCityName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public City editCity(City city) {
        return city;
    }

    @Override
    public List<City> getAll() {
        return cityDao.findAll();
    }

    @Override
    public long getCount() {
        return cityDao.count();
    }
}
