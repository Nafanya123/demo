package com.example.demo.Service;

import com.example.demo.Model.Attractions;

public interface AttractionsService {

    Attractions addAttractions(Attractions attractions);
    void delete(Attractions id);
    Attractions findId(long id);
    Attractions getByAttractionsName(String name);
    Attractions editCity(Attractions attractions);
    Iterable<Attractions> getAll();
    long getCount();
}
