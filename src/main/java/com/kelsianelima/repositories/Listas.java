package com.kelsianelima.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kelsianelima.entity.Lista;

@RestResource(rel = "listas", path = "listas")
public interface Listas extends MongoRepository<Lista, String>{
	Page<List<Lista>> findByDescricao(String descricao, Pageable pageable);
	 
}
