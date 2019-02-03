package com.example.demo.Dao;

import com.example.demo.Model.Attractions;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AttractionsDao extends CrudRepository<Attractions, Long> {

    @Override
    public List<Attractions> findAll();
    public Attractions findByAttractionsName(String name);
    public List<Attractions> findByCityId(Long cityId);
}
