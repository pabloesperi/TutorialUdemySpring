package com.tutorial.spring.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping(value = "params")
public class EjemploParamsController {

	//el requestparams toma el parámetro que se le envía mediante la URL con la anotación ?texto=Pablo por ejem. luego 
	//de la ruta absoluta
	//se le pueden pasar parametros tales como el value, defalultValue y el required
	//NO PUEDE HABER RUTAS REPETIDAS
	@GetMapping(value = "String")
	public String params(@RequestParam(value = "texto", defaultValue = "Valor por defecto", required = false) String texto, Model model) {
		model.addAttribute("Resultado", "El texto enviado es " + texto);		
		return "params/ver";
	}
	
	//agregando varios parámetros
	@GetMapping(value = "mix-params")
	public String params(@RequestParam String texto, @RequestParam Integer numero, Model model) {
		model.addAttribute("Resultado", "El texto enviado es " + texto + "El número enviado es " + numero);		
		return "params/ver";
	}
	
	//el httpServletRequest
	@GetMapping(value = "mix-params-request")
	public String params(HttpServletRequest request, Model model) {
		String texto = request.getParameter("texto");
		Integer numero = null;
		try {
		numero = Integer.parseInt(request.getParameter("numero"));		
		}catch(NumberFormatException e) {
			
		}
		model.addAttribute("Resultado", "El texto enviado es " + texto + "El número enviado es " + numero);		
		return "params/ver";
	}
	
	@RequestMapping(value = "/")
	public String index() {		
		return "params/index";
	}
	
}
