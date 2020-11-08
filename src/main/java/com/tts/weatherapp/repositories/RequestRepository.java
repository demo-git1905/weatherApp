package com.tts.weatherapp.repositories;

import java.util.List;

import com.tts.weatherapp.models.Request;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestRepository extends CrudRepository<Request, Long>{
    List<Request> findAll();

}
