package com.example.demo.Controller;

import com.example.demo.Model.Attractions;
import com.example.demo.ServiceImpl.AttractionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.expression.ParseException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AttractionsController {
    @Autowired
    private AttractionsServiceImpl attractionsServiceImpl;


    @RequestMapping(value = "/attra", method = RequestMethod.GET)
    public ModelAndView attra() {
        List<Attractions> all = attractionsServiceImpl.getAll();
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/cities");
        return model;
    }

    @RequestMapping(value = "/attra/{cityId}", method = RequestMethod.GET)
    public ModelAndView citiesTest(@ModelAttribute("attra") Attractions attractions,
                                   @PathVariable("cityId") Long id) {
        ModelAndView model = new ModelAndView("attra");
        model.addObject("attra", attractionsServiceImpl.getCityId(id));
        return model;
    }

    @RequestMapping(value = "/attra", method = RequestMethod.POST)
    public ModelAndView editAtt(@ModelAttribute("attra") Attractions attractions,
                                @RequestParam("id") Long id,
                                @RequestParam("attractionsName") String attractionsName,
                                @RequestParam("attractionsProperties") String attractionsProperties,
                                @RequestParam("cityId") Long cityId)
    {
        ModelAndView model = new ModelAndView();
        if(attractionsName !="" && attractionsProperties !="")
        {
            attractions = attractionsServiceImpl.findId(id);
            attractions.setAttractionsName(attractionsName);
            attractions.setAttractionsProperties(attractionsProperties);
            attractionsServiceImpl.editCity(attractions);
            List<Attractions> all = attractionsServiceImpl.getAll();
            model.setViewName("redirect:/attra/"+ cityId);
            model.addObject("attra", all);
        }
        return model;
    }

    @RequestMapping(value = "/delete/attra/{cityId}", method = RequestMethod.GET)
    public ModelAndView attraDelete() {
        ModelAndView model = new ModelAndView();
        model.setViewName("attra");
        return model;
    }
    @RequestMapping(value = "/delete/attra/{cityId}", method = RequestMethod.POST)
    public ModelAndView deleteAtt(@ModelAttribute("attra") Attractions attractions,
                                  @RequestParam("id") long id)
    {
        ModelAndView model = new ModelAndView();
        attractions = attractionsServiceImpl.findId(id);
        attractionsServiceImpl.delete(attractions);
        List<Attractions> all = attractionsServiceImpl.getAll();
        model.setViewName("redirect:/attra/{cityId}");
        model.addObject("attra", all);
        return model;
    }


    @RequestMapping(value = "/resultatt/attra/{cityId}", method = RequestMethod.POST)
    public ModelAndView resultAtt(@ModelAttribute("attra") Attractions attractions,
                                  @RequestParam("attractionsName") String attractionsName,
                                  @RequestParam("attractionsProperties") String attractionsProperties)
            throws ParseException {
        ModelAndView model = null;
        if(attractionsName != "" && attractionsProperties != "")
        {
            model = new ModelAndView();
            model.setViewName("redirect:/attra/{cityId}");
            attractions.setAttractionsName(attractionsName);
            attractions.setAttractionsProperties(attractionsProperties);
            model.addObject("attra", attractionsServiceImpl.addAttractions(attractions));
        }

        return model;
    }


}
