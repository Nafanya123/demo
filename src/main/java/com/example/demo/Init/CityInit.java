/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.Init;
import com.example.demo.Dao.CityDao;
import com.example.demo.ServiceImpl.CityServiceImpl;
import com.example.demo.Model.City;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;
import org.springframework.boot.ApplicationRunner;
/**
 *
 * @author Sergey
 */
@Component
public class CityInit implements ApplicationRunner{
    private CityServiceImpl cityServiceImpl;

    private static final DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    @Autowired
    public CityInit(CityServiceImpl cityServiceImpl) {
        this.cityServiceImpl = cityServiceImpl;
    }
    @Override
    public void run(ApplicationArguments args) throws Exception {
        long count = cityServiceImpl.getCount();

        if (count == 0) {
            City c1 = new City();

            c1.setCityName("Moscow");

            Date d1 = df.parse("1147-09-10");
            c1.setDateOfFoundation(d1);
            //
            City c2 = new City();

            c2.setCityName("Samara");
            Date d2 = df.parse("1586-06-11");
            c2.setDateOfFoundation(d2);

            City c3 = new City();
            c3.setCityName("Tolyatti");
            Date d3 = df.parse("1586-06-11");
            c3.setDateOfFoundation(d3);

            City c4 = new City();
            c4.setCityName("Sizran");
            Date d4 = df.parse("1586-06-11");
            c4.setDateOfFoundation(d4);


            cityServiceImpl.addCity(c1);
            cityServiceImpl.addCity(c2);
            cityServiceImpl.addCity(c3);
            cityServiceImpl.addCity(c4);
        }
    }
}
