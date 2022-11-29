package com.example.demo.springboot;

import org.springframework.stereotype.Component;

@Component
public class VeterinarioSB {

	private String nombre;
	private String cedula;
	
	
	//SET y GET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	@Override
	public String toString() {
		return "Veterinario [nombre=" + nombre + ", cedula=" + cedula + "]";
	}
	
	
}
