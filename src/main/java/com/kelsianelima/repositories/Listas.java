package com.kelsianelima.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kelsianelima.entity.Lista;

@RestResource(rel = "listas", path = "listas")
public interface Listas extends MongoRepository<Lista, String>{

}
