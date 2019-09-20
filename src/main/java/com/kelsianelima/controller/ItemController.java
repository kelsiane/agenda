package com.kelsianelima.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kelsianelima.entity.Item;
import com.kelsianelima.repositories.Itens;

@RestController
@RequestMapping("/item")
public class ItemController {
	 @Autowired
	    Itens itensRepository;
					
	    @RequestMapping(method = RequestMethod.GET)
	    public void listaritem() {
	    	itensRepository.findAll();
	    }
	    @RequestMapping(method = RequestMethod.POST)
	    public void create(@RequestBody Item item) {
	    	itensRepository.save(item);
	    }

	    @RequestMapping(value = "/{nome}") 
	    public Optional<Item> read(@PathVariable String nome) {
	        return itensRepository.findById(nome);
	    }

	    @RequestMapping(method = RequestMethod.PUT)
	    public void update(@RequestBody Item item) {
	    	itensRepository.save(item);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	    	itensRepository.deleteById(id); 
	    }
}
