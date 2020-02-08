package com.tutorial.spring.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

// se trata de un pojo que es una clase simple de java. No hereda ni implementa ninguna interfaz externa.	

//@Entity
//@Table(name = "usuarios")
public class Usuario {

	public Usuario(String nombre, String apellido, String email) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
	}

	public Usuario() {

	}

	// los atributos son privados y se los accede mediante getters and setters
	// en los column si es combre del atributo es igual al del campo de la base de
	// datos, no es necesario el name.

//	@Column(name = "name")
	private String nombre;

//	@Column(name = "surname")
	private String apellido;

	private String email;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
