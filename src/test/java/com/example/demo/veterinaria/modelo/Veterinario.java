package com.example.demo.veterinaria.modelo;

public class Veterinario {


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
