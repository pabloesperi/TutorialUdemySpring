package com.tutorial.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	//redirigir a otro metodo handler. reinicia el request
	@GetMapping("/")
	public String home() {
		return "redirect:/app/index";
	}
	
	//redirigir a una pagina web
	@GetMapping("/google")
	public String google() {
		return "redirect:https://www.google.com";
	}
	
	//para no perder los datos del request se usa el forward. solo rutas internas de la app
	@GetMapping("/")
	public String home() {
		return "forward:/app/index";
	}

}
	