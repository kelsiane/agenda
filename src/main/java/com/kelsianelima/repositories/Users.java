package com.kelsianelima.repositories;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kelsianelima.entity.User;
@RestResource(rel = "users", path = "users")
public interface Users extends MongoRepository<User,String>{
	
	
	 @Query(value="{ 'nome' : ?0 }", fields="{ 'nome' : 1, 'email' : 1}")
	  Page<List<User>> findByThenome(String nome, Pageable pageable);
	
	 @Query(" {$or: 	[	{ 'nome': { $regex:?0, $options: 'i' } }, { 'email': { $regex:?0, $options: 'i' } }, { 'lista.descricao': { $regex:?0, $options: 'i' } }, { 'lista.item.nome': { $regex:?0, $options: 'i' } }    ]}")
	 Page<List<User>> findBySearch(@Param("search") String search, Pageable pageable);	
}
