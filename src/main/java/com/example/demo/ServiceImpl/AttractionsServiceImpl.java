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
    public void delete(long id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Attractions findId(long id) {
        Attractions findAttractions = attractionsDao.findOne(id);
        return findAttractions;
        //throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Attractions getByAttractionsName(String name) {
        return null;
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