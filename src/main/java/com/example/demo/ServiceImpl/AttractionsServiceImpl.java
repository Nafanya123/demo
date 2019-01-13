package com.example.demo.ServiceImpl;

import com.example.demo.Dao.AttractionsDao;
import com.example.demo.Model.Attractions;
import com.example.demo.Service.AttractionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttractionsServiceImpl implements AttractionsService {

    @Autowired
    private AttractionsDao attractionsDao;

    @Override
    public Attractions addAttractions(Attractions attractions) {
        Attractions savedAttractions = attractionsDao.save(attractions);
        return savedAttractions;
    }

    @Override
    public void delete(Attractions id) {;
        attractionsDao.delete(id);
    }

    @Override
    public Attractions findId(long id)
    {
        Attractions findAttraction = attractionsDao.findOne(id);
        return findAttraction;
    }

    @Override
    public Attractions getByAttractionsName(String name) {
        Attractions findAttractionsName = attractionsDao.findByAttractionsName(name);
        return findAttractionsName;
    }

    @Override
    public Attractions editCity(Attractions attractions) {
        return attractions;
    }

    @Override
    public List<Attractions> getAll() {
        return attractionsDao.findAll();
    }

    @Override
    public long getCount() {
        return attractionsDao.count();
    }
}
