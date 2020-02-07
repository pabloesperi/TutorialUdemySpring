package com.tutorial.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//IMPORTANTE: SI UNA VEZ QUE LEVANTAMOS EL SERVIDOR, LO STARTEAMOS DE VUELTA, VA A HABER CONFLICTO DE PUERTO. HAY QUE HACER 
//RE START.

@Controller
public class IndexController {
	
	@RequestMapping(value = {"/index", "/", "/index2"}, method = RequestMethod.GET)
	//se puede usar value o path. es igual.
	//Si no se indica el método, por defecto es GET.
	//Si es un GET se puede directamente anotar @GetMapping. También según el caso puede ser @PostMapping, etc.
	public String index	(Model model) {
		
		model.addAttribute("Spring", "Prácticas Spring");
		model.addAttribute("Nombre", "Mi nombre es Pablo");
		
		return "index";
	}

}
 	