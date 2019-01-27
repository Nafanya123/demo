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
        ModelAndView model = new ModelAndView("attra");
        model.addObject("attra", all);
        return model;
    }

    @RequestMapping(value = "/attra", method = RequestMethod.POST)
    public ModelAndView editAtt(@ModelAttribute("attra") Attractions attractions,
                                @RequestParam("id") Long id,
                                @RequestParam("attractionsName") String attractionsName,
                                @RequestParam("attractionsProperties") String attractionsProperties)
    {
        ModelAndView model = new ModelAndView();
        attractions = attractionsServiceImpl.findId(id);
        attractions.setAttractionsName(attractionsName);
        attractions.setAttractionsProperties(attractionsProperties);
        attractionsServiceImpl.editCity(attractions);
        List<Attractions> all = attractionsServiceImpl.getAll();
        model.setViewName("attra");
        model.addObject("attra", all);
        return model;
    }

    @RequestMapping(value = "/delete/attra", method = RequestMethod.GET)
    public ModelAndView attraDelete() {
        ModelAndView model = new ModelAndView();
        model.setViewName("attra");
        return model;
    }
    @RequestMapping(value = "/delete/attra", method = RequestMethod.POST)
    public ModelAndView deleteAtt(@ModelAttribute("attra") Attractions attractions,
                                  @RequestParam("id") long id)
    {
        ModelAndView model = new ModelAndView();
        attractions = attractionsServiceImpl.findId(id);
        attractionsServiceImpl.delete(attractions);
        List<Attractions> all = attractionsServiceImpl.getAll();
        model.setViewName("redirect:/attra");
        model.addObject("attra", all);
        return model;
    }


    @RequestMapping(value = "/addatt", method = RequestMethod.GET)
    public ModelAndView addAtt() {
        return new ModelAndView("addatt", "attractions", new Attractions());
    }


    @RequestMapping(value = "/resultatt", method = RequestMethod.POST)
    public ModelAndView resultAtt(@ModelAttribute("attractions") Attractions attractions,
                                  @RequestParam("attractionsName") String attractionsName,
                                  @RequestParam("attractionsProperties") String attractionsProperties)
            throws ParseException {
        ModelAndView model = new ModelAndView();
        model.setViewName("redirect:/attra");
        attractions.setAttractionsName(attractionsName);
        attractions.setAttractionsProperties(attractionsProperties);
        model.addObject("attraction", attractionsServiceImpl.addAttractions(attractions));
        return model;
    }


}
