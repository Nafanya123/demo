/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import com.example.demo.Dao.CityDao;
import com.example.demo.ServiceImpl.CityServiceImpl;
import com.example.demo.Model.City;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

/**
 *
 * @author Sergey
 */
@RestController
public class CityController {
    @Autowired
    private CityServiceImpl cityServiceImpl;
    private City city = new City();
    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public ModelAndView cities() {
        List<City> all = cityServiceImpl.getAll();   
        ModelAndView model = new ModelAndView("cities");
        model.addObject("cities", all);
        return model;
    }


    @RequestMapping(value="/form", method=RequestMethod.GET)
    public ModelAndView formForm(ModelAndView model) {
        model = new ModelAndView("form");
        model.addObject("form", *сюда я должен передать введеное данно из jsp*;
        return model;
    }

    @RequestMapping(value="/form", method=RequestMethod.POST)
    public ModelAndView formSubmit(@ModelAttribute ModelAndView model,@ModelAttribute("id") int id) {
        model.setViewName("result");
        model.addObject("form", id);
        return model;
    }
}
