package com.example.demo.Init;

import com.example.demo.Model.Attractions;
import com.example.demo.ServiceImpl.AttractionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

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

            a1.setAttractionsName("Test1");
            a1.setAttractionsProperties("text test1");
            //
            Attractions a2 = new Attractions();

            a2.setAttractionsName("Test2");
            a1.setAttractionsProperties("text test2");

            attractionsServiceImpl.addAttractions(a1);
            attractionsServiceImpl.addAttractions(a2);
        }
    }
}
