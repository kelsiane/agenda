package com.kelsianelima.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import com.kelsianelima.entity.User;
@RestResource(rel = "users", path = "users")
public interface Users extends MongoRepository<User,String>{

}
