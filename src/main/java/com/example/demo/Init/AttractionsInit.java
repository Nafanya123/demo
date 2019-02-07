package com.example.demo.Init;

import com.example.demo.Model.Attractions;
import com.example.demo.ServiceImpl.AttractionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class AttractionsInit implements ApplicationRunner {
    private AttractionsServiceImpl attractionsServiceImpl;

    @Autowired
    public AttractionsInit(AttractionsServiceImpl attractionsServiceImpl) {
        this.attractionsServiceImpl = attractionsServiceImpl;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
        long count = attractionsServiceImpl.getCount();
        if (count == 0) {
            Attractions a1 = new Attractions();
            a1.setAttractionsName("The Moscow Kremlin");
            a1.setAttractionsProperties("Fortress in the center of Moscow and its oldest part," +
                                        " the main socio-political and historical-artistic complex of the city," +
                                        " official residence of the President of the Russian Federation. ");
            a1.setCityId(1l);
            //
            Attractions a2 = new Attractions();
            a2.setAttractionsName("The Red Square");
            a2.setAttractionsProperties("The main square of Moscow, located between the" +
                                        " Moscow Kremlin and China Town.");
            a2.setCityId(1l);

            Attractions a3 = new Attractions();
            a3.setAttractionsName("Stalin's Bunker");
            a3.setAttractionsProperties("the common name of a defensive structure in Samara," +
                                        " created as a backup location");
            a3.setCityId(2l);

            attractionsServiceImpl.addAttractions(a1);
            attractionsServiceImpl.addAttractions(a2);
            attractionsServiceImpl.addAttractions(a3);
        }
    }
}
