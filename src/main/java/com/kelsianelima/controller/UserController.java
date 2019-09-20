package com.kelsianelima.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kelsianelima.entity.User;
import com.kelsianelima.repositories.Users;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    Users userRepository;
				
    @RequestMapping(method = RequestMethod.GET)
    public void listar() {
    	userRepository.findAll();
    }
    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping(value = "/{nome}") 
    public Optional<User> read(@PathVariable String nome) {
        return userRepository.findById(nome);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public void update(@RequestBody User user) {
        userRepository.save(user);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
    public void delete(@PathVariable String id) {
        userRepository.deleteById(id); 
    }

}