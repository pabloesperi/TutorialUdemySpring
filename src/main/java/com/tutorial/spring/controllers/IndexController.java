package com.tutorial.spring.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tutorial.spring.models.Usuario;

//IMPORTANTE: SI UNA VEZ QUE LEVANTAMOS EL SERVIDOR, LO STARTEAMOS DE VUELTA, VA A HABER CONFLICTO DE PUERTO. HAY QUE HACER 
//RE START.
//se pueden mapear tanto los métodos handler como el controlador.

@Controller
@RequestMapping(value = "/app", method = RequestMethod.GET)//ruta de primer nivel. igual para todos los métodos
public class IndexController {
	
	//se puede usar value o path. es igual.
	//Si no se indica el método, por defecto es GET.
	//Si es un GET se puede directamente anotar @GetMapping. También según el caso puede ser @PostMapping, etc.
	@RequestMapping(value = {"/index", "/", "/index2"}, method = RequestMethod.GET)//rutas de segundo nivel
	public String index	(Model model) {
		
		model.addAttribute("Spring", "Prácticas Spring");
		model.addAttribute("Nombre", "Mi nombre es Pablo");
		
		return "index";
	}
	
	@RequestMapping(value = "/perfil", method = RequestMethod.GET)
	public String perfil(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Pablo");
		usuario.setApellido("Esperi");
		usuario.setEmail("pabloesperi@hotmail.com");
		
		model.addAttribute("usuario", usuario);
		model.addAttribute("Titulo", "Perfil del usuario " + usuario.getNombre() + " ".concat(usuario.getApellido()));
		
		return "/perfil";
	}
	
	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	public String listar(Model model) {
		
		Usuario usuario = new Usuario();
		usuario.setNombre("Pablo");
		usuario.setApellido("Esperi");
		usuario.setEmail("pabloesperi@hotmail.com");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNombre("Luis");
		usuario2.setApellido("Salvatore");
		usuario2.setEmail("pablosalvatore@hotmail.com");
		
		List<Usuario> usuarios = new ArrayList<>();
		
		usuarios.add(new Usuario("Alberto", "Zingaro", "albert@hotmail.com"));
		usuarios.add(usuario);
		usuarios.add(usuario2);
		
		model.addAttribute("usuarios", usuarios);
		model.addAttribute("Titulo", "Listado de usuarios");
		
		return "/listar";
	}
	
	//El ModelAttribute permite poblar para todos los métodos del controlador
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Juan", "Perez", "juanperez@hotmail.com"), 
				new Usuario("Juan", "Perez", "juanperez@hotmail.com"));
		
		return usuarios;
	}
	
	

}
 	