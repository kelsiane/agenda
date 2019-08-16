package com.kelsianelima.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.kelsianelima.repositories.Users;

@Controller
public class DemoController{
	@Autowired
  private Users repository;
	
@GetMapping("/cadastro")
public String cadastro(@RequestParam(name="nome", required=false, defaultValue="World") String nome, Model model) {
    model.addAttribute("users.nome", nome);
    model.addAttribute("users.nome", nome);
    return "cadastro";
}


}