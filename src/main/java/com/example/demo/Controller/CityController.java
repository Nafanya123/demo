/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Controller;

import com.example.demo.ServiceImpl.CityServiceImpl;
import com.example.demo.Model.City;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Sergey
 */
@Controller
public class CityController {
    @Autowired
    private CityServiceImpl cityServiceImpl;
    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

    @RequestMapping(value = "/cities", method = RequestMethod.GET)
    public @ResponseBody ModelAndView cities() {
        ModelAndView model = new ModelAndView("cities");
        model.addObject("cities", cityServiceImpl.getAll());


        return model;
    }

    @RequestMapping(value = "/cities", method = RequestMethod.POST)
    public @ResponseBody ModelAndView citiesTes(@RequestParam(value = "cityName") String cityName) {
        ModelAndView model = new ModelAndView("cities");
        List<City> a = cityServiceImpl.findByCityName(cityName);
            model.addObject("cities", a);
        return model;
    }



    /*@RequestMapping(value = "/cities", method = RequestMethod.GET)
    public ModelAndView citiesSearch() {
        List<City> all = cityServiceImpl.getAll();
        ModelAndView model = new ModelAndView("cities");
        model.addObject("cities", all);
        return model;
    }*/

    @RequestMapping(value = "/cities/{cityId}")
    public ModelAndView citiesTest(@PathVariable("cityId") Long id) {
        List<City> all = cityServiceImpl.getAll();
        ModelAndView model = new ModelAndView("cities");
        model.setViewName("redirect:/attra/{cityId}");
        return model;
    }

    @RequestMapping(value = "/form", method = RequestMethod.GET)
    public ModelAndView form() {
        return new ModelAndView("form", "city", new City());
    }

    @RequestMapping(value = "/result", method = RequestMethod.POST)
    public ModelAndView formSubmit(@ModelAttribute("city") City city, @RequestParam ("cityName") String cityName) throws ParseException {
        ModelAndView model = new ModelAndView();
        model.setViewName("result");
        //city.setId(3l);
        city.setCityName(cityName);
        Date d3 = df.parse("1522-01-12");
        city.setDateOfFoundation(d3);
        model.addObject("city", cityServiceImpl.addCity(city));
        //model.addObject("CityName", this.cityServiceImpl)
        return model;
    }
}
