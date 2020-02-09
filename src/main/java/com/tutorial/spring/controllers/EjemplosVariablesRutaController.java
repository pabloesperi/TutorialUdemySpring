package com.tutorial.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/variables")
public class EjemplosVariablesRutaController {

	//PathVariable permite tomar la variable en la ruta URL
	//texto tiene que ser igual para ambos tanto en la ruta como en el parámetro del método
	@GetMapping(value = "/string/{texto}")
	public String variables(@PathVariable String texto, Model model) {
		model.addAttribute("Variable", texto);
		return "variables/ver";
	}
	
	//dos variables o màs variables
	@GetMapping(value = "/string/{texto}/{numero}")
	public String variables(@PathVariable String texto, @PathVariable Integer numero, Model model) {
		model.addAttribute("Variable", texto);
		model.addAttribute("VariableNumero", numero);
		return "variables/ver";
	}
	
	
	
}
