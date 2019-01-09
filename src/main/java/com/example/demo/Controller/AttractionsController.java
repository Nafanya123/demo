package com.example.demo.Controller;

import com.example.demo.Model.Attractions;
import com.example.demo.ServiceImpl.AttractionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
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
}
