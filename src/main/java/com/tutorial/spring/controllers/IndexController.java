package com.tutorial.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value = "/index")
	//se puede usar value o path. es igual.
	//Si no se indica el método, por defecto es GET.
	public String index	(Model model) {
		
		model.addAttribute("Nombre", "Mi nombre es Pablo");
		
		return "index";
	}

}
 	