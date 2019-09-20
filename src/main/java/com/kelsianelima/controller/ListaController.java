package com.kelsianelima.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kelsianelima.entity.Lista;
import com.kelsianelima.repositories.Listas;

@RestController
@RequestMapping("/lista")
public class ListaController {
	 @Autowired
	    Listas listaRepository;
					
	    @RequestMapping(method = RequestMethod.GET)
	    public void listar() {
	    	listaRepository.findAll();
	    }
	    @RequestMapping(method = RequestMethod.POST)
	    public void create(@RequestBody Lista lista) {
	    	listaRepository.save(lista);
	    }

	    @RequestMapping(value = "/{nome}") 
	    public Optional<Lista> read(@PathVariable String descricao) {
	        return listaRepository.findById(descricao);
	    }

	    @RequestMapping(method = RequestMethod.PUT)
	    public void update(@RequestBody Lista lista) {
	    	listaRepository.save(lista);
	    }

	    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE) 
	    public void delete(@PathVariable String id) {
	    	listaRepository.deleteById(id); 
	    }
}
