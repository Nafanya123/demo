package com.example.demo.Dao;

import com.example.demo.Model.Attractions;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AttractionsDao extends CrudRepository<Attractions, Long> {

    @Override
    public List<Attractions> findAll();

    public List<Attractions> findId(Long id);

    public List<Attractions> findAttractionsName(String name);
}
