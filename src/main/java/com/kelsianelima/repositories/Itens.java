package com.kelsianelima.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kelsianelima.entity.Item;

@RestResource(rel = "itens", path = "itens")
public interface Itens extends MongoRepository<Item, String> {

}
