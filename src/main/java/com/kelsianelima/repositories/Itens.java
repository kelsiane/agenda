package com.kelsianelima.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kelsianelima.entity.Item;

@RestResource(rel = "itens", path = "itens")
public interface Itens extends MongoRepository<Item, String> {
	Page<List<Item>> findByNome(String nome, Pageable pageable);
}
